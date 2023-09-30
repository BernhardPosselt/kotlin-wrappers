@file:JsModule("node:crypto")

package node.crypto


/**
 * Decrypts `buffer` with `key`.`buffer` was previously encrypted using
 * the corresponding private key, for example using {@link privateEncrypt}.
 *
 * If `key` is not a `KeyObject`, this function behaves as if`key` had been passed to {@link createPublicKey}. If it is an
 * object, the `padding` property can be passed. Otherwise, this function uses`RSA_PKCS1_PADDING`.
 *
 * Because RSA public keys can be derived from private keys, a private key may
 * be passed instead of a public key.
 * @since v1.1.0
 */
external fun publicDecrypt(key: RsaPublicKey, buffer: js.buffer.ArrayBufferView): node.buffer.Buffer

external fun publicDecrypt(key: RsaPrivateKey, buffer: js.buffer.ArrayBufferView): node.buffer.Buffer

external fun publicDecrypt(key: KeyLike, buffer: js.buffer.ArrayBufferView): node.buffer.Buffer