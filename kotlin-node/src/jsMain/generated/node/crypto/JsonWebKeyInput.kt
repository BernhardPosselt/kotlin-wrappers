package node.crypto


sealed external interface JsonWebKeyInput {
    var key: JsonWebKey
    var format: String /* 'jwk' */
}