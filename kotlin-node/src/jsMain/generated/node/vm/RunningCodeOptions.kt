// Generated by Karakum - do not modify it manually!


package node.vm

import node.module.ImportAttributes


sealed external interface RunningCodeOptions : RunningScriptOptions {
    var cachedData: Any? /* ArrayBufferView | Buffer | undefined */
    var importModuleDynamically: ((specifier: String, script: Script, importAttributes: ImportAttributes) -> Module)?
}
