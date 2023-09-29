package node.fs


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{CLOSE: 'close', DRAIN: 'drain', ERROR: 'error', FINISH: 'finish', OPEN: 'open', PIPE: 'pipe', READY: 'ready', UNPIPE: 'unpipe'}/*union*/)""")
sealed external interface WriteStreamEvent : node.events.EventType {
    object CLOSE : WriteStreamEvent
    object DRAIN : WriteStreamEvent
    object ERROR : WriteStreamEvent
    object FINISH : WriteStreamEvent
    object OPEN : WriteStreamEvent
    object PIPE : WriteStreamEvent
    object READY : WriteStreamEvent
    object UNPIPE : WriteStreamEvent
}
