// Generated by Karakum - do not modify it manually!

package node.crypto


sealed external interface ECDHConvertKeyFormat {
    companion object {
        @seskar.js.JsValue("uncompressed")
        val uncompressed: ECDHConvertKeyFormat

        @seskar.js.JsValue("compressed")
        val compressed: ECDHConvertKeyFormat

        @seskar.js.JsValue("hybrid")
        val hybrid: ECDHConvertKeyFormat
    }
}
