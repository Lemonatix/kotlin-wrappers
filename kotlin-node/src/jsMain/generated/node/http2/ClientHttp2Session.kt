// Generated by Karakum - do not modify it manually!

package node.http2

import node.http.OutgoingHttpHeaders

sealed external interface ClientHttp2Session : Http2Session {
    /**
     * For HTTP/2 Client `Http2Session` instances only, the `http2session.request()` creates and returns an `Http2Stream` instance that can be used to send an
     * HTTP/2 request to the connected server.
     *
     * When a `ClientHttp2Session` is first created, the socket may not yet be
     * connected. if `clienthttp2session.request()` is called during this time, the
     * actual request will be deferred until the socket is ready to go.
     * If the `session` is closed before the actual request be executed, an `ERR_HTTP2_GOAWAY_SESSION` is thrown.
     *
     * This method is only available if `http2session.type` is equal to `http2.constants.NGHTTP2_SESSION_CLIENT`.
     *
     * ```js
     * const http2 = require('node:http2');
     * const clientSession = http2.connect('https://localhost:1234');
     * const {
     *   HTTP2_HEADER_PATH,
     *   HTTP2_HEADER_STATUS,
     * } = http2.constants;
     *
     * const req = clientSession.request({ [HTTP2_HEADER_PATH]: '/' });
     * req.on('response', (headers) => {
     *   console.log(headers[HTTP2_HEADER_STATUS]);
     *   req.on('data', (chunk) => { // ..  });
     *   req.on('end', () => { // ..  });
     * });
     * ```
     *
     * When the `options.waitForTrailers` option is set, the `'wantTrailers'` event
     * is emitted immediately after queuing the last chunk of payload data to be sent.
     * The `http2stream.sendTrailers()` method can then be called to send trailing
     * headers to the peer.
     *
     * When `options.waitForTrailers` is set, the `Http2Stream` will not automatically
     * close when the final `DATA` frame is transmitted. User code must call either`http2stream.sendTrailers()` or `http2stream.close()` to close the`Http2Stream`.
     *
     * When `options.signal` is set with an `AbortSignal` and then `abort` on the
     * corresponding `AbortController` is called, the request will emit an `'error'`event with an `AbortError` error.
     *
     * The `:method` and `:path` pseudo-headers are not specified within `headers`,
     * they respectively default to:
     *
     * * `:method` \= `'GET'`
     * * `:path` \= `/`
     * @since v8.4.0
     */
    fun request(
        headers: OutgoingHttpHeaders = definedExternally,
        options: ClientSessionRequestOptions = definedExternally,
    ): ClientHttp2Stream


    override fun addListener(event: String, listener: Function<Unit> /* (...args: any[]) => void */): Unit /* this */

    override fun addListener(
        event: js.symbol.Symbol,
        listener: Function<Unit>, /* (...args: any[]) => void */
    ): Unit /* this */


    override fun emit(event: String, vararg args: Any?): Boolean

    override fun emit(event: js.symbol.Symbol, vararg args: Any?): Boolean


    override fun on(event: String, listener: Function<Unit> /* (...args: any[]) => void */): Unit /* this */

    override fun on(event: js.symbol.Symbol, listener: Function<Unit> /* (...args: any[]) => void */): Unit /* this */


    override fun once(event: String, listener: Function<Unit> /* (...args: any[]) => void */): Unit /* this */

    override fun once(event: js.symbol.Symbol, listener: Function<Unit> /* (...args: any[]) => void */): Unit /* this */


    override fun prependListener(
        event: String,
        listener: Function<Unit>, /* (...args: any[]) => void */
    ): Unit /* this */

    override fun prependListener(
        event: js.symbol.Symbol,
        listener: Function<Unit>, /* (...args: any[]) => void */
    ): Unit /* this */


    override fun prependOnceListener(
        event: String,
        listener: Function<Unit>, /* (...args: any[]) => void */
    ): Unit /* this */

    override fun prependOnceListener(
        event: js.symbol.Symbol,
        listener: Function<Unit>, /* (...args: any[]) => void */
    ): Unit /* this */

    @web.events.JsEvent("altsvc")
    val altsvcEvent: node.events.EventInstance<js.array.JsTuple3<String, String, Double>>

    @web.events.JsEvent("origin")
    val originEvent: node.events.EventInstance<js.array.JsTuple1<js.array.ReadonlyArray<String>>>

    @web.events.JsEvent("connect")
    val connectEvent: node.events.EventInstance<js.array.JsTuple2<ClientHttp2Session, Any /* net.Socket | tls.TLSSocket */>>

    @web.events.JsEvent("stream")
    val streamEvent: node.events.EventInstance<js.array.JsTuple3<ClientHttp2Stream, ClientHttp2SessionAddListenerListenerHeaders, Double>>
}
