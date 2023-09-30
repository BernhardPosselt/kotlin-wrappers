package node.fs

import js.promise.await


suspend fun readlink(path: PathLike, options: ObjectEncodingOptions? = undefined.unsafeCast<Nothing>()): String =
    readlinkAsync(
        path, options
    ).await()


suspend fun readlink(path: PathLike, options: node.buffer.BufferEncoding? = undefined.unsafeCast<Nothing>()): String =
    readlinkAsync(
        path, options
    ).await()


suspend fun readlink(path: PathLike, options: BufferEncodingOption): node.buffer.Buffer =
    readlinkAsync(
        path, options
    ).await()


suspend fun readlink(path: PathLike, options: String? = undefined.unsafeCast<Nothing>()): Any /* string | Buffer */ =
    readlinkAsync(
        path, options
    ).await()