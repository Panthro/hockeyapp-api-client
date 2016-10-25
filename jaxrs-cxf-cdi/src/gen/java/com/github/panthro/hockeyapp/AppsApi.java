package com.github.panthro.hockeyapp;

import io.swagger.model.Apps;
import io.swagger.model.App;
import java.io.File;
import com.github.panthro.hockeyapp.AppsApiService;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import io.swagger.annotations.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;

import java.util.List;

@Path("/apps")
@RequestScoped

@Api(description = "the apps API")


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2016-10-25T11:55:57.707Z")

public class AppsApi  {

  @Context SecurityContext securityContext;

  @Inject AppsApiService delegate;


    @GET
    
    
    
    @ApiOperation(value = "", notes = "Gets `Apps`. ", response = Apps.class, authorizations = {
        @Authorization(value = "token")
    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = Apps.class),
        @ApiResponse(code = 400, message = "Bad request", response = Apps.class) })
    public Response appsGet() {
    	return delegate.appsGet(securityContext);
    }

    @POST
    @Path("/upload")
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "Upload a new app", response = App.class, authorizations = {
        @Authorization(value = "token")
    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Upload success", response = App.class),
        @ApiResponse(code = 400, message = "Bad request", response = App.class) })
    public Response appsUploadPost( @Multipart(value = "ipa") InputStream ipaInputStream, @Multipart(value = "ipa" ) Attachment ipaDetail,  @Multipart(value = "dsym", required = false) InputStream dsymInputStream, @Multipart(value = "dsym" , required = false) Attachment dsymDetail, @Multipart(value = "notes", required = false)  String notes, @Multipart(value = "notesType", required = false)  Integer notesType, @Multipart(value = "notify", required = false)  Integer notify, @Multipart(value = "status", required = false)  Integer status, @Multipart(value = "strategy", required = false)  String strategy, @Multipart(value = "tags", required = false)  List<String> tags, @Multipart(value = "teams", required = false)  List<Integer> teams, @Multipart(value = "users", required = false)  List<Integer> users, @Multipart(value = "mandatory", required = false)  Integer mandatory, @Multipart(value = "releaseType", required = false)  Integer releaseType, @Multipart(value = "_private", required = false)  Boolean _private, @Multipart(value = "ownerId", required = false)  Integer ownerId, @Multipart(value = "commitSha", required = false)  String commitSha, @Multipart(value = "buildServerUrl", required = false)  String buildServerUrl, @Multipart(value = "repositoryUrl", required = false)  String repositoryUrl) {
    	return delegate.appsUploadPost(inputStream, fileDetail, inputStream, fileDetail, notes, notesType, notify, status, strategy, tags, teams, users, mandatory, releaseType, _private, ownerId, commitSha, buildServerUrl, repositoryUrl, securityContext);
    }
}
