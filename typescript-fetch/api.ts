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

import * as querystring from "querystring";
import * as url from "url";

import * as isomorphicFetch from "isomorphic-fetch";
import * as assign from "core-js/library/fn/object/assign";

interface Dictionary<T> { [index: string]: T; }
export interface FetchAPI { (url: string, init?: any): Promise<any>; }

const BASE_PATH = "https://rink.hockeyapp.net/api/2".replace(/\/+$/, '');

export interface FetchArgs {
    url: string;
    options: any; 
}

export class BaseAPI {
    basePath: string;
    fetch: FetchAPI;

    constructor(fetch: FetchAPI = isomorphicFetch, basePath: string = BASE_PATH) {
        this.basePath = basePath;
        this.fetch = fetch;
    }
}

export interface App {
    "title"?: string;
    "bundleIdentifier"?: string;
    "publicIdentifier"?: string;
    "releaseType"?: number;
    "platform"?: AppPlatformEnum;
}

export type AppPlatformEnum = "iOS" | "Android" | "Mac Os" | "Windows Phone" | "Custom";
export interface Apps {
    "success"?: string;
    "apps"?: Array<AppsApps>;
}

export interface AppsApps {
    "title"?: string;
    "bundleIdentifier"?: string;
    "publicIdentifier"?: string;
    "deviceFamily"?: string;
    "minimumOsVersion"?: string;
    "releaseType"?: number;
    "status"?: number;
    "platform"?: AppsAppsPlatformEnum;
}

export type AppsAppsPlatformEnum = "iOS" | "Android" | "Mac Os" | "Windows Phone" | "Custom";


/**
 * DefaultApi - fetch parameter creator
 */
export const DefaultApiFetchParamCreactor = {
    /** 
     * Gets &#x60;Apps&#x60;. 
     */
    appsGet(): FetchArgs {
        const baseUrl = `/apps`;
        let urlObj = url.parse(baseUrl, true);
        let fetchOptions: RequestInit = { method: "GET" };

        let contentTypeHeader: Dictionary<string>;
        if (contentTypeHeader) {
            fetchOptions.headers = contentTypeHeader;
        }
        return {
            url: url.format(urlObj),
            options: fetchOptions,
        };
    },
    /** 
     * Upload a new app
     * @param ipa file data of the .ipa for iOS, .app.zip for OS X, or .apk file for Android
     * @param dsym file data of the .dSYM.zip file (iOS and OS X) or mapping.txt (Android); note that the extension has to be .dsym.zip (case-insensitive) for iOS and OS X and the file name has to be mapping.txt for Android.
     * @param notes release notes as Textile or Markdown (after 5k characters note are truncated)
     * @param notesType type of release notes. &#x60;0&#x60; for Textile, &#x60;1&#x60; for Markdown
     * @param notify notify testers (can only be set with full-access tokens). &#x60;0&#x60; to not notify, &#x60;1&#x60; to notify all testers that can install this app,  &#x60;2&#x60; to notify all testers
     * @param status download status (can only be set with full-access tokens). &#x60;1&#x60; to not allow users to download the version, &#x60;2&#x60; to make the version available for download
     * @param strategy replace or add build with same build number. &#x60;add&#x60; to add the build as a new build to even if it has the same build number __default__, &#x60;replace&#x60; to replace to a build with the same build number
     * @param tags restrict download to comma-separated list of tags
     * @param teams restrict download to comma-separated list of team IDs
     * @param users restrict download to comma-separated list of user IDs
     * @param mandatory set version as mandatory &#x60;0&#x60; for not mandatory __default__, &#x60;1&#x60; for mandatory
     * @param releaseType set the release type of the app. &#x60;0&#x60; for beta __default__  &#x60;1&#x60; for store &#x60;2&#x60; for alpha &#x60;3&#x60; for enterprise
     * @param _private set to &#x60;true&#x60; to enable the private download page (default is &#x60;true&#x60;)
     * @param ownerId set to the ID of your organization
     * @param commitSha set to the git commit sha for this build
     * @param buildServerUrl set to the URL of the build job on your build server
     * @param repositoryUrl set to your source repository
     */
    appsUploadPost(params: {  ipa: any; dsym?: any; notes?: string; notesType?: number; notify?: number; status?: number; strategy?: string; tags?: Array<string>; teams?: Array<number>; users?: Array<number>; mandatory?: number; releaseType?: number; _private?: boolean; ownerId?: number; commitSha?: string; buildServerUrl?: string; repositoryUrl?: string; }): FetchArgs {
        // verify required parameter "ipa" is set
        if (params["ipa"] == null) {
            throw new Error("Missing required parameter ipa when calling appsUploadPost");
        }
        const baseUrl = `/apps/upload`;
        let urlObj = url.parse(baseUrl, true);
        let fetchOptions: RequestInit = { method: "POST" };

        let contentTypeHeader: Dictionary<string>;
        contentTypeHeader = { "Content-Type": "application/x-www-form-urlencoded" };
        fetchOptions.body = querystring.stringify({ 
            "Ipa": params.ipa,
            "dsym": params.dsym,
            "notes": params.notes,
            "notes_type": params.notesType,
            "notify": params.notify,
            "status": params.status,
            "strategy": params.strategy,
            "tags": params.tags,
            "teams": params.teams,
            "users": params.users,
            "mandatory": params.mandatory,
            "release_type": params.releaseType,
            "private": params._private,
            "owner_id": params.ownerId,
            "commit_sha": params.commitSha,
            "build_server_url": params.buildServerUrl,
            "repository_url": params.repositoryUrl,
        });
        if (contentTypeHeader) {
            fetchOptions.headers = contentTypeHeader;
        }
        return {
            url: url.format(urlObj),
            options: fetchOptions,
        };
    },
}

/**
 * DefaultApi - functional programming interface
 */
export const DefaultApiFp = {
    /** 
     * Gets &#x60;Apps&#x60;. 
     */
    appsGet(): (fetch: FetchAPI, basePath?: string) => Promise<Apps> {
        const fetchArgs = DefaultApiFetchParamCreactor.appsGet();
        return (fetch: FetchAPI = isomorphicFetch, basePath: string = BASE_PATH) => {
            return fetch(basePath + fetchArgs.url, fetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        };
    },
    /** 
     * Upload a new app
     * @param ipa file data of the .ipa for iOS, .app.zip for OS X, or .apk file for Android
     * @param dsym file data of the .dSYM.zip file (iOS and OS X) or mapping.txt (Android); note that the extension has to be .dsym.zip (case-insensitive) for iOS and OS X and the file name has to be mapping.txt for Android.
     * @param notes release notes as Textile or Markdown (after 5k characters note are truncated)
     * @param notesType type of release notes. &#x60;0&#x60; for Textile, &#x60;1&#x60; for Markdown
     * @param notify notify testers (can only be set with full-access tokens). &#x60;0&#x60; to not notify, &#x60;1&#x60; to notify all testers that can install this app,  &#x60;2&#x60; to notify all testers
     * @param status download status (can only be set with full-access tokens). &#x60;1&#x60; to not allow users to download the version, &#x60;2&#x60; to make the version available for download
     * @param strategy replace or add build with same build number. &#x60;add&#x60; to add the build as a new build to even if it has the same build number __default__, &#x60;replace&#x60; to replace to a build with the same build number
     * @param tags restrict download to comma-separated list of tags
     * @param teams restrict download to comma-separated list of team IDs
     * @param users restrict download to comma-separated list of user IDs
     * @param mandatory set version as mandatory &#x60;0&#x60; for not mandatory __default__, &#x60;1&#x60; for mandatory
     * @param releaseType set the release type of the app. &#x60;0&#x60; for beta __default__  &#x60;1&#x60; for store &#x60;2&#x60; for alpha &#x60;3&#x60; for enterprise
     * @param _private set to &#x60;true&#x60; to enable the private download page (default is &#x60;true&#x60;)
     * @param ownerId set to the ID of your organization
     * @param commitSha set to the git commit sha for this build
     * @param buildServerUrl set to the URL of the build job on your build server
     * @param repositoryUrl set to your source repository
     */
    appsUploadPost(params: { ipa: any; dsym?: any; notes?: string; notesType?: number; notify?: number; status?: number; strategy?: string; tags?: Array<string>; teams?: Array<number>; users?: Array<number>; mandatory?: number; releaseType?: number; _private?: boolean; ownerId?: number; commitSha?: string; buildServerUrl?: string; repositoryUrl?: string;  }): (fetch: FetchAPI, basePath?: string) => Promise<App> {
        const fetchArgs = DefaultApiFetchParamCreactor.appsUploadPost(params);
        return (fetch: FetchAPI = isomorphicFetch, basePath: string = BASE_PATH) => {
            return fetch(basePath + fetchArgs.url, fetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        };
    },
};

/**
 * DefaultApi - object-oriented interface
 */
export class DefaultApi extends BaseAPI {
    /** 
     * Gets &#x60;Apps&#x60;. 
     */
    appsGet() {
        return DefaultApiFp.appsGet()(this.fetch, this.basePath);
    }
    /** 
     * Upload a new app
     * @param ipa file data of the .ipa for iOS, .app.zip for OS X, or .apk file for Android
     * @param dsym file data of the .dSYM.zip file (iOS and OS X) or mapping.txt (Android); note that the extension has to be .dsym.zip (case-insensitive) for iOS and OS X and the file name has to be mapping.txt for Android.
     * @param notes release notes as Textile or Markdown (after 5k characters note are truncated)
     * @param notesType type of release notes. &#x60;0&#x60; for Textile, &#x60;1&#x60; for Markdown
     * @param notify notify testers (can only be set with full-access tokens). &#x60;0&#x60; to not notify, &#x60;1&#x60; to notify all testers that can install this app,  &#x60;2&#x60; to notify all testers
     * @param status download status (can only be set with full-access tokens). &#x60;1&#x60; to not allow users to download the version, &#x60;2&#x60; to make the version available for download
     * @param strategy replace or add build with same build number. &#x60;add&#x60; to add the build as a new build to even if it has the same build number __default__, &#x60;replace&#x60; to replace to a build with the same build number
     * @param tags restrict download to comma-separated list of tags
     * @param teams restrict download to comma-separated list of team IDs
     * @param users restrict download to comma-separated list of user IDs
     * @param mandatory set version as mandatory &#x60;0&#x60; for not mandatory __default__, &#x60;1&#x60; for mandatory
     * @param releaseType set the release type of the app. &#x60;0&#x60; for beta __default__  &#x60;1&#x60; for store &#x60;2&#x60; for alpha &#x60;3&#x60; for enterprise
     * @param _private set to &#x60;true&#x60; to enable the private download page (default is &#x60;true&#x60;)
     * @param ownerId set to the ID of your organization
     * @param commitSha set to the git commit sha for this build
     * @param buildServerUrl set to the URL of the build job on your build server
     * @param repositoryUrl set to your source repository
     */
    appsUploadPost(params: {  ipa: any; dsym?: any; notes?: string; notesType?: number; notify?: number; status?: number; strategy?: string; tags?: Array<string>; teams?: Array<number>; users?: Array<number>; mandatory?: number; releaseType?: number; _private?: boolean; ownerId?: number; commitSha?: string; buildServerUrl?: string; repositoryUrl?: string; }) {
        return DefaultApiFp.appsUploadPost(params)(this.fetch, this.basePath);
    }
};

/**
 * DefaultApi - factory interface
 */
export const DefaultApiFactory = function (fetch?: FetchAPI, basePath?: string) {
    return {
        /** 
         * Gets &#x60;Apps&#x60;. 
         */
        appsGet() {
            return DefaultApiFp.appsGet()(fetch, basePath);
        },
        /** 
         * Upload a new app
         * @param ipa file data of the .ipa for iOS, .app.zip for OS X, or .apk file for Android
         * @param dsym file data of the .dSYM.zip file (iOS and OS X) or mapping.txt (Android); note that the extension has to be .dsym.zip (case-insensitive) for iOS and OS X and the file name has to be mapping.txt for Android.
         * @param notes release notes as Textile or Markdown (after 5k characters note are truncated)
         * @param notesType type of release notes. &#x60;0&#x60; for Textile, &#x60;1&#x60; for Markdown
         * @param notify notify testers (can only be set with full-access tokens). &#x60;0&#x60; to not notify, &#x60;1&#x60; to notify all testers that can install this app,  &#x60;2&#x60; to notify all testers
         * @param status download status (can only be set with full-access tokens). &#x60;1&#x60; to not allow users to download the version, &#x60;2&#x60; to make the version available for download
         * @param strategy replace or add build with same build number. &#x60;add&#x60; to add the build as a new build to even if it has the same build number __default__, &#x60;replace&#x60; to replace to a build with the same build number
         * @param tags restrict download to comma-separated list of tags
         * @param teams restrict download to comma-separated list of team IDs
         * @param users restrict download to comma-separated list of user IDs
         * @param mandatory set version as mandatory &#x60;0&#x60; for not mandatory __default__, &#x60;1&#x60; for mandatory
         * @param releaseType set the release type of the app. &#x60;0&#x60; for beta __default__  &#x60;1&#x60; for store &#x60;2&#x60; for alpha &#x60;3&#x60; for enterprise
         * @param _private set to &#x60;true&#x60; to enable the private download page (default is &#x60;true&#x60;)
         * @param ownerId set to the ID of your organization
         * @param commitSha set to the git commit sha for this build
         * @param buildServerUrl set to the URL of the build job on your build server
         * @param repositoryUrl set to your source repository
         */
        appsUploadPost(params: {  ipa: any; dsym?: any; notes?: string; notesType?: number; notify?: number; status?: number; strategy?: string; tags?: Array<string>; teams?: Array<number>; users?: Array<number>; mandatory?: number; releaseType?: number; _private?: boolean; ownerId?: number; commitSha?: string; buildServerUrl?: string; repositoryUrl?: string; }) {
            return DefaultApiFp.appsUploadPost(params)(fetch, basePath);
        },
    }
};
