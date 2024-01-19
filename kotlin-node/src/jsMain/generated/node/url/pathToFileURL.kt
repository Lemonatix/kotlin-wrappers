// Generated by Karakum - do not modify it manually!

@file:JsModule("node:url")

package node.url

import web.url.URL

/**
 * This function ensures that `path` is resolved absolutely, and that the URL
 * control characters are correctly encoded when converting into a File URL.
 *
 * ```js
 * import { pathToFileURL } from 'node:url';
 *
 * new URL('/foo#1', 'file:');           // Incorrect: file:///foo#1
 * pathToFileURL('/foo#1');              // Correct:   file:///foo%231 (POSIX)
 *
 * new URL('/some/path%.c', 'file:');    // Incorrect: file:///some/path%.c
 * pathToFileURL('/some/path%.c');       // Correct:   file:///some/path%25.c (POSIX)
 * ```
 * @since v10.12.0
 * @param path The path to convert to a File URL.
 * @return The file URL object.
 */
external fun pathToFileURL(path: String): URL
