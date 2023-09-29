@file:JsModule("node:fs")

package node.fs


/**
 * Retrieves the `fs.Stats` for the symbolic link referred to by the path.
 * The callback gets two arguments `(err, stats)` where `stats` is a `fs.Stats` object. `lstat()` is identical to `stat()`, except that if `path` is a symbolic
 * link, then the link itself is stat-ed, not the file that it refers to.
 *
 * See the POSIX [`lstat(2)`](http://man7.org/linux/man-pages/man2/lstat.2.html) documentation for more details.
 * @since v0.1.30
 */
external fun lstat(path: PathLike, callback: (err: node.ErrnoException?, stats: Stats) -> Unit): Unit

external fun lstat(
    path: PathLike,
    options: (LstatOptions)?,
    callback: (err: node.ErrnoException?, stats: Stats) -> Unit,
): Unit

external fun lstat(
    path: PathLike,
    options: LstatBigIntOptions,
    callback: (err: node.ErrnoException?, stats: BigIntStats) -> Unit,
): Unit

external fun lstat(
    path: PathLike,
    options: StatOptions?,
    callback: (err: node.ErrnoException?, stats: Any /* Stats | BigIntStats */) -> Unit,
): Unit
