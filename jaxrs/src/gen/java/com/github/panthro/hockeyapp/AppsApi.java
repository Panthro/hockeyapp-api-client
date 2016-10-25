package com.github.panthro.hockeyapp;

import io.swagger.model.*;
import com.github.panthro.hockeyapp.AppsApiService;
import com.github.panthro.hockeyapp.factories.AppsApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import io.swagger.model.Apps;
import io.swagger.model.App;
import java.io.File;

import java.util.List;
import com.github.panthro.hockeyapp.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/apps")


@io.swagger.annotations.Api(description = "the apps API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-10-25T11:56:06.721Z")
public class AppsApi  {
   private final AppsApiService delegate = AppsApiServiceFactory.getAppsApi();

    @GET
    
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "Gets `Apps`. ", response = Apps.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "token")
    }, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful response", response = Apps.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad request", response = Apps.class) })
    public Response appsGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.appsGet(securityContext);
    }
    @POST
    @Path("/upload")
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Upload a new app", response = App.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "token")
    }, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "Upload success", response = App.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad request", response = App.class) })
    public Response appsUploadPost(
            @FormDataParam("ipa") InputStream ipaInputStream,
            @FormDataParam("ipa") FormDataContentDisposition ipaDetail
,
            @FormDataParam("dsym") InputStream dsymInputStream,
            @FormDataParam("dsym") FormDataContentDisposition dsymDetail
,@ApiParam(value = "release notes as Textile or Markdown (after 5k characters note are truncated)")@FormDataParam("notes")  String notes
,@ApiParam(value = "type of release notes. `0` for Textile, `1` for Markdown")@FormDataParam("notesType")  Integer notesType
,@ApiParam(value = "notify testers (can only be set with full-access tokens). `0` to not notify, `1` to notify all testers that can install this app,  `2` to notify all testers")@FormDataParam("notify")  Integer notify
,@ApiParam(value = "download status (can only be set with full-access tokens). `1` to not allow users to download the version, `2` to make the version available for download")@FormDataParam("status")  Integer status
,@ApiParam(value = "replace or add build with same build number. `add` to add the build as a new build to even if it has the same build number __default__, `replace` to replace to a build with the same build number", allowableValues="add, replace")@FormDataParam("strategy")  String strategy
,@ApiParam(value = "restrict download to comma-separated list of tags")@FormDataParam("tags")  List<String> tags
,@ApiParam(value = "restrict download to comma-separated list of team IDs")@FormDataParam("teams")  List<Integer> teams
,@ApiParam(value = "restrict download to comma-separated list of user IDs")@FormDataParam("users")  List<Integer> users
,@ApiParam(value = "set version as mandatory `0` for not mandatory __default__, `1` for mandatory")@FormDataParam("mandatory")  Integer mandatory
,@ApiParam(value = "set the release type of the app. `0` for beta __default__  `1` for store `2` for alpha `3` for enterprise")@FormDataParam("releaseType")  Integer releaseType
,@ApiParam(value = "set to `true` to enable the private download page (default is `true`)")@FormDataParam("_private")  Boolean _private
,@ApiParam(value = "set to the ID of your organization")@FormDataParam("ownerId")  Integer ownerId
,@ApiParam(value = "set to the git commit sha for this build")@FormDataParam("commitSha")  String commitSha
,@ApiParam(value = "set to the URL of the build job on your build server")@FormDataParam("buildServerUrl")  String buildServerUrl
,@ApiParam(value = "set to your source repository")@FormDataParam("repositoryUrl")  String repositoryUrl
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.appsUploadPost(ipaInputStream, ipaDetail,dsymInputStream, dsymDetail,notes,notesType,notify,status,strategy,tags,teams,users,mandatory,releaseType,_private,ownerId,commitSha,buildServerUrl,repositoryUrl,securityContext);
    }
}
