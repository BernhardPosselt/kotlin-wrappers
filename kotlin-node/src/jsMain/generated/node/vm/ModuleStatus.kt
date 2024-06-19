// Generated by Karakum - do not modify it manually!


package node.vm


sealed external interface ModuleStatus {
    companion object {
        @seskar.js.JsValue("unlinked")
        val unlinked: ModuleStatus

        @seskar.js.JsValue("linking")
        val linking: ModuleStatus

        @seskar.js.JsValue("linked")
        val linked: ModuleStatus

        @seskar.js.JsValue("evaluating")
        val evaluating: ModuleStatus

        @seskar.js.JsValue("evaluated")
        val evaluated: ModuleStatus

        @seskar.js.JsValue("errored")
        val errored: ModuleStatus
    }
}
