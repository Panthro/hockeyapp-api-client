{-# LANGUAGE DataKinds, TypeFamilies, TypeOperators, FlexibleInstances, OverloadedStrings, ViewPatterns #-}
{-# LANGUAGE RecordWildCards, GeneralizedNewtypeDeriving, DeriveTraversable, FlexibleContexts, DeriveGeneric #-}
{-# OPTIONS_GHC -fno-warn-unused-binds -fno-warn-unused-imports -fcontext-stack=304 #-}
module HockeyappPublicAPIWrapper.API (
  -- * Client and Server
  ServerConfig(..),
  HockeyappPublicAPIWrapperBackend,
  createHockeyappPublicAPIWrapperClient,
  runHockeyappPublicAPIWrapperServer,
  runHockeyappPublicAPIWrapperClient,
  runHockeyappPublicAPIWrapperClientWithManager,
  HockeyappPublicAPIWrapperClient,
  -- ** Servant
  HockeyappPublicAPIWrapperAPI,
  ) where

import HockeyappPublicAPIWrapper.Types

import Data.Aeson (Value)
import Data.Coerce (coerce)
import Servant.API
import Servant (serve, ServantErr)
import Web.HttpApiData
import qualified Network.Wai.Handler.Warp as Warp
import qualified Data.Text as T
import Data.Text (Text)
import Servant.Common.BaseUrl(BaseUrl(..))
import Servant.Client (ServantError, client, Scheme(Http))
import Data.Proxy (Proxy(..))
import Control.Monad.IO.Class
import Data.Function ((&))
import GHC.Exts (IsString(..))
import qualified Data.Map as Map
import GHC.Generics (Generic)
import Data.Monoid ((<>))
import Servant.API.Verbs (Verb, StdMethod(..))
import Control.Monad.Except (ExceptT)
import Network.HTTP.Client (Manager, newManager, defaultManagerSettings)
import Network.HTTP.Types.Method (methodOptions)

instance ReflectMethod 'OPTIONS where
  reflectMethod _ = methodOptions



data FormAppsUploadPost = FormAppsUploadPost
    { appsUploadPostIpa :: FilePath
    , appsUploadPostDsym :: FilePath
    , appsUploadPostNotes :: Text
    , appsUploadPostNotesType :: Int
    , appsUploadPostNotify :: Int
    , appsUploadPostStatus :: Int
    , appsUploadPostStrategy :: Text
    , appsUploadPostTags :: [Text]
    , appsUploadPostTeams :: [Int]
    , appsUploadPostUsers :: [Int]
    , appsUploadPostMandatory :: Int
    , appsUploadPostReleaseType :: Int
    , appsUploadPostPrivate :: Bool
    , appsUploadPostOwnerId :: Int
    , appsUploadPostCommitSha :: Text
    , appsUploadPostBuildServerUrl :: Text
    , appsUploadPostRepositoryUrl :: Text
    } deriving (Show, Eq, Generic)

instance FromFormUrlEncoded FormAppsUploadPost where
    fromFormUrlEncoded inputs = FormAppsUploadPost <$>  lookupEither "Ipa" inputs <*>  lookupEither "dsym" inputs <*>  lookupEither "notes" inputs <*>  lookupEither "notes_type" inputs <*>  lookupEither "notify" inputs <*>  lookupEither "status" inputs <*>  lookupEither "strategy" inputs <*>  lookupEither "tags" inputs <*>  lookupEither "teams" inputs <*>  lookupEither "users" inputs <*>  lookupEither "mandatory" inputs <*>  lookupEither "release_type" inputs <*>  lookupEither "private" inputs <*>  lookupEither "owner_id" inputs <*>  lookupEither "commit_sha" inputs <*>  lookupEither "build_server_url" inputs <*>  lookupEither "repository_url" inputs
instance ToFormUrlEncoded FormAppsUploadPost where
    toFormUrlEncoded value = [("Ipa", toQueryParam $ appsUploadPostIpa value), ("dsym", toQueryParam $ appsUploadPostDsym value), ("notes", toQueryParam $ appsUploadPostNotes value), ("notes_type", toQueryParam $ appsUploadPostNotesType value), ("notify", toQueryParam $ appsUploadPostNotify value), ("status", toQueryParam $ appsUploadPostStatus value), ("strategy", toQueryParam $ appsUploadPostStrategy value), ("tags", toQueryParam $ appsUploadPostTags value), ("teams", toQueryParam $ appsUploadPostTeams value), ("users", toQueryParam $ appsUploadPostUsers value), ("mandatory", toQueryParam $ appsUploadPostMandatory value), ("release_type", toQueryParam $ appsUploadPostReleaseType value), ("private", toQueryParam $ appsUploadPostPrivate value), ("owner_id", toQueryParam $ appsUploadPostOwnerId value), ("commit_sha", toQueryParam $ appsUploadPostCommitSha value), ("build_server_url", toQueryParam $ appsUploadPostBuildServerUrl value), ("repository_url", toQueryParam $ appsUploadPostRepositoryUrl value)]


-- For the form data code generation.
lookupEither :: FromHttpApiData b => Text -> [(Text, Text)] -> Either Text b
lookupEither key assocs =
  case lookup key assocs of
    Nothing -> Left $ "Could not find parameter " <> key <> " in form data"
    Just value -> parseQueryParam value

-- | Servant type-level API, generated from the Swagger spec for HockeyappPublicAPIWrapper.
type HockeyappPublicAPIWrapperAPI
    =    "apps" :> Verb 'GET 200 '[JSON] Apps -- 'appsGet' route
    :<|> "apps" :> "upload" :> ReqBody '[FormUrlEncoded] FormAppsUploadPost :> Verb 'POST 200 '[JSON] App -- 'appsUploadPost' route

-- | Server or client configuration, specifying the host and port to query or serve on.
data ServerConfig = ServerConfig {
    configHost :: String,  -- ^ Hostname to serve on, e.g. "127.0.0.1"
    configPort :: Int      -- ^ Port to serve on, e.g. 8080
  } deriving (Eq, Ord, Show, Read)

-- | List of elements parsed from a query.
newtype QueryList (p :: CollectionFormat) a = QueryList { fromQueryList :: [a] }
  deriving (Functor, Applicative, Monad, Foldable, Traversable)

-- | Formats in which a list can be encoded into a HTTP path.
data CollectionFormat = CommaSeparated -- ^ CSV format for multiple parameters.
                      | SpaceSeparated -- ^ Also called "SSV"
                      | TabSeparated -- ^ Also called "TSV"
                      | PipeSeparated -- ^ `value1|value2|value2`
                      | MultiParamArray -- ^ Using multiple GET parameters, e.g. `foo=bar&foo=baz`. Only for GET params.

instance FromHttpApiData a => FromHttpApiData (QueryList 'CommaSeparated a) where
    parseQueryParam = parseSeparatedQueryList ','

instance FromHttpApiData a => FromHttpApiData (QueryList 'TabSeparated a) where
    parseQueryParam = parseSeparatedQueryList '\t'

instance FromHttpApiData a => FromHttpApiData (QueryList 'SpaceSeparated a) where
    parseQueryParam = parseSeparatedQueryList ' '

instance FromHttpApiData a => FromHttpApiData (QueryList 'PipeSeparated a) where
    parseQueryParam = parseSeparatedQueryList '|'

instance FromHttpApiData a => FromHttpApiData (QueryList 'MultiParamArray a) where
    parseQueryParam = error "unimplemented FromHttpApiData for MultiParamArray collection format"

parseSeparatedQueryList :: FromHttpApiData a => Char -> Text -> Either Text (QueryList p a)
parseSeparatedQueryList char = fmap QueryList . mapM parseQueryParam . T.split (== char)

instance ToHttpApiData a => ToHttpApiData (QueryList 'CommaSeparated a) where
    toQueryParam = formatSeparatedQueryList ','

instance ToHttpApiData a => ToHttpApiData (QueryList 'TabSeparated a) where
    toQueryParam = formatSeparatedQueryList '\t'

instance ToHttpApiData a => ToHttpApiData (QueryList 'SpaceSeparated a) where
    toQueryParam = formatSeparatedQueryList ' '

instance ToHttpApiData a => ToHttpApiData (QueryList 'PipeSeparated a) where
    toQueryParam = formatSeparatedQueryList '|'

instance ToHttpApiData a => ToHttpApiData (QueryList 'MultiParamArray a) where
    toQueryParam = error "unimplemented ToHttpApiData for MultiParamArray collection format"

formatSeparatedQueryList :: ToHttpApiData a => Char ->  QueryList p a -> Text
formatSeparatedQueryList char = T.intercalate (T.singleton char) . map toQueryParam . fromQueryList


-- | Backend for HockeyappPublicAPIWrapper.
-- The backend can be used both for the client and the server. The client generated from the HockeyappPublicAPIWrapper Swagger spec
-- is a backend that executes actions by sending HTTP requests (see @createHockeyappPublicAPIWrapperClient@). Alternatively, provided
-- a backend, the API can be served using @runHockeyappPublicAPIWrapperServer@.
data HockeyappPublicAPIWrapperBackend m = HockeyappPublicAPIWrapperBackend {
    appsGet :: m Apps{- ^ Gets `Apps`.  -},
    appsUploadPost :: FormAppsUploadPost -> m App{- ^ Upload a new app -}
  }

newtype HockeyappPublicAPIWrapperClient a = HockeyappPublicAPIWrapperClient { runClient :: Manager -> BaseUrl -> ExceptT ServantError IO a }
    deriving Functor

instance Applicative HockeyappPublicAPIWrapperClient where
    pure x = HockeyappPublicAPIWrapperClient (\_ _ -> pure x)
    (HockeyappPublicAPIWrapperClient f) <*> (HockeyappPublicAPIWrapperClient x) = HockeyappPublicAPIWrapperClient (\manager url -> f manager url <*> x manager url)

instance Monad HockeyappPublicAPIWrapperClient where
    (HockeyappPublicAPIWrapperClient a) >>= f = HockeyappPublicAPIWrapperClient (\manager url -> do
        value <- a manager url
        runClient (f value) manager url)

instance MonadIO HockeyappPublicAPIWrapperClient where
    liftIO io = HockeyappPublicAPIWrapperClient (\_ _ -> liftIO io)

createHockeyappPublicAPIWrapperClient :: HockeyappPublicAPIWrapperBackend HockeyappPublicAPIWrapperClient
createHockeyappPublicAPIWrapperClient = HockeyappPublicAPIWrapperBackend{..}
  where
    ((coerce -> appsGet) :<|>
     (coerce -> appsUploadPost)) = client (Proxy :: Proxy HockeyappPublicAPIWrapperAPI)

-- | Run requests in the HockeyappPublicAPIWrapperClient monad.
runHockeyappPublicAPIWrapperClient :: ServerConfig -> HockeyappPublicAPIWrapperClient a -> ExceptT ServantError IO a
runHockeyappPublicAPIWrapperClient clientConfig cl = do
  manager <- liftIO $ newManager defaultManagerSettings
  runHockeyappPublicAPIWrapperClientWithManager manager clientConfig cl

-- | Run requests in the HockeyappPublicAPIWrapperClient monad using a custom manager.
runHockeyappPublicAPIWrapperClientWithManager :: Manager -> ServerConfig -> HockeyappPublicAPIWrapperClient a -> ExceptT ServantError IO a
runHockeyappPublicAPIWrapperClientWithManager manager clientConfig cl =
  runClient cl manager $ BaseUrl Http (configHost clientConfig) (configPort clientConfig) ""

-- | Run the HockeyappPublicAPIWrapper server at the provided host and port.
runHockeyappPublicAPIWrapperServer :: MonadIO m => ServerConfig -> HockeyappPublicAPIWrapperBackend (ExceptT ServantErr IO)  -> m ()
runHockeyappPublicAPIWrapperServer ServerConfig{..} backend =
  liftIO $ Warp.runSettings warpSettings $ serve (Proxy :: Proxy HockeyappPublicAPIWrapperAPI) (serverFromBackend backend)

  where
    warpSettings = Warp.defaultSettings & Warp.setPort configPort & Warp.setHost (fromString configHost)
    serverFromBackend HockeyappPublicAPIWrapperBackend{..} =
      (coerce appsGet :<|>
       coerce appsUploadPost)
