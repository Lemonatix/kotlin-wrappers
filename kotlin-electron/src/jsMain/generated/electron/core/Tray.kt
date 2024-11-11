// Generated by Karakum - do not modify it manually!

@file:JsModule("INTERNAL_ENTITY")

package electron.core

import electron.NativeImage
import node.events.EventEmitter as NodeEventEmitter

open external class Tray : NodeEventEmitter {
    /**
     * Tray
     */
    constructor (image: NativeImage, guid: String = definedExternally)

    /**
     * Tray
     */
    constructor (image: String, guid: String = definedExternally)
// Docs: https://electronjs.org/docs/api/tray
    /**
     * Emitted when the tray balloon is clicked.
     *
     * @platform win32
     */

    /**
     * Emitted when the tray balloon is closed because of timeout or user manually
     * closes it.
     *
     * @platform win32
     */

    /**
     * Emitted when the tray balloon shows.
     *
     * @platform win32
     */

    /**
     * Emitted when the tray icon is clicked.
     *
     * Note that on Linux this event is emitted when the tray icon receives an
     * activation, which might not necessarily be left mouse click.
     */

    /**
     * Emitted when the tray icon is double clicked.
     *
     * @platform darwin,win32
     */

    /**
     * Emitted when a drag operation ends on the tray or ends at another location.
     *
     * @platform darwin
     */

    /**
     * Emitted when a drag operation enters the tray icon.
     *
     * @platform darwin
     */

    /**
     * Emitted when a drag operation exits the tray icon.
     *
     * @platform darwin
     */

    /**
     * Emitted when any dragged items are dropped on the tray icon.
     *
     * @platform darwin
     */

    /**
     * Emitted when dragged files are dropped in the tray icon.
     *
     * @platform darwin
     */

    /**
     * Emitted when dragged text is dropped in the tray icon.
     *
     * @platform darwin
     */

    /**
     * Emitted when the tray icon is middle clicked.
     *
     * @platform win32
     */

    /**
     * Emitted when the mouse clicks the tray icon.
     *
     * @platform darwin
     */

    /**
     * Emitted when the mouse enters the tray icon.
     *
     * @platform darwin,win32
     */

    /**
     * Emitted when the mouse exits the tray icon.
     *
     * @platform darwin,win32
     */

    /**
     * Emitted when the mouse moves in the tray icon.
     *
     * @platform darwin,win32
     */

    /**
     * Emitted when the mouse is released from clicking the tray icon.
     *
     * Note: This will not be emitted if you have set a context menu for your Tray
     * using `tray.setContextMenu`, as a result of macOS-level constraints.
     *
     * @platform darwin
     */

    /**
     * Emitted when the tray icon is right clicked.
     *
     * @platform darwin,win32
     */

    /**
     * @platform win32
     */

    /**
     * @platform win32
     */

    /**
     * @platform win32
     */


    /**
     * @platform darwin,win32
     */

    /**
     * @platform darwin
     */

    /**
     * @platform darwin
     */

    /**
     * @platform darwin
     */

    /**
     * @platform darwin
     */

    /**
     * @platform darwin
     */

    /**
     * @platform darwin
     */

    /**
     * @platform win32
     */

    /**
     * @platform darwin
     */

    /**
     * @platform darwin,win32
     */

    /**
     * @platform darwin,win32
     */

    /**
     * @platform darwin,win32
     */

    /**
     * @platform darwin
     */

    /**
     * @platform darwin,win32
     */

    /**
     * @platform win32
     */

    /**
     * @platform win32
     */

    /**
     * @platform win32
     */


    /**
     * @platform darwin,win32
     */

    /**
     * @platform darwin
     */

    /**
     * @platform darwin
     */

    /**
     * @platform darwin
     */

    /**
     * @platform darwin
     */

    /**
     * @platform darwin
     */

    /**
     * @platform darwin
     */

    /**
     * @platform win32
     */

    /**
     * @platform darwin
     */

    /**
     * @platform darwin,win32
     */

    /**
     * @platform darwin,win32
     */

    /**
     * @platform darwin,win32
     */

    /**
     * @platform darwin
     */

    /**
     * @platform darwin,win32
     */

    /**
     * @platform win32
     */

    /**
     * @platform win32
     */

    /**
     * @platform win32
     */


    /**
     * @platform darwin,win32
     */

    /**
     * @platform darwin
     */

    /**
     * @platform darwin
     */

    /**
     * @platform darwin
     */

    /**
     * @platform darwin
     */

    /**
     * @platform darwin
     */

    /**
     * @platform darwin
     */

    /**
     * @platform win32
     */

    /**
     * @platform darwin
     */

    /**
     * @platform darwin,win32
     */

    /**
     * @platform darwin,win32
     */

    /**
     * @platform darwin,win32
     */

    /**
     * @platform darwin
     */

    /**
     * @platform darwin,win32
     */

    /**
     * @platform win32
     */

    /**
     * @platform win32
     */

    /**
     * @platform win32
     */


    /**
     * @platform darwin,win32
     */

    /**
     * @platform darwin
     */

    /**
     * @platform darwin
     */

    /**
     * @platform darwin
     */

    /**
     * @platform darwin
     */

    /**
     * @platform darwin
     */

    /**
     * @platform darwin
     */

    /**
     * @platform win32
     */

    /**
     * @platform darwin
     */

    /**
     * @platform darwin,win32
     */

    /**
     * @platform darwin,win32
     */

    /**
     * @platform darwin,win32
     */

    /**
     * @platform darwin
     */

    /**
     * @platform darwin,win32
     */

    /**
     * Closes an open context menu, as set by `tray.setContextMenu()`.
     *
     * @platform darwin,win32
     */
    fun closeContextMenu(): Unit

    /**
     * Destroys the tray icon immediately.
     */
    fun destroy(): Unit

    /**
     * Displays a tray balloon.
     *
     * @platform win32
     */
    fun displayBalloon(options: DisplayBalloonOptions): Unit

    /**
     * Returns focus to the taskbar notification area. Notification area icons should
     * use this message when they have completed their UI operation. For example, if
     * the icon displays a shortcut menu, but the user presses ESC to cancel it, use
     * `tray.focus()` to return focus to the notification area.
     *
     * @platform win32
     */
    fun focus(): Unit

    /**
     * The `bounds` of this tray icon as `Object`.
     *
     * @platform darwin,win32
     */
    fun getBounds(): Rectangle

    /**
     * Whether double click events will be ignored.
     *
     * @platform darwin
     */
    fun getIgnoreDoubleClickEvents(): Boolean

    /**
     * the title displayed next to the tray icon in the status bar
     *
     * @platform darwin
     */
    fun getTitle(): String

    /**
     * Whether the tray icon is destroyed.
     */
    fun isDestroyed(): Boolean

    /**
     * Pops up the context menu of the tray icon. When `menu` is passed, the `menu`
     * will be shown instead of the tray icon's context menu.
     *
     * The `position` is only available on Windows, and it is (0, 0) by default.
     *
     * @platform darwin,win32
     */
    fun popUpContextMenu(menu: Menu = definedExternally, position: Point = definedExternally): Unit

    /**
     * Removes a tray balloon.
     *
     * @platform win32
     */
    fun removeBalloon(): Unit

    /**
     * Sets the context menu for this icon.
     */
    fun setContextMenu(menu: Menu?): Unit

    /**
     * Sets the option to ignore double click events. Ignoring these events allows you
     * to detect every individual click of the tray icon.
     *
     * This value is set to false by default.
     *
     * @platform darwin
     */
    fun setIgnoreDoubleClickEvents(ignore: Boolean): Unit

    /**
     * Sets the `image` associated with this tray icon.
     */
    fun setImage(image: NativeImage): Unit

    /**
     * Sets the `image` associated with this tray icon.
     */
    fun setImage(image: String): Unit

    /**
     * Sets the `image` associated with this tray icon when pressed on macOS.
     *
     * @platform darwin
     */
    fun setPressedImage(image: NativeImage): Unit

    /**
     * Sets the `image` associated with this tray icon when pressed on macOS.
     *
     * @platform darwin
     */
    fun setPressedImage(image: String): Unit

    /**
     * Sets the title displayed next to the tray icon in the status bar (Support ANSI
     * colors).
     *
     * @platform darwin
     */
    fun setTitle(title: String, options: TitleOptions = definedExternally): Unit

    /**
     * Sets the hover text for this tray icon.
     */
    fun setToolTip(toolTip: String): Unit

    @web.events.JsEvent("balloon-click")
    val balloonClickEvent: node.events.EventInstance<js.array.JsTuple>

    @web.events.JsEvent("balloon-closed")
    val balloonClosedEvent: node.events.EventInstance<js.array.JsTuple>

    @web.events.JsEvent("balloon-show")
    val balloonShowEvent: node.events.EventInstance<js.array.JsTuple>

    @web.events.JsEvent("click")
    val clickEvent: node.events.EventInstance<js.array.JsTuple3<KeyboardEvent, Rectangle, Point>>

    @web.events.JsEvent("double-click")
    val doubleClickEvent: node.events.EventInstance<js.array.JsTuple2<KeyboardEvent, Rectangle>>

    @web.events.JsEvent("drag-end")
    val dragEndEvent: node.events.EventInstance<js.array.JsTuple>

    @web.events.JsEvent("drag-enter")
    val dragEnterEvent: node.events.EventInstance<js.array.JsTuple>

    @web.events.JsEvent("drag-leave")
    val dragLeaveEvent: node.events.EventInstance<js.array.JsTuple>

    @web.events.JsEvent("drop")
    val dropEvent: node.events.EventInstance<js.array.JsTuple>

    @web.events.JsEvent("drop-files")
    val dropFilesEvent: node.events.EventInstance<js.array.JsTuple2<Event<*>, js.array.ReadonlyArray<String>>>

    @web.events.JsEvent("drop-text")
    val dropTextEvent: node.events.EventInstance<js.array.JsTuple2<Event<*>, String>>

    @web.events.JsEvent("middle-click")
    val middleClickEvent: node.events.EventInstance<js.array.JsTuple2<KeyboardEvent, Rectangle>>

    @web.events.JsEvent("mouse-down")
    val mouseDownEvent: node.events.EventInstance<js.array.JsTuple2<KeyboardEvent, Point>>

    @web.events.JsEvent("mouse-enter")
    val mouseEnterEvent: node.events.EventInstance<js.array.JsTuple2<KeyboardEvent, Point>>

    @web.events.JsEvent("mouse-leave")
    val mouseLeaveEvent: node.events.EventInstance<js.array.JsTuple2<KeyboardEvent, Point>>

    @web.events.JsEvent("mouse-move")
    val mouseMoveEvent: node.events.EventInstance<js.array.JsTuple2<KeyboardEvent, Point>>

    @web.events.JsEvent("mouse-up")
    val mouseUpEvent: node.events.EventInstance<js.array.JsTuple2<KeyboardEvent, Point>>

    @web.events.JsEvent("right-click")
    val rightClickEvent: node.events.EventInstance<js.array.JsTuple2<KeyboardEvent, Rectangle>>
}
