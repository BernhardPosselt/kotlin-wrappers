// Generated by Karakum - do not modify it manually!

package node.fs

suspend fun rm(path: PathLike, options: RmOptions = undefined.unsafeCast<Nothing>()): Unit =
    rmAsync(
        path, options
    ).await()
