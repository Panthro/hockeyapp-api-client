/**
 * Hockeyapp Public API wrapper
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 0.0.2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.panthro.hockeyapp;

import io.swagger.client.ApiInvoker;
import io.swagger.client.ApiException;
import io.swagger.client.Pair;

import io.swagger.client.model.*;

import java.util.*;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import io.swagger.client.model.Apps;
import io.swagger.client.model.App;
import java.io.File;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class DefaultApi {
  String basePath = "https://rink.hockeyapp.net/api/2";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public void addHeader(String key, String value) {
    getInvoker().addDefaultHeader(key, value);
  }

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
  }

  /**
  * 
  * Gets &#x60;Apps&#x60;. 
   * @return Apps
  */
  public Apps appsGet () throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  

  // create path and map variables
  String path = "/apps".replaceAll("\\{format\\}","json");

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();



      String[] contentTypes = {
  
      };
      String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

      if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
        }

      String[] authNames = new String[] { "token" };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (Apps) ApiInvoker.deserialize(localVarResponse, "", Apps.class);
        } else {
           return null;
        }
      } catch (ApiException ex) {
         throw ex;
      } catch (InterruptedException ex) {
         throw ex;
      } catch (ExecutionException ex) {
         if(ex.getCause() instanceof VolleyError) {
	    VolleyError volleyError = (VolleyError)ex.getCause();
	    if (volleyError.networkResponse != null) {
	       throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
	    }
         }
         throw ex;
      } catch (TimeoutException ex) {
         throw ex;
      }
  }

      /**
   * 
   * Gets &#x60;Apps&#x60;. 

  */
  public void appsGet (final Response.Listener<Apps> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  

    // create path and map variables
    String path = "/apps".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

      String[] authNames = new String[] { "token" };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((Apps) ApiInvoker.deserialize(localVarResponse,  "", Apps.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * 
  * Upload a new app
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
   * @param _private set to &#x60;true&#x60; to enable the private download page (default is &#x60;true&#x60;)
   * @param ownerId set to the ID of your organization
   * @param commitSha set to the git commit sha for this build
   * @param buildServerUrl set to the URL of the build job on your build server
   * @param repositoryUrl set to your source repository
   * @return App
  */
  public App appsUploadPost (File ipa, File dsym, String notes, Integer notesType, Integer notify, Integer status, String strategy, List<String> tags, List<Integer> teams, List<Integer> users, Integer mandatory, Integer releaseType, Boolean _private, Integer ownerId, String commitSha, String buildServerUrl, String repositoryUrl) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'ipa' is set
      if (ipa == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'ipa' when calling appsUploadPost",
      new ApiException(400, "Missing the required parameter 'ipa' when calling appsUploadPost"));
      }
  

  // create path and map variables
  String path = "/apps/upload".replaceAll("\\{format\\}","json");

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();



      String[] contentTypes = {
  "multipart/form-data"
      };
      String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

      if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
  
          if (ipa != null) {
          localVarBuilder.addBinaryBody("Ipa", ipa);
          }
  
          if (dsym != null) {
          localVarBuilder.addBinaryBody("dsym", dsym);
          }
  
          if (notes != null) {
          localVarBuilder.addTextBody("notes", ApiInvoker.parameterToString(notes), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  
          if (notesType != null) {
          localVarBuilder.addTextBody("notes_type", ApiInvoker.parameterToString(notesType), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  
          if (notify != null) {
          localVarBuilder.addTextBody("notify", ApiInvoker.parameterToString(notify), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  
          if (status != null) {
          localVarBuilder.addTextBody("status", ApiInvoker.parameterToString(status), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  
          if (strategy != null) {
          localVarBuilder.addTextBody("strategy", ApiInvoker.parameterToString(strategy), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  
          if (tags != null) {
          localVarBuilder.addTextBody("tags", ApiInvoker.parameterToString(tags), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  
          if (teams != null) {
          localVarBuilder.addTextBody("teams", ApiInvoker.parameterToString(teams), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  
          if (users != null) {
          localVarBuilder.addTextBody("users", ApiInvoker.parameterToString(users), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  
          if (mandatory != null) {
          localVarBuilder.addTextBody("mandatory", ApiInvoker.parameterToString(mandatory), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  
          if (releaseType != null) {
          localVarBuilder.addTextBody("release_type", ApiInvoker.parameterToString(releaseType), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  
          if (_private != null) {
          localVarBuilder.addTextBody("private", ApiInvoker.parameterToString(_private), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  
          if (ownerId != null) {
          localVarBuilder.addTextBody("owner_id", ApiInvoker.parameterToString(ownerId), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  
          if (commitSha != null) {
          localVarBuilder.addTextBody("commit_sha", ApiInvoker.parameterToString(commitSha), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  
          if (buildServerUrl != null) {
          localVarBuilder.addTextBody("build_server_url", ApiInvoker.parameterToString(buildServerUrl), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  
          if (repositoryUrl != null) {
          localVarBuilder.addTextBody("repository_url", ApiInvoker.parameterToString(repositoryUrl), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
  

formParams.put("notes", ApiInvoker.parameterToString(notes));
formParams.put("notes_type", ApiInvoker.parameterToString(notesType));
formParams.put("notify", ApiInvoker.parameterToString(notify));
formParams.put("status", ApiInvoker.parameterToString(status));
formParams.put("strategy", ApiInvoker.parameterToString(strategy));
formParams.put("tags", ApiInvoker.parameterToString(tags));
formParams.put("teams", ApiInvoker.parameterToString(teams));
formParams.put("users", ApiInvoker.parameterToString(users));
formParams.put("mandatory", ApiInvoker.parameterToString(mandatory));
formParams.put("release_type", ApiInvoker.parameterToString(releaseType));
formParams.put("private", ApiInvoker.parameterToString(_private));
formParams.put("owner_id", ApiInvoker.parameterToString(ownerId));
formParams.put("commit_sha", ApiInvoker.parameterToString(commitSha));
formParams.put("build_server_url", ApiInvoker.parameterToString(buildServerUrl));
formParams.put("repository_url", ApiInvoker.parameterToString(repositoryUrl));
      }

      String[] authNames = new String[] { "token" };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (App) ApiInvoker.deserialize(localVarResponse, "", App.class);
        } else {
           return null;
        }
      } catch (ApiException ex) {
         throw ex;
      } catch (InterruptedException ex) {
         throw ex;
      } catch (ExecutionException ex) {
         if(ex.getCause() instanceof VolleyError) {
	    VolleyError volleyError = (VolleyError)ex.getCause();
	    if (volleyError.networkResponse != null) {
	       throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
	    }
         }
         throw ex;
      } catch (TimeoutException ex) {
         throw ex;
      }
  }

      /**
   * 
   * Upload a new app
   * @param ipa file data of the .ipa for iOS, .app.zip for OS X, or .apk file for Android   * @param dsym file data of the .dSYM.zip file (iOS and OS X) or mapping.txt (Android); note that the extension has to be .dsym.zip (case-insensitive) for iOS and OS X and the file name has to be mapping.txt for Android.   * @param notes release notes as Textile or Markdown (after 5k characters note are truncated)   * @param notesType type of release notes. &#x60;0&#x60; for Textile, &#x60;1&#x60; for Markdown   * @param notify notify testers (can only be set with full-access tokens). &#x60;0&#x60; to not notify, &#x60;1&#x60; to notify all testers that can install this app,  &#x60;2&#x60; to notify all testers   * @param status download status (can only be set with full-access tokens). &#x60;1&#x60; to not allow users to download the version, &#x60;2&#x60; to make the version available for download   * @param strategy replace or add build with same build number. &#x60;add&#x60; to add the build as a new build to even if it has the same build number __default__, &#x60;replace&#x60; to replace to a build with the same build number   * @param tags restrict download to comma-separated list of tags   * @param teams restrict download to comma-separated list of team IDs   * @param users restrict download to comma-separated list of user IDs   * @param mandatory set version as mandatory &#x60;0&#x60; for not mandatory __default__, &#x60;1&#x60; for mandatory   * @param releaseType set the release type of the app. &#x60;0&#x60; for beta __default__  &#x60;1&#x60; for store &#x60;2&#x60; for alpha &#x60;3&#x60; for enterprise   * @param _private set to &#x60;true&#x60; to enable the private download page (default is &#x60;true&#x60;)   * @param ownerId set to the ID of your organization   * @param commitSha set to the git commit sha for this build   * @param buildServerUrl set to the URL of the build job on your build server   * @param repositoryUrl set to your source repository
  */
  public void appsUploadPost (File ipa, File dsym, String notes, Integer notesType, Integer notify, Integer status, String strategy, List<String> tags, List<Integer> teams, List<Integer> users, Integer mandatory, Integer releaseType, Boolean _private, Integer ownerId, String commitSha, String buildServerUrl, String repositoryUrl, final Response.Listener<App> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'ipa' is set
    if (ipa == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'ipa' when calling appsUploadPost",
         new ApiException(400, "Missing the required parameter 'ipa' when calling appsUploadPost"));
    }
    

    // create path and map variables
    String path = "/apps/upload".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      "multipart/form-data"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      
      if (ipa != null) {
        localVarBuilder.addBinaryBody("Ipa", ipa);
      }
      
      if (dsym != null) {
        localVarBuilder.addBinaryBody("dsym", dsym);
      }
      
      if (notes != null) {
        localVarBuilder.addTextBody("notes", ApiInvoker.parameterToString(notes), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (notesType != null) {
        localVarBuilder.addTextBody("notes_type", ApiInvoker.parameterToString(notesType), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (notify != null) {
        localVarBuilder.addTextBody("notify", ApiInvoker.parameterToString(notify), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (status != null) {
        localVarBuilder.addTextBody("status", ApiInvoker.parameterToString(status), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (strategy != null) {
        localVarBuilder.addTextBody("strategy", ApiInvoker.parameterToString(strategy), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (tags != null) {
        localVarBuilder.addTextBody("tags", ApiInvoker.parameterToString(tags), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (teams != null) {
        localVarBuilder.addTextBody("teams", ApiInvoker.parameterToString(teams), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (users != null) {
        localVarBuilder.addTextBody("users", ApiInvoker.parameterToString(users), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (mandatory != null) {
        localVarBuilder.addTextBody("mandatory", ApiInvoker.parameterToString(mandatory), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (releaseType != null) {
        localVarBuilder.addTextBody("release_type", ApiInvoker.parameterToString(releaseType), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (_private != null) {
        localVarBuilder.addTextBody("private", ApiInvoker.parameterToString(_private), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (ownerId != null) {
        localVarBuilder.addTextBody("owner_id", ApiInvoker.parameterToString(ownerId), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (commitSha != null) {
        localVarBuilder.addTextBody("commit_sha", ApiInvoker.parameterToString(commitSha), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (buildServerUrl != null) {
        localVarBuilder.addTextBody("build_server_url", ApiInvoker.parameterToString(buildServerUrl), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (repositoryUrl != null) {
        localVarBuilder.addTextBody("repository_url", ApiInvoker.parameterToString(repositoryUrl), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      

formParams.put("notes", ApiInvoker.parameterToString(notes));
formParams.put("notes_type", ApiInvoker.parameterToString(notesType));
formParams.put("notify", ApiInvoker.parameterToString(notify));
formParams.put("status", ApiInvoker.parameterToString(status));
formParams.put("strategy", ApiInvoker.parameterToString(strategy));
formParams.put("tags", ApiInvoker.parameterToString(tags));
formParams.put("teams", ApiInvoker.parameterToString(teams));
formParams.put("users", ApiInvoker.parameterToString(users));
formParams.put("mandatory", ApiInvoker.parameterToString(mandatory));
formParams.put("release_type", ApiInvoker.parameterToString(releaseType));
formParams.put("private", ApiInvoker.parameterToString(_private));
formParams.put("owner_id", ApiInvoker.parameterToString(ownerId));
formParams.put("commit_sha", ApiInvoker.parameterToString(commitSha));
formParams.put("build_server_url", ApiInvoker.parameterToString(buildServerUrl));
formParams.put("repository_url", ApiInvoker.parameterToString(repositoryUrl));
    }

      String[] authNames = new String[] { "token" };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((App) ApiInvoker.deserialize(localVarResponse,  "", App.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
}