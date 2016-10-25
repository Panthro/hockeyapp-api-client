package com.github.panthro.hockeyapp.factories;

import com.github.panthro.hockeyapp.AppsApiService;
import com.github.panthro.hockeyapp.impl.AppsApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2016-10-25T11:55:55.901Z")
public class AppsApiServiceFactory {

   private final static AppsApiService service = new AppsApiServiceImpl();

   public static AppsApiService getAppsApi()
   {
      return service;
   }
}
