// Generated by Karakum - do not modify it manually!

@file:JsModule("node:stream")

package node.stream

import js.buffer.ArrayBuffer
import js.core.Object
import js.iterable.AsyncIterable
import js.promise.Promise
import web.buffer.Blob as NodeBlob

/**
 * Duplex streams are streams that implement both the `Readable` and `Writable` interfaces.
 *
 * Examples of `Duplex` streams include:
 *
 * * `TCP sockets`
 * * `zlib streams`
 * * `crypto streams`
 * @since v0.9.4
 */

@Suppress("MANY_CLASSES_IN_SUPERTYPE_LIST")

open external class Duplex : Readable, Writable {
    constructor (opts: DuplexOptions = definedExternally)

    @JsName("writable")
    val duplexWritable: Boolean
    override val writableEnded: Boolean
    override val writableFinished: Boolean
    override val writableHighWaterMark: Double
    override val writableLength: Double
    override val writableObjectMode: Boolean
    override val writableCorked: Double
    override val writableNeedDrain: Boolean
    override val closed: Boolean
    override val errored: Throwable /* JsError */?

    /**
     * If `false` then the stream will automatically end the writable side when the
     * readable side ends. Set initially by the `allowHalfOpen` constructor option,
     * which defaults to `false`.
     *
     * This can be changed manually to change the half-open behavior of an existing`Duplex` stream instance, but must be changed before the `'end'` event is
     * emitted.
     * @since v0.9.4
     */
    var allowHalfOpen: Boolean
    override fun _write(
        chunk: Any?,
        encoding: node.buffer.BufferEncoding,
        callback: (error: Throwable /* JsError */? /* use undefined for default */) -> Unit,
    ): Unit

    override fun _writev(
        chunks: Array<WritableWritevChunksItem>,
        callback: (error: Throwable /* JsError */? /* use undefined for default */) -> Unit,
    ): Unit

    override fun _destroy(error: Throwable /* JsError */?, callback: (error: Throwable /* JsError */?) -> Unit): Unit
    override fun _final(callback: (error: Throwable /* JsError */? /* use undefined for default */) -> Unit): Unit
    override fun write(
        chunk: Any?,
        encoding: node.buffer.BufferEncoding,
        callback: (error: Throwable /* JsError */?) -> Unit,
    ): Boolean

    override fun write(chunk: Any?, callback: (error: Throwable /* JsError */?) -> Unit): Boolean
    override fun setDefaultEncoding(encoding: node.buffer.BufferEncoding): Unit /* this */
    override fun end(cb: () -> Unit): Unit /* this */
    override fun end(chunk: Any?, cb: () -> Unit): Unit /* this */
    override fun end(chunk: Any?, encoding: node.buffer.BufferEncoding, cb: () -> Unit): Unit /* this */
    override fun cork(): Unit
    override fun uncork(): Unit

    /**
     * Event emitter
     * The defined events on documents including:
     * 1.  close
     * 2.  data
     * 3.  drain
     * 4.  end
     * 5.  error
     * 6.  finish
     * 7.  pause
     * 8.  pipe
     * 9.  readable
     * 10. resume
     * 11. unpipe
     */
    fun addListener(event: DuplexEvent.CLOSE, listener: () -> Unit): Unit /* this */
    fun addListener(event: DuplexEvent.DATA, listener: (chunk: Any?) -> Unit): Unit /* this */
    fun addListener(event: DuplexEvent.DRAIN, listener: () -> Unit): Unit /* this */
    fun addListener(event: DuplexEvent.END, listener: () -> Unit): Unit /* this */
    fun addListener(event: DuplexEvent.ERROR, listener: (err: Throwable /* JsError */) -> Unit): Unit /* this */
    fun addListener(event: DuplexEvent.FINISH, listener: () -> Unit): Unit /* this */
    fun addListener(event: DuplexEvent.PAUSE, listener: () -> Unit): Unit /* this */
    fun addListener(event: DuplexEvent.PIPE, listener: (src: Readable) -> Unit): Unit /* this */
    fun addListener(event: DuplexEvent.READABLE, listener: () -> Unit): Unit /* this */
    fun addListener(event: DuplexEvent.RESUME, listener: () -> Unit): Unit /* this */
    fun addListener(event: DuplexEvent.UNPIPE, listener: (src: Readable) -> Unit): Unit /* this */
    override fun addListener(event: String, listener: Function<Unit> /* (...args: any[]) => void */): Unit /* this */

    override fun addListener(
        event: js.core.Symbol,
        listener: Function<Unit>, /* (...args: any[]) => void */
    ): Unit /* this */

    fun emit(event: DuplexEvent.CLOSE): Boolean
    fun emit(event: DuplexEvent.DATA, chunk: Any?): Boolean
    fun emit(event: DuplexEvent.DRAIN): Boolean
    fun emit(event: DuplexEvent.END): Boolean
    fun emit(event: DuplexEvent.ERROR, err: Throwable /* JsError */): Boolean
    fun emit(event: DuplexEvent.FINISH): Boolean
    fun emit(event: DuplexEvent.PAUSE): Boolean
    fun emit(event: DuplexEvent.PIPE, src: Readable): Boolean
    fun emit(event: DuplexEvent.READABLE): Boolean
    fun emit(event: DuplexEvent.RESUME): Boolean
    fun emit(event: DuplexEvent.UNPIPE, src: Readable): Boolean
    override fun emit(event: String, vararg args: Any? /* js.core.ReadonlyArray<Any?> */): Boolean

    override fun emit(event: js.core.Symbol, vararg args: Any? /* js.core.ReadonlyArray<Any?> */): Boolean
    fun on(event: DuplexEvent.CLOSE, listener: () -> Unit): Unit /* this */
    fun on(event: DuplexEvent.DATA, listener: (chunk: Any?) -> Unit): Unit /* this */
    fun on(event: DuplexEvent.DRAIN, listener: () -> Unit): Unit /* this */
    fun on(event: DuplexEvent.END, listener: () -> Unit): Unit /* this */
    fun on(event: DuplexEvent.ERROR, listener: (err: Throwable /* JsError */) -> Unit): Unit /* this */
    fun on(event: DuplexEvent.FINISH, listener: () -> Unit): Unit /* this */
    fun on(event: DuplexEvent.PAUSE, listener: () -> Unit): Unit /* this */
    fun on(event: DuplexEvent.PIPE, listener: (src: Readable) -> Unit): Unit /* this */
    fun on(event: DuplexEvent.READABLE, listener: () -> Unit): Unit /* this */
    fun on(event: DuplexEvent.RESUME, listener: () -> Unit): Unit /* this */
    fun on(event: DuplexEvent.UNPIPE, listener: (src: Readable) -> Unit): Unit /* this */
    override fun on(event: String, listener: Function<Unit> /* (...args: any[]) => void */): Unit /* this */

    override fun on(event: js.core.Symbol, listener: Function<Unit> /* (...args: any[]) => void */): Unit /* this */
    fun once(event: DuplexEvent.CLOSE, listener: () -> Unit): Unit /* this */
    fun once(event: DuplexEvent.DATA, listener: (chunk: Any?) -> Unit): Unit /* this */
    fun once(event: DuplexEvent.DRAIN, listener: () -> Unit): Unit /* this */
    fun once(event: DuplexEvent.END, listener: () -> Unit): Unit /* this */
    fun once(event: DuplexEvent.ERROR, listener: (err: Throwable /* JsError */) -> Unit): Unit /* this */
    fun once(event: DuplexEvent.FINISH, listener: () -> Unit): Unit /* this */
    fun once(event: DuplexEvent.PAUSE, listener: () -> Unit): Unit /* this */
    fun once(event: DuplexEvent.PIPE, listener: (src: Readable) -> Unit): Unit /* this */
    fun once(event: DuplexEvent.READABLE, listener: () -> Unit): Unit /* this */
    fun once(event: DuplexEvent.RESUME, listener: () -> Unit): Unit /* this */
    fun once(event: DuplexEvent.UNPIPE, listener: (src: Readable) -> Unit): Unit /* this */
    override fun once(event: String, listener: Function<Unit> /* (...args: any[]) => void */): Unit /* this */

    override fun once(event: js.core.Symbol, listener: Function<Unit> /* (...args: any[]) => void */): Unit /* this */
    fun prependListener(event: DuplexEvent.CLOSE, listener: () -> Unit): Unit /* this */
    fun prependListener(event: DuplexEvent.DATA, listener: (chunk: Any?) -> Unit): Unit /* this */
    fun prependListener(event: DuplexEvent.DRAIN, listener: () -> Unit): Unit /* this */
    fun prependListener(event: DuplexEvent.END, listener: () -> Unit): Unit /* this */
    fun prependListener(event: DuplexEvent.ERROR, listener: (err: Throwable /* JsError */) -> Unit): Unit /* this */
    fun prependListener(event: DuplexEvent.FINISH, listener: () -> Unit): Unit /* this */
    fun prependListener(event: DuplexEvent.PAUSE, listener: () -> Unit): Unit /* this */
    fun prependListener(event: DuplexEvent.PIPE, listener: (src: Readable) -> Unit): Unit /* this */
    fun prependListener(event: DuplexEvent.READABLE, listener: () -> Unit): Unit /* this */
    fun prependListener(event: DuplexEvent.RESUME, listener: () -> Unit): Unit /* this */
    fun prependListener(event: DuplexEvent.UNPIPE, listener: (src: Readable) -> Unit): Unit /* this */
    override fun prependListener(
        event: String,
        listener: Function<Unit>, /* (...args: any[]) => void */
    ): Unit /* this */

    override fun prependListener(
        event: js.core.Symbol,
        listener: Function<Unit>, /* (...args: any[]) => void */
    ): Unit /* this */

    fun prependOnceListener(event: DuplexEvent.CLOSE, listener: () -> Unit): Unit /* this */
    fun prependOnceListener(event: DuplexEvent.DATA, listener: (chunk: Any?) -> Unit): Unit /* this */
    fun prependOnceListener(event: DuplexEvent.DRAIN, listener: () -> Unit): Unit /* this */
    fun prependOnceListener(event: DuplexEvent.END, listener: () -> Unit): Unit /* this */
    fun prependOnceListener(event: DuplexEvent.ERROR, listener: (err: Throwable /* JsError */) -> Unit): Unit /* this */
    fun prependOnceListener(event: DuplexEvent.FINISH, listener: () -> Unit): Unit /* this */
    fun prependOnceListener(event: DuplexEvent.PAUSE, listener: () -> Unit): Unit /* this */
    fun prependOnceListener(event: DuplexEvent.PIPE, listener: (src: Readable) -> Unit): Unit /* this */
    fun prependOnceListener(event: DuplexEvent.READABLE, listener: () -> Unit): Unit /* this */
    fun prependOnceListener(event: DuplexEvent.RESUME, listener: () -> Unit): Unit /* this */
    fun prependOnceListener(event: DuplexEvent.UNPIPE, listener: (src: Readable) -> Unit): Unit /* this */
    override fun prependOnceListener(
        event: String,
        listener: Function<Unit>, /* (...args: any[]) => void */
    ): Unit /* this */

    override fun prependOnceListener(
        event: js.core.Symbol,
        listener: Function<Unit>, /* (...args: any[]) => void */
    ): Unit /* this */

    fun removeListener(event: DuplexEvent.CLOSE, listener: () -> Unit): Unit /* this */
    fun removeListener(event: DuplexEvent.DATA, listener: (chunk: Any?) -> Unit): Unit /* this */
    fun removeListener(event: DuplexEvent.DRAIN, listener: () -> Unit): Unit /* this */
    fun removeListener(event: DuplexEvent.END, listener: () -> Unit): Unit /* this */
    fun removeListener(event: DuplexEvent.ERROR, listener: (err: Throwable /* JsError */) -> Unit): Unit /* this */
    fun removeListener(event: DuplexEvent.FINISH, listener: () -> Unit): Unit /* this */
    fun removeListener(event: DuplexEvent.PAUSE, listener: () -> Unit): Unit /* this */
    fun removeListener(event: DuplexEvent.PIPE, listener: (src: Readable) -> Unit): Unit /* this */
    fun removeListener(event: DuplexEvent.READABLE, listener: () -> Unit): Unit /* this */
    fun removeListener(event: DuplexEvent.RESUME, listener: () -> Unit): Unit /* this */
    fun removeListener(event: DuplexEvent.UNPIPE, listener: (src: Readable) -> Unit): Unit /* this */
    override fun removeListener(event: String, listener: Function<Unit> /* (...args: any[]) => void */): Unit /* this */

    override fun removeListener(
        event: js.core.Symbol,
        listener: Function<Unit>, /* (...args: any[]) => void */
    ): Unit /* this */

    override var destroyed: Boolean
    override fun _construct(callback: (error: Throwable /* JsError */? /* use undefined for default */) -> Unit): Unit
    override fun destroy(error: Throwable /* JsError */): Unit /* this */

    companion object {
        /**
         * A utility method for creating duplex streams.
         *
         * - `Stream` converts writable stream into writable `Duplex` and readable stream
         *   to `Duplex`.
         * - `Blob` converts into readable `Duplex`.
         * - `string` converts into readable `Duplex`.
         * - `ArrayBuffer` converts into readable `Duplex`.
         * - `AsyncIterable` converts into a readable `Duplex`. Cannot yield `null`.
         * - `AsyncGeneratorFunction` converts into a readable/writable transform
         *   `Duplex`. Must take a source `AsyncIterable` as first parameter. Cannot yield
         *   `null`.
         * - `AsyncFunction` converts into a writable `Duplex`. Must return
         *   either `null` or `undefined`
         * - `Object ({ writable, readable })` converts `readable` and
         *   `writable` into `Stream` and then combines them into `Duplex` where the
         *   `Duplex` will write to the `writable` and read from the `readable`.
         * - `Promise` converts into readable `Duplex`. Value `null` is ignored.
         *
         * @since v16.8.0
         */
        fun from(src: Stream): Duplex

        fun from(src: NodeBlob): Duplex

        fun from(src: ArrayBuffer): Duplex

        fun from(src: String): Duplex

        fun from(src: Iterable<Any?>): Duplex

        fun from(src: AsyncIterable<Any?>): Duplex

        fun from(src: Any /* AsyncGeneratorFunction */): Duplex

        fun from(src: Promise<Any?>): Duplex

        fun from(src: Object): Duplex
    }

}