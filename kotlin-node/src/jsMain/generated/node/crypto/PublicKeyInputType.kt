// Generated by Karakum - do not modify it manually!

package node.crypto


sealed external interface PublicKeyInputType {
    companion object {
        @seskar.js.JsValue("pkcs1")
        val pkcs1: PublicKeyInputType

        @seskar.js.JsValue("spki")
        val spki: PublicKeyInputType
    }
}
