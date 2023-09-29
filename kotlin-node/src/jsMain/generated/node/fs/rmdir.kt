@file:JsModule("node:fs")

package node.fs


/**
 * Asynchronous [`rmdir(2)`](http://man7.org/linux/man-pages/man2/rmdir.2.html). No arguments other than a possible exception are given
 * to the completion callback.
 *
 * Using `fs.rmdir()` on a file (not a directory) results in an `ENOENT` error on
 * Windows and an `ENOTDIR` error on POSIX.
 *
 * To get a behavior similar to the `rm -rf` Unix command, use {@link rm} with options `{ recursive: true, force: true }`.
 * @since v0.0.2
 */
external fun rmdir(path: PathLike, callback: NoParamCallback): Unit

external fun rmdir(path: PathLike, options: RmDirOptions, callback: NoParamCallback): Unit
