@file:JsModule("node:fs")

package node.fs


/**
 * Reads the contents of the directory.
 *
 * See the POSIX [`readdir(3)`](http://man7.org/linux/man-pages/man3/readdir.3.html) documentation for more details.
 *
 * The optional `options` argument can be a string specifying an encoding, or an
 * object with an `encoding` property specifying the character encoding to use for
 * the filenames returned. If the `encoding` is set to `'buffer'`,
 * the filenames returned will be passed as `Buffer` objects.
 *
 * If `options.withFileTypes` is set to `true`, the result will contain `fs.Dirent` objects.
 * @since v0.1.21
 */
external fun readdirSync(
    path: PathLike,
    options: (ReaddirSyncStringOptions)? = definedExternally,
): js.core.ReadonlyArray<String>

external fun readdirSync(
    path: PathLike,
    options: node.buffer.BufferEncoding? = definedExternally,
): js.core.ReadonlyArray<String>

/**
 * Synchronous readdir(3) - read a directory.
 * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
 * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
 */
external fun readdirSync(path: PathLike, options: ReaddirSyncBufferOptions): js.core.ReadonlyArray<node.buffer.Buffer>

external fun readdirSync(path: PathLike, options: String /* 'buffer' */): js.core.ReadonlyArray<node.buffer.Buffer>

/**
 * Synchronous readdir(3) - read a directory.
 * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
 * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
 */
external fun readdirSync(
    path: PathLike,
    options: (ReaddirSyncOptions)? = definedExternally,
): Any /* string[] | Buffer[] */

external fun readdirSync(
    path: PathLike,
    options: node.buffer.BufferEncoding? = definedExternally,
): Any /* string[] | Buffer[] */

/**
 * Synchronous readdir(3) - read a directory.
 * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
 * @param options If called with `withFileTypes: true` the result data will be an array of Dirent.
 */
external fun readdirSync(path: PathLike, options: ReaddirSyncWithFileTypesOptions): js.core.ReadonlyArray<Dirent>
