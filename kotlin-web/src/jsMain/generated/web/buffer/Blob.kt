package web.buffer

import js.buffer.ArrayBuffer
import js.core.JsLong
import js.core.ReadonlyArray
import js.promise.Promise
import js.typedarrays.Uint8Array
import web.streams.ReadableStream

/** A file-like object of immutable, raw data. Blobs represent data that isn't necessarily in a JavaScript-native format. The File interface is based on Blob, inheriting blob functionality and expanding it to support files on the user's system. */
open external class Blob(
    blobParts: ReadonlyArray<BlobPart> = definedExternally,
    options: BlobPropertyBag = definedExternally,
) {
    val size: JsLong
    val type: String

    fun arrayBuffer(): Promise<ArrayBuffer>
    fun slice(
        start: JsLong = definedExternally,
        end: JsLong = definedExternally,
        contentType: String = definedExternally,
    ): Blob

    fun stream(): ReadableStream<Uint8Array>
    fun text(): Promise<String>
}
