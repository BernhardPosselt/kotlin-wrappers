@file:JsModule("node:fs")

package node.fs


/**
 * Returns the number of `bytesRead`.
 *
 * For detailed information, see the documentation of the asynchronous version of
 * this API: {@link read}.
 * @since v0.1.21
 */
external fun readSync(
    fd: Number,
    buffer: js.buffer.ArrayBufferView,
    offset: Number,
    length: Number,
    position: ReadPosition?,
): Double

/**
 * Similar to the above `fs.readSync` function, this version takes an optional `options` object.
 * If no `options` object is specified, it will default with the above values.
 */
external fun readSync(fd: Number, buffer: js.buffer.ArrayBufferView, opts: ReadSyncOptions = definedExternally): Double