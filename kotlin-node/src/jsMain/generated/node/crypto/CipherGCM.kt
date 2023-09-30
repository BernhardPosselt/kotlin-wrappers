package node.crypto


@Suppress("INTERFACE_WITH_SUPERCLASS")

sealed external interface CipherGCM : Cipher {
    fun setAAD(buffer: js.buffer.ArrayBufferView, options: CipherGCMSetAADOptions = definedExternally): Unit /* this */
    fun getAuthTag(): node.buffer.Buffer
}