// Generated by Karakum - do not modify it manually!

@file:JsModule("node:async_hooks")

package node.asyncHooks


/**
 * ```js
 * import { executionAsyncId } from 'node:async_hooks';
 * import fs from 'node:fs';
 *
 * console.log(executionAsyncId());  // 1 - bootstrap
 * const path = '.';
 * fs.open(path, 'r', (err, fd) => {
 *   console.log(executionAsyncId());  // 6 - open()
 * });
 * ```
 *
 * The ID returned from `executionAsyncId()` is related to execution timing, not
 * causality (which is covered by `triggerAsyncId()`):
 *
 * ```js
 * const server = net.createServer((conn) => {
 *   // Returns the ID of the server, not of the new connection, because the
 *   // callback runs in the execution scope of the server's MakeCallback().
 *   async_hooks.executionAsyncId();
 *
 * }).listen(port, () => {
 *   // Returns the ID of a TickObject (process.nextTick()) because all
 *   // callbacks passed to .listen() are wrapped in a nextTick().
 *   async_hooks.executionAsyncId();
 * });
 * ```
 *
 * Promise contexts may not get precise `executionAsyncIds` by default.
 * See the section on `promise execution tracking`.
 * @since v8.1.0
 * @return The `asyncId` of the current execution context. Useful to track when something calls.
 */
external fun executionAsyncId(): Double
