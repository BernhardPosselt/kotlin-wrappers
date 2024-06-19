// Generated by Karakum - do not modify it manually!

package node.stream


sealed external interface WritableEvent {
    sealed interface CLOSE : node.events.LegacyEventType
    sealed interface DRAIN : node.events.LegacyEventType
    sealed interface ERROR : node.events.LegacyEventType
    sealed interface FINISH : node.events.LegacyEventType
    sealed interface PIPE : node.events.LegacyEventType
    sealed interface UNPIPE : node.events.LegacyEventType

    companion object {
        @seskar.js.JsValue("close")
        val CLOSE: CLOSE

        @seskar.js.JsValue("drain")
        val DRAIN: DRAIN

        @seskar.js.JsValue("error")
        val ERROR: ERROR

        @seskar.js.JsValue("finish")
        val FINISH: FINISH

        @seskar.js.JsValue("pipe")
        val PIPE: PIPE

        @seskar.js.JsValue("unpipe")
        val UNPIPE: UNPIPE

        @seskar.js.JsValue("close")
        fun close(): node.events.EventType<Writable, js.array.JsTuple>

        @seskar.js.JsValue("drain")
        fun drain(): node.events.EventType<Writable, js.array.JsTuple>

        @seskar.js.JsValue("error")
        fun error(): node.events.EventType<Writable, js.array.JsTuple1<Throwable /* JsError */>>

        @seskar.js.JsValue("finish")
        fun finish(): node.events.EventType<Writable, js.array.JsTuple>

        @seskar.js.JsValue("pipe")
        fun pipe(): node.events.EventType<Writable, js.array.JsTuple1<Readable>>

        @seskar.js.JsValue("unpipe")
        fun unpipe(): node.events.EventType<Writable, js.array.JsTuple1<Readable>>
    }
}
