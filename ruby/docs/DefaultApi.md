# SwaggerClient::DefaultApi

All URIs are relative to *https://rink.hockeyapp.net/api/2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apps_get**](DefaultApi.md#apps_get) | **GET** /apps | 
[**apps_upload_post**](DefaultApi.md#apps_upload_post) | **POST** /apps/upload | 


# **apps_get**
> Apps apps_get



Gets `Apps`. 

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure API key authorization: token
  config.api_key['X-HockeyAppToken'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-HockeyAppToken'] = 'Bearer'
end

api_instance = SwaggerClient::DefaultApi.new

begin
  result = api_instance.apps_get
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling DefaultApi->apps_get: #{e}"
end
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Apps**](Apps.md)

### Authorization

[token](../README.md#token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **apps_upload_post**
> App apps_upload_post(ipa, opts)



Upload a new app

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure API key authorization: token
  config.api_key['X-HockeyAppToken'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-HockeyAppToken'] = 'Bearer'
end

api_instance = SwaggerClient::DefaultApi.new

ipa = File.new("/path/to/file.txt") # File | file data of the .ipa for iOS, .app.zip for OS X, or .apk file for Android

opts = { 
  dsym: File.new("/path/to/file.txt"), # File | file data of the .dSYM.zip file (iOS and OS X) or mapping.txt (Android); note that the extension has to be .dsym.zip (case-insensitive) for iOS and OS X and the file name has to be mapping.txt for Android.
  notes: "notes_example", # String | release notes as Textile or Markdown (after 5k characters note are truncated)
  notes_type: 56, # Integer | type of release notes. `0` for Textile, `1` for Markdown
  notify: 56, # Integer | notify testers (can only be set with full-access tokens). `0` to not notify, `1` to notify all testers that can install this app,  `2` to notify all testers
  status: 56, # Integer | download status (can only be set with full-access tokens). `1` to not allow users to download the version, `2` to make the version available for download
  strategy: "strategy_example", # String | replace or add build with same build number. `add` to add the build as a new build to even if it has the same build number __default__, `replace` to replace to a build with the same build number
  tags: ["tags_example"], # Array<String> | restrict download to comma-separated list of tags
  teams: [56], # Array<Integer> | restrict download to comma-separated list of team IDs
  users: [56], # Array<Integer> | restrict download to comma-separated list of user IDs
  mandatory: 56, # Integer | set version as mandatory `0` for not mandatory __default__, `1` for mandatory
  release_type: 56, # Integer | set the release type of the app. `0` for beta __default__  `1` for store `2` for alpha `3` for enterprise
  private: true, # BOOLEAN | set to `true` to enable the private download page (default is `true`)
  owner_id: 56, # Integer | set to the ID of your organization
  commit_sha: "commit_sha_example", # String | set to the git commit sha for this build
  build_server_url: "build_server_url_example", # String | set to the URL of the build job on your build server
  repository_url: "repository_url_example" # String | set to your source repository
}

begin
  result = api_instance.apps_upload_post(ipa, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling DefaultApi->apps_upload_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ipa** | **File**| file data of the .ipa for iOS, .app.zip for OS X, or .apk file for Android | 
 **dsym** | **File**| file data of the .dSYM.zip file (iOS and OS X) or mapping.txt (Android); note that the extension has to be .dsym.zip (case-insensitive) for iOS and OS X and the file name has to be mapping.txt for Android. | [optional] 
 **notes** | **String**| release notes as Textile or Markdown (after 5k characters note are truncated) | [optional] 
 **notes_type** | **Integer**| type of release notes. &#x60;0&#x60; for Textile, &#x60;1&#x60; for Markdown | [optional] 
 **notify** | **Integer**| notify testers (can only be set with full-access tokens). &#x60;0&#x60; to not notify, &#x60;1&#x60; to notify all testers that can install this app,  &#x60;2&#x60; to notify all testers | [optional] 
 **status** | **Integer**| download status (can only be set with full-access tokens). &#x60;1&#x60; to not allow users to download the version, &#x60;2&#x60; to make the version available for download | [optional] 
 **strategy** | **String**| replace or add build with same build number. &#x60;add&#x60; to add the build as a new build to even if it has the same build number __default__, &#x60;replace&#x60; to replace to a build with the same build number | [optional] 
 **tags** | [**Array&lt;String&gt;**](String.md)| restrict download to comma-separated list of tags | [optional] 
 **teams** | [**Array&lt;Integer&gt;**](Integer.md)| restrict download to comma-separated list of team IDs | [optional] 
 **users** | [**Array&lt;Integer&gt;**](Integer.md)| restrict download to comma-separated list of user IDs | [optional] 
 **mandatory** | **Integer**| set version as mandatory &#x60;0&#x60; for not mandatory __default__, &#x60;1&#x60; for mandatory | [optional] 
 **release_type** | **Integer**| set the release type of the app. &#x60;0&#x60; for beta __default__  &#x60;1&#x60; for store &#x60;2&#x60; for alpha &#x60;3&#x60; for enterprise | [optional] 
 **private** | **BOOLEAN**| set to &#x60;true&#x60; to enable the private download page (default is &#x60;true&#x60;) | [optional] 
 **owner_id** | **Integer**| set to the ID of your organization | [optional] 
 **commit_sha** | **String**| set to the git commit sha for this build | [optional] 
 **build_server_url** | **String**| set to the URL of the build job on your build server | [optional] 
 **repository_url** | **String**| set to your source repository | [optional] 

### Return type

[**App**](App.md)

### Authorization

[token](../README.md#token)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json



