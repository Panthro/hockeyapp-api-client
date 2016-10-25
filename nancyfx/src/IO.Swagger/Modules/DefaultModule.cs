using System;
using Nancy;
using Nancy.ModelBinding;
using System.Collections.Generic;
using Sharpility.Base;
using IO.Swagger.api2.Models;
using IO.Swagger.api2.Utils;
using NodaTime;

namespace IO.Swagger.api2.Modules
{ 
    /// <summary>
    /// replace or add build with same build number. &#x60;add&#x60; to add the build as a new build to even if it has the same build number __default__, &#x60;replace&#x60; to replace to a build with the same build number
    /// </summary>
    public enum AppsUploadPostStrategyEnum
    {
        add, 
        replace
    };


    /// <summary>
    /// Module processing requests of Default domain.
    /// </summary>
    public sealed class DefaultModule : NancyModule
    {
        /// <summary>
        /// Sets up HTTP methods mappings.
        /// </summary>
        /// <param name="service">Service handling requests</param>
        public DefaultModule(DefaultService service) : base("/api/2")
        { 
            Get["/apps"] = parameters =>
            {
                
                return service.AppsGet(Context);
            };

            Post["/apps/upload"] = parameters =>
            {
                var ipa = Parameters.ValueOf<System.IO.Stream>(parameters, Context.Request, "ipa", ParameterType.Undefined);
                var dsym = Parameters.ValueOf<System.IO.Stream>(parameters, Context.Request, "dsym", ParameterType.Undefined);
                var notes = Parameters.ValueOf<string>(parameters, Context.Request, "notes", ParameterType.Undefined);
                var notesType = Parameters.ValueOf<int?>(parameters, Context.Request, "notesType", ParameterType.Undefined);
                var notify = Parameters.ValueOf<int?>(parameters, Context.Request, "notify", ParameterType.Undefined);
                var status = Parameters.ValueOf<int?>(parameters, Context.Request, "status", ParameterType.Undefined);
                var strategy = Parameters.ValueOf<AppsUploadPostStrategyEnum?>(parameters, Context.Request, "strategy", ParameterType.Undefined);
                var tags = Parameters.ValueOf<List<string>>(parameters, Context.Request, "tags", ParameterType.Undefined);
                var teams = Parameters.ValueOf<List<int?>>(parameters, Context.Request, "teams", ParameterType.Undefined);
                var users = Parameters.ValueOf<List<int?>>(parameters, Context.Request, "users", ParameterType.Undefined);
                var mandatory = Parameters.ValueOf<int?>(parameters, Context.Request, "mandatory", ParameterType.Undefined);
                var releaseType = Parameters.ValueOf<int?>(parameters, Context.Request, "releaseType", ParameterType.Undefined);
                var private = Parameters.ValueOf<bool?>(parameters, Context.Request, "private", ParameterType.Undefined);
                var ownerId = Parameters.ValueOf<int?>(parameters, Context.Request, "ownerId", ParameterType.Undefined);
                var commitSha = Parameters.ValueOf<string>(parameters, Context.Request, "commitSha", ParameterType.Undefined);
                var buildServerUrl = Parameters.ValueOf<string>(parameters, Context.Request, "buildServerUrl", ParameterType.Undefined);
                var repositoryUrl = Parameters.ValueOf<string>(parameters, Context.Request, "repositoryUrl", ParameterType.Undefined);
                Preconditions.IsNotNull(ipa, "Required parameter: 'ipa' is missing at 'AppsUploadPost'");
                
                return service.AppsUploadPost(Context, ipa, dsym, notes, notesType, notify, status, strategy, tags, teams, users, mandatory, releaseType, private, ownerId, commitSha, buildServerUrl, repositoryUrl);
            };
        }
    }

    /// <summary>
    /// Service handling Default requests.
    /// </summary>
    public interface DefaultService
    {
        /// <summary>
        /// Gets &#x60;Apps&#x60;. 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <returns>Apps</returns>
        Apps AppsGet(NancyContext context);

        /// <summary>
        /// Upload a new app
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="ipa">file data of the .ipa for iOS, .app.zip for OS X, or .apk file for Android</param>
        /// <param name="dsym">file data of the .dSYM.zip file (iOS and OS X) or mapping.txt (Android); note that the extension has to be .dsym.zip (case-insensitive) for iOS and OS X and the file name has to be mapping.txt for Android. (optional)</param>
        /// <param name="notes">release notes as Textile or Markdown (after 5k characters note are truncated) (optional)</param>
        /// <param name="notesType">type of release notes. &#x60;0&#x60; for Textile, &#x60;1&#x60; for Markdown (optional)</param>
        /// <param name="notify">notify testers (can only be set with full-access tokens). &#x60;0&#x60; to not notify, &#x60;1&#x60; to notify all testers that can install this app,  &#x60;2&#x60; to notify all testers (optional)</param>
        /// <param name="status">download status (can only be set with full-access tokens). &#x60;1&#x60; to not allow users to download the version, &#x60;2&#x60; to make the version available for download (optional)</param>
        /// <param name="strategy">replace or add build with same build number. &#x60;add&#x60; to add the build as a new build to even if it has the same build number __default__, &#x60;replace&#x60; to replace to a build with the same build number (optional)</param>
        /// <param name="tags">restrict download to comma-separated list of tags (optional)</param>
        /// <param name="teams">restrict download to comma-separated list of team IDs (optional)</param>
        /// <param name="users">restrict download to comma-separated list of user IDs (optional)</param>
        /// <param name="mandatory">set version as mandatory &#x60;0&#x60; for not mandatory __default__, &#x60;1&#x60; for mandatory (optional)</param>
        /// <param name="releaseType">set the release type of the app. &#x60;0&#x60; for beta __default__  &#x60;1&#x60; for store &#x60;2&#x60; for alpha &#x60;3&#x60; for enterprise (optional)</param>
        /// <param name="private">set to &#x60;true&#x60; to enable the private download page (default is &#x60;true&#x60;) (optional)</param>
        /// <param name="ownerId">set to the ID of your organization (optional)</param>
        /// <param name="commitSha">set to the git commit sha for this build (optional)</param>
        /// <param name="buildServerUrl">set to the URL of the build job on your build server (optional)</param>
        /// <param name="repositoryUrl">set to your source repository (optional)</param>
        /// <returns>App</returns>
        App AppsUploadPost(NancyContext context, System.IO.Stream ipa, System.IO.Stream dsym, string notes, int? notesType, int? notify, int? status, AppsUploadPostStrategyEnum? strategy, List<string> tags, List<int?> teams, List<int?> users, int? mandatory, int? releaseType, bool? private, int? ownerId, string commitSha, string buildServerUrl, string repositoryUrl);
    }

    /// <summary>
    /// Abstraction of DefaultService.
    /// </summary>
    public abstract class AbstractDefaultService: DefaultService
    {
        public virtual Apps AppsGet(NancyContext context)
        {
            return AppsGet();
        }

        public virtual App AppsUploadPost(NancyContext context, System.IO.Stream ipa, System.IO.Stream dsym, string notes, int? notesType, int? notify, int? status, AppsUploadPostStrategyEnum? strategy, List<string> tags, List<int?> teams, List<int?> users, int? mandatory, int? releaseType, bool? private, int? ownerId, string commitSha, string buildServerUrl, string repositoryUrl)
        {
            return AppsUploadPost(ipa, dsym, notes, notesType, notify, status, strategy, tags, teams, users, mandatory, releaseType, private, ownerId, commitSha, buildServerUrl, repositoryUrl);
        }

        protected abstract Apps AppsGet();

        protected abstract App AppsUploadPost(System.IO.Stream ipa, System.IO.Stream dsym, string notes, int? notesType, int? notify, int? status, AppsUploadPostStrategyEnum? strategy, List<string> tags, List<int?> teams, List<int?> users, int? mandatory, int? releaseType, bool? private, int? ownerId, string commitSha, string buildServerUrl, string repositoryUrl);
    }

}
