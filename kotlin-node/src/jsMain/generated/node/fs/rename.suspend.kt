// Generated by Karakum - do not modify it manually!

package node.fs

suspend fun rename(oldPath: PathLike, newPath: PathLike): Unit =
    renameAsync(
        oldPath, newPath
    ).await()
