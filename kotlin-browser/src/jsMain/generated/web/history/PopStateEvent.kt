// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.history

import web.events.Event
import web.events.EventInit
import web.events.EventType

external interface PopStateEventInit : EventInit {
    var state: Any?
}

open external class PopStateEvent(
    override val type: EventType<PopStateEvent>,
    init: PopStateEventInit = definedExternally,
) : Event {
    /** Returns a copy of the information that was provided to pushState() or replaceState(). */
    val state: Any?

    companion object
}