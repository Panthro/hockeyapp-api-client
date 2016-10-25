goog.provide('API.Client.Apps_apps');

/**
 * @record
 */
API.Client.AppsApps = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.AppsApps.prototype.title;

/**
 * @type {!string}
 * @export
 */
API.Client.AppsApps.prototype.bundleIdentifier;

/**
 * @type {!string}
 * @export
 */
API.Client.AppsApps.prototype.publicIdentifier;

/**
 * @type {!string}
 * @export
 */
API.Client.AppsApps.prototype.deviceFamily;

/**
 * @type {!string}
 * @export
 */
API.Client.AppsApps.prototype.minimumOsVersion;

/**
 * @type {!number}
 * @export
 */
API.Client.AppsApps.prototype.releaseType;

/**
 * @type {!number}
 * @export
 */
API.Client.AppsApps.prototype.status;

/**
 * @type {!string}
 * @export
 */
API.Client.AppsApps.prototype.platform;

/** @enum {string} */
API.Client.AppsApps.PlatformEnum = { 
  iOS: 'iOS',
  Android: 'Android',
  Mac Os: 'Mac Os',
  Windows Phone: 'Windows Phone',
  Custom: 'Custom',
}
