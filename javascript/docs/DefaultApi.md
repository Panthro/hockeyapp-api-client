# HockeyappPublicApiWrapper.DefaultApi

All URIs are relative to *https://rink.hockeyapp.net/api/2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**appsGet**](DefaultApi.md#appsGet) | **GET** /apps | 
[**appsUploadPost**](DefaultApi.md#appsUploadPost) | **POST** /apps/upload | 


<a name="appsGet"></a>
# **appsGet**
> Apps appsGet()



Gets &#x60;Apps&#x60;. 

### Example
```javascript
var HockeyappPublicApiWrapper = require('hockeyapp_public_api_wrapper');
var defaultClient = HockeyappPublicApiWrapper.ApiClient.default;

// Configure API key authorization: token
var token = defaultClient.authentications['token'];
token.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//token.apiKeyPrefix = 'Token';

var apiInstance = new HockeyappPublicApiWrapper.DefaultApi();

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.appsGet(callback);
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

<a name="appsUploadPost"></a>
# **appsUploadPost**
> App appsUploadPost(ipa, opts)



Upload a new app

### Example
```javascript
var HockeyappPublicApiWrapper = require('hockeyapp_public_api_wrapper');
var defaultClient = HockeyappPublicApiWrapper.ApiClient.default;

// Configure API key authorization: token
var token = defaultClient.authentications['token'];
token.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//token.apiKeyPrefix = 'Token';

var apiInstance = new HockeyappPublicApiWrapper.DefaultApi();

var ipa = "/path/to/file.txt"; // File | file data of the .ipa for iOS, .app.zip for OS X, or .apk file for Android

var opts = { 
  'dsym': "/path/to/file.txt", // File | file data of the .dSYM.zip file (iOS and OS X) or mapping.txt (Android); note that the extension has to be .dsym.zip (case-insensitive) for iOS and OS X and the file name has to be mapping.txt for Android.
  'notes': "notes_example", // String | release notes as Textile or Markdown (after 5k characters note are truncated)
  'notesType': 56, // Number | type of release notes. `0` for Textile, `1` for Markdown
  'notify': 56, // Number | notify testers (can only be set with full-access tokens). `0` to not notify, `1` to notify all testers that can install this app,  `2` to notify all testers
  'status': 56, // Number | download status (can only be set with full-access tokens). `1` to not allow users to download the version, `2` to make the version available for download
  'strategy': "strategy_example", // String | replace or add build with same build number. `add` to add the build as a new build to even if it has the same build number __default__, `replace` to replace to a build with the same build number
  'tags': ["tags_example"], // [String] | restrict download to comma-separated list of tags
  'teams': [3.4], // [Number] | restrict download to comma-separated list of team IDs
  'users': [3.4], // [Number] | restrict download to comma-separated list of user IDs
  'mandatory': 56, // Number | set version as mandatory `0` for not mandatory __default__, `1` for mandatory
  'releaseType': 56, // Number | set the release type of the app. `0` for beta __default__  `1` for store `2` for alpha `3` for enterprise
  '_private': true, // Boolean | set to `true` to enable the private download page (default is `true`)
  'ownerId': 56, // Number | set to the ID of your organization
  'commitSha': "commitSha_example", // String | set to the git commit sha for this build
  'buildServerUrl': "buildServerUrl_example", // String | set to the URL of the build job on your build server
  'repositoryUrl': "repositoryUrl_example" // String | set to your source repository
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.appsUploadPost(ipa, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ipa** | **File**| file data of the .ipa for iOS, .app.zip for OS X, or .apk file for Android | 
 **dsym** | **File**| file data of the .dSYM.zip file (iOS and OS X) or mapping.txt (Android); note that the extension has to be .dsym.zip (case-insensitive) for iOS and OS X and the file name has to be mapping.txt for Android. | [optional] 
 **notes** | **String**| release notes as Textile or Markdown (after 5k characters note are truncated) | [optional] 
 **notesType** | **Number**| type of release notes. &#x60;0&#x60; for Textile, &#x60;1&#x60; for Markdown | [optional] 
 **notify** | **Number**| notify testers (can only be set with full-access tokens). &#x60;0&#x60; to not notify, &#x60;1&#x60; to notify all testers that can install this app,  &#x60;2&#x60; to notify all testers | [optional] 
 **status** | **Number**| download status (can only be set with full-access tokens). &#x60;1&#x60; to not allow users to download the version, &#x60;2&#x60; to make the version available for download | [optional] 
 **strategy** | **String**| replace or add build with same build number. &#x60;add&#x60; to add the build as a new build to even if it has the same build number __default__, &#x60;replace&#x60; to replace to a build with the same build number | [optional] 
 **tags** | [**[String]**](String.md)| restrict download to comma-separated list of tags | [optional] 
 **teams** | [**[Number]**](Number.md)| restrict download to comma-separated list of team IDs | [optional] 
 **users** | [**[Number]**](Number.md)| restrict download to comma-separated list of user IDs | [optional] 
 **mandatory** | **Number**| set version as mandatory &#x60;0&#x60; for not mandatory __default__, &#x60;1&#x60; for mandatory | [optional] 
 **releaseType** | **Number**| set the release type of the app. &#x60;0&#x60; for beta __default__  &#x60;1&#x60; for store &#x60;2&#x60; for alpha &#x60;3&#x60; for enterprise | [optional] 
 **_private** | **Boolean**| set to &#x60;true&#x60; to enable the private download page (default is &#x60;true&#x60;) | [optional] 
 **ownerId** | **Number**| set to the ID of your organization | [optional] 
 **commitSha** | **String**| set to the git commit sha for this build | [optional] 
 **buildServerUrl** | **String**| set to the URL of the build job on your build server | [optional] 
 **repositoryUrl** | **String**| set to your source repository | [optional] 

### Return type

[**App**](App.md)

### Authorization

[token](../README.md#token)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

