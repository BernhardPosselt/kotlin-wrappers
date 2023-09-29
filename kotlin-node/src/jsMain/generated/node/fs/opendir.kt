@file:JsModule("node:fs")

package node.fs


/**
 * Asynchronously open a directory. See the POSIX [`opendir(3)`](http://man7.org/linux/man-pages/man3/opendir.3.html) documentation for
 * more details.
 *
 * Creates an `fs.Dir`, which contains all further functions for reading from
 * and cleaning up the directory.
 *
 * The `encoding` option sets the encoding for the `path` while opening the
 * directory and subsequent read operations.
 * @since v12.12.0
 */
external fun opendir(path: PathLike, cb: (err: node.ErrnoException?, dir: Dir) -> Unit): Unit

external fun opendir(path: PathLike, options: OpenDirOptions, cb: (err: node.ErrnoException?, dir: Dir) -> Unit): Unit
