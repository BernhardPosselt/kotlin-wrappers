package node.fs


sealed external interface CreateWriteStreamOptions {
    var encoding: node.buffer.BufferEncoding?
    var autoClose: Boolean?
    var emitClose: Boolean?
    var start: Double?
}