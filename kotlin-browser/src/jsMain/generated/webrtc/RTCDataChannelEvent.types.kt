// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package webrtc

import seskar.js.JsValue
import web.events.EventType

sealed external interface RTCDataChannelEventTypes {
    @JsValue("datachannel")
    val DATA_CHANNEL: EventType<RTCDataChannelEvent>
        get() = definedExternally
}