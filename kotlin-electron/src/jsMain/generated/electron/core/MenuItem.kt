@file:JsModule("INTERNAL_ENTITY")

package electron.core


open external class MenuItem {
// Docs: https://electronjs.org/docs/api/menu-item
    /**
     * MenuItem
     */
    constructor (options: MenuItemConstructorOptions)

    /**
     * An `Accelerator` (optional) indicating the item's accelerator, if set.
     */
    var accelerator: Accelerator?

    /**
     * A `boolean` indicating whether the item is checked, this property can be
     * dynamically changed.
     *
     * A `checkbox` menu item will toggle the `checked` property on and off when
     * selected.
     *
     * A `radio` menu item will turn on its `checked` property when clicked, and will
     * turn off that property for all adjacent items in the same menu.
     *
     * You can add a `click` function for additional behavior.
     */
    var checked: Boolean

    /**
     * A `Function` that is fired when the MenuItem receives a click event. It can be
     * called with `menuItem.click(event, focusedWindow, focusedWebContents)`.
     *
     * * `event` KeyboardEvent
     * * `focusedWindow` BrowserWindow
     * * `focusedWebContents` WebContents
     */
    var click: Function<*>

    /**
     * A `number` indicating an item's sequential unique id.
     */
    var commandId: Double

    /**
     * A `boolean` indicating whether the item is enabled, this property can be
     * dynamically changed.
     */
    var enabled: Boolean

    /**
     * A `NativeImage | string` (optional) indicating the item's icon, if set.
     */
    var icon: Any /* (NativeImage) | (string) */?

    /**
     * A `string` indicating the item's unique id, this property can be dynamically
     * changed.
     */
    var id: String

    /**
     * A `string` indicating the item's visible label.
     */
    var label: String

    /**
     * A `Menu` that the item is a part of.
     */
    var menu: Menu

    /**
     * A `boolean` indicating if the accelerator should be registered with the system
     * or just displayed.
     *
     * This property can be dynamically changed.
     */
    var registerAccelerator: Boolean

    /**
     * A `string` (optional) indicating the item's role, if set. Can be `undo`, `redo`,
     * `cut`, `copy`, `paste`, `pasteAndMatchStyle`, `delete`, `selectAll`, `reload`,
     * `forceReload`, `toggleDevTools`, `resetZoom`, `zoomIn`, `zoomOut`,
     * `toggleSpellChecker`, `togglefullscreen`, `window`, `minimize`, `close`, `help`,
     * `about`, `services`, `hide`, `hideOthers`, `unhide`, `quit`, `startSpeaking`,
     * `stopSpeaking`, `zoom`, `front`, `appMenu`, `fileMenu`, `editMenu`, `viewMenu`,
     * `shareMenu`, `recentDocuments`, `toggleTabBar`, `selectNextTab`,
     * `selectPreviousTab`, `mergeAllWindows`, `clearRecentDocuments`,
     * `moveTabToNewWindow` or `windowMenu`
     */
    var role: (MenuItemRole)?

    /**
     * A `SharingItem` indicating the item to share when the `role` is `shareMenu`.
     *
     * This property can be dynamically changed.
     *
     * @platform darwin
     */
    var sharingItem: SharingItem

    /**
     * A `string` indicating the item's sublabel.
     */
    var sublabel: String

    /**
     * A `Menu` (optional) containing the menu item's submenu, if present.
     */
    var submenu: Menu?

    /**
     * A `string` indicating the item's hover text.
     *
     * @platform darwin
     */
    var toolTip: String

    /**
     * A `string` indicating the type of the item. Can be `normal`, `separator`,
     * `submenu`, `checkbox` or `radio`.
     */
    var type: (MenuItemType)

    /**
     * An `Accelerator | null` indicating the item's user-assigned accelerator for the
     * menu item.
     *
     * **Note:** This property is only initialized after the `MenuItem` has been added
     * to a `Menu`. Either via `Menu.buildFromTemplate` or via
     * `Menu.append()/insert()`.  Accessing before initialization will just return
     * `null`.
     *
     * @platform darwin
     */
    val userAccelerator: Any /* (Accelerator) | (null) */

    /**
     * A `boolean` indicating whether the item is visible, this property can be
     * dynamically changed.
     */
    var visible: Boolean
}