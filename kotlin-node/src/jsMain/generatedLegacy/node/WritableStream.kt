// Automatically generated - do not modify!

package node

@Suppress("INTERFACE_WITH_SUPERCLASS")
external interface WritableStream : node.events.EventEmitter {
    var writable: Boolean
    fun write(
        chunk: Any, /* Uint8Array | string */
        callback: (error: Error?) -> Unit = definedExternally,
    ): Boolean

    fun write(
        str: String,
        encoding: node.buffer.BufferEncoding = definedExternally,
        callback: (error: Error?) -> Unit = definedExternally,
    ): Boolean

    fun end(callback: () -> Unit = definedExternally) /* : this */
    fun end(
        chunk: Any, /* string | Uint8Array */
        callback: () -> Unit = definedExternally,
    ) /* : this */

    fun end(
        str: String,
        encoding: node.buffer.BufferEncoding = definedExternally,
        callback: () -> Unit = definedExternally,
    ) /* : this */
}
