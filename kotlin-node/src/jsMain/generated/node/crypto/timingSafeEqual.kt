// Generated by Karakum - do not modify it manually!

@file:JsModule("node:crypto")

package node.crypto


/**
 * This function compares the underlying bytes that represent the given`ArrayBuffer`, `TypedArray`, or `DataView` instances using a constant-time
 * algorithm.
 *
 * This function does not leak timing information that
 * would allow an attacker to guess one of the values. This is suitable for
 * comparing HMAC digests or secret values like authentication cookies or [capability urls](https://www.w3.org/TR/capability-urls/).
 *
 * `a` and `b` must both be `Buffer`s, `TypedArray`s, or `DataView`s, and they
 * must have the same byte length. An error is thrown if `a` and `b` have
 * different byte lengths.
 *
 * If at least one of `a` and `b` is a `TypedArray` with more than one byte per
 * entry, such as `Uint16Array`, the result will be computed using the platform
 * byte order.
 *
 * **When both of the inputs are `Float32Array`s or`Float64Array`s, this function might return unexpected results due to IEEE 754**
 * **encoding of floating-point numbers. In particular, neither `x === y` nor`Object.is(x, y)` implies that the byte representations of two floating-point**
 * **numbers `x` and `y` are equal.**
 *
 * Use of `crypto.timingSafeEqual` does not guarantee that the _surrounding_ code
 * is timing-safe. Care should be taken to ensure that the surrounding code does
 * not introduce timing vulnerabilities.
 * @since v6.6.0
 */
external fun timingSafeEqual(a: js.buffer.ArrayBufferView, b: js.buffer.ArrayBufferView): Boolean
