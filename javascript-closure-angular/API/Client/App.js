goog.provide('API.Client.App');

/**
 * @record
 */
API.Client.App = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.App.prototype.title;

/**
 * @type {!string}
 * @export
 */
API.Client.App.prototype.bundleIdentifier;

/**
 * @type {!string}
 * @export
 */
API.Client.App.prototype.publicIdentifier;

/**
 * @type {!number}
 * @export
 */
API.Client.App.prototype.releaseType;

/**
 * @type {!string}
 * @export
 */
API.Client.App.prototype.platform;

/** @enum {string} */
API.Client.App.PlatformEnum = { 
  iOS: 'iOS',
  Android: 'Android',
  Mac Os: 'Mac Os',
  Windows Phone: 'Windows Phone',
  Custom: 'Custom',
}
