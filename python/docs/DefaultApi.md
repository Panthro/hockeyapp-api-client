# swagger_client.DefaultApi

All URIs are relative to *https://rink.hockeyapp.net/api/2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apps_get**](DefaultApi.md#apps_get) | **GET** /apps | 
[**apps_upload_post**](DefaultApi.md#apps_upload_post) | **POST** /apps/upload | 


# **apps_get**
> Apps apps_get()



Gets `Apps`. 

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure API key authorization: token
swagger_client.configuration.api_key['X-HockeyAppToken'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# swagger_client.configuration.api_key_prefix['X-HockeyAppToken'] = 'Bearer'

# create an instance of the API class
api_instance = swagger_client.DefaultApi()

try: 
    api_response = api_instance.apps_get()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DefaultApi->apps_get: %s\n" % e)
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **apps_upload_post**
> App apps_upload_post(ipa, dsym=dsym, notes=notes, notes_type=notes_type, notify=notify, status=status, strategy=strategy, tags=tags, teams=teams, users=users, mandatory=mandatory, release_type=release_type, private=private, owner_id=owner_id, commit_sha=commit_sha, build_server_url=build_server_url, repository_url=repository_url)



Upload a new app

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure API key authorization: token
swagger_client.configuration.api_key['X-HockeyAppToken'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# swagger_client.configuration.api_key_prefix['X-HockeyAppToken'] = 'Bearer'

# create an instance of the API class
api_instance = swagger_client.DefaultApi()
ipa = '/path/to/file.txt' # file | file data of the .ipa for iOS, .app.zip for OS X, or .apk file for Android
dsym = '/path/to/file.txt' # file | file data of the .dSYM.zip file (iOS and OS X) or mapping.txt (Android); note that the extension has to be .dsym.zip (case-insensitive) for iOS and OS X and the file name has to be mapping.txt for Android. (optional)
notes = 'notes_example' # str | release notes as Textile or Markdown (after 5k characters note are truncated) (optional)
notes_type = 56 # int | type of release notes. `0` for Textile, `1` for Markdown (optional)
notify = 56 # int | notify testers (can only be set with full-access tokens). `0` to not notify, `1` to notify all testers that can install this app,  `2` to notify all testers (optional)
status = 56 # int | download status (can only be set with full-access tokens). `1` to not allow users to download the version, `2` to make the version available for download (optional)
strategy = 'strategy_example' # str | replace or add build with same build number. `add` to add the build as a new build to even if it has the same build number __default__, `replace` to replace to a build with the same build number (optional)
tags = ['tags_example'] # list[str] | restrict download to comma-separated list of tags (optional)
teams = [56] # list[int] | restrict download to comma-separated list of team IDs (optional)
users = [56] # list[int] | restrict download to comma-separated list of user IDs (optional)
mandatory = 56 # int | set version as mandatory `0` for not mandatory __default__, `1` for mandatory (optional)
release_type = 56 # int | set the release type of the app. `0` for beta __default__  `1` for store `2` for alpha `3` for enterprise (optional)
private = true # bool | set to `true` to enable the private download page (default is `true`) (optional)
owner_id = 56 # int | set to the ID of your organization (optional)
commit_sha = 'commit_sha_example' # str | set to the git commit sha for this build (optional)
build_server_url = 'build_server_url_example' # str | set to the URL of the build job on your build server (optional)
repository_url = 'repository_url_example' # str | set to your source repository (optional)

try: 
    api_response = api_instance.apps_upload_post(ipa, dsym=dsym, notes=notes, notes_type=notes_type, notify=notify, status=status, strategy=strategy, tags=tags, teams=teams, users=users, mandatory=mandatory, release_type=release_type, private=private, owner_id=owner_id, commit_sha=commit_sha, build_server_url=build_server_url, repository_url=repository_url)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DefaultApi->apps_upload_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ipa** | **file**| file data of the .ipa for iOS, .app.zip for OS X, or .apk file for Android | 
 **dsym** | **file**| file data of the .dSYM.zip file (iOS and OS X) or mapping.txt (Android); note that the extension has to be .dsym.zip (case-insensitive) for iOS and OS X and the file name has to be mapping.txt for Android. | [optional] 
 **notes** | **str**| release notes as Textile or Markdown (after 5k characters note are truncated) | [optional] 
 **notes_type** | **int**| type of release notes. &#x60;0&#x60; for Textile, &#x60;1&#x60; for Markdown | [optional] 
 **notify** | **int**| notify testers (can only be set with full-access tokens). &#x60;0&#x60; to not notify, &#x60;1&#x60; to notify all testers that can install this app,  &#x60;2&#x60; to notify all testers | [optional] 
 **status** | **int**| download status (can only be set with full-access tokens). &#x60;1&#x60; to not allow users to download the version, &#x60;2&#x60; to make the version available for download | [optional] 
 **strategy** | **str**| replace or add build with same build number. &#x60;add&#x60; to add the build as a new build to even if it has the same build number __default__, &#x60;replace&#x60; to replace to a build with the same build number | [optional] 
 **tags** | [**list[str]**](str.md)| restrict download to comma-separated list of tags | [optional] 
 **teams** | [**list[int]**](int.md)| restrict download to comma-separated list of team IDs | [optional] 
 **users** | [**list[int]**](int.md)| restrict download to comma-separated list of user IDs | [optional] 
 **mandatory** | **int**| set version as mandatory &#x60;0&#x60; for not mandatory __default__, &#x60;1&#x60; for mandatory | [optional] 
 **release_type** | **int**| set the release type of the app. &#x60;0&#x60; for beta __default__  &#x60;1&#x60; for store &#x60;2&#x60; for alpha &#x60;3&#x60; for enterprise | [optional] 
 **private** | **bool**| set to &#x60;true&#x60; to enable the private download page (default is &#x60;true&#x60;) | [optional] 
 **owner_id** | **int**| set to the ID of your organization | [optional] 
 **commit_sha** | **str**| set to the git commit sha for this build | [optional] 
 **build_server_url** | **str**| set to the URL of the build job on your build server | [optional] 
 **repository_url** | **str**| set to your source repository | [optional] 

### Return type

[**App**](App.md)

### Authorization

[token](../README.md#token)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

