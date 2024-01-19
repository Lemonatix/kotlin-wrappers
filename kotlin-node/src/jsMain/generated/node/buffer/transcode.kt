// Generated by Karakum - do not modify it manually!

@file:JsModule("node:buffer")

package node.buffer

import js.typedarrays.Uint8Array

/**
 * Re-encodes the given `Buffer` or `Uint8Array` instance from one character
 * encoding to another. Returns a new `Buffer` instance.
 *
 * Throws if the `fromEnc` or `toEnc` specify invalid character encodings or if
 * conversion from `fromEnc` to `toEnc` is not permitted.
 *
 * Encodings supported by `buffer.transcode()` are: `'ascii'`, `'utf8'`,`'utf16le'`, `'ucs2'`, `'latin1'`, and `'binary'`.
 *
 * The transcoding process will use substitution characters if a given byte
 * sequence cannot be adequately represented in the target encoding. For instance:
 *
 * ```js
 * import { Buffer, transcode } from 'node:buffer';
 *
 * const newBuf = transcode(Buffer.from('€'), 'utf8', 'ascii');
 * console.log(newBuf.toString('ascii'));
 * // Prints: '?'
 * ```
 *
 * Because the Euro (`€`) sign is not representable in US-ASCII, it is replaced
 * with `?` in the transcoded `Buffer`.
 * @since v7.1.0
 * @param source A `Buffer` or `Uint8Array` instance.
 * @param fromEnc The current encoding.
 * @param toEnc To target encoding.
 */
external fun transcode(source: Uint8Array, fromEnc: TranscodeEncoding, toEnc: TranscodeEncoding): Buffer
