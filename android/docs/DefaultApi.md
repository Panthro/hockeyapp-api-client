# DefaultApi

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
```java
// Import classes:
//import com.github.panthro.hockeyapp.DefaultApi;

DefaultApi apiInstance = new DefaultApi();
try {
    Apps result = apiInstance.appsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#appsGet");
    e.printStackTrace();
}
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
> App appsUploadPost(ipa, dsym, notes, notesType, notify, status, strategy, tags, teams, users, mandatory, releaseType, _private, ownerId, commitSha, buildServerUrl, repositoryUrl)



Upload a new app

### Example
```java
// Import classes:
//import com.github.panthro.hockeyapp.DefaultApi;

DefaultApi apiInstance = new DefaultApi();
File ipa = new File("/path/to/file.txt"); // File | file data of the .ipa for iOS, .app.zip for OS X, or .apk file for Android
File dsym = new File("/path/to/file.txt"); // File | file data of the .dSYM.zip file (iOS and OS X) or mapping.txt (Android); note that the extension has to be .dsym.zip (case-insensitive) for iOS and OS X and the file name has to be mapping.txt for Android.
String notes = "notes_example"; // String | release notes as Textile or Markdown (after 5k characters note are truncated)
Integer notesType = 56; // Integer | type of release notes. `0` for Textile, `1` for Markdown
Integer notify = 56; // Integer | notify testers (can only be set with full-access tokens). `0` to not notify, `1` to notify all testers that can install this app,  `2` to notify all testers
Integer status = 56; // Integer | download status (can only be set with full-access tokens). `1` to not allow users to download the version, `2` to make the version available for download
String strategy = "strategy_example"; // String | replace or add build with same build number. `add` to add the build as a new build to even if it has the same build number __default__, `replace` to replace to a build with the same build number
List<String> tags = Arrays.asList("tags_example"); // List<String> | restrict download to comma-separated list of tags
List<Integer> teams = Arrays.asList(56); // List<Integer> | restrict download to comma-separated list of team IDs
List<Integer> users = Arrays.asList(56); // List<Integer> | restrict download to comma-separated list of user IDs
Integer mandatory = 56; // Integer | set version as mandatory `0` for not mandatory __default__, `1` for mandatory
Integer releaseType = 56; // Integer | set the release type of the app. `0` for beta __default__  `1` for store `2` for alpha `3` for enterprise
Boolean _private = true; // Boolean | set to `true` to enable the private download page (default is `true`)
Integer ownerId = 56; // Integer | set to the ID of your organization
String commitSha = "commitSha_example"; // String | set to the git commit sha for this build
String buildServerUrl = "buildServerUrl_example"; // String | set to the URL of the build job on your build server
String repositoryUrl = "repositoryUrl_example"; // String | set to your source repository
try {
    App result = apiInstance.appsUploadPost(ipa, dsym, notes, notesType, notify, status, strategy, tags, teams, users, mandatory, releaseType, _private, ownerId, commitSha, buildServerUrl, repositoryUrl);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#appsUploadPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ipa** | **File**| file data of the .ipa for iOS, .app.zip for OS X, or .apk file for Android |
 **dsym** | **File**| file data of the .dSYM.zip file (iOS and OS X) or mapping.txt (Android); note that the extension has to be .dsym.zip (case-insensitive) for iOS and OS X and the file name has to be mapping.txt for Android. | [optional]
 **notes** | **String**| release notes as Textile or Markdown (after 5k characters note are truncated) | [optional]
 **notesType** | **Integer**| type of release notes. &#x60;0&#x60; for Textile, &#x60;1&#x60; for Markdown | [optional]
 **notify** | **Integer**| notify testers (can only be set with full-access tokens). &#x60;0&#x60; to not notify, &#x60;1&#x60; to notify all testers that can install this app,  &#x60;2&#x60; to notify all testers | [optional]
 **status** | **Integer**| download status (can only be set with full-access tokens). &#x60;1&#x60; to not allow users to download the version, &#x60;2&#x60; to make the version available for download | [optional]
 **strategy** | **String**| replace or add build with same build number. &#x60;add&#x60; to add the build as a new build to even if it has the same build number __default__, &#x60;replace&#x60; to replace to a build with the same build number | [optional] [enum: add, replace]
 **tags** | [**List&lt;String&gt;**](String.md)| restrict download to comma-separated list of tags | [optional]
 **teams** | [**List&lt;Integer&gt;**](Integer.md)| restrict download to comma-separated list of team IDs | [optional]
 **users** | [**List&lt;Integer&gt;**](Integer.md)| restrict download to comma-separated list of user IDs | [optional]
 **mandatory** | **Integer**| set version as mandatory &#x60;0&#x60; for not mandatory __default__, &#x60;1&#x60; for mandatory | [optional]
 **releaseType** | **Integer**| set the release type of the app. &#x60;0&#x60; for beta __default__  &#x60;1&#x60; for store &#x60;2&#x60; for alpha &#x60;3&#x60; for enterprise | [optional]
 **_private** | **Boolean**| set to &#x60;true&#x60; to enable the private download page (default is &#x60;true&#x60;) | [optional]
 **ownerId** | **Integer**| set to the ID of your organization | [optional]
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

