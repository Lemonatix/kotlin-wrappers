// Generated by Karakum - do not modify it manually!

@file:JsModule("semver/functions/inc")

package semver

// import SemVer = require("../classes/semver");

// import semver = require("../index");

/** Base number to be used for the prerelease identifier */
sealed external interface IdentifierBase {
    companion object {
        @seskar.js.JsValue("0")
        val `0`: IdentifierBase

        @seskar.js.JsValue("1")
        val `1`: IdentifierBase
    }
}

/**
 * Return the version incremented by the release type (major, premajor, minor, preminor, patch, prepatch, or prerelease), or null if it's not valid.
 */
external fun inc(
    version: String,
    release: semver.ReleaseType,
): String?

/**
 * Return the version incremented by the release type (major, premajor, minor, preminor, patch, prepatch, or prerelease), or null if it's not valid.
 */
external fun inc(
    version: String,
    release: semver.ReleaseType,
    optionsOrLoose: Boolean = definedExternally,
    identifier: String = definedExternally,
): String?

/**
 * Return the version incremented by the release type (major, premajor, minor, preminor, patch, prepatch, or prerelease), or null if it's not valid.
 */
external fun inc(
    version: String,
    release: semver.ReleaseType,
    optionsOrLoose: semver.Options = definedExternally,
    identifier: String = definedExternally,
): String?

/**
 * Return the version incremented by the release type (major, premajor, minor, preminor, patch, prepatch, or prerelease), or null if it's not valid.
 */
external fun inc(
    version: SemVer,
    release: semver.ReleaseType,
): String?

/**
 * Return the version incremented by the release type (major, premajor, minor, preminor, patch, prepatch, or prerelease), or null if it's not valid.
 */
external fun inc(
    version: SemVer,
    release: semver.ReleaseType,
    optionsOrLoose: Boolean = definedExternally,
    identifier: String = definedExternally,
): String?

/**
 * Return the version incremented by the release type (major, premajor, minor, preminor, patch, prepatch, or prerelease), or null if it's not valid.
 */
external fun inc(
    version: SemVer,
    release: semver.ReleaseType,
    optionsOrLoose: semver.Options = definedExternally,
    identifier: String = definedExternally,
): String?

external fun inc(
    version: String,
    release: semver.ReleaseType,
    identifier: String = definedExternally,
    identifierBase: IdentifierBase = definedExternally,
): String?

external fun inc(
    version: String,
    release: semver.ReleaseType,
    identifier: String = definedExternally,
    identifierBase: Boolean /* false */ = definedExternally,
): String?

external fun inc(
    version: SemVer,
    release: semver.ReleaseType,
    identifier: String = definedExternally,
    identifierBase: IdentifierBase = definedExternally,
): String?

external fun inc(
    version: SemVer,
    release: semver.ReleaseType,
    identifier: String = definedExternally,
    identifierBase: Boolean /* false */ = definedExternally,
): String?

// export = inc;
