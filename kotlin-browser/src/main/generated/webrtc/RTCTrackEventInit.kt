// Automatically generated - do not modify!

package webrtc

import kotlinx.js.ReadonlyArray

sealed external interface RTCTrackEventInit : web.events.EventInit {
    var receiver: RTCRtpReceiver
    var streams: ReadonlyArray<org.w3c.dom.mediacapture.MediaStream>?
    var track: media.stream.MediaStreamTrack
    var transceiver: RTCRtpTransceiver
}
