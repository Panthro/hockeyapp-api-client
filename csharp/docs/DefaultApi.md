# IO.Swagger.Api.DefaultApi

All URIs are relative to *https://rink.hockeyapp.net/api/2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AppsGet**](DefaultApi.md#appsget) | **GET** /apps | 
[**AppsUploadPost**](DefaultApi.md#appsuploadpost) | **POST** /apps/upload | 


<a name="appsget"></a>
# **AppsGet**
> Apps AppsGet ()



Gets `Apps`. 

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class AppsGetExample
    {
        public void main()
        {
            
            // Configure API key authorization: token
            Configuration.Default.ApiKey.Add("X-HockeyAppToken", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.ApiKeyPrefix.Add("X-HockeyAppToken", "Bearer");

            var apiInstance = new DefaultApi();

            try
            {
                Apps result = apiInstance.AppsGet();
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling DefaultApi.AppsGet: " + e.Message );
            }
        }
    }
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="appsuploadpost"></a>
# **AppsUploadPost**
> App AppsUploadPost (System.IO.Stream ipa, System.IO.Stream dsym = null, string notes = null, int? notesType = null, int? notify = null, int? status = null, string strategy = null, List<string> tags = null, List<int?> teams = null, List<int?> users = null, int? mandatory = null, int? releaseType = null, bool? _private = null, int? ownerId = null, string commitSha = null, string buildServerUrl = null, string repositoryUrl = null)



Upload a new app

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class AppsUploadPostExample
    {
        public void main()
        {
            
            // Configure API key authorization: token
            Configuration.Default.ApiKey.Add("X-HockeyAppToken", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.ApiKeyPrefix.Add("X-HockeyAppToken", "Bearer");

            var apiInstance = new DefaultApi();
            var ipa = new System.IO.Stream(); // System.IO.Stream | file data of the .ipa for iOS, .app.zip for OS X, or .apk file for Android
            var dsym = new System.IO.Stream(); // System.IO.Stream | file data of the .dSYM.zip file (iOS and OS X) or mapping.txt (Android); note that the extension has to be .dsym.zip (case-insensitive) for iOS and OS X and the file name has to be mapping.txt for Android. (optional) 
            var notes = notes_example;  // string | release notes as Textile or Markdown (after 5k characters note are truncated) (optional) 
            var notesType = 56;  // int? | type of release notes. `0` for Textile, `1` for Markdown (optional) 
            var notify = 56;  // int? | notify testers (can only be set with full-access tokens). `0` to not notify, `1` to notify all testers that can install this app,  `2` to notify all testers (optional) 
            var status = 56;  // int? | download status (can only be set with full-access tokens). `1` to not allow users to download the version, `2` to make the version available for download (optional) 
            var strategy = strategy_example;  // string | replace or add build with same build number. `add` to add the build as a new build to even if it has the same build number __default__, `replace` to replace to a build with the same build number (optional) 
            var tags = new List<string>(); // List<string> | restrict download to comma-separated list of tags (optional) 
            var teams = new List<int?>(); // List<int?> | restrict download to comma-separated list of team IDs (optional) 
            var users = new List<int?>(); // List<int?> | restrict download to comma-separated list of user IDs (optional) 
            var mandatory = 56;  // int? | set version as mandatory `0` for not mandatory __default__, `1` for mandatory (optional) 
            var releaseType = 56;  // int? | set the release type of the app. `0` for beta __default__  `1` for store `2` for alpha `3` for enterprise (optional) 
            var _private = true;  // bool? | set to `true` to enable the private download page (default is `true`) (optional) 
            var ownerId = 56;  // int? | set to the ID of your organization (optional) 
            var commitSha = commitSha_example;  // string | set to the git commit sha for this build (optional) 
            var buildServerUrl = buildServerUrl_example;  // string | set to the URL of the build job on your build server (optional) 
            var repositoryUrl = repositoryUrl_example;  // string | set to your source repository (optional) 

            try
            {
                App result = apiInstance.AppsUploadPost(ipa, dsym, notes, notesType, notify, status, strategy, tags, teams, users, mandatory, releaseType, _private, ownerId, commitSha, buildServerUrl, repositoryUrl);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling DefaultApi.AppsUploadPost: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ipa** | **System.IO.Stream**| file data of the .ipa for iOS, .app.zip for OS X, or .apk file for Android | 
 **dsym** | **System.IO.Stream**| file data of the .dSYM.zip file (iOS and OS X) or mapping.txt (Android); note that the extension has to be .dsym.zip (case-insensitive) for iOS and OS X and the file name has to be mapping.txt for Android. | [optional] 
 **notes** | **string**| release notes as Textile or Markdown (after 5k characters note are truncated) | [optional] 
 **notesType** | **int?**| type of release notes. &#x60;0&#x60; for Textile, &#x60;1&#x60; for Markdown | [optional] 
 **notify** | **int?**| notify testers (can only be set with full-access tokens). &#x60;0&#x60; to not notify, &#x60;1&#x60; to notify all testers that can install this app,  &#x60;2&#x60; to notify all testers | [optional] 
 **status** | **int?**| download status (can only be set with full-access tokens). &#x60;1&#x60; to not allow users to download the version, &#x60;2&#x60; to make the version available for download | [optional] 
 **strategy** | **string**| replace or add build with same build number. &#x60;add&#x60; to add the build as a new build to even if it has the same build number __default__, &#x60;replace&#x60; to replace to a build with the same build number | [optional] 
 **tags** | [**List<string>**](string.md)| restrict download to comma-separated list of tags | [optional] 
 **teams** | [**List<int?>**](int?.md)| restrict download to comma-separated list of team IDs | [optional] 
 **users** | [**List<int?>**](int?.md)| restrict download to comma-separated list of user IDs | [optional] 
 **mandatory** | **int?**| set version as mandatory &#x60;0&#x60; for not mandatory __default__, &#x60;1&#x60; for mandatory | [optional] 
 **releaseType** | **int?**| set the release type of the app. &#x60;0&#x60; for beta __default__  &#x60;1&#x60; for store &#x60;2&#x60; for alpha &#x60;3&#x60; for enterprise | [optional] 
 **_private** | **bool?**| set to &#x60;true&#x60; to enable the private download page (default is &#x60;true&#x60;) | [optional] 
 **ownerId** | **int?**| set to the ID of your organization | [optional] 
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

