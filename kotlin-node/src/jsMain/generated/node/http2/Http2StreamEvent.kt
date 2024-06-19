// Generated by Karakum - do not modify it manually!

package node.http2


sealed external interface Http2StreamEvent {
    sealed interface ABORTED : node.events.LegacyEventType
    sealed interface CLOSE : node.events.LegacyEventType
    sealed interface DATA : node.events.LegacyEventType
    sealed interface DRAIN : node.events.LegacyEventType
    sealed interface END : node.events.LegacyEventType
    sealed interface ERROR : node.events.LegacyEventType
    sealed interface FINISH : node.events.LegacyEventType
    sealed interface FRAMEERROR : node.events.LegacyEventType
    sealed interface PIPE : node.events.LegacyEventType
    sealed interface UNPIPE : node.events.LegacyEventType
    sealed interface STREAMCLOSED : node.events.LegacyEventType
    sealed interface TIMEOUT : node.events.LegacyEventType
    sealed interface TRAILERS : node.events.LegacyEventType
    sealed interface WANTTRAILERS : node.events.LegacyEventType

    companion object {
        @seskar.js.JsValue("aborted")
        val ABORTED: ABORTED

        @seskar.js.JsValue("close")
        val CLOSE: CLOSE

        @seskar.js.JsValue("data")
        val DATA: DATA

        @seskar.js.JsValue("drain")
        val DRAIN: DRAIN

        @seskar.js.JsValue("end")
        val END: END

        @seskar.js.JsValue("error")
        val ERROR: ERROR

        @seskar.js.JsValue("finish")
        val FINISH: FINISH

        @seskar.js.JsValue("frameError")
        val FRAMEERROR: FRAMEERROR

        @seskar.js.JsValue("pipe")
        val PIPE: PIPE

        @seskar.js.JsValue("unpipe")
        val UNPIPE: UNPIPE

        @seskar.js.JsValue("streamClosed")
        val STREAMCLOSED: STREAMCLOSED

        @seskar.js.JsValue("timeout")
        val TIMEOUT: TIMEOUT

        @seskar.js.JsValue("trailers")
        val TRAILERS: TRAILERS

        @seskar.js.JsValue("wantTrailers")
        val WANTTRAILERS: WANTTRAILERS

        @seskar.js.JsValue("aborted")
        fun aborted(): node.events.EventType<Http2Stream, js.array.JsTuple>

        @seskar.js.JsValue("close")
        fun close(): node.events.EventType<Http2Stream, js.array.JsTuple>

        @seskar.js.JsValue("data")
        fun data(): node.events.EventType<Http2Stream, js.array.JsTuple1<Any /* Buffer | string */>>

        @seskar.js.JsValue("drain")
        fun drain(): node.events.EventType<Http2Stream, js.array.JsTuple>

        @seskar.js.JsValue("end")
        fun end(): node.events.EventType<Http2Stream, js.array.JsTuple>

        @seskar.js.JsValue("error")
        fun error(): node.events.EventType<Http2Stream, js.array.JsTuple1<Throwable /* JsError */>>

        @seskar.js.JsValue("finish")
        fun finish(): node.events.EventType<Http2Stream, js.array.JsTuple>

        @seskar.js.JsValue("frameError")
        fun frameError(): node.events.EventType<Http2Stream, js.array.JsTuple2<Double, Double>>

        @seskar.js.JsValue("pipe")
        fun pipe(): node.events.EventType<Http2Stream, js.array.JsTuple1<node.stream.Readable>>

        @seskar.js.JsValue("unpipe")
        fun unpipe(): node.events.EventType<Http2Stream, js.array.JsTuple1<node.stream.Readable>>

        @seskar.js.JsValue("streamClosed")
        fun streamClosed(): node.events.EventType<Http2Stream, js.array.JsTuple1<Double>>

        @seskar.js.JsValue("timeout")
        fun timeout(): node.events.EventType<Http2Stream, js.array.JsTuple>

        @seskar.js.JsValue("trailers")
        fun trailers(): node.events.EventType<Http2Stream, js.array.JsTuple2<IncomingHttpHeaders, Double>>

        @seskar.js.JsValue("wantTrailers")
        fun wantTrailers(): node.events.EventType<Http2Stream, js.array.JsTuple>
    }
}
