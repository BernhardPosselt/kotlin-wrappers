package node.crypto


@Suppress("INTERFACE_WITH_SUPERCLASS")

sealed external interface CipherCCM : Cipher {
    fun setAAD(buffer: js.buffer.ArrayBufferView, options: CipherCCMSetAADOptions): Unit /* this */
    fun getAuthTag(): node.buffer.Buffer
}