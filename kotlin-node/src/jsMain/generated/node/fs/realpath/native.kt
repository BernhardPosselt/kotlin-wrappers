@file:JsModule("node:fs")
@file:JsQualifier("realpath")

package node.fs.realpath

import node.fs.BufferEncodingOption
import node.fs.EncodingOption
import node.fs.PathLike

/**
 * Asynchronous [`realpath(3)`](http://man7.org/linux/man-pages/man3/realpath.3.html).
 *
 * The `callback` gets two arguments `(err, resolvedPath)`.
 *
 * Only paths that can be converted to UTF8 strings are supported.
 *
 * The optional `options` argument can be a string specifying an encoding, or an
 * object with an `encoding` property specifying the character encoding to use for
 * the path passed to the callback. If the `encoding` is set to `'buffer'`,
 * the path returned will be passed as a `Buffer` object.
 *
 * On Linux, when Node.js is linked against musl libc, the procfs file system must
 * be mounted on `/proc` in order for this function to work. Glibc does not have
 * this restriction.
 * @since v9.2.0
 */
external fun native(
    path: PathLike,
    options: EncodingOption,
    callback: (err: node.ErrnoException?, resolvedPath: String) -> Unit,
): Unit

external fun native(
    path: PathLike,
    options: BufferEncodingOption,
    callback: (err: node.ErrnoException?, resolvedPath: node.buffer.Buffer) -> Unit,
): Unit

external fun native(
    path: PathLike,
    options: EncodingOption,
    callback: (err: node.ErrnoException?, resolvedPath: Any /* string | Buffer */) -> Unit,
): Unit

external fun native(path: PathLike, callback: (err: node.ErrnoException?, resolvedPath: String) -> Unit): Unit
