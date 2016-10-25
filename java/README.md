# hockeyapp-api

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.github.panthro.hockeyapp</groupId>
    <artifactId>hockeyapp-api</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.github.panthro.hockeyapp:hockeyapp-api:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/hockeyapp-api-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.github.panthro.*;
import com.github.panthro.auth.*;
import io.swagger.client.model.*;
import com.github.panthro.hockeyapp.DefaultApi;

import java.io.File;
import java.util.*;

public class DefaultApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure API key authorization: token
        ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
        token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //token.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi();
        try {
            Apps result = apiInstance.appsGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#appsGet");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://rink.hockeyapp.net/api/2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**appsGet**](docs/DefaultApi.md#appsGet) | **GET** /apps | 
*DefaultApi* | [**appsUploadPost**](docs/DefaultApi.md#appsUploadPost) | **POST** /apps/upload | 


## Documentation for Models

 - [App](docs/App.md)
 - [Apps](docs/Apps.md)
 - [AppsApps](docs/AppsApps.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### token

- **Type**: API key
- **API key parameter name**: X-HockeyAppToken
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



