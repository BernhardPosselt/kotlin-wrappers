@file:JsModule("node:fs")

package node.fs


/**
 * Stop watching for changes on `filename`. If `listener` is specified, only that
 * particular listener is removed. Otherwise, _all_ listeners are removed,
 * effectively stopping watching of `filename`.
 *
 * Calling `fs.unwatchFile()` with a filename that is not being watched is a
 * no-op, not an error.
 *
 * Using {@link watch} is more efficient than `fs.watchFile()` and`fs.unwatchFile()`. `fs.watch()` should be used instead of `fs.watchFile()`and `fs.unwatchFile()` when possible.
 * @since v0.1.31
 * @param listener Optional, a listener previously attached using `fs.watchFile()`
 */
external fun unwatchFile(filename: PathLike, listener: StatsListener = definedExternally): Unit

external fun unwatchFile(filename: PathLike, listener: BigIntStatsListener = definedExternally): Unit
