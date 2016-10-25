package com.github.panthro.hockeyapp;

import com.github.panthro.hockeyapp.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.Apps;
import io.swagger.model.App;
import java.io.File;

import java.util.List;
import com.github.panthro.hockeyapp.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-10-25T11:56:06.721Z")
public abstract class AppsApiService {
    public abstract Response appsGet(SecurityContext securityContext) throws NotFoundException;
    public abstract Response appsUploadPost(InputStream ipaInputStream, FormDataContentDisposition ipaDetail,InputStream dsymInputStream, FormDataContentDisposition dsymDetail,String notes,Integer notesType,Integer notify,Integer status,String strategy,List<String> tags,List<Integer> teams,List<Integer> users,Integer mandatory,Integer releaseType,Boolean _private,Integer ownerId,String commitSha,String buildServerUrl,String repositoryUrl,SecurityContext securityContext) throws NotFoundException;
}
