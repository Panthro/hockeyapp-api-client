'use strict';

exports.appsGET = function(args, res, next) {
  /**
   * parameters expected in the args:
  **/
    var examples = {};
  examples['application/json'] = {
  "success" : "aeiou",
  "apps" : [ {
    "bundle_identifier" : "aeiou",
    "device_family" : "aeiou",
    "release_type" : "",
    "title" : "aeiou",
    "minimum_os_version" : "aeiou",
    "public_identifier" : "aeiou",
    "platform" : "aeiou",
    "status" : ""
  } ]
};
  if(Object.keys(examples).length > 0) {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(examples[Object.keys(examples)[0]] || {}, null, 2));
  }
  else {
    res.end();
  }
  
}

exports.appsUploadPOST = function(args, res, next) {
  /**
   * parameters expected in the args:
  * ipa (file)
  * dsym (file)
  * notes (String)
  * notes_type (Integer)
  * notify (Integer)
  * status (Integer)
  * strategy (String)
  * tags (List)
  * teams (List)
  * users (List)
  * mandatory (Integer)
  * release_type (Integer)
  * private (Boolean)
  * owner_id (Integer)
  * commit_sha (String)
  * build_server_url (String)
  * repository_url (String)
  **/
    var examples = {};
  examples['application/json'] = {
  "bundle_identifier" : "aeiou",
  "release_type" : "",
  "title" : "aeiou",
  "public_identifier" : "aeiou",
  "platform" : "aeiou"
};
  if(Object.keys(examples).length > 0) {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(examples[Object.keys(examples)[0]] || {}, null, 2));
  }
  else {
    res.end();
  }
  
}

