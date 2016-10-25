package com.github.panthro.hockeyapp.impl;

import com.github.panthro.hockeyapp.*;
import io.swagger.model.*;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;


import io.swagger.model.Apps;
import io.swagger.model.App;
import java.io.File;

import java.util.List;
import com.github.panthro.hockeyapp.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2016-10-25T11:55:55.901Z")
public class AppsApiServiceImpl extends AppsApiService {
      @Override
      public Response appsGet(SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      @Override
      public Response appsUploadPost(MultipartFormDataInput input,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
}
