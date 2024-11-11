// Generated by Karakum - do not modify it manually!

@file:JsModule("node:net")

package node.net

import js.typedarrays.Uint8Array

/**
 * This class is an abstraction of a TCP socket or a streaming `IPC` endpoint
 * (uses named pipes on Windows, and Unix domain sockets otherwise). It is also
 * an `EventEmitter`.
 *
 * A `net.Socket` can be created by the user and used directly to interact with
 * a server. For example, it is returned by {@link createConnection},
 * so the user can use it to talk to the server.
 *
 * It can also be created by Node.js and passed to the user when a connection
 * is received. For example, it is passed to the listeners of a `'connection'` event emitted on a {@link Server}, so the user can use
 * it to interact with the client.
 * @since v0.3.4
 */
open external class Socket : node.stream.Duplex {
    constructor (options: SocketConstructorOpts = definedExternally)

    /**
     * Destroys the socket after all data is written. If the `finish` event was already emitted the socket is destroyed immediately.
     * If the socket is still writable it implicitly calls `socket.end()`.
     * @since v0.3.4
     */
    fun destroySoon(): Unit

    /**
     * Sends data on the socket. The second parameter specifies the encoding in the
     * case of a string. It defaults to UTF8 encoding.
     *
     * Returns `true` if the entire data was flushed successfully to the kernel
     * buffer. Returns `false` if all or part of the data was queued in user memory.`'drain'` will be emitted when the buffer is again free.
     *
     * The optional `callback` parameter will be executed when the data is finally
     * written out, which may not be immediately.
     *
     * See `Writable` stream `write()` method for more
     * information.
     * @since v0.1.90
     * @param [encoding='utf8'] Only used when data is `string`.
     */
    override fun write(
        buffer: Uint8Array<*>,
        cb: (err: js.errors.JsError? /* use undefined for default */) -> Unit,
    ): Boolean

    /**
     * Sends data on the socket. The second parameter specifies the encoding in the
     * case of a string. It defaults to UTF8 encoding.
     *
     * Returns `true` if the entire data was flushed successfully to the kernel
     * buffer. Returns `false` if all or part of the data was queued in user memory.`'drain'` will be emitted when the buffer is again free.
     *
     * The optional `callback` parameter will be executed when the data is finally
     * written out, which may not be immediately.
     *
     * See `Writable` stream `write()` method for more
     * information.
     * @since v0.1.90
     * @param [encoding='utf8'] Only used when data is `string`.
     */
    override fun write(buffer: String, cb: (err: js.errors.JsError? /* use undefined for default */) -> Unit): Boolean
    fun write(
        str: Uint8Array<*>,
        encoding: node.buffer.BufferEncoding = definedExternally,
        cb: (err: js.errors.JsError? /* use undefined for default */) -> Unit = definedExternally,
    ): Boolean

    override fun write(
        str: String,
        encoding: node.buffer.BufferEncoding,
        cb: (err: js.errors.JsError? /* use undefined for default */) -> Unit,
    ): Boolean

    /**
     * Initiate a connection on a given socket.
     *
     * Possible signatures:
     *
     * * `socket.connect(options[, connectListener])`
     * * `socket.connect(path[, connectListener])` for `IPC` connections.
     * * `socket.connect(port[, host][, connectListener])` for TCP connections.
     * * Returns: `net.Socket` The socket itself.
     *
     * This function is asynchronous. When the connection is established, the `'connect'` event will be emitted. If there is a problem connecting,
     * instead of a `'connect'` event, an `'error'` event will be emitted with
     * the error passed to the `'error'` listener.
     * The last parameter `connectListener`, if supplied, will be added as a listener
     * for the `'connect'` event **once**.
     *
     * This function should only be used for reconnecting a socket after`'close'` has been emitted or otherwise it may lead to undefined
     * behavior.
     */
    fun connect(options: SocketConnectOpts, connectionListener: () -> Unit = definedExternally): Unit /* this */
    fun connect(port: Number, host: String, connectionListener: () -> Unit = definedExternally): Unit /* this */
    fun connect(port: Number, connectionListener: () -> Unit = definedExternally): Unit /* this */
    fun connect(path: String, connectionListener: () -> Unit = definedExternally): Unit /* this */

    /**
     * Set the encoding for the socket as a `Readable Stream`. See `readable.setEncoding()` for more information.
     * @since v0.1.90
     * @return The socket itself.
     */
    override fun setEncoding(encoding: node.buffer.BufferEncoding): Unit /* this */

    /**
     * Pauses the reading of data. That is, `'data'` events will not be emitted.
     * Useful to throttle back an upload.
     * @return The socket itself.
     */
    override fun pause(): Unit /* this */

    /**
     * Close the TCP connection by sending an RST packet and destroy the stream.
     * If this TCP socket is in connecting status, it will send an RST packet and destroy this TCP socket once it is connected.
     * Otherwise, it will call `socket.destroy` with an `ERR_SOCKET_CLOSED` Error.
     * If this is not a TCP socket (for example, a pipe), calling this method will immediately throw an `ERR_INVALID_HANDLE_TYPE` Error.
     * @since v18.3.0, v16.17.0
     */
    fun resetAndDestroy(): Unit /* this */

    /**
     * Resumes reading after a call to `socket.pause()`.
     * @return The socket itself.
     */
    override fun resume(): Unit /* this */

    /**
     * Sets the socket to timeout after `timeout` milliseconds of inactivity on
     * the socket. By default `net.Socket` do not have a timeout.
     *
     * When an idle timeout is triggered the socket will receive a `'timeout'` event but the connection will not be severed. The user must manually call `socket.end()` or `socket.destroy()` to
     * end the connection.
     *
     * ```js
     * socket.setTimeout(3000);
     * socket.on('timeout', () => {
     *   console.log('socket timeout');
     *   socket.end();
     * });
     * ```
     *
     * If `timeout` is 0, then the existing idle timeout is disabled.
     *
     * The optional `callback` parameter will be added as a one-time listener for the `'timeout'` event.
     * @since v0.1.90
     * @return The socket itself.
     */
    fun setTimeout(timeout: Number, callback: () -> Unit = definedExternally): Unit /* this */

    /**
     * Enable/disable the use of Nagle's algorithm.
     *
     * When a TCP connection is created, it will have Nagle's algorithm enabled.
     *
     * Nagle's algorithm delays data before it is sent via the network. It attempts
     * to optimize throughput at the expense of latency.
     *
     * Passing `true` for `noDelay` or not passing an argument will disable Nagle's
     * algorithm for the socket. Passing `false` for `noDelay` will enable Nagle's
     * algorithm.
     * @since v0.1.90
     * @param [noDelay=true]
     * @return The socket itself.
     */
    fun setNoDelay(noDelay: Boolean = definedExternally): Unit /* this */

    /**
     * Enable/disable keep-alive functionality, and optionally set the initial
     * delay before the first keepalive probe is sent on an idle socket.
     *
     * Set `initialDelay` (in milliseconds) to set the delay between the last
     * data packet received and the first keepalive probe. Setting `0` for`initialDelay` will leave the value unchanged from the default
     * (or previous) setting.
     *
     * Enabling the keep-alive functionality will set the following socket options:
     *
     * * `SO_KEEPALIVE=1`
     * * `TCP_KEEPIDLE=initialDelay`
     * * `TCP_KEEPCNT=10`
     * * `TCP_KEEPINTVL=1`
     * @since v0.1.92
     * @param [enable=false]
     * @param [initialDelay=0]
     * @return The socket itself.
     */
    fun setKeepAlive(enable: Boolean = definedExternally, initialDelay: Number = definedExternally): Unit /* this */

    /**
     * Returns the bound `address`, the address `family` name and `port` of the
     * socket as reported by the operating system:`{ port: 12346, family: 'IPv4', address: '127.0.0.1' }`
     * @since v0.1.90
     */
    fun address(): Any /* AddressInfo | {} */

    /**
     * Calling `unref()` on a socket will allow the program to exit if this is the only
     * active socket in the event system. If the socket is already `unref`ed calling`unref()` again will have no effect.
     * @since v0.9.1
     * @return The socket itself.
     */
    fun unref(): Unit /* this */

    /**
     * Opposite of `unref()`, calling `ref()` on a previously `unref`ed socket will _not_ let the program exit if it's the only socket left (the default behavior).
     * If the socket is `ref`ed calling `ref` again will have no effect.
     * @since v0.9.1
     * @return The socket itself.
     */
    fun ref(): Unit /* this */

    /**
     * This property is only present if the family autoselection algorithm is enabled in `socket.connect(options)`
     * and it is an array of the addresses that have been attempted.
     *
     * Each address is a string in the form of `$IP:$PORT`.
     * If the connection was successful, then the last address is the one that the socket is currently connected to.
     * @since v19.4.0
     */
    val autoSelectFamilyAttemptedAddresses: js.array.ReadonlyArray<String>

    /**
     * This property shows the number of characters buffered for writing. The buffer
     * may contain strings whose length after encoding is not yet known. So this number
     * is only an approximation of the number of bytes in the buffer.
     *
     * `net.Socket` has the property that `socket.write()` always works. This is to
     * help users get up and running quickly. The computer cannot always keep up
     * with the amount of data that is written to a socket. The network connection
     * simply might be too slow. Node.js will internally queue up the data written to a
     * socket and send it out over the wire when it is possible.
     *
     * The consequence of this internal buffering is that memory may grow.
     * Users who experience large or growing `bufferSize` should attempt to
     * "throttle" the data flows in their program with `socket.pause()` and `socket.resume()`.
     * @since v0.3.8
     * @deprecated Since v14.6.0 - Use `writableLength` instead.
     */
    val bufferSize: Double

    /**
     * The amount of received bytes.
     * @since v0.5.3
     */
    val bytesRead: Double

    /**
     * The amount of bytes sent.
     * @since v0.5.3
     */
    val bytesWritten: Double

    /**
     * If `true`, `socket.connect(options[, connectListener])` was
     * called and has not yet finished. It will stay `true` until the socket becomes
     * connected, then it is set to `false` and the `'connect'` event is emitted. Note
     * that the `socket.connect(options[, connectListener])` callback is a listener for the `'connect'` event.
     * @since v6.1.0
     */
    val connecting: Boolean

    /**
     * This is `true` if the socket is not connected yet, either because `.connect()`has not yet been called or because it is still in the process of connecting
     * (see `socket.connecting`).
     * @since v11.2.0, v10.16.0
     */
    val pending: Boolean

    /**
     * See `writable.destroyed` for further details.
     */
    @JsName("destroyed")
    val netSocketDestroyed: Boolean

    /**
     * The string representation of the local IP address the remote client is
     * connecting on. For example, in a server listening on `'0.0.0.0'`, if a client
     * connects on `'192.168.1.1'`, the value of `socket.localAddress` would be`'192.168.1.1'`.
     * @since v0.9.6
     */
    val localAddress: String?

    /**
     * The numeric representation of the local port. For example, `80` or `21`.
     * @since v0.9.6
     */
    val localPort: Double?

    /**
     * The string representation of the local IP family. `'IPv4'` or `'IPv6'`.
     * @since v18.8.0, v16.18.0
     */
    val localFamily: String?

    /**
     * This property represents the state of the connection as a string.
     *
     * * If the stream is connecting `socket.readyState` is `opening`.
     * * If the stream is readable and writable, it is `open`.
     * * If the stream is readable and not writable, it is `readOnly`.
     * * If the stream is not readable and writable, it is `writeOnly`.
     * @since v0.5.0
     */
    val readyState: SocketReadyState

    /**
     * The string representation of the remote IP address. For example,`'74.125.127.100'` or `'2001:4860:a005::68'`. Value may be `undefined` if
     * the socket is destroyed (for example, if the client disconnected).
     * @since v0.5.10
     */
    val remoteAddress: String?

    /**
     * The string representation of the remote IP family. `'IPv4'` or `'IPv6'`. Value may be `undefined` if
     * the socket is destroyed (for example, if the client disconnected).
     * @since v0.11.14
     */
    val remoteFamily: String?

    /**
     * The numeric representation of the remote port. For example, `80` or `21`. Value may be `undefined` if
     * the socket is destroyed (for example, if the client disconnected).
     * @since v0.5.10
     */
    val remotePort: Double?

    /**
     * The socket timeout in milliseconds as set by `socket.setTimeout()`.
     * It is `undefined` if a timeout has not been set.
     * @since v10.7.0
     */
    val timeout: Double?

    /**
     * Half-closes the socket. i.e., it sends a FIN packet. It is possible the
     * server will still send some data.
     *
     * See `writable.end()` for further details.
     * @since v0.1.90
     * @param [encoding='utf8'] Only used when data is `string`.
     * @param callback Optional callback for when the socket is finished.
     * @return The socket itself.
     */
    override fun end(cb: () -> Unit): Unit /* this */
    override fun end(data: Uint8Array<*>, cb: () -> Unit): Unit /* this */

    override fun end(data: String, cb: () -> Unit): Unit /* this */
    fun end(
        str: Uint8Array<*>,
        encoding: node.buffer.BufferEncoding = definedExternally,
        cb: () -> Unit = definedExternally,
    ): Unit /* this */

    override fun end(str: String, encoding: node.buffer.BufferEncoding, cb: () -> Unit): Unit /* this */

    /**
     * events.EventEmitter
     *   1. close
     *   2. connect
     *   3. connectionAttempt
     *   4. connectionAttemptFailed
     *   5. connectionAttemptTimeout
     *   6. data
     *   7. drain
     *   8. end
     *   9. error
     *   10. lookup
     *   11. ready
     *   12. timeout
     */
    override fun addListener(event: String, listener: Function<Unit> /* (...args: any[]) => void */): Unit /* this */


    override fun emit(event: String, vararg args: Any?): Boolean

    override fun emit(event: js.symbol.Symbol, vararg args: Any?): Boolean


    override fun on(event: String, listener: Function<Unit> /* (...args: any[]) => void */): Unit /* this */


    override fun once(event: String, listener: Function<Unit> /* (...args: any[]) => void */): Unit /* this */


    override fun prependListener(
        event: String,
        listener: Function<Unit>, /* (...args: any[]) => void */
    ): Unit /* this */


    override fun prependOnceListener(
        event: String,
        listener: Function<Unit>, /* (...args: any[]) => void */
    ): Unit /* this */


    @web.events.JsEvent("close")
    override val closeEvent: node.events.EventInstance<js.array.JsTuple1<Boolean>>

    @web.events.JsEvent("connect")
    val connectEvent: node.events.EventInstance<js.array.JsTuple>

    @web.events.JsEvent("connectionAttempt")
    val connectionAttemptEvent: node.events.EventInstance<js.array.JsTuple3<String, Double, Double>>

    @web.events.JsEvent("connectionAttemptFailed")
    val connectionAttemptFailedEvent: node.events.EventInstance<js.array.JsTuple3<String, Double, Double>>

    @web.events.JsEvent("connectionAttemptTimeout")
    val connectionAttemptTimeoutEvent: node.events.EventInstance<js.array.JsTuple3<String, Double, Double>>

    @web.events.JsEvent("data")
    override val dataEvent: node.events.EventInstance<js.array.JsTuple1<node.buffer.Buffer>>

    @web.events.JsEvent("drain")
    override val drainEvent: node.events.EventInstance<js.array.JsTuple>

    @web.events.JsEvent("end")
    override val endEvent: node.events.EventInstance<js.array.JsTuple>

    @web.events.JsEvent("error")
    override val errorEvent: node.events.EventInstance<js.array.JsTuple1<js.errors.JsError>>

    @web.events.JsEvent("lookup")
    val lookupEvent: node.events.EventInstance<js.array.JsTuple4<js.errors.JsError, String, Any /* string | number */, String>>

    @web.events.JsEvent("ready")
    val readyEvent: node.events.EventInstance<js.array.JsTuple>

    @web.events.JsEvent("timeout")
    val timeoutEvent: node.events.EventInstance<js.array.JsTuple>
}
