// Generated by Karakum - do not modify it manually!

@file:JsModule("node:test")
@file:JsQualifier("describe")

package node.test.describe

import js.promise.Promise
import node.test.SuiteFn
import node.test.TestOptions

/**
 * Shorthand for marking a suite as `only`. This is the same as calling {@link describe} with `options.only` set to `true`.
 * @since v18.15.0
 */

@JsName("only")
external fun onlyAsync(
    name: String = definedExternally,
    options: TestOptions = definedExternally,
    fn: SuiteFn = definedExternally,
): Promise<js.core.Void>


@JsName("only")
external fun onlyAsync(name: String = definedExternally, fn: SuiteFn = definedExternally): Promise<js.core.Void>


@JsName("only")
external fun onlyAsync(options: TestOptions = definedExternally, fn: SuiteFn = definedExternally): Promise<js.core.Void>


@JsName("only")
external fun onlyAsync(fn: SuiteFn = definedExternally): Promise<js.core.Void>

@JsName("only")
external fun onlyAsync(): Promise<js.core.Void>
