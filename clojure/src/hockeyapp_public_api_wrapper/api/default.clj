(ns hockeyapp-public-api-wrapper.api.default
  (:require [hockeyapp-public-api-wrapper.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn apps-get-with-http-info
  "
  Gets `Apps`."
  []
  (call-api "/apps" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    ["token"]}))

(defn apps-get
  "
  Gets `Apps`."
  []
  (:data (apps-get-with-http-info)))

(defn apps-upload-post-with-http-info
  "
  Upload a new app"
  ([^File ipa ] (apps-upload-post-with-http-info ipa nil))
  ([^File ipa {:keys [^File dsym notes notes-type notify status strategy tags teams users mandatory release-type private owner-id commit-sha build-server-url repository-url ]}]
   (call-api "/apps/upload" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {"Ipa" ipa "dsym" dsym "notes" notes "notes_type" notes-type "notify" notify "status" status "strategy" strategy "tags" (with-collection-format tags :multi) "teams" (with-collection-format teams :multi) "users" (with-collection-format users :multi) "mandatory" mandatory "release_type" release-type "private" private "owner_id" owner-id "commit_sha" commit-sha "build_server_url" build-server-url "repository_url" repository-url }
              :content-types ["multipart/form-data"]
              :accepts       ["application/json"]
              :auth-names    ["token"]})))

(defn apps-upload-post
  "
  Upload a new app"
  ([^File ipa ] (apps-upload-post ipa nil))
  ([^File ipa optional-params]
   (:data (apps-upload-post-with-http-info ipa optional-params))))

