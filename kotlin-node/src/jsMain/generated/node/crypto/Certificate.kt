// Generated by Karakum - do not modify it manually!

@file:JsModule("node:crypto")

package node.crypto


/**
 * SPKAC is a Certificate Signing Request mechanism originally implemented by
 * Netscape and was specified formally as part of HTML5's `keygen` element.
 *
 * `<keygen>` is deprecated since [HTML 5.2](https://www.w3.org/TR/html52/changes.html#features-removed) and new projects
 * should not use this element anymore.
 *
 * The `node:crypto` module provides the `Certificate` class for working with SPKAC
 * data. The most common usage is handling output generated by the HTML5`<keygen>` element. Node.js uses [OpenSSL's SPKAC
     * implementation](https://www.openssl.org/docs/man3.0/man1/openssl-spkac.html) internally.
 * @since v0.11.8
 */

external class Certificate {
    /**
     * @deprecated
     * @param spkac
     * @returns The challenge component of the `spkac` data structure,
     * which includes a public key and a challenge.
     */
    fun exportChallenge(spkac: BinaryLike): node.buffer.Buffer

    /**
     * @deprecated
     * @param spkac
     * @param encoding The encoding of the spkac string.
     * @returns The public key component of the `spkac` data structure,
     * which includes a public key and a challenge.
     */
    fun exportPublicKey(spkac: BinaryLike, encoding: String = definedExternally): node.buffer.Buffer

    /**
     * @deprecated
     * @param spkac
     * @returns `true` if the given `spkac` data structure is valid,
     * `false` otherwise.
     */
    fun verifySpkac(spkac: js.buffer.ArrayBufferView): Boolean

    companion object {
        /**
         * ```js
         * const { Certificate } = await import('node:crypto');
         * const spkac = getSpkacSomehow();
         * const challenge = Certificate.exportChallenge(spkac);
         * console.log(challenge.toString('utf8'));
         * // Prints: the challenge as a UTF8 string
         * ```
         * @since v9.0.0
         * @param encoding The `encoding` of the `spkac` string.
         * @return The challenge component of the `spkac` data structure, which includes a public key and a challenge.
         */
        fun exportChallenge(spkac: BinaryLike): node.buffer.Buffer

        /**
         * ```js
         * const { Certificate } = await import('node:crypto');
         * const spkac = getSpkacSomehow();
         * const publicKey = Certificate.exportPublicKey(spkac);
         * console.log(publicKey);
         * // Prints: the public key as <Buffer ...>
         * ```
         * @since v9.0.0
         * @param encoding The `encoding` of the `spkac` string.
         * @return The public key component of the `spkac` data structure, which includes a public key and a challenge.
         */
        fun exportPublicKey(spkac: BinaryLike, encoding: String = definedExternally): node.buffer.Buffer

        /**
         * ```js
         * import { Buffer } from 'node:buffer';
         * const { Certificate } = await import('node:crypto');
         *
         * const spkac = getSpkacSomehow();
         * console.log(Certificate.verifySpkac(Buffer.from(spkac)));
         * // Prints: true or false
         * ```
         * @since v9.0.0
         * @param encoding The `encoding` of the `spkac` string.
         * @return `true` if the given `spkac` data structure is valid, `false` otherwise.
         */
        fun verifySpkac(spkac: js.buffer.ArrayBufferView): Boolean
    }

}
