package node.childProcess


sealed external interface SpawnSyncOptions : CommonSpawnOptions {
    var input: Any? /* string | NodeJS.ArrayBufferView | undefined */
    var maxBuffer: Double?
    var encoding: Any? /* BufferEncoding | 'buffer' | null | undefined */
}