// Generated by Karakum - do not modify it manually!

@file:JsModule("node:worker_threads")

package node.workerThreads

import js.array.ReadonlyArray
import js.promise.Promise
import node.events.EventEmitter
import node.stream.Readable
import node.stream.Writable
import web.url.URL

/**
 * The `Worker` class represents an independent JavaScript execution thread.
 * Most Node.js APIs are available inside of it.
 *
 * Notable differences inside a Worker environment are:
 *
 * * The `process.stdin`, `process.stdout`, and `process.stderr` streams may be redirected by the parent thread.
 * * The `require('node:worker_threads').isMainThread` property is set to `false`.
 * * The `require('node:worker_threads').parentPort` message port is available.
 * * `process.exit()` does not stop the whole program, just the single thread,
 * and `process.abort()` is not available.
 * * `process.chdir()` and `process` methods that set group or user ids
 * are not available.
 * * `process.env` is a copy of the parent thread's environment variables,
 * unless otherwise specified. Changes to one copy are not visible in other
 * threads, and are not visible to native add-ons (unless `worker.SHARE_ENV` is passed as the `env` option to the `Worker` constructor). On Windows, unlike the main thread, a copy of the
 * environment variables operates in a case-sensitive manner.
 * * `process.title` cannot be modified.
 * * Signals are not delivered through `process.on('...')`.
 * * Execution may stop at any point as a result of `worker.terminate()` being invoked.
 * * IPC channels from parent processes are not accessible.
 * * The `trace_events` module is not supported.
 * * Native add-ons can only be loaded from multiple threads if they fulfill `certain conditions`.
 *
 * Creating `Worker` instances inside of other `Worker`s is possible.
 *
 * Like [Web Workers](https://developer.mozilla.org/en-US/docs/Web/API/Web_Workers_API) and the `node:cluster module`, two-way communication
 * can be achieved through inter-thread message passing. Internally, a `Worker` has
 * a built-in pair of `MessagePort` s that are already associated with each
 * other when the `Worker` is created. While the `MessagePort` object on the parent
 * side is not directly exposed, its functionalities are exposed through `worker.postMessage()` and the `worker.on('message')` event
 * on the `Worker` object for the parent thread.
 *
 * To create custom messaging channels (which is encouraged over using the default
 * global channel because it facilitates separation of concerns), users can create
 * a `MessageChannel` object on either thread and pass one of the`MessagePort`s on that `MessageChannel` to the other thread through a
 * pre-existing channel, such as the global one.
 *
 * See `port.postMessage()` for more information on how messages are passed,
 * and what kind of JavaScript values can be successfully transported through
 * the thread barrier.
 *
 * ```js
 * const assert = require('node:assert');
 * const {
 *   Worker, MessageChannel, MessagePort, isMainThread, parentPort,
 * } = require('node:worker_threads');
 * if (isMainThread) {
 *   const worker = new Worker(__filename);
 *   const subChannel = new MessageChannel();
 *   worker.postMessage({ hereIsYourPort: subChannel.port1 }, [subChannel.port1]);
 *   subChannel.port2.on('message', (value) => {
 *     console.log('received:', value);
 *   });
 * } else {
 *   parentPort.once('message', (value) => {
 *     assert(value.hereIsYourPort instanceof MessagePort);
 *     value.hereIsYourPort.postMessage('the worker is sending this');
 *     value.hereIsYourPort.close();
 *   });
 * }
 * ```
 * @since v10.5.0
 */
external class Worker : EventEmitter {
    /**
     * @param filename  The path to the Worker’s main script or module.
     *                  Must be either an absolute path or a relative path (i.e. relative to the current working directory) starting with ./ or ../,
     *                  or a WHATWG URL object using file: protocol. If options.eval is true, this is a string containing JavaScript code rather than a path.
     */
    constructor (filename: String, options: WorkerOptions = definedExternally)

    /**
     * @param filename  The path to the Worker’s main script or module.
     *                  Must be either an absolute path or a relative path (i.e. relative to the current working directory) starting with ./ or ../,
     *                  or a WHATWG URL object using file: protocol. If options.eval is true, this is a string containing JavaScript code rather than a path.
     */
    constructor (filename: URL, options: WorkerOptions = definedExternally)

    /**
     * If `stdin: true` was passed to the `Worker` constructor, this is a
     * writable stream. The data written to this stream will be made available in
     * the worker thread as `process.stdin`.
     * @since v10.5.0
     */
    val stdin: Writable?

    /**
     * This is a readable stream which contains data written to `process.stdout` inside the worker thread. If `stdout: true` was not passed to the `Worker` constructor, then data is piped to the
     * parent thread's `process.stdout` stream.
     * @since v10.5.0
     */
    val stdout: Readable

    /**
     * This is a readable stream which contains data written to `process.stderr` inside the worker thread. If `stderr: true` was not passed to the `Worker` constructor, then data is piped to the
     * parent thread's `process.stderr` stream.
     * @since v10.5.0
     */
    val stderr: Readable

    /**
     * An integer identifier for the referenced thread. Inside the worker thread,
     * it is available as `require('node:worker_threads').threadId`.
     * This value is unique for each `Worker` instance inside a single process.
     * @since v10.5.0
     */
    val threadId: Double

    /**
     * Provides the set of JS engine resource constraints for this Worker thread.
     * If the `resourceLimits` option was passed to the `Worker` constructor,
     * this matches its values.
     *
     * If the worker has stopped, the return value is an empty object.
     * @since v13.2.0, v12.16.0
     */
    val resourceLimits: ResourceLimits?

    /**
     * An object that can be used to query performance information from a worker
     * instance. Similar to `perf_hooks.performance`.
     * @since v15.1.0, v14.17.0, v12.22.0
     */
    val performance: WorkerPerformance

    /**
     * Send a message to the worker that is received via `require('node:worker_threads').parentPort.on('message')`.
     * See `port.postMessage()` for more details.
     * @since v10.5.0
     */
    fun postMessage(value: Any?, transferList: ReadonlyArray<TransferListItem> = definedExternally): Unit

    /**
     * Sends a value to another worker, identified by its thread ID.
     * @param threadId The target thread ID. If the thread ID is invalid, a `ERR_WORKER_MESSAGING_FAILED` error will be thrown.
     * If the target thread ID is the current thread ID, a `ERR_WORKER_MESSAGING_SAME_THREAD` error will be thrown.
     * @param value The value to send.
     * @param transferList If one or more `MessagePort`-like objects are passed in value, a `transferList` is required for those items
     * or `ERR_MISSING_MESSAGE_PORT_IN_TRANSFER_LIST` is thrown. See `port.postMessage()` for more information.
     * @param timeout Time to wait for the message to be delivered in milliseconds. By default it's `undefined`, which means wait forever.
     * If the operation times out, a `ERR_WORKER_MESSAGING_TIMEOUT` error is thrown.
     * @since v22.5.0
     */
    fun postMessageToThread(threadId: Number, value: Any?, timeout: Number = definedExternally): Promise<js.core.Void>
    fun postMessageToThread(
        threadId: Number,
        value: Any?,
        transferList: ReadonlyArray<TransferListItem>,
        timeout: Number = definedExternally,
    ): Promise<js.core.Void>

    /**
     * Opposite of `unref()`, calling `ref()` on a previously `unref()`ed worker does _not_ let the program exit if it's the only active handle left (the default
     * behavior). If the worker is `ref()`ed, calling `ref()` again has
     * no effect.
     * @since v10.5.0
     */
    fun ref(): Unit

    /**
     * Calling `unref()` on a worker allows the thread to exit if this is the only
     * active handle in the event system. If the worker is already `unref()`ed calling `unref()` again has no effect.
     * @since v10.5.0
     */
    fun unref(): Unit

    /**
     * Stop all JavaScript execution in the worker thread as soon as possible.
     * Returns a Promise for the exit code that is fulfilled when the `'exit' event` is emitted.
     * @since v10.5.0
     */
    fun terminate(): Promise<Double>

    /**
     * Returns a readable stream for a V8 snapshot of the current state of the Worker.
     * See `v8.getHeapSnapshot()` for more details.
     *
     * If the Worker thread is no longer running, which may occur before the `'exit' event` is emitted, the returned `Promise` is rejected
     * immediately with an `ERR_WORKER_NOT_RUNNING` error.
     * @since v13.9.0, v12.17.0
     * @return A promise for a Readable Stream containing a V8 heap snapshot
     */
    fun getHeapSnapshot(): Promise<Readable>


    fun addListener(event: String, listener: Function<Unit> /* (...args: any[]) => void */): Unit /* this */

    fun addListener(event: js.symbol.Symbol, listener: Function<Unit> /* (...args: any[]) => void */): Unit /* this */


    fun emit(event: String, vararg args: Any?): Boolean

    fun emit(event: js.symbol.Symbol, vararg args: Any?): Boolean


    fun on(event: String, listener: Function<Unit> /* (...args: any[]) => void */): Unit /* this */

    fun on(event: js.symbol.Symbol, listener: Function<Unit> /* (...args: any[]) => void */): Unit /* this */


    fun once(event: String, listener: Function<Unit> /* (...args: any[]) => void */): Unit /* this */

    fun once(event: js.symbol.Symbol, listener: Function<Unit> /* (...args: any[]) => void */): Unit /* this */


    fun prependListener(event: String, listener: Function<Unit> /* (...args: any[]) => void */): Unit /* this */

    fun prependListener(
        event: js.symbol.Symbol,
        listener: Function<Unit>, /* (...args: any[]) => void */
    ): Unit /* this */


    fun prependOnceListener(event: String, listener: Function<Unit> /* (...args: any[]) => void */): Unit /* this */

    fun prependOnceListener(
        event: js.symbol.Symbol,
        listener: Function<Unit>, /* (...args: any[]) => void */
    ): Unit /* this */


    fun removeListener(event: String, listener: Function<Unit> /* (...args: any[]) => void */): Unit /* this */

    fun removeListener(
        event: js.symbol.Symbol,
        listener: Function<Unit>, /* (...args: any[]) => void */
    ): Unit /* this */


    fun off(event: String, listener: Function<Unit> /* (...args: any[]) => void */): Unit /* this */

    fun off(event: js.symbol.Symbol, listener: Function<Unit> /* (...args: any[]) => void */): Unit /* this */

    @web.events.JsEvent("error")
    val errorEvent: node.events.EventInstance<js.array.JsTuple1<js.errors.JsError>>

    @web.events.JsEvent("exit")
    val exitEvent: node.events.EventInstance<js.array.JsTuple1<Double>>

    @web.events.JsEvent("message")
    val messageEvent: node.events.EventInstance<js.array.JsTuple1<Any?>>

    @web.events.JsEvent("messageerror")
    val messageerrorEvent: node.events.EventInstance<js.array.JsTuple1<js.errors.JsError>>

    @web.events.JsEvent("online")
    val onlineEvent: node.events.EventInstance<js.array.JsTuple>
}
