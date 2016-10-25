# Swagger\Client\DefaultApi

All URIs are relative to *https://rink.hockeyapp.net/api/2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**appsGet**](DefaultApi.md#appsGet) | **GET** /apps | 
[**appsUploadPost**](DefaultApi.md#appsUploadPost) | **POST** /apps/upload | 


# **appsGet**
> \Swagger\Client\Model\Apps appsGet()



Gets `Apps`.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure API key authorization: token
Swagger\Client\Configuration::getDefaultConfiguration()->setApiKey('X-HockeyAppToken', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// Swagger\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('X-HockeyAppToken', 'Bearer');

$api_instance = new Swagger\Client\Api\DefaultApi();

try {
    $result = $api_instance->appsGet();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DefaultApi->appsGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**\Swagger\Client\Model\Apps**](../Model/Apps.md)

### Authorization

[token](../../README.md#token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **appsUploadPost**
> \Swagger\Client\Model\App appsUploadPost($ipa, $dsym, $notes, $notes_type, $notify, $status, $strategy, $tags, $teams, $users, $mandatory, $release_type, $private, $owner_id, $commit_sha, $build_server_url, $repository_url)



Upload a new app

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure API key authorization: token
Swagger\Client\Configuration::getDefaultConfiguration()->setApiKey('X-HockeyAppToken', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// Swagger\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('X-HockeyAppToken', 'Bearer');

$api_instance = new Swagger\Client\Api\DefaultApi();
$ipa = "/path/to/file.txt"; // \SplFileObject | file data of the .ipa for iOS, .app.zip for OS X, or .apk file for Android
$dsym = "/path/to/file.txt"; // \SplFileObject | file data of the .dSYM.zip file (iOS and OS X) or mapping.txt (Android); note that the extension has to be .dsym.zip (case-insensitive) for iOS and OS X and the file name has to be mapping.txt for Android.
$notes = "notes_example"; // string | release notes as Textile or Markdown (after 5k characters note are truncated)
$notes_type = 56; // int | type of release notes. `0` for Textile, `1` for Markdown
$notify = 56; // int | notify testers (can only be set with full-access tokens). `0` to not notify, `1` to notify all testers that can install this app,  `2` to notify all testers
$status = 56; // int | download status (can only be set with full-access tokens). `1` to not allow users to download the version, `2` to make the version available for download
$strategy = "strategy_example"; // string | replace or add build with same build number. `add` to add the build as a new build to even if it has the same build number __default__, `replace` to replace to a build with the same build number
$tags = array("tags_example"); // string[] | restrict download to comma-separated list of tags
$teams = array(56); // int[] | restrict download to comma-separated list of team IDs
$users = array(56); // int[] | restrict download to comma-separated list of user IDs
$mandatory = 56; // int | set version as mandatory `0` for not mandatory __default__, `1` for mandatory
$release_type = 56; // int | set the release type of the app. `0` for beta __default__  `1` for store `2` for alpha `3` for enterprise
$private = true; // bool | set to `true` to enable the private download page (default is `true`)
$owner_id = 56; // int | set to the ID of your organization
$commit_sha = "commit_sha_example"; // string | set to the git commit sha for this build
$build_server_url = "build_server_url_example"; // string | set to the URL of the build job on your build server
$repository_url = "repository_url_example"; // string | set to your source repository

try {
    $result = $api_instance->appsUploadPost($ipa, $dsym, $notes, $notes_type, $notify, $status, $strategy, $tags, $teams, $users, $mandatory, $release_type, $private, $owner_id, $commit_sha, $build_server_url, $repository_url);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DefaultApi->appsUploadPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ipa** | **\SplFileObject**| file data of the .ipa for iOS, .app.zip for OS X, or .apk file for Android |
 **dsym** | **\SplFileObject**| file data of the .dSYM.zip file (iOS and OS X) or mapping.txt (Android); note that the extension has to be .dsym.zip (case-insensitive) for iOS and OS X and the file name has to be mapping.txt for Android. | [optional]
 **notes** | **string**| release notes as Textile or Markdown (after 5k characters note are truncated) | [optional]
 **notes_type** | **int**| type of release notes. &#x60;0&#x60; for Textile, &#x60;1&#x60; for Markdown | [optional]
 **notify** | **int**| notify testers (can only be set with full-access tokens). &#x60;0&#x60; to not notify, &#x60;1&#x60; to notify all testers that can install this app,  &#x60;2&#x60; to notify all testers | [optional]
 **status** | **int**| download status (can only be set with full-access tokens). &#x60;1&#x60; to not allow users to download the version, &#x60;2&#x60; to make the version available for download | [optional]
 **strategy** | **string**| replace or add build with same build number. &#x60;add&#x60; to add the build as a new build to even if it has the same build number __default__, &#x60;replace&#x60; to replace to a build with the same build number | [optional]
 **tags** | [**string[]**](../Model/string.md)| restrict download to comma-separated list of tags | [optional]
 **teams** | [**int[]**](../Model/int.md)| restrict download to comma-separated list of team IDs | [optional]
 **users** | [**int[]**](../Model/int.md)| restrict download to comma-separated list of user IDs | [optional]
 **mandatory** | **int**| set version as mandatory &#x60;0&#x60; for not mandatory __default__, &#x60;1&#x60; for mandatory | [optional]
 **release_type** | **int**| set the release type of the app. &#x60;0&#x60; for beta __default__  &#x60;1&#x60; for store &#x60;2&#x60; for alpha &#x60;3&#x60; for enterprise | [optional]
 **private** | **bool**| set to &#x60;true&#x60; to enable the private download page (default is &#x60;true&#x60;) | [optional]
 **owner_id** | **int**| set to the ID of your organization | [optional]
 **commit_sha** | **string**| set to the git commit sha for this build | [optional]
 **build_server_url** | **string**| set to the URL of the build job on your build server | [optional]
 **repository_url** | **string**| set to your source repository | [optional]

### Return type

[**\Swagger\Client\Model\App**](../Model/App.md)

### Authorization

[token](../../README.md#token)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

