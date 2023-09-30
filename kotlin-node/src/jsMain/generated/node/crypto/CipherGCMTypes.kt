package node.crypto


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{aes128Gcm: 'aes-128-gcm', aes192Gcm: 'aes-192-gcm', aes256Gcm: 'aes-256-gcm'}/*union*/)""")
sealed external interface CipherGCMTypes {
    companion object {
        val aes128Gcm: CipherGCMTypes
        val aes192Gcm: CipherGCMTypes
        val aes256Gcm: CipherGCMTypes
    }
}