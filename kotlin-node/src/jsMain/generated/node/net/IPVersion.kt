// Generated by Karakum - do not modify it manually!


package node.net


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{ipv4: 'ipv4', ipv6: 'ipv6'}/*union*/)""")
sealed external interface IPVersion {
    companion object {
        val ipv4: IPVersion
        val ipv6: IPVersion
    }
}
