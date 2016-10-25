/* 
 * Hockeyapp Public API wrapper
 *
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 0.0.2
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package swagger

import (
	"net/url"
	"strings"
	"os"
	"io/ioutil"
	"encoding/json"
)

type DefaultApi struct {
	Configuration *Configuration
}

func NewDefaultApi() *DefaultApi {
	configuration := NewConfiguration()
	return &DefaultApi{
		Configuration: configuration,
	}
}

func NewDefaultApiWithBasePath(basePath string) *DefaultApi {
	configuration := NewConfiguration()
	configuration.BasePath = basePath

	return &DefaultApi{
		Configuration: configuration,
	}
}

/**
 * 
 * Gets &#x60;Apps&#x60;. 
 *
 * @return *Apps
 */
func (a DefaultApi) AppsGet() (*Apps, *APIResponse, error) {

	var localVarHttpMethod = strings.ToUpper("Get")
	// create path and map variables
	localVarPath := a.Configuration.BasePath + "/apps"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := make(map[string]string)
	var localVarPostBody interface{}
	var localVarFileName string
	var localVarFileBytes []byte
	// authentication '(token)' required
	// set key with prefix in header
	localVarHeaderParams["X-HockeyAppToken"] = a.Configuration.GetAPIKeyWithPrefix("X-HockeyAppToken")
	// add default headers if any
	for key := range a.Configuration.DefaultHeader {
		localVarHeaderParams[key] = a.Configuration.DefaultHeader[key]
	}

	// to determine the Content-Type header
	localVarHttpContentTypes := []string{  }

	// set Content-Type header
	localVarHttpContentType := a.Configuration.APIClient.SelectHeaderContentType(localVarHttpContentTypes)
	if localVarHttpContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHttpContentType
	}
	// to determine the Accept header
	localVarHttpHeaderAccepts := []string{
		}

	// set Accept header
	localVarHttpHeaderAccept := a.Configuration.APIClient.SelectHeaderAccept(localVarHttpHeaderAccepts)
	if localVarHttpHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHttpHeaderAccept
	}
	var successPayload = new(Apps)
	localVarHttpResponse, err := a.Configuration.APIClient.CallAPI(localVarPath, localVarHttpMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFileName, localVarFileBytes)

	var localVarURL, _ = url.Parse(localVarPath)
	localVarURL.RawQuery = localVarQueryParams.Encode()
	var localVarAPIResponse = &APIResponse{Operation: "AppsGet", Method: localVarHttpMethod, RequestURL: localVarURL.String()}
	if localVarHttpResponse != nil {
		localVarAPIResponse.Response = localVarHttpResponse.RawResponse
		localVarAPIResponse.Payload = localVarHttpResponse.Body()
	}

	if err != nil {
		return successPayload, localVarAPIResponse, err
	}
	err = json.Unmarshal(localVarHttpResponse.Body(), &successPayload)
	return successPayload, localVarAPIResponse, err
}

/**
 * 
 * Upload a new app
 *
 * @param ipa file data of the .ipa for iOS, .app.zip for OS X, or .apk file for Android
 * @param dsym file data of the .dSYM.zip file (iOS and OS X) or mapping.txt (Android); note that the extension has to be .dsym.zip (case-insensitive) for iOS and OS X and the file name has to be mapping.txt for Android.
 * @param notes release notes as Textile or Markdown (after 5k characters note are truncated)
 * @param notesType type of release notes. &#x60;0&#x60; for Textile, &#x60;1&#x60; for Markdown
 * @param notify notify testers (can only be set with full-access tokens). &#x60;0&#x60; to not notify, &#x60;1&#x60; to notify all testers that can install this app,  &#x60;2&#x60; to notify all testers
 * @param status download status (can only be set with full-access tokens). &#x60;1&#x60; to not allow users to download the version, &#x60;2&#x60; to make the version available for download
 * @param strategy replace or add build with same build number. &#x60;add&#x60; to add the build as a new build to even if it has the same build number __default__, &#x60;replace&#x60; to replace to a build with the same build number
 * @param tags restrict download to comma-separated list of tags
 * @param teams restrict download to comma-separated list of team IDs
 * @param users restrict download to comma-separated list of user IDs
 * @param mandatory set version as mandatory &#x60;0&#x60; for not mandatory __default__, &#x60;1&#x60; for mandatory
 * @param releaseType set the release type of the app. &#x60;0&#x60; for beta __default__  &#x60;1&#x60; for store &#x60;2&#x60; for alpha &#x60;3&#x60; for enterprise
 * @param private set to &#x60;true&#x60; to enable the private download page (default is &#x60;true&#x60;)
 * @param ownerId set to the ID of your organization
 * @param commitSha set to the git commit sha for this build
 * @param buildServerUrl set to the URL of the build job on your build server
 * @param repositoryUrl set to your source repository
 * @return *App
 */
func (a DefaultApi) AppsUploadPost(ipa *os.File, dsym *os.File, notes string, notesType int32, notify int32, status int32, strategy string, tags []string, teams []int32, users []int32, mandatory int32, releaseType int32, private bool, ownerId int32, commitSha string, buildServerUrl string, repositoryUrl string) (*App, *APIResponse, error) {

	var localVarHttpMethod = strings.ToUpper("Post")
	// create path and map variables
	localVarPath := a.Configuration.BasePath + "/apps/upload"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := make(map[string]string)
	var localVarPostBody interface{}
	var localVarFileName string
	var localVarFileBytes []byte
	// authentication '(token)' required
	// set key with prefix in header
	localVarHeaderParams["X-HockeyAppToken"] = a.Configuration.GetAPIKeyWithPrefix("X-HockeyAppToken")
	// add default headers if any
	for key := range a.Configuration.DefaultHeader {
		localVarHeaderParams[key] = a.Configuration.DefaultHeader[key]
	}

	// to determine the Content-Type header
	localVarHttpContentTypes := []string{ "multipart/form-data",  }

	// set Content-Type header
	localVarHttpContentType := a.Configuration.APIClient.SelectHeaderContentType(localVarHttpContentTypes)
	if localVarHttpContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHttpContentType
	}
	// to determine the Accept header
	localVarHttpHeaderAccepts := []string{
		"application/json",
		}

	// set Accept header
	localVarHttpHeaderAccept := a.Configuration.APIClient.SelectHeaderAccept(localVarHttpHeaderAccepts)
	if localVarHttpHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHttpHeaderAccept
	}
	fbs, _ := ioutil.ReadAll(file)
	localVarFileBytes = fbs
	localVarFileName = file.Name()
	fbs, _ := ioutil.ReadAll(file)
	localVarFileBytes = fbs
	localVarFileName = file.Name()
	localVarFormParams["notes"] = a.Configuration.APIClient.ParameterToString(notes, "")
	localVarFormParams["notesType"] = a.Configuration.APIClient.ParameterToString(notesType, "")
	localVarFormParams["notify"] = a.Configuration.APIClient.ParameterToString(notify, "")
	localVarFormParams["status"] = a.Configuration.APIClient.ParameterToString(status, "")
	localVarFormParams["strategy"] = a.Configuration.APIClient.ParameterToString(strategy, "")
	localVarFormParams["tags"] = a.Configuration.APIClient.ParameterToString(tags, "")
	localVarFormParams["teams"] = a.Configuration.APIClient.ParameterToString(teams, "")
	localVarFormParams["users"] = a.Configuration.APIClient.ParameterToString(users, "")
	localVarFormParams["mandatory"] = a.Configuration.APIClient.ParameterToString(mandatory, "")
	localVarFormParams["releaseType"] = a.Configuration.APIClient.ParameterToString(releaseType, "")
	localVarFormParams["private"] = a.Configuration.APIClient.ParameterToString(private, "")
	localVarFormParams["ownerId"] = a.Configuration.APIClient.ParameterToString(ownerId, "")
	localVarFormParams["commitSha"] = a.Configuration.APIClient.ParameterToString(commitSha, "")
	localVarFormParams["buildServerUrl"] = a.Configuration.APIClient.ParameterToString(buildServerUrl, "")
	localVarFormParams["repositoryUrl"] = a.Configuration.APIClient.ParameterToString(repositoryUrl, "")
	var successPayload = new(App)
	localVarHttpResponse, err := a.Configuration.APIClient.CallAPI(localVarPath, localVarHttpMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFileName, localVarFileBytes)

	var localVarURL, _ = url.Parse(localVarPath)
	localVarURL.RawQuery = localVarQueryParams.Encode()
	var localVarAPIResponse = &APIResponse{Operation: "AppsUploadPost", Method: localVarHttpMethod, RequestURL: localVarURL.String()}
	if localVarHttpResponse != nil {
		localVarAPIResponse.Response = localVarHttpResponse.RawResponse
		localVarAPIResponse.Payload = localVarHttpResponse.Body()
	}

	if err != nil {
		return successPayload, localVarAPIResponse, err
	}
	err = json.Unmarshal(localVarHttpResponse.Body(), &successPayload)
	return successPayload, localVarAPIResponse, err
}

