using System;
using System.Collections.Generic;
using RestSharp;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace IO.Swagger.Api
{
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IDefaultApi
    {
        /// <summary>
        ///  Gets &#x60;Apps&#x60;. 
        /// </summary>
        /// <returns>Apps</returns>
        Apps AppsGet ();
        /// <summary>
        ///  Upload a new app
        /// </summary>
        /// <param name="ipa">file data of the .ipa for iOS, .app.zip for OS X, or .apk file for Android</param>
        /// <param name="dsym">file data of the .dSYM.zip file (iOS and OS X) or mapping.txt (Android); note that the extension has to be .dsym.zip (case-insensitive) for iOS and OS X and the file name has to be mapping.txt for Android.</param>
        /// <param name="notes">release notes as Textile or Markdown (after 5k characters note are truncated)</param>
        /// <param name="notesType">type of release notes. &#x60;0&#x60; for Textile, &#x60;1&#x60; for Markdown</param>
        /// <param name="notify">notify testers (can only be set with full-access tokens). &#x60;0&#x60; to not notify, &#x60;1&#x60; to notify all testers that can install this app,  &#x60;2&#x60; to notify all testers</param>
        /// <param name="status">download status (can only be set with full-access tokens). &#x60;1&#x60; to not allow users to download the version, &#x60;2&#x60; to make the version available for download</param>
        /// <param name="strategy">replace or add build with same build number. &#x60;add&#x60; to add the build as a new build to even if it has the same build number __default__, &#x60;replace&#x60; to replace to a build with the same build number</param>
        /// <param name="tags">restrict download to comma-separated list of tags</param>
        /// <param name="teams">restrict download to comma-separated list of team IDs</param>
        /// <param name="users">restrict download to comma-separated list of user IDs</param>
        /// <param name="mandatory">set version as mandatory &#x60;0&#x60; for not mandatory __default__, &#x60;1&#x60; for mandatory</param>
        /// <param name="releaseType">set the release type of the app. &#x60;0&#x60; for beta __default__  &#x60;1&#x60; for store &#x60;2&#x60; for alpha &#x60;3&#x60; for enterprise</param>
        /// <param name="_private">set to &#x60;true&#x60; to enable the private download page (default is &#x60;true&#x60;)</param>
        /// <param name="ownerId">set to the ID of your organization</param>
        /// <param name="commitSha">set to the git commit sha for this build</param>
        /// <param name="buildServerUrl">set to the URL of the build job on your build server</param>
        /// <param name="repositoryUrl">set to your source repository</param>
        /// <returns>App</returns>
        App AppsUploadPost (System.IO.Stream ipa, System.IO.Stream dsym, string notes, int? notesType, int? notify, int? status, string strategy, List<string> tags, List<int?> teams, List<int?> users, int? mandatory, int? releaseType, bool? _private, int? ownerId, string commitSha, string buildServerUrl, string repositoryUrl);
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class DefaultApi : IDefaultApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="DefaultApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public DefaultApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient; 
            else
                this.ApiClient = apiClient;
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="DefaultApi"/> class.
        /// </summary>
        /// <returns></returns>
        public DefaultApi(String basePath)
        {
            this.ApiClient = new ApiClient(basePath);
        }
    
        /// <summary>
        /// Sets the base path of the API client.
        /// </summary>
        /// <param name="basePath">The base path</param>
        /// <value>The base path</value>
        public void SetBasePath(String basePath)
        {
            this.ApiClient.BasePath = basePath;
        }
    
        /// <summary>
        /// Gets the base path of the API client.
        /// </summary>
        /// <param name="basePath">The base path</param>
        /// <value>The base path</value>
        public String GetBasePath(String basePath)
        {
            return this.ApiClient.BasePath;
        }
    
        /// <summary>
        /// Gets or sets the API client.
        /// </summary>
        /// <value>An instance of the ApiClient</value>
        public ApiClient ApiClient {get; set;}
    
        /// <summary>
        ///  Gets &#x60;Apps&#x60;. 
        /// </summary>
        /// <returns>Apps</returns>            
        public Apps AppsGet ()
        {
            
    
            var path = "/apps";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                                    
            // authentication setting, if any
            String[] authSettings = new String[] { "token" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling AppsGet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling AppsGet: " + response.ErrorMessage, response.ErrorMessage);
    
            return (Apps) ApiClient.Deserialize(response.Content, typeof(Apps), response.Headers);
        }
    
        /// <summary>
        ///  Upload a new app
        /// </summary>
        /// <param name="ipa">file data of the .ipa for iOS, .app.zip for OS X, or .apk file for Android</param> 
        /// <param name="dsym">file data of the .dSYM.zip file (iOS and OS X) or mapping.txt (Android); note that the extension has to be .dsym.zip (case-insensitive) for iOS and OS X and the file name has to be mapping.txt for Android.</param> 
        /// <param name="notes">release notes as Textile or Markdown (after 5k characters note are truncated)</param> 
        /// <param name="notesType">type of release notes. &#x60;0&#x60; for Textile, &#x60;1&#x60; for Markdown</param> 
        /// <param name="notify">notify testers (can only be set with full-access tokens). &#x60;0&#x60; to not notify, &#x60;1&#x60; to notify all testers that can install this app,  &#x60;2&#x60; to notify all testers</param> 
        /// <param name="status">download status (can only be set with full-access tokens). &#x60;1&#x60; to not allow users to download the version, &#x60;2&#x60; to make the version available for download</param> 
        /// <param name="strategy">replace or add build with same build number. &#x60;add&#x60; to add the build as a new build to even if it has the same build number __default__, &#x60;replace&#x60; to replace to a build with the same build number</param> 
        /// <param name="tags">restrict download to comma-separated list of tags</param> 
        /// <param name="teams">restrict download to comma-separated list of team IDs</param> 
        /// <param name="users">restrict download to comma-separated list of user IDs</param> 
        /// <param name="mandatory">set version as mandatory &#x60;0&#x60; for not mandatory __default__, &#x60;1&#x60; for mandatory</param> 
        /// <param name="releaseType">set the release type of the app. &#x60;0&#x60; for beta __default__  &#x60;1&#x60; for store &#x60;2&#x60; for alpha &#x60;3&#x60; for enterprise</param> 
        /// <param name="_private">set to &#x60;true&#x60; to enable the private download page (default is &#x60;true&#x60;)</param> 
        /// <param name="ownerId">set to the ID of your organization</param> 
        /// <param name="commitSha">set to the git commit sha for this build</param> 
        /// <param name="buildServerUrl">set to the URL of the build job on your build server</param> 
        /// <param name="repositoryUrl">set to your source repository</param> 
        /// <returns>App</returns>            
        public App AppsUploadPost (System.IO.Stream ipa, System.IO.Stream dsym, string notes, int? notesType, int? notify, int? status, string strategy, List<string> tags, List<int?> teams, List<int?> users, int? mandatory, int? releaseType, bool? _private, int? ownerId, string commitSha, string buildServerUrl, string repositoryUrl)
        {
            
            // verify the required parameter 'ipa' is set
            if (ipa == null) throw new ApiException(400, "Missing required parameter 'ipa' when calling AppsUploadPost");
            
    
            var path = "/apps/upload";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                    if (ipa != null) fileParams.Add("Ipa", ApiClient.ParameterToFile("Ipa", ipa));
if (dsym != null) fileParams.Add("dsym", ApiClient.ParameterToFile("dsym", dsym));
if (notes != null) formParams.Add("notes", ApiClient.ParameterToString(notes)); // form parameter
if (notesType != null) formParams.Add("notes_type", ApiClient.ParameterToString(notesType)); // form parameter
if (notify != null) formParams.Add("notify", ApiClient.ParameterToString(notify)); // form parameter
if (status != null) formParams.Add("status", ApiClient.ParameterToString(status)); // form parameter
if (strategy != null) formParams.Add("strategy", ApiClient.ParameterToString(strategy)); // form parameter
if (tags != null) formParams.Add("tags", ApiClient.ParameterToString(tags)); // form parameter
if (teams != null) formParams.Add("teams", ApiClient.ParameterToString(teams)); // form parameter
if (users != null) formParams.Add("users", ApiClient.ParameterToString(users)); // form parameter
if (mandatory != null) formParams.Add("mandatory", ApiClient.ParameterToString(mandatory)); // form parameter
if (releaseType != null) formParams.Add("release_type", ApiClient.ParameterToString(releaseType)); // form parameter
if (_private != null) formParams.Add("private", ApiClient.ParameterToString(_private)); // form parameter
if (ownerId != null) formParams.Add("owner_id", ApiClient.ParameterToString(ownerId)); // form parameter
if (commitSha != null) formParams.Add("commit_sha", ApiClient.ParameterToString(commitSha)); // form parameter
if (buildServerUrl != null) formParams.Add("build_server_url", ApiClient.ParameterToString(buildServerUrl)); // form parameter
if (repositoryUrl != null) formParams.Add("repository_url", ApiClient.ParameterToString(repositoryUrl)); // form parameter
                
            // authentication setting, if any
            String[] authSettings = new String[] { "token" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling AppsUploadPost: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling AppsUploadPost: " + response.ErrorMessage, response.ErrorMessage);
    
            return (App) ApiClient.Deserialize(response.Content, typeof(App), response.Headers);
        }
    
    }
}
