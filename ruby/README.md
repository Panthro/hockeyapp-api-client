# swagger_client

SwaggerClient - the Ruby gem for the Hockeyapp Public API wrapper

No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)

This SDK is automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen) project:

- API version: 0.0.2
- Package version: 1.0.0
- Build package: class io.swagger.codegen.languages.RubyClientCodegen

## Installation

### Build a gem

To build the Ruby code into a gem:

```shell
gem build swagger_client.gemspec
```

Then either install the gem locally:

```shell
gem install ./swagger_client-1.0.0.gem
```
(for development, run `gem install --dev ./swagger_client-1.0.0.gem` to install the development dependencies)

or publish the gem to a gem hosting service, e.g. [RubyGems](https://rubygems.org/).

Finally add this to the Gemfile:

    gem 'swagger_client', '~> 1.0.0'

### Install from Git

If the Ruby gem is hosted at a git repository: https://github.com/GIT_USER_ID/GIT_REPO_ID, then add the following in the Gemfile:

    gem 'swagger_client', :git => 'https://github.com/GIT_USER_ID/GIT_REPO_ID.git'

### Include the Ruby code directly

Include the Ruby code directly using `-I` as follows:

```shell
ruby -Ilib script.rb
```

## Getting Started

Please follow the [installation](#installation) procedure and then run the following code:
```ruby
# Load the gem
require 'swagger_client'

# Setup authorization
SwaggerClient.configure do |config|
  # Configure API key authorization: token
  config.api_key['X-HockeyAppToken'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-HockeyAppToken'] = 'Bearer'
end

api_instance = SwaggerClient::DefaultApi.new

begin
  result = api_instance.apps_get
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling DefaultApi->apps_get: #{e}"
end

```

## Documentation for API Endpoints

All URIs are relative to *https://rink.hockeyapp.net/api/2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*SwaggerClient::DefaultApi* | [**apps_get**](docs/DefaultApi.md#apps_get) | **GET** /apps | 
*SwaggerClient::DefaultApi* | [**apps_upload_post**](docs/DefaultApi.md#apps_upload_post) | **POST** /apps/upload | 


## Documentation for Models

 - [SwaggerClient::App](docs/App.md)
 - [SwaggerClient::Apps](docs/Apps.md)
 - [SwaggerClient::AppsApps](docs/AppsApps.md)


## Documentation for Authorization


### token

- **Type**: API key
- **API key parameter name**: X-HockeyAppToken
- **Location**: HTTP header
