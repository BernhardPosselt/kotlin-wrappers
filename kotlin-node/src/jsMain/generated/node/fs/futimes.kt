@file:JsModule("node:fs")

package node.fs


/**
 * Change the file system timestamps of the object referenced by the supplied file
 * descriptor. See {@link utimes}.
 * @since v0.4.2
 */
external fun futimes(fd: Number, atime: TimeLike, mtime: TimeLike, callback: NoParamCallback): Unit
