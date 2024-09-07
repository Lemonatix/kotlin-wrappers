// Generated by Karakum - do not modify it manually!

@file:JsModule("node:test")
@file:JsQualifier("describe")

package node.test.describe

import js.promise.Promise
import node.test.SuiteFn
import node.test.TestOptions

/**
 * Shorthand for skipping a suite. This is the same as calling {@link describe} with `options.skip` set to `true`.
 * @since v18.15.0
 */

@JsName("skip")
external fun skipAsync(
    name: String = definedExternally,
    options: TestOptions = definedExternally,
    fn: SuiteFn = definedExternally,
): Promise<js.core.Void>


@JsName("skip")
external fun skipAsync(name: String = definedExternally, fn: SuiteFn = definedExternally): Promise<js.core.Void>


@JsName("skip")
external fun skipAsync(options: TestOptions = definedExternally, fn: SuiteFn = definedExternally): Promise<js.core.Void>


@JsName("skip")
external fun skipAsync(fn: SuiteFn = definedExternally): Promise<js.core.Void>

@JsName("skip")
external fun skipAsync(): Promise<js.core.Void>
