/*
 * Hockeyapp Public API wrapper
 *
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 0.0.2
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.ComponentModel;
using System.IO;
using System.Linq;
using System.Net;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using Newtonsoft.Json;
using Swashbuckle.SwaggerGen.Annotations;
using IO.Swagger.Models;

namespace IO.Swagger.Controllers
{ 
    /// <summary>
    /// 
    /// </summary>
    public class DefaultApiController : Controller
    { 

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>Gets &#x60;Apps&#x60;. </remarks>
        /// <response code="200">Successful response</response>
        /// <response code="400">Bad request</response>
        [HttpGet]
        [Route("/api/2/apps")]
        [SwaggerOperation("AppsGet")]
        [SwaggerResponse(200, type: typeof(Apps))]
        public virtual IActionResult AppsGet()
        { 
            string exampleJson = null;
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<Apps>(exampleJson)
            : default(Apps);
            return new ObjectResult(example);
        }


        /// <summary>
        /// 
        /// </summary>
        /// <remarks>Upload a new app</remarks>
        /// <param name="ipa">file data of the .ipa for iOS, .app.zip for OS X, or .apk file for Android</param>
        /// <param name="dsym">file data of the .dSYM.zip file (iOS and OS X) or mapping.txt (Android); note that the extension has to be .dsym.zip (case-insensitive) for iOS and OS X and the file name has to be mapping.txt for Android.</param>
        /// <param name="notes">release notes as Textile or Markdown (after 5k characters note are truncated)</param>
        /// <param name="notesType">type of release notes. &#x60;0&#x60; for Textile, &#x60;1&#x60; for Markdown</param>
        /// <param name="notify">notify testers (can only be set with full-access tokens). &#x60;0&#x60; to not notify, &#x60;1&#x60; to notify all testers that can install this app,  &#x60;2&#x60; to notify all testers</param>
        /// <param name="status">download status (can only be set with full-access tokens). &#x60;1&#x60; to not allow users to download the version, &#x60;2&#x60; to make the version available for download</param>
        /// <param name="strategy">replace or add build with same build number. &#x60;add&#x60; to add the build as a new build to even if it has the same build number __default__, &#x60;replace&#x60; to replace to a build with the same build number</param>
        /// <param name="tags">restrict download to comma-separated list of tags</param>
        /// <param name="teams">restrict download to comma-separated list of team IDs</param>
        /// <param name="users">restrict download to comma-separated list of user IDs</param>
        /// <param name="mandatory">set version as mandatory &#x60;0&#x60; for not mandatory __default__, &#x60;1&#x60; for mandatory</param>
        /// <param name="releaseType">set the release type of the app. &#x60;0&#x60; for beta __default__  &#x60;1&#x60; for store &#x60;2&#x60; for alpha &#x60;3&#x60; for enterprise</param>
        /// <param name="private">set to &#x60;true&#x60; to enable the private download page (default is &#x60;true&#x60;)</param>
        /// <param name="ownerId">set to the ID of your organization</param>
        /// <param name="commitSha">set to the git commit sha for this build</param>
        /// <param name="buildServerUrl">set to the URL of the build job on your build server</param>
        /// <param name="repositoryUrl">set to your source repository</param>
        /// <response code="201">Upload success</response>
        /// <response code="400">Bad request</response>
        [HttpPost]
        [Route("/api/2/apps/upload")]
        [SwaggerOperation("AppsUploadPost")]
        [SwaggerResponse(200, type: typeof(App))]
        public virtual IActionResult AppsUploadPost([FromForm]System.IO.Stream ipa, [FromForm]System.IO.Stream dsym, [FromForm]string notes, [FromForm]int? notesType, [FromForm]int? notify, [FromForm]int? status, [FromForm]string strategy, [FromForm]List<string> tags, [FromForm]List<int?> teams, [FromForm]List<int?> users, [FromForm]int? mandatory, [FromForm]int? releaseType, [FromForm]bool? private, [FromForm]int? ownerId, [FromForm]string commitSha, [FromForm]string buildServerUrl, [FromForm]string repositoryUrl)
        { 
            string exampleJson = null;
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<App>(exampleJson)
            : default(App);
            return new ObjectResult(example);
        }
    }
}