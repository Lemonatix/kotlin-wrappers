// Generated by Karakum - do not modify it manually!

@file:JsModule("node:crypto")

package node.crypto

import js.buffer.ArrayBuffer

/**
 * Creates a `DiffieHellman` key exchange object using the supplied `prime` and an
 * optional specific `generator`.
 *
 * The `generator` argument can be a number, string, or `Buffer`. If `generator` is not specified, the value `2` is used.
 *
 * If `primeEncoding` is specified, `prime` is expected to be a string; otherwise
 * a `Buffer`, `TypedArray`, or `DataView` is expected.
 *
 * If `generatorEncoding` is specified, `generator` is expected to be a string;
 * otherwise a number, `Buffer`, `TypedArray`, or `DataView` is expected.
 * @since v0.11.12
 * @param primeEncoding The `encoding` of the `prime` string.
 * @param [generator=2]
 * @param generatorEncoding The `encoding` of the `generator` string.
 */
external fun createDiffieHellman(primeLength: Number, generator: Number = definedExternally): DiffieHellman

external fun createDiffieHellman(prime: ArrayBuffer): DiffieHellman

external fun createDiffieHellman(prime: ArrayBuffer, generator: Double = definedExternally): DiffieHellman

external fun createDiffieHellman(prime: ArrayBuffer, generator: ArrayBuffer = definedExternally): DiffieHellman

external fun createDiffieHellman(
    prime: ArrayBuffer,
    generator: js.buffer.ArrayBufferView<*> = definedExternally,
): DiffieHellman

external fun createDiffieHellman(prime: js.buffer.ArrayBufferView<*>): DiffieHellman

external fun createDiffieHellman(prime: js.buffer.ArrayBufferView<*>, generator: Double = definedExternally): DiffieHellman

external fun createDiffieHellman(
    prime: js.buffer.ArrayBufferView<*>,
    generator: ArrayBuffer = definedExternally,
): DiffieHellman

external fun createDiffieHellman(
    prime: js.buffer.ArrayBufferView<*>,
    generator: js.buffer.ArrayBufferView<*> = definedExternally,
): DiffieHellman

external fun createDiffieHellman(
    prime: ArrayBuffer,
    generator: String,
    generatorEncoding: BinaryToTextEncoding,
): DiffieHellman

external fun createDiffieHellman(
    prime: js.buffer.ArrayBufferView<*>,
    generator: String,
    generatorEncoding: BinaryToTextEncoding,
): DiffieHellman

external fun createDiffieHellman(prime: String, primeEncoding: BinaryToTextEncoding): DiffieHellman

external fun createDiffieHellman(
    prime: String,
    primeEncoding: BinaryToTextEncoding,
    generator: Double = definedExternally,
): DiffieHellman

external fun createDiffieHellman(
    prime: String,
    primeEncoding: BinaryToTextEncoding,
    generator: ArrayBuffer = definedExternally,
): DiffieHellman

external fun createDiffieHellman(
    prime: String,
    primeEncoding: BinaryToTextEncoding,
    generator: js.buffer.ArrayBufferView<*> = definedExternally,
): DiffieHellman

external fun createDiffieHellman(
    prime: String,
    primeEncoding: BinaryToTextEncoding,
    generator: String,
    generatorEncoding: BinaryToTextEncoding,
): DiffieHellman
