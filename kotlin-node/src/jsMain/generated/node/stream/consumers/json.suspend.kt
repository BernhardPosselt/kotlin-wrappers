// Generated by Karakum - do not modify it manually!

package node.stream.consumers

import js.iterable.AsyncIterable
import node.stream.Readable


suspend fun json(stream: node.ReadableStream): Any? =
    jsonAsync(
        stream
    ).await()


suspend fun json(stream: Readable): Any? =
    jsonAsync(
        stream
    ).await()


suspend fun json(stream: AsyncIterable<Any?>): Any? =
    jsonAsync(
        stream
    ).await()
