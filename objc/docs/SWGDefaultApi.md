# SWGDefaultApi

All URIs are relative to *https://rink.hockeyapp.net/api/2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**appsGet**](SWGDefaultApi.md#appsget) | **GET** /apps | 
[**appsUploadPost**](SWGDefaultApi.md#appsuploadpost) | **POST** /apps/upload | 


# **appsGet**
```objc
-(NSNumber*) appsGetWithCompletionHandler: 
        (void (^)(SWGApps* output, NSError* error)) handler;
```



Gets `Apps`. 

### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: token)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"X-HockeyAppToken"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"X-HockeyAppToken"];



SWGDefaultApi*apiInstance = [[SWGDefaultApi alloc] init];

[apiInstance appsGetWithCompletionHandler: 
          ^(SWGApps* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGDefaultApi->appsGet: %@", error);
                        }
                    }];
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SWGApps***](SWGApps.md)

### Authorization

[token](../README.md#token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **appsUploadPost**
```objc
-(NSNumber*) appsUploadPostWithIpa: (NSURL*) ipa
    dsym: (NSURL*) dsym
    notes: (NSString*) notes
    notesType: (NSNumber*) notesType
    notify: (NSNumber*) notify
    status: (NSNumber*) status
    strategy: (NSString*) strategy
    tags: (NSArray<NSString*>*) tags
    teams: (NSArray<NSNumber*>*) teams
    users: (NSArray<NSNumber*>*) users
    mandatory: (NSNumber*) mandatory
    releaseType: (NSNumber*) releaseType
    private: (NSNumber*) private
    ownerId: (NSNumber*) ownerId
    commitSha: (NSString*) commitSha
    buildServerUrl: (NSString*) buildServerUrl
    repositoryUrl: (NSString*) repositoryUrl
        completionHandler: (void (^)(SWGApp* output, NSError* error)) handler;
```



Upload a new app

### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: token)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"X-HockeyAppToken"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"X-HockeyAppToken"];


NSURL* ipa = [NSURL fileURLWithPath:@"/path/to/file.txt"]; // file data of the .ipa for iOS, .app.zip for OS X, or .apk file for Android
NSURL* dsym = [NSURL fileURLWithPath:@"/path/to/file.txt"]; // file data of the .dSYM.zip file (iOS and OS X) or mapping.txt (Android); note that the extension has to be .dsym.zip (case-insensitive) for iOS and OS X and the file name has to be mapping.txt for Android. (optional)
NSString* notes = @"notes_example"; // release notes as Textile or Markdown (after 5k characters note are truncated) (optional)
NSNumber* notesType = @56; // type of release notes. `0` for Textile, `1` for Markdown (optional)
NSNumber* notify = @56; // notify testers (can only be set with full-access tokens). `0` to not notify, `1` to notify all testers that can install this app,  `2` to notify all testers (optional)
NSNumber* status = @56; // download status (can only be set with full-access tokens). `1` to not allow users to download the version, `2` to make the version available for download (optional)
NSString* strategy = @"strategy_example"; // replace or add build with same build number. `add` to add the build as a new build to even if it has the same build number __default__, `replace` to replace to a build with the same build number (optional)
NSArray<NSString*>* tags = @[@"tags_example"]; // restrict download to comma-separated list of tags (optional)
NSArray<NSNumber*>* teams = @[@56]; // restrict download to comma-separated list of team IDs (optional)
NSArray<NSNumber*>* users = @[@56]; // restrict download to comma-separated list of user IDs (optional)
NSNumber* mandatory = @56; // set version as mandatory `0` for not mandatory __default__, `1` for mandatory (optional)
NSNumber* releaseType = @56; // set the release type of the app. `0` for beta __default__  `1` for store `2` for alpha `3` for enterprise (optional)
NSNumber* private = @true; // set to `true` to enable the private download page (default is `true`) (optional)
NSNumber* ownerId = @56; // set to the ID of your organization (optional)
NSString* commitSha = @"commitSha_example"; // set to the git commit sha for this build (optional)
NSString* buildServerUrl = @"buildServerUrl_example"; // set to the URL of the build job on your build server (optional)
NSString* repositoryUrl = @"repositoryUrl_example"; // set to your source repository (optional)

SWGDefaultApi*apiInstance = [[SWGDefaultApi alloc] init];

[apiInstance appsUploadPostWithIpa:ipa
              dsym:dsym
              notes:notes
              notesType:notesType
              notify:notify
              status:status
              strategy:strategy
              tags:tags
              teams:teams
              users:users
              mandatory:mandatory
              releaseType:releaseType
              private:private
              ownerId:ownerId
              commitSha:commitSha
              buildServerUrl:buildServerUrl
              repositoryUrl:repositoryUrl
          completionHandler: ^(SWGApp* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGDefaultApi->appsUploadPost: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ipa** | **NSURL***| file data of the .ipa for iOS, .app.zip for OS X, or .apk file for Android | 
 **dsym** | **NSURL***| file data of the .dSYM.zip file (iOS and OS X) or mapping.txt (Android); note that the extension has to be .dsym.zip (case-insensitive) for iOS and OS X and the file name has to be mapping.txt for Android. | [optional] 
 **notes** | **NSString***| release notes as Textile or Markdown (after 5k characters note are truncated) | [optional] 
 **notesType** | **NSNumber***| type of release notes. &#x60;0&#x60; for Textile, &#x60;1&#x60; for Markdown | [optional] 
 **notify** | **NSNumber***| notify testers (can only be set with full-access tokens). &#x60;0&#x60; to not notify, &#x60;1&#x60; to notify all testers that can install this app,  &#x60;2&#x60; to notify all testers | [optional] 
 **status** | **NSNumber***| download status (can only be set with full-access tokens). &#x60;1&#x60; to not allow users to download the version, &#x60;2&#x60; to make the version available for download | [optional] 
 **strategy** | **NSString***| replace or add build with same build number. &#x60;add&#x60; to add the build as a new build to even if it has the same build number __default__, &#x60;replace&#x60; to replace to a build with the same build number | [optional] 
 **tags** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| restrict download to comma-separated list of tags | [optional] 
 **teams** | [**NSArray&lt;NSNumber*&gt;***](NSNumber*.md)| restrict download to comma-separated list of team IDs | [optional] 
 **users** | [**NSArray&lt;NSNumber*&gt;***](NSNumber*.md)| restrict download to comma-separated list of user IDs | [optional] 
 **mandatory** | **NSNumber***| set version as mandatory &#x60;0&#x60; for not mandatory __default__, &#x60;1&#x60; for mandatory | [optional] 
 **releaseType** | **NSNumber***| set the release type of the app. &#x60;0&#x60; for beta __default__  &#x60;1&#x60; for store &#x60;2&#x60; for alpha &#x60;3&#x60; for enterprise | [optional] 
 **private** | **NSNumber***| set to &#x60;true&#x60; to enable the private download page (default is &#x60;true&#x60;) | [optional] 
 **ownerId** | **NSNumber***| set to the ID of your organization | [optional] 
 **commitSha** | **NSString***| set to the git commit sha for this build | [optional] 
 **buildServerUrl** | **NSString***| set to the URL of the build job on your build server | [optional] 
 **repositoryUrl** | **NSString***| set to your source repository | [optional] 

### Return type

[**SWGApp***](SWGApp.md)

### Authorization

[token](../README.md#token)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

