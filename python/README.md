# swagger_client
No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)

This Python package is automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen) project:

- API version: 0.0.2
- Package version: 1.0.0
- Build package: class io.swagger.codegen.languages.PythonClientCodegen

## Requirements.

Python 2.7 and 3.4+

## Installation & Usage
### pip install

If the python package is hosted on Github, you can install directly from Github

```sh
pip install git+https://github.com/GIT_USER_ID/GIT_REPO_ID.git
```
(you may need to run `pip` with root permission: `sudo pip install git+https://github.com/GIT_USER_ID/GIT_REPO_ID.git`)

Then import the package:
```python
import swagger_client 
```

### Setuptools

Install via [Setuptools](http://pypi.python.org/pypi/setuptools).

```sh
python setup.py install --user
```
(or `sudo python setup.py install` to install the package for all users)

Then import the package:
```python
import swagger_client
```

## Getting Started

Please follow the [installation procedure](#installation--usage) and then run the following:

```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure API key authorization: token
swagger_client.configuration.api_key['X-HockeyAppToken'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# swagger_client.configuration.api_key_prefix['X-HockeyAppToken'] = 'Bearer'
# create an instance of the API class
api_instance = swagger_client.DefaultApi

try:
    api_response = api_instance.apps_get()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DefaultApi->apps_get: %s\n" % e)

```

## Documentation for API Endpoints

All URIs are relative to *https://rink.hockeyapp.net/api/2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**apps_get**](docs/DefaultApi.md#apps_get) | **GET** /apps | 
*DefaultApi* | [**apps_upload_post**](docs/DefaultApi.md#apps_upload_post) | **POST** /apps/upload | 


## Documentation For Models

 - [App](docs/App.md)
 - [Apps](docs/Apps.md)
 - [AppsApps](docs/AppsApps.md)


## Documentation For Authorization


## token

- **Type**: API key
- **API key parameter name**: X-HockeyAppToken
- **Location**: HTTP header


## Author


