// Generated by Karakum - do not modify it manually!

@file:JsModule("node:crypto")

package node.crypto

import node.stream.TransformOptions

/**
 * The `Hmac` class is a utility for creating cryptographic HMAC digests. It can
 * be used in one of two ways:
 *
 * * As a `stream` that is both readable and writable, where data is written
 * to produce a computed HMAC digest on the readable side, or
 * * Using the `hmac.update()` and `hmac.digest()` methods to produce the
 * computed HMAC digest.
 *
 * The {@link createHmac} method is used to create `Hmac` instances. `Hmac`objects are not to be created directly using the `new` keyword.
 *
 * Example: Using `Hmac` objects as streams:
 *
 * ```js
 * const {
 *   createHmac,
 * } = await import('node:crypto');
 *
 * const hmac = createHmac('sha256', 'a secret');
 *
 * hmac.on('readable', () => {
 *   // Only one element is going to be produced by the
 *   // hash stream.
 *   const data = hmac.read();
 *   if (data) {
 *     console.log(data.toString('hex'));
 *     // Prints:
 *     //   7fd04df92f636fd450bc841c9418e5825c17f33ad9c87c518115a45971f7f77e
 *   }
 * });
 *
 * hmac.write('some data to hash');
 * hmac.end();
 * ```
 *
 * Example: Using `Hmac` and piped streams:
 *
 * ```js
 * import { createReadStream } from 'node:fs';
 * import { stdout } from 'node:process';
 * const {
 *   createHmac,
 * } = await import('node:crypto');
 *
 * const hmac = createHmac('sha256', 'a secret');
 *
 * const input = createReadStream('test.js');
 * input.pipe(hmac).pipe(stdout);
 * ```
 *
 * Example: Using the `hmac.update()` and `hmac.digest()` methods:
 *
 * ```js
 * const {
 *   createHmac,
 * } = await import('node:crypto');
 *
 * const hmac = createHmac('sha256', 'a secret');
 *
 * hmac.update('some data to hash');
 * console.log(hmac.digest('hex'));
 * // Prints:
 * //   7fd04df92f636fd450bc841c9418e5825c17f33ad9c87c518115a45971f7f77e
 * ```
 * @since v0.1.94
 */

external class Hmac : node.stream.Transform {
    constructor (opts: TransformOptions = definedExternally)

    /**
     * Updates the `Hmac` content with the given `data`, the encoding of which
     * is given in `inputEncoding`.
     * If `encoding` is not provided, and the `data` is a string, an
     * encoding of `'utf8'` is enforced. If `data` is a `Buffer`, `TypedArray`, or`DataView`, then `inputEncoding` is ignored.
     *
     * This can be called many times with new data as it is streamed.
     * @since v0.1.94
     * @param inputEncoding The `encoding` of the `data` string.
     */
    fun update(data: BinaryLike): Hmac
    fun update(data: String, inputEncoding: Encoding): Hmac

    /**
     * Calculates the HMAC digest of all of the data passed using `hmac.update()`.
     * If `encoding` is
     * provided a string is returned; otherwise a `Buffer` is returned;
     *
     * The `Hmac` object can not be used again after `hmac.digest()` has been
     * called. Multiple calls to `hmac.digest()` will result in an error being thrown.
     * @since v0.1.94
     * @param encoding The `encoding` of the return value.
     */
    fun digest(): node.buffer.Buffer
    fun digest(encoding: BinaryToTextEncoding): String
}
