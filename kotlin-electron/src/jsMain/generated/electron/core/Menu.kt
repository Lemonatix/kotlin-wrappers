// Generated by Karakum - do not modify it manually!

@file:JsModule("INTERNAL_ENTITY")

package electron.core

import node.events.EventEmitter as NodeEventEmitter

open external class Menu : NodeEventEmitter {
    /**
     * Menu
     */
    constructor ()
// Docs: https://electronjs.org/docs/api/menu
    /**
     * Emitted when a popup is closed either manually or with `menu.closePopup()`.
     */

    /**
     * Emitted when `menu.popup()` is called.
     */


    /**
     * Appends the `menuItem` to the menu.
     */
    fun append(menuItem: MenuItem): Unit

    /**
     * Closes the context menu in the `browserWindow`.
     */
    fun closePopup(browserWindow: BrowserWindow = definedExternally): Unit

    /**
     * the item with the specified `id`
     */
    fun getMenuItemById(id: String): MenuItem?

    /**
     * Inserts the `menuItem` to the `pos` position of the menu.
     */
    fun insert(pos: Double, menuItem: MenuItem): Unit

    /**
     * Pops up this menu as a context menu in the `BrowserWindow`.
     */
    fun popup(options: PopupOptions = definedExternally): Unit

    /**
     * A `MenuItem[]` array containing the menu's items.
     *
     * Each `Menu` consists of multiple `MenuItem`s and each `MenuItem` can have a
     * submenu.
     */
    var items: js.array.ReadonlyArray<MenuItem>

    @web.events.JsEvent("menu-will-close")
    val menuWillCloseEvent: node.events.EventInstance<js.array.JsTuple1<Event<*>>>

    @web.events.JsEvent("menu-will-show")
    val menuWillShowEvent: node.events.EventInstance<js.array.JsTuple1<Event<*>>>

    companion object {
        /**
         * Generally, the `template` is an array of `options` for constructing a MenuItem.
         * The usage can be referenced above.
         *
         * You can also attach other fields to the element of the `template` and they will
         * become properties of the constructed menu items.
         */
        fun buildFromTemplate(template: Array<Any /* (MenuItemConstructorOptions) | (MenuItem) */>): Menu

        /**
         * The application menu, if set, or `null`, if not set.
         *
         * **Note:** The returned `Menu` instance doesn't support dynamic addition or
         * removal of menu items. Instance properties can still be dynamically modified.
         */
        fun getApplicationMenu(): Menu?

        /**
         * Sends the `action` to the first responder of application. This is used for
         * emulating default macOS menu behaviors. Usually you would use the `role`
         * property of a `MenuItem`.
         *
         * See the macOS Cocoa Event Handling Guide for more information on macOS' native
         * actions.
         *
         * @platform darwin
         */
        fun sendActionToFirstResponder(action: String): Unit

        /**
         * Sets `menu` as the application menu on macOS. On Windows and Linux, the `menu`
         * will be set as each window's top menu.
         *
         * Also on Windows and Linux, you can use a `&` in the top-level item name to
         * indicate which letter should get a generated accelerator. For example, using
         * `&File` for the file menu would result in a generated `Alt-F` accelerator that
         * opens the associated menu. The indicated character in the button label then gets
         * an underline, and the `&` character is not displayed on the button label.
         *
         * In order to escape the `&` character in an item name, add a proceeding `&`. For
         * example, `&&File` would result in `&File` displayed on the button label.
         *
         * Passing `null` will suppress the default menu. On Windows and Linux, this has
         * the additional effect of removing the menu bar from the window.
         *
         * **Note:** The default menu will be created automatically if the app does not set
         * one. It contains standard items such as `File`, `Edit`, `View`, `Window` and
         * `Help`.
         */
        fun setApplicationMenu(menu: Menu?): Unit
    }
}
