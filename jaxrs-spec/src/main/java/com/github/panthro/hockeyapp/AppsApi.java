package com.github.panthro.hockeyapp;

import io.swagger.model.Apps;
import io.swagger.model.App;
import java.io.File;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.util.List;

@Path("/apps")

@Api(description = "the apps API")


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2016-10-25T11:55:55.861Z")

public class AppsApi  {

    @GET
    
    
    
    @ApiOperation(value = "", notes = "Gets `Apps`. ", response = Apps.class, authorizations = {
        @Authorization(value = "token")
    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = Apps.class),
        @ApiResponse(code = 400, message = "Bad request", response = Apps.class) })
    public Response appsGet() {
    	return Response.ok().entity("magic!").build();
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
    public Response appsUploadPost( @FormParam(value = "ipa") InputStream ipaInputStream,
   @FormParam(value = "ipa" ) Attachment ipaDetail, @FormParam(value = "dsym", required = false) InputStream dsymInputStream,
   @FormParam(value = "dsym" , required = false) Attachment dsymDetail,@FormParam(value = "notes", required = false)  String notes,@FormParam(value = "notesType", required = false)  Integer notesType,@FormParam(value = "notify", required = false)  Integer notify,@FormParam(value = "status", required = false)  Integer status,@FormParam(value = "strategy", required = false)  String strategy,@FormParam(value = "tags", required = false)  List<String> tags,@FormParam(value = "teams", required = false)  List<Integer> teams,@FormParam(value = "users", required = false)  List<Integer> users,@FormParam(value = "mandatory", required = false)  Integer mandatory,@FormParam(value = "releaseType", required = false)  Integer releaseType,@FormParam(value = "_private", required = false)  Boolean _private,@FormParam(value = "ownerId", required = false)  Integer ownerId,@FormParam(value = "commitSha", required = false)  String commitSha,@FormParam(value = "buildServerUrl", required = false)  String buildServerUrl,@FormParam(value = "repositoryUrl", required = false)  String repositoryUrl) {
    	return Response.ok().entity("magic!").build();
    }
}

