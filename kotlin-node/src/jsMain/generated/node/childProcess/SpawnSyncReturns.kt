package node.childProcess


sealed external interface SpawnSyncReturns<T> {
    var pid: Double
    var output: Array<T?>
    var stdout: T
    var stderr: T
    var status: Double?
    var signal: node.process.Signals?
    var error: Throwable /* JsError */?
}