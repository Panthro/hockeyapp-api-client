/**
 * Hockeyapp Public API wrapper
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 0.0.2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD.
    define(['expect.js', '../../src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require('../../src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.HockeyappPublicApiWrapper);
  }
}(this, function(expect, HockeyappPublicApiWrapper) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new HockeyappPublicApiWrapper.AppsApps();
  });

  var getProperty = function(object, getter, property) {
    // Use getter method if present; otherwise, get the property directly.
    if (typeof object[getter] === 'function')
      return object[getter]();
    else
      return object[property];
  }

  var setProperty = function(object, setter, property, value) {
    // Use setter method if present; otherwise, set the property directly.
    if (typeof object[setter] === 'function')
      object[setter](value);
    else
      object[property] = value;
  }

  describe('AppsApps', function() {
    it('should create an instance of AppsApps', function() {
      // uncomment below and update the code to test AppsApps
      //var instane = new HockeyappPublicApiWrapper.AppsApps();
      //expect(instance).to.be.a(HockeyappPublicApiWrapper.AppsApps);
    });

    it('should have the property title (base name: "title")', function() {
      // uncomment below and update the code to test the property title
      //var instane = new HockeyappPublicApiWrapper.AppsApps();
      //expect(instance).to.be();
    });

    it('should have the property bundleIdentifier (base name: "bundle_identifier")', function() {
      // uncomment below and update the code to test the property bundleIdentifier
      //var instane = new HockeyappPublicApiWrapper.AppsApps();
      //expect(instance).to.be();
    });

    it('should have the property publicIdentifier (base name: "public_identifier")', function() {
      // uncomment below and update the code to test the property publicIdentifier
      //var instane = new HockeyappPublicApiWrapper.AppsApps();
      //expect(instance).to.be();
    });

    it('should have the property deviceFamily (base name: "device_family")', function() {
      // uncomment below and update the code to test the property deviceFamily
      //var instane = new HockeyappPublicApiWrapper.AppsApps();
      //expect(instance).to.be();
    });

    it('should have the property minimumOsVersion (base name: "minimum_os_version")', function() {
      // uncomment below and update the code to test the property minimumOsVersion
      //var instane = new HockeyappPublicApiWrapper.AppsApps();
      //expect(instance).to.be();
    });

    it('should have the property releaseType (base name: "release_type")', function() {
      // uncomment below and update the code to test the property releaseType
      //var instane = new HockeyappPublicApiWrapper.AppsApps();
      //expect(instance).to.be();
    });

    it('should have the property status (base name: "status")', function() {
      // uncomment below and update the code to test the property status
      //var instane = new HockeyappPublicApiWrapper.AppsApps();
      //expect(instance).to.be();
    });

    it('should have the property platform (base name: "platform")', function() {
      // uncomment below and update the code to test the property platform
      //var instane = new HockeyappPublicApiWrapper.AppsApps();
      //expect(instance).to.be();
    });

  });

}));
