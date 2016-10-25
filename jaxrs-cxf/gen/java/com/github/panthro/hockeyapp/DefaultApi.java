package com.github.panthro.hockeyapp;

import io.swagger.model.Apps;
import io.swagger.model.App;
import java.io.File;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import org.apache.cxf.jaxrs.ext.multipart.*;

@Path("/api/2")
public interface DefaultApi  {
    @GET
    @Path("/apps")
    
    
    Response appsGet();
    @POST
    @Path("/apps/upload")
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    Response appsUploadPost( @Multipart(value = "ipa") InputStream ipaInputStream,
   @Multipart(value = "ipa" ) Attachment ipaDetail, @Multipart(value = "dsym", required = false) InputStream dsymInputStream,
   @Multipart(value = "dsym" , required = false) Attachment dsymDetail,@Multipart(value = "notes", required = false)  String notes,@Multipart(value = "notesType", required = false)  Integer notesType,@Multipart(value = "notify", required = false)  Integer notify,@Multipart(value = "status", required = false)  Integer status,@Multipart(value = "strategy", required = false)  String strategy,@Multipart(value = "tags", required = false)  List<String> tags,@Multipart(value = "teams", required = false)  List<Integer> teams,@Multipart(value = "users", required = false)  List<Integer> users,@Multipart(value = "mandatory", required = false)  Integer mandatory,@Multipart(value = "releaseType", required = false)  Integer releaseType,@Multipart(value = "_private", required = false)  Boolean _private,@Multipart(value = "ownerId", required = false)  Integer ownerId,@Multipart(value = "commitSha", required = false)  String commitSha,@Multipart(value = "buildServerUrl", required = false)  String buildServerUrl,@Multipart(value = "repositoryUrl", required = false)  String repositoryUrl);
}

