// Generated by Karakum - do not modify it manually!

package node.fs

sealed external interface ReadAsyncOptions<TBuffer : js.buffer.ArrayBufferView<*>> : ReadSyncOptions {
    var buffer: TBuffer?
}
