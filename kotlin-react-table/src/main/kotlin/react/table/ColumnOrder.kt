@file:JsModule("react-table")
@file:JsNonModule

@file:Suppress("NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE")

package react.table

@JsName("useColumnOrder")
external val useColumnOrder: PluginHook<Any>

external interface UseColumnOrderState<D> {
    var columnOrder: Array<out IdType<D>>
}

external interface UseColumnOrderInstanceProps<D> {
    fun setColumnOrder(ids: Array<out IdType<D>>)
    fun setColumnOrder(updater: (Array<out IdType<D>>) -> Array<out IdType<D>>)
}
