// Automatically generated - do not modify!

package mui.material

import seskar.js.JsValue
import seskar.js.JsVirtual

@Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsVirtual
sealed external interface LinearProgressColor {
    companion object {
        @JsValue("primary")
        val primary: LinearProgressColor

        @JsValue("secondary")
        val secondary: LinearProgressColor

        @JsValue("error")
        val error: LinearProgressColor

        @JsValue("info")
        val info: LinearProgressColor

        @JsValue("success")
        val success: LinearProgressColor

        @JsValue("warning")
        val warning: LinearProgressColor

        @JsValue("inherit")
        val inherit: LinearProgressColor
    }
}

@Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsVirtual
sealed external interface LinearProgressVariant {
    companion object {
        @JsValue("determinate")
        val determinate: LinearProgressVariant

        @JsValue("indeterminate")
        val indeterminate: LinearProgressVariant

        @JsValue("buffer")
        val buffer: LinearProgressVariant

        @JsValue("query")
        val query: LinearProgressVariant
    }
}
