package node.fs


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{CHANGE: 'change', ERROR: 'error', CLOSE: 'close'}/*union*/)""")
sealed external interface FSWatcherEvent : node.events.EventType {
    object CHANGE : FSWatcherEvent
    object ERROR : FSWatcherEvent
    object CLOSE : FSWatcherEvent
}
