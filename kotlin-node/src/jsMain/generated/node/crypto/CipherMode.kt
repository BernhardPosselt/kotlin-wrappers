// Generated by Karakum - do not modify it manually!


package node.crypto


sealed external interface CipherMode {
    companion object {
        @seskar.js.JsValue("cbc")
        val cbc: CipherMode

        @seskar.js.JsValue("ccm")
        val ccm: CipherMode

        @seskar.js.JsValue("cfb")
        val cfb: CipherMode

        @seskar.js.JsValue("ctr")
        val ctr: CipherMode

        @seskar.js.JsValue("ecb")
        val ecb: CipherMode

        @seskar.js.JsValue("gcm")
        val gcm: CipherMode

        @seskar.js.JsValue("ocb")
        val ocb: CipherMode

        @seskar.js.JsValue("ofb")
        val ofb: CipherMode

        @seskar.js.JsValue("stream")
        val stream: CipherMode

        @seskar.js.JsValue("wrap")
        val wrap: CipherMode

        @seskar.js.JsValue("xts")
        val xts: CipherMode
    }
}
