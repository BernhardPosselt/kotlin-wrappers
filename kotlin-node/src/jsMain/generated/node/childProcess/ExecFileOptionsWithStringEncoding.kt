package node.childProcess


sealed external interface ExecFileOptionsWithStringEncoding : ExecFileOptions {
    var encoding: node.buffer.BufferEncoding
}