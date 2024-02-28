// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.rtc

import seskar.js.JsValue
import web.events.EventTarget
import web.events.EventType

sealed external interface RTCPeerConnectionIceErrorEventTypes_deprecated {
    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("RTCPeerConnectionIceErrorEvent.iceCandidateError()"),
    )
    @JsValue("icecandidateerror")
    val ICE_CANDIDATE_ERROR: EventType<RTCPeerConnectionIceErrorEvent<EventTarget>>
        get() = definedExternally
}
