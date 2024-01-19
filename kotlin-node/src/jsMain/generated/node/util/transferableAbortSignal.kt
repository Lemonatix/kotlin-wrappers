// Generated by Karakum - do not modify it manually!

@file:JsModule("node:util")

package node.util

import web.abort.AbortSignal

/**
 * Marks the given `AbortSignal` as transferable so that it can be used with`structuredClone()` and `postMessage()`.
 *
 * ```js
 * const signal = transferableAbortSignal(AbortSignal.timeout(100));
 * const channel = new MessageChannel();
 * channel.port2.postMessage(signal, [signal]);
 * ```
 * @since v18.11.0
 * @experimental
 * @param signal The AbortSignal
 * @returns The same AbortSignal
 */
external fun transferableAbortSignal(signal: AbortSignal): AbortSignal
