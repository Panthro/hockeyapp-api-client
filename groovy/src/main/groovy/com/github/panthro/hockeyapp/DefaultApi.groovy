package com.github.panthro.hockeyapp;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import com.github.panthro.ApiUtils

import io.swagger.model.Apps
import io.swagger.model.App
import io.swagger.model.File

import java.util.*;

@Mixin(ApiUtils)
class DefaultApi {
    String basePath = "https://rink.hockeyapp.net/api/2"
    String versionPath = "/api/v1"

    def appsGet ( Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/apps"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    Apps.class )
                    
    }
    def appsUploadPost ( File ipa, File dsym, String notes, Integer notesType, Integer notify, Integer status, String strategy, List<String> tags, List<Integer> teams, List<Integer> users, Integer mandatory, Integer releaseType, Boolean _private, Integer ownerId, String commitSha, String buildServerUrl, String repositoryUrl, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/apps/upload"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (ipa == null) {
            throw new RuntimeException("missing required params ipa")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    App.class )
                    
    }
}
