@file:JsModule("node:crypto")

package node.crypto


/**
 * Node.js uses a `KeyObject` class to represent a symmetric or asymmetric key,
 * and each kind of key exposes different functions. The {@link createSecretKey}, {@link createPublicKey} and {@link createPrivateKey} methods are used to create `KeyObject`instances. `KeyObject`
 * objects are not to be created directly using the `new`keyword.
 *
 * Most applications should consider using the new `KeyObject` API instead of
 * passing keys as strings or `Buffer`s due to improved security features.
 *
 * `KeyObject` instances can be passed to other threads via `postMessage()`.
 * The receiver obtains a cloned `KeyObject`, and the `KeyObject` does not need to
 * be listed in the `transferList` argument.
 * @since v11.6.0
 */

external class KeyObject {
    /**
     * For asymmetric keys, this property represents the type of the key. Supported key
     * types are:
     *
     * * `'rsa'` (OID 1.2.840.113549.1.1.1)
     * * `'rsa-pss'` (OID 1.2.840.113549.1.1.10)
     * * `'dsa'` (OID 1.2.840.10040.4.1)
     * * `'ec'` (OID 1.2.840.10045.2.1)
     * * `'x25519'` (OID 1.3.101.110)
     * * `'x448'` (OID 1.3.101.111)
     * * `'ed25519'` (OID 1.3.101.112)
     * * `'ed448'` (OID 1.3.101.113)
     * * `'dh'` (OID 1.2.840.113549.1.3.1)
     *
     * This property is `undefined` for unrecognized `KeyObject` types and symmetric
     * keys.
     * @since v11.6.0
     */
    var asymmetricKeyType: KeyType?

    /**
     * For asymmetric keys, this property represents the size of the embedded key in
     * bytes. This property is `undefined` for symmetric keys.
     */
    var asymmetricKeySize: Double?

    /**
     * This property exists only on asymmetric keys. Depending on the type of the key,
     * this object contains information about the key. None of the information obtained
     * through this property can be used to uniquely identify a key or to compromise
     * the security of the key.
     *
     * For RSA-PSS keys, if the key material contains a `RSASSA-PSS-params` sequence,
     * the `hashAlgorithm`, `mgf1HashAlgorithm`, and `saltLength` properties will be
     * set.
     *
     * Other key details might be exposed via this API using additional attributes.
     * @since v15.7.0
     */
    var asymmetricKeyDetails: AsymmetricKeyDetails?
    fun export(options: KeyExportOptions<KeyFormat.der> = definedExternally): node.buffer.Buffer
    fun export(options: JwkKeyExportOptions = definedExternally): JsonWebKey

    /**
     * For secret keys, this property represents the size of the key in bytes. This
     * property is `undefined` for asymmetric keys.
     * @since v11.6.0
     */
    var symmetricKeySize: Double?

    /**
     * Depending on the type of this `KeyObject`, this property is either`'secret'` for secret (symmetric) keys, `'public'` for public (asymmetric) keys
     * or `'private'` for private (asymmetric) keys.
     * @since v11.6.0
     */
    var type: KeyObjectType

    companion object {
        /**
         * Example: Converting a `CryptoKey` instance to a `KeyObject`:
         *
         * ```js
         * const { webcrypto, KeyObject } = await import('crypto');
         * const { subtle } = webcrypto;
         *
         * const key = await subtle.generateKey({
         *   name: 'HMAC',
         *   hash: 'SHA-256',
         *   length: 256
         * }, true, ['sign', 'verify']);
         *
         * const keyObject = KeyObject.from(key);
         * console.log(keyObject.symmetricKeySize);
         * // Prints: 32 (symmetric key size in bytes)
         * ```
         * @since v15.0.0
         */
        fun from(key: web.crypto.CryptoKey): KeyObject
    }

}