{-# LANGUAGE DeriveGeneric #-}
{-# LANGUAGE GeneralizedNewtypeDeriving #-}
{-# OPTIONS_GHC -fno-warn-unused-binds -fno-warn-unused-imports #-}

module HockeyappPublicAPIWrapper.Types (
    App (..),
    Apps (..),
    Apps_apps (..),
    ) where

import Data.List (stripPrefix)
import Data.Maybe (fromMaybe)
import Data.Aeson (Value, FromJSON(..), ToJSON(..), genericToJSON, genericParseJSON)
import Data.Aeson.Types (Options(..), defaultOptions)
import Data.Text (Text)
import qualified Data.Text as T
import qualified Data.Map as Map
import GHC.Generics (Generic)
import Data.Function ((&))


-- | 
data App = App
    { appTitle :: Text -- ^ 
    , appBundleIdentifier :: Text -- ^ 
    , appPublicIdentifier :: Text -- ^ 
    , appReleaseType :: Int -- ^ 
    , appPlatform :: Text -- ^ 
    } deriving (Show, Eq, Generic)

instance FromJSON App where
  parseJSON  = genericParseJSON  (removeFieldLabelPrefix True "app")
instance ToJSON App where
  toJSON     = genericToJSON     (removeFieldLabelPrefix False "app")

-- | 
data Apps = Apps
    { appsSuccess :: Text -- ^ 
    , appsApps :: [Apps_apps] -- ^ 
    } deriving (Show, Eq, Generic)

instance FromJSON Apps where
  parseJSON  = genericParseJSON  (removeFieldLabelPrefix True "apps")
instance ToJSON Apps where
  toJSON     = genericToJSON     (removeFieldLabelPrefix False "apps")

-- | 
data Apps_apps = Apps_apps
    { appsAppsTitle :: Text -- ^ 
    , appsAppsBundleIdentifier :: Text -- ^ 
    , appsAppsPublicIdentifier :: Text -- ^ 
    , appsAppsDeviceFamily :: Text -- ^ 
    , appsAppsMinimumOsVersion :: Text -- ^ 
    , appsAppsReleaseType :: Int -- ^ 
    , appsAppsStatus :: Int -- ^ 
    , appsAppsPlatform :: Text -- ^ 
    } deriving (Show, Eq, Generic)

instance FromJSON Apps_apps where
  parseJSON  = genericParseJSON  (removeFieldLabelPrefix True "appsApps")
instance ToJSON Apps_apps where
  toJSON     = genericToJSON     (removeFieldLabelPrefix False "appsApps")

-- Remove a field label prefix during JSON parsing.
-- Also perform any replacements for special characters.
removeFieldLabelPrefix :: Bool -> String -> Options
removeFieldLabelPrefix forParsing prefix =
  defaultOptions
    { fieldLabelModifier = fromMaybe (error ("did not find prefix " ++ prefix)) . stripPrefix prefix . replaceSpecialChars
    }
  where
    replaceSpecialChars field = foldl (&) field (map mkCharReplacement specialChars)
    specialChars = [("@", "'At"), ("<=", "'Less_Than_Or_Equal_To"), ("[", "'Left_Square_Bracket"), ("\", "'Back_Slash"), ("]", "'Right_Square_Bracket"), ("^", "'Caret"), ("_", "'Underscore"), ("`", "'Backtick"), ("!", "'Exclamation"), (""", "'Double_Quote"), ("#", "'Hash"), ("$", "'Dollar"), ("%", "'Percent"), ("&", "'Ampersand"), ("'", "'Quote"), ("(", "'Left_Parenthesis"), (")", "'Right_Parenthesis"), ("*", "'Star"), ("+", "'Plus"), (",", "'Comma"), ("-", "'Dash"), (".", "'Period"), ("/", "'Slash"), (":", "'Colon"), ("{", "'Left_Curly_Bracket"), ("|", "'Pipe"), ("<", "'LessThan"), ("!=", "'Not_Equal"), ("=", "'Equal"), ("}", "'Right_Curly_Bracket"), (">", "'GreaterThan"), ("~", "'Tilde"), ("?", "'Question_Mark"), (">=", "'Greater_Than_Or_Equal_To")]
    mkCharReplacement (replaceStr, searchStr) = T.unpack . replacer (T.pack searchStr) (T.pack replaceStr) . T.pack
    replacer = if forParsing then flip T.replace else T.replace


