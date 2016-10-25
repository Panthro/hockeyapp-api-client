# \DefaultApi

All URIs are relative to *https://rink.hockeyapp.net/api/2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AppsGet**](DefaultApi.md#AppsGet) | **Get** /apps | 
[**AppsUploadPost**](DefaultApi.md#AppsUploadPost) | **Post** /apps/upload | 


# **AppsGet**
> Apps AppsGet()



Gets `Apps`. 


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

# **AppsUploadPost**
> App AppsUploadPost($ipa, $dsym, $notes, $notesType, $notify, $status, $strategy, $tags, $teams, $users, $mandatory, $releaseType, $private, $ownerId, $commitSha, $buildServerUrl, $repositoryUrl)



Upload a new app


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ipa** | ***os.File**| file data of the .ipa for iOS, .app.zip for OS X, or .apk file for Android | 
 **dsym** | ***os.File**| file data of the .dSYM.zip file (iOS and OS X) or mapping.txt (Android); note that the extension has to be .dsym.zip (case-insensitive) for iOS and OS X and the file name has to be mapping.txt for Android. | [optional] 
 **notes** | **string**| release notes as Textile or Markdown (after 5k characters note are truncated) | [optional] 
 **notesType** | **int32**| type of release notes. &#x60;0&#x60; for Textile, &#x60;1&#x60; for Markdown | [optional] 
 **notify** | **int32**| notify testers (can only be set with full-access tokens). &#x60;0&#x60; to not notify, &#x60;1&#x60; to notify all testers that can install this app,  &#x60;2&#x60; to notify all testers | [optional] 
 **status** | **int32**| download status (can only be set with full-access tokens). &#x60;1&#x60; to not allow users to download the version, &#x60;2&#x60; to make the version available for download | [optional] 
 **strategy** | **string**| replace or add build with same build number. &#x60;add&#x60; to add the build as a new build to even if it has the same build number __default__, &#x60;replace&#x60; to replace to a build with the same build number | [optional] 
 **tags** | [**[]string**](string.md)| restrict download to comma-separated list of tags | [optional] 
 **teams** | [**[]int32**](int32.md)| restrict download to comma-separated list of team IDs | [optional] 
 **users** | [**[]int32**](int32.md)| restrict download to comma-separated list of user IDs | [optional] 
 **mandatory** | **int32**| set version as mandatory &#x60;0&#x60; for not mandatory __default__, &#x60;1&#x60; for mandatory | [optional] 
 **releaseType** | **int32**| set the release type of the app. &#x60;0&#x60; for beta __default__  &#x60;1&#x60; for store &#x60;2&#x60; for alpha &#x60;3&#x60; for enterprise | [optional] 
 **private** | **bool**| set to &#x60;true&#x60; to enable the private download page (default is &#x60;true&#x60;) | [optional] 
 **ownerId** | **int32**| set to the ID of your organization | [optional] 
 **commitSha** | **string**| set to the git commit sha for this build | [optional] 
 **buildServerUrl** | **string**| set to the URL of the build job on your build server | [optional] 
 **repositoryUrl** | **string**| set to your source repository | [optional] 

### Return type

[**App**](App.md)

### Authorization

[token](../README.md#token)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

