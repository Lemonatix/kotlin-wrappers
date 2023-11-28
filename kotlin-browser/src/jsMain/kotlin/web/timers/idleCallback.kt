package web.timers

sealed external interface IdleRequestId

external fun requestIdleCallback(
    callback: IdleRequestCallback,
    options: IdleRequestOptions = definedExternally,
): IdleRequestId

external fun cancelIdleCallback(
    requestId: IdleRequestId,
)
