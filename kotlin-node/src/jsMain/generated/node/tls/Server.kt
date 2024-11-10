// Generated by Karakum - do not modify it manually!

@file:JsModule("node:tls")

package node.tls

/**
 * Accepts encrypted connections using TLS or SSL.
 * @since v0.3.2
 */
open external class Server : node.net.Server {
    constructor (secureConnectionListener: (socket: TLSSocket) -> Unit = definedExternally)
    constructor (options: TlsOptions, secureConnectionListener: (socket: TLSSocket) -> Unit = definedExternally)

    /**
     * The `server.addContext()` method adds a secure context that will be used if
     * the client request's SNI name matches the supplied `hostname` (or wildcard).
     *
     * When there are multiple matching contexts, the most recently added one is
     * used.
     * @since v0.5.3
     * @param hostname A SNI host name or wildcard (e.g. `'*'`)
     * @param context An object containing any of the possible properties from the {@link createSecureContext} `options` arguments (e.g. `key`, `cert`, `ca`, etc), or a TLS context object created
     * with {@link createSecureContext} itself.
     */
    fun addContext(hostname: String, context: SecureContextOptions): Unit

    /**
     * Returns the session ticket keys.
     *
     * See `Session Resumption` for more information.
     * @since v3.0.0
     * @return A 48-byte buffer containing the session ticket keys.
     */
    fun getTicketKeys(): node.buffer.Buffer

    /**
     * The `server.setSecureContext()` method replaces the secure context of an
     * existing server. Existing connections to the server are not interrupted.
     * @since v11.0.0
     * @param options An object containing any of the possible properties from the {@link createSecureContext} `options` arguments (e.g. `key`, `cert`, `ca`, etc).
     */
    fun setSecureContext(options: SecureContextOptions): Unit

    /**
     * Sets the session ticket keys.
     *
     * Changes to the ticket keys are effective only for future server connections.
     * Existing or currently pending server connections will use the previous keys.
     *
     * See `Session Resumption` for more information.
     * @since v3.0.0
     * @param keys A 48-byte buffer containing the session ticket keys.
     */
    fun setTicketKeys(keys: node.buffer.Buffer): Unit

    /**
     * events.EventEmitter
     * 1. tlsClientError
     * 2. newSession
     * 3. OCSPRequest
     * 4. resumeSession
     * 5. secureConnection
     * 6. keylog
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


    @web.events.JsEvent("tlsClientError")
    open val tlsClientErrorEvent: node.events.EventInstance<js.array.JsTuple2<js.errors.JsError, TLSSocket>>

    @web.events.JsEvent("newSession")
    val newSessionEvent: node.events.EventInstance<js.array.JsTuple3<node.buffer.Buffer, node.buffer.Buffer, () -> Unit>>

    @web.events.JsEvent("OCSPRequest")
    open val OCSPRequestEvent: node.events.EventInstance<js.array.JsTuple3<node.buffer.Buffer, node.buffer.Buffer, (err: js.errors.JsError?, resp: node.buffer.Buffer) -> Unit>>

    @web.events.JsEvent("resumeSession")
    val resumeSessionEvent: node.events.EventInstance<js.array.JsTuple2<node.buffer.Buffer, (err: js.errors.JsError?, sessionData: node.buffer.Buffer?) -> Unit>>

    @web.events.JsEvent("secureConnection")
    open val secureConnectionEvent: node.events.EventInstance<js.array.JsTuple1<TLSSocket>>

    @web.events.JsEvent("keylog")
    open val keylogEvent: node.events.EventInstance<js.array.JsTuple2<node.buffer.Buffer, TLSSocket>>
}
