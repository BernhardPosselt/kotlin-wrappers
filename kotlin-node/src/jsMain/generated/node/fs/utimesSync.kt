@file:JsModule("node:fs")

package node.fs


/**
 * Returns `undefined`.
 *
 * For detailed information, see the documentation of the asynchronous version of
 * this API: {@link utimes}.
 * @since v0.4.2
 */
external fun utimesSync(path: PathLike, atime: TimeLike, mtime: TimeLike): Unit
