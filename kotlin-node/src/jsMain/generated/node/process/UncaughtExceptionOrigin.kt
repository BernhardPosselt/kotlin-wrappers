// Generated by Karakum - do not modify it manually!


package node.process


sealed external interface UncaughtExceptionOrigin {
    companion object {
        @seskar.js.JsValue("uncaughtException")
        val uncaughtException: UncaughtExceptionOrigin

        @seskar.js.JsValue("unhandledRejection")
        val unhandledRejection: UncaughtExceptionOrigin
    }
}
