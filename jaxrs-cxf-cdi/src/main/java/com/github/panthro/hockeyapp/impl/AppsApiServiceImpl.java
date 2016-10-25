package com.github.panthro.hockeyapp.impl;

import com.github.panthro.hockeyapp.*;
import io.swagger.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;

import io.swagger.model.Apps;
import io.swagger.model.App;
import java.io.File;

import java.util.List;

import java.io.InputStream;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@RequestScoped
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2016-10-25T11:55:57.707Z")
public class AppsApiServiceImpl implements AppsApiService {
      @Override
      public Response appsGet(SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      @Override
      public Response appsUploadPost(InputStream ipaInputStream, Attachment ipaDetail, InputStream dsymInputStream, Attachment dsymDetail, String notes, Integer notesType, Integer notify, Integer status, String strategy, List<String> tags, List<Integer> teams, List<Integer> users, Integer mandatory, Integer releaseType, Boolean _private, Integer ownerId, String commitSha, String buildServerUrl, String repositoryUrl, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
}
