package node.childProcess

import node.events.Abortable
import web.abort.AbortSignal


sealed external interface ExecFileOptions : CommonOptions, Abortable {
    var maxBuffer: Double?
    var killSignal: Any? /* NodeJS.Signals | number | undefined */
    var windowsVerbatimArguments: Boolean?
    var shell: Any? /* boolean | string | undefined */
    override var signal: AbortSignal?
}