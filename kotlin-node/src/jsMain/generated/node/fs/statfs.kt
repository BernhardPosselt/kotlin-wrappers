@file:JsModule("node:fs")

package node.fs


/**
 * Asynchronous statfs(2). Returns information about the mounted file system which contains path. The callback gets two arguments (err, stats) where stats is an <fs.StatFs> object.
 * In case of an error, the err.code will be one of Common System Errors.
 * @param path A path to an existing file or directory on the file system to be queried.
 * @param callback
 */
external fun statfs(path: PathLike, callback: (err: node.ErrnoException?, stats: StatsFs) -> Unit): Unit

external fun statfs(
    path: PathLike,
    options: (StatfsOptions)?,
    callback: (err: node.ErrnoException?, stats: StatsFs) -> Unit,
): Unit

external fun statfs(
    path: PathLike,
    options: StatfsBigIntOptions,
    callback: (err: node.ErrnoException?, stats: BigIntStatsFs) -> Unit,
): Unit

external fun statfs(
    path: PathLike,
    options: StatFsOptions?,
    callback: (err: node.ErrnoException?, stats: Any /* StatsFs | BigIntStatsFs */) -> Unit,
): Unit
