// Generated by Karakum - do not modify it manually!

package node.net


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{CLOSE: 'close', CONNECT: 'connect', DATA: 'data', DRAIN: 'drain', END: 'end', ERROR: 'error', LOOKUP: 'lookup', READY: 'ready', TIMEOUT: 'timeout'}/*union*/)""")
sealed external interface SocketEvent : node.events.EventType {
    object CLOSE : SocketEvent
    object CONNECT : SocketEvent
    object DATA : SocketEvent
    object DRAIN : SocketEvent
    object END : SocketEvent
    object ERROR : SocketEvent
    object LOOKUP : SocketEvent
    object READY : SocketEvent
    object TIMEOUT : SocketEvent
}