package com.github.panthro.hockeyapp;

import io.swagger.model.*;
import com.github.panthro.hockeyapp.AppsApiService;
import com.github.panthro.hockeyapp.factories.AppsApiServiceFactory;

import io.swagger.model.Apps;
import io.swagger.model.App;
import java.io.File;

import java.util.List;
import com.github.panthro.hockeyapp.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;

@Path("/apps")


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2016-10-25T11:55:55.901Z")
public class AppsApi  {
   private final AppsApiService delegate = AppsApiServiceFactory.getAppsApi();

    @GET
    
    
    
    public Response appsGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.appsGet(securityContext);
    }
    @POST
    @Path("/upload")
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    public Response appsUploadPost(MultipartFormDataInput input,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.appsUploadPost(input,securityContext);
    }
}
