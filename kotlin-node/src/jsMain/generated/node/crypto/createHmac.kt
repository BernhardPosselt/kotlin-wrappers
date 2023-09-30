@file:JsModule("node:crypto")

package node.crypto


/**
 * Creates and returns an `Hmac` object that uses the given `algorithm` and `key`.
 * Optional `options` argument controls stream behavior.
 *
 * The `algorithm` is dependent on the available algorithms supported by the
 * version of OpenSSL on the platform. Examples are `'sha256'`, `'sha512'`, etc.
 * On recent releases of OpenSSL, `openssl list -digest-algorithms` will
 * display the available digest algorithms.
 *
 * The `key` is the HMAC key used to generate the cryptographic HMAC hash. If it is
 * a `KeyObject`, its type must be `secret`.
 *
 * Example: generating the sha256 HMAC of a file
 *
 * ```js
 * import {
 *   createReadStream
 * } from 'fs';
 * import { argv } from 'process';
 * const {
 *   createHmac
 * } = await import('crypto');
 *
 * const filename = argv[2];
 *
 * const hmac = createHmac('sha256', 'a secret');
 *
 * const input = createReadStream(filename);
 * input.on('readable', () => {
 *   // Only one element is going to be produced by the
 *   // hash stream.
 *   const data = input.read();
 *   if (data)
 *     hmac.update(data);
 *   else {
 *     console.log(`${hmac.digest('hex')} ${filename}`);
 *   }
 * });
 * ```
 * @since v0.1.94
 * @param options `stream.transform` options
 */
external fun createHmac(
    algorithm: String,
    key: BinaryLike,
    options: node.stream.TransformOptions = definedExternally,
): Hmac

external fun createHmac(
    algorithm: String,
    key: KeyObject,
    options: node.stream.TransformOptions = definedExternally,
): Hmac