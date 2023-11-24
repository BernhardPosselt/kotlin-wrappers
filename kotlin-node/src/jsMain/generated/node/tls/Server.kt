// Generated by Karakum - do not modify it manually!

@file:JsModule("node:tls")

package node.tls


/**
 * Accepts encrypted connections using TLS or SSL.
 * @since v0.3.2
 */

external class Server : node.net.Server {
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
     * @param context An object containing any of the possible properties from the {@link createSecureContext} `options` arguments (e.g. `key`, `cert`, `ca`, etc).
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
    fun addListener(event: String, listener: Function<Unit> /* (...args: any[]) => void */): Unit /* this */
    fun addListener(
        event: ServerEvent.TLSCLIENTERROR,
        listener: (err: Throwable /* JsError */, tlsSocket: TLSSocket) -> Unit,
    ): Unit /* this */

    fun addListener(
        event: ServerEvent.NEWSESSION,
        listener: (sessionId: node.buffer.Buffer, sessionData: node.buffer.Buffer, callback: () -> Unit) -> Unit,
    ): Unit /* this */

    fun addListener(
        event: ServerEvent.OCSPREQUEST,
        listener: (certificate: node.buffer.Buffer, issuer: node.buffer.Buffer, callback: (err: Throwable /* JsError */?, resp: node.buffer.Buffer) -> Unit) -> Unit,
    ): Unit /* this */

    fun addListener(
        event: ServerEvent.RESUMESESSION,
        listener: (sessionId: node.buffer.Buffer, callback: (err: Throwable /* JsError */?, sessionData: node.buffer.Buffer?) -> Unit) -> Unit,
    ): Unit /* this */

    fun addListener(event: ServerEvent.SECURECONNECTION, listener: (tlsSocket: TLSSocket) -> Unit): Unit /* this */
    fun addListener(
        event: ServerEvent.KEYLOG,
        listener: (line: node.buffer.Buffer, tlsSocket: TLSSocket) -> Unit,
    ): Unit /* this */

    fun emit(event: String, vararg args: Any? /* js.core.ReadonlyArray<Any?> */): Boolean

    fun emit(event: js.core.Symbol, vararg args: Any? /* js.core.ReadonlyArray<Any?> */): Boolean
    fun emit(event: ServerEvent.TLSCLIENTERROR, err: Throwable /* JsError */, tlsSocket: TLSSocket): Boolean
    fun emit(
        event: ServerEvent.NEWSESSION,
        sessionId: node.buffer.Buffer,
        sessionData: node.buffer.Buffer,
        callback: () -> Unit,
    ): Boolean

    fun emit(
        event: ServerEvent.OCSPREQUEST,
        certificate: node.buffer.Buffer,
        issuer: node.buffer.Buffer,
        callback: (err: Throwable /* JsError */?, resp: node.buffer.Buffer) -> Unit,
    ): Boolean

    fun emit(
        event: ServerEvent.RESUMESESSION,
        sessionId: node.buffer.Buffer,
        callback: (err: Throwable /* JsError */?, sessionData: node.buffer.Buffer?) -> Unit,
    ): Boolean

    fun emit(event: ServerEvent.SECURECONNECTION, tlsSocket: TLSSocket): Boolean
    fun emit(event: ServerEvent.KEYLOG, line: node.buffer.Buffer, tlsSocket: TLSSocket): Boolean
    fun on(event: String, listener: Function<Unit> /* (...args: any[]) => void */): Unit /* this */
    fun on(
        event: ServerEvent.TLSCLIENTERROR,
        listener: (err: Throwable /* JsError */, tlsSocket: TLSSocket) -> Unit,
    ): Unit /* this */

    fun on(
        event: ServerEvent.NEWSESSION,
        listener: (sessionId: node.buffer.Buffer, sessionData: node.buffer.Buffer, callback: () -> Unit) -> Unit,
    ): Unit /* this */

    fun on(
        event: ServerEvent.OCSPREQUEST,
        listener: (certificate: node.buffer.Buffer, issuer: node.buffer.Buffer, callback: (err: Throwable /* JsError */?, resp: node.buffer.Buffer) -> Unit) -> Unit,
    ): Unit /* this */

    fun on(
        event: ServerEvent.RESUMESESSION,
        listener: (sessionId: node.buffer.Buffer, callback: (err: Throwable /* JsError */?, sessionData: node.buffer.Buffer?) -> Unit) -> Unit,
    ): Unit /* this */

    fun on(event: ServerEvent.SECURECONNECTION, listener: (tlsSocket: TLSSocket) -> Unit): Unit /* this */
    fun on(
        event: ServerEvent.KEYLOG,
        listener: (line: node.buffer.Buffer, tlsSocket: TLSSocket) -> Unit,
    ): Unit /* this */

    fun once(event: String, listener: Function<Unit> /* (...args: any[]) => void */): Unit /* this */
    fun once(
        event: ServerEvent.TLSCLIENTERROR,
        listener: (err: Throwable /* JsError */, tlsSocket: TLSSocket) -> Unit,
    ): Unit /* this */

    fun once(
        event: ServerEvent.NEWSESSION,
        listener: (sessionId: node.buffer.Buffer, sessionData: node.buffer.Buffer, callback: () -> Unit) -> Unit,
    ): Unit /* this */

    fun once(
        event: ServerEvent.OCSPREQUEST,
        listener: (certificate: node.buffer.Buffer, issuer: node.buffer.Buffer, callback: (err: Throwable /* JsError */?, resp: node.buffer.Buffer) -> Unit) -> Unit,
    ): Unit /* this */

    fun once(
        event: ServerEvent.RESUMESESSION,
        listener: (sessionId: node.buffer.Buffer, callback: (err: Throwable /* JsError */?, sessionData: node.buffer.Buffer?) -> Unit) -> Unit,
    ): Unit /* this */

    fun once(event: ServerEvent.SECURECONNECTION, listener: (tlsSocket: TLSSocket) -> Unit): Unit /* this */
    fun once(
        event: ServerEvent.KEYLOG,
        listener: (line: node.buffer.Buffer, tlsSocket: TLSSocket) -> Unit,
    ): Unit /* this */

    fun prependListener(event: String, listener: Function<Unit> /* (...args: any[]) => void */): Unit /* this */
    fun prependListener(
        event: ServerEvent.TLSCLIENTERROR,
        listener: (err: Throwable /* JsError */, tlsSocket: TLSSocket) -> Unit,
    ): Unit /* this */

    fun prependListener(
        event: ServerEvent.NEWSESSION,
        listener: (sessionId: node.buffer.Buffer, sessionData: node.buffer.Buffer, callback: () -> Unit) -> Unit,
    ): Unit /* this */

    fun prependListener(
        event: ServerEvent.OCSPREQUEST,
        listener: (certificate: node.buffer.Buffer, issuer: node.buffer.Buffer, callback: (err: Throwable /* JsError */?, resp: node.buffer.Buffer) -> Unit) -> Unit,
    ): Unit /* this */

    fun prependListener(
        event: ServerEvent.RESUMESESSION,
        listener: (sessionId: node.buffer.Buffer, callback: (err: Throwable /* JsError */?, sessionData: node.buffer.Buffer?) -> Unit) -> Unit,
    ): Unit /* this */

    fun prependListener(event: ServerEvent.SECURECONNECTION, listener: (tlsSocket: TLSSocket) -> Unit): Unit /* this */
    fun prependListener(
        event: ServerEvent.KEYLOG,
        listener: (line: node.buffer.Buffer, tlsSocket: TLSSocket) -> Unit,
    ): Unit /* this */

    fun prependOnceListener(event: String, listener: Function<Unit> /* (...args: any[]) => void */): Unit /* this */
    fun prependOnceListener(
        event: ServerEvent.TLSCLIENTERROR,
        listener: (err: Throwable /* JsError */, tlsSocket: TLSSocket) -> Unit,
    ): Unit /* this */

    fun prependOnceListener(
        event: ServerEvent.NEWSESSION,
        listener: (sessionId: node.buffer.Buffer, sessionData: node.buffer.Buffer, callback: () -> Unit) -> Unit,
    ): Unit /* this */

    fun prependOnceListener(
        event: ServerEvent.OCSPREQUEST,
        listener: (certificate: node.buffer.Buffer, issuer: node.buffer.Buffer, callback: (err: Throwable /* JsError */?, resp: node.buffer.Buffer) -> Unit) -> Unit,
    ): Unit /* this */

    fun prependOnceListener(
        event: ServerEvent.RESUMESESSION,
        listener: (sessionId: node.buffer.Buffer, callback: (err: Throwable /* JsError */?, sessionData: node.buffer.Buffer?) -> Unit) -> Unit,
    ): Unit /* this */

    fun prependOnceListener(
        event: ServerEvent.SECURECONNECTION,
        listener: (tlsSocket: TLSSocket) -> Unit,
    ): Unit /* this */

    fun prependOnceListener(
        event: ServerEvent.KEYLOG,
        listener: (line: node.buffer.Buffer, tlsSocket: TLSSocket) -> Unit,
    ): Unit /* this */
}
