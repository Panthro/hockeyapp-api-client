# SwaggerClient-php
No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)

This PHP package is automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen) project:

- API version: 0.0.2
- Build package: class io.swagger.codegen.languages.PhpClientCodegen

## Requirements

PHP 5.4.0 and later

## Installation & Usage
### Composer

To install the bindings via [Composer](http://getcomposer.org/), add the following to `composer.json`:

```
{
  "repositories": [
    {
      "type": "git",
      "url": "https://github.com/GIT_USER_ID/GIT_REPO_ID.git"
    }
  ],
  "require": {
    "GIT_USER_ID/GIT_REPO_ID": "*@dev"
  }
}
```

Then run `composer install`

### Manual Installation

Download the files and include `autoload.php`:

```php
    require_once('/path/to/SwaggerClient-php/autoload.php');
```

## Tests

To run the unit tests:

```
composer install
./vendor/bin/phpunit
```

## Getting Started

Please follow the [installation procedure](#installation--usage) and then run the following:

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure API key authorization: token
Swagger\Client\Configuration::getDefaultConfiguration()->setApiKey('X-HockeyAppToken', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// Swagger\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('X-HockeyAppToken', 'Bearer');

$api_instance = new Swagger\Client\Api\DefaultApi();

try {
    $result = $api_instance->appsGet();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DefaultApi->appsGet: ', $e->getMessage(), PHP_EOL;
}

?>
```

## Documentation for API Endpoints

All URIs are relative to *https://rink.hockeyapp.net/api/2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**appsGet**](docs/Api/DefaultApi.md#appsget) | **GET** /apps | 
*DefaultApi* | [**appsUploadPost**](docs/Api/DefaultApi.md#appsuploadpost) | **POST** /apps/upload | 


## Documentation For Models

 - [App](docs/Model/App.md)
 - [Apps](docs/Model/Apps.md)
 - [AppsApps](docs/Model/AppsApps.md)


## Documentation For Authorization


## token

- **Type**: API key
- **API key parameter name**: X-HockeyAppToken
- **Location**: HTTP header


## Author



