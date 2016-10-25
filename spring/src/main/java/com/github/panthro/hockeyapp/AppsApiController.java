package com.github.panthro.hockeyapp;

import io.swagger.model.Apps;
import io.swagger.model.App;
import java.io.File;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-10-25T11:56:12.494Z")

@Controller
public class AppsApiController implements AppsApi {

    public ResponseEntity<Apps> appsGet() {
        // do some magic!
        return new ResponseEntity<Apps>(HttpStatus.OK);
    }

    public ResponseEntity<App> appsUploadPost(


@ApiParam(value = "file detail") @RequestPart("file") MultipartFile Ipa
,
        


@ApiParam(value = "file detail") @RequestPart("file") MultipartFile dsym
,
        


@ApiParam(value = "release notes as Textile or Markdown (after 5k characters note are truncated)" ) @RequestPart(value="notes", required=false)  String notes
,
        


@ApiParam(value = "type of release notes. `0` for Textile, `1` for Markdown" ) @RequestPart(value="notesType", required=false)  Integer notesType
,
        


@ApiParam(value = "notify testers (can only be set with full-access tokens). `0` to not notify, `1` to notify all testers that can install this app,  `2` to notify all testers" ) @RequestPart(value="notify", required=false)  Integer notify
,
        


@ApiParam(value = "download status (can only be set with full-access tokens). `1` to not allow users to download the version, `2` to make the version available for download" ) @RequestPart(value="status", required=false)  Integer status
,
        


@ApiParam(value = "replace or add build with same build number. `add` to add the build as a new build to even if it has the same build number __default__, `replace` to replace to a build with the same build number" , allowableValues="ADD, REPLACE") @RequestPart(value="strategy", required=false)  String strategy
,
        


@ApiParam(value = "restrict download to comma-separated list of tags" ) @RequestPart(value="tags", required=false)  List<String> tags
,
        


@ApiParam(value = "restrict download to comma-separated list of team IDs" ) @RequestPart(value="teams", required=false)  List<Integer> teams
,
        


@ApiParam(value = "restrict download to comma-separated list of user IDs" ) @RequestPart(value="users", required=false)  List<Integer> users
,
        


@ApiParam(value = "set version as mandatory `0` for not mandatory __default__, `1` for mandatory" ) @RequestPart(value="mandatory", required=false)  Integer mandatory
,
        


@ApiParam(value = "set the release type of the app. `0` for beta __default__  `1` for store `2` for alpha `3` for enterprise" ) @RequestPart(value="releaseType", required=false)  Integer releaseType
,
        


@ApiParam(value = "set to `true` to enable the private download page (default is `true`)" ) @RequestPart(value="_private", required=false)  Boolean _private
,
        


@ApiParam(value = "set to the ID of your organization" ) @RequestPart(value="ownerId", required=false)  Integer ownerId
,
        


@ApiParam(value = "set to the git commit sha for this build" ) @RequestPart(value="commitSha", required=false)  String commitSha
,
        


@ApiParam(value = "set to the URL of the build job on your build server" ) @RequestPart(value="buildServerUrl", required=false)  String buildServerUrl
,
        


@ApiParam(value = "set to your source repository" ) @RequestPart(value="repositoryUrl", required=false)  String repositoryUrl
) {
        // do some magic!
        return new ResponseEntity<App>(HttpStatus.OK);
    }

}
