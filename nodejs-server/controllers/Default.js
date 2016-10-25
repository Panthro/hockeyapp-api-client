'use strict';

var url = require('url');


var Default = require('./DefaultService');


module.exports.appsGET = function appsGET (req, res, next) {
  Default.appsGET(req.swagger.params, res, next);
};

module.exports.appsUploadPOST = function appsUploadPOST (req, res, next) {
  Default.appsUploadPOST(req.swagger.params, res, next);
};
