# hockeyapp_public_api_wrapper

HockeyappPublicApiWrapper - JavaScript client for hockeyapp_public_api_wrapper
No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
This SDK is automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen) project:

- API version: 0.0.2
- Package version: 0.0.2
- Build package: class io.swagger.codegen.languages.JavascriptClientCodegen

## Installation

### For [Node.js](https://nodejs.org/)

#### npm

To publish the library as a [npm](https://www.npmjs.com/),
please follow the procedure in ["Publishing npm packages"](https://docs.npmjs.com/getting-started/publishing-npm-packages).

Then install it via:

```shell
npm install hockeyapp_public_api_wrapper --save
```

#### git
#
If the library is hosted at a git repository, e.g.
https://github.com/GIT_USER_ID/GIT_REPO_ID
then install it via:

```shell
    npm install GIT_USER_ID/GIT_REPO_ID --save
```

### For browser

The library also works in the browser environment via npm and [browserify](http://browserify.org/). After following
the above steps with Node.js and installing browserify with `npm install -g browserify`,
perform the following (assuming *main.js* is your entry file):

```shell
browserify main.js > bundle.js
```

Then include *bundle.js* in the HTML pages.

## Getting Started

Please follow the [installation](#installation) instruction and execute the following JS code:

```javascript
var HockeyappPublicApiWrapper = require('hockeyapp_public_api_wrapper');

var defaultClient = HockeyappPublicApiWrapper.ApiClient.instance;

// Configure API key authorization: token
var token = defaultClient.authentications['token'];
token.apiKey = "YOUR API KEY"
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//token.apiKeyPrefix['X-HockeyAppToken'] = "Token"

var api = new HockeyappPublicApiWrapper.DefaultApi()

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
api.appsGet(callback);

```

## Documentation for API Endpoints

All URIs are relative to *https://rink.hockeyapp.net/api/2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*HockeyappPublicApiWrapper.DefaultApi* | [**appsGet**](docs/DefaultApi.md#appsGet) | **GET** /apps | 
*HockeyappPublicApiWrapper.DefaultApi* | [**appsUploadPost**](docs/DefaultApi.md#appsUploadPost) | **POST** /apps/upload | 


## Documentation for Models

 - [HockeyappPublicApiWrapper.App](docs/App.md)
 - [HockeyappPublicApiWrapper.Apps](docs/Apps.md)
 - [HockeyappPublicApiWrapper.AppsApps](docs/AppsApps.md)


## Documentation for Authorization


### token

- **Type**: API key
- **API key parameter name**: X-HockeyAppToken
- **Location**: HTTP header
