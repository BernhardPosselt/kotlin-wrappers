// Generated by Karakum - do not modify it manually!

package node.fs

suspend fun rmdir(path: PathLike, options: RmDirOptions = undefined.unsafeCast<Nothing>()): Unit =
    rmdirAsync(
        path, options
    ).await()
