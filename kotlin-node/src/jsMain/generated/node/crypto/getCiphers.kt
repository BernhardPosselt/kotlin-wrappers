@file:JsModule("node:crypto")

package node.crypto


/**
 * ```js
 * const {
 *   getCiphers
 * } = await import('crypto');
 *
 * console.log(getCiphers()); // ['aes-128-cbc', 'aes-128-ccm', ...]
 * ```
 * @since v0.9.3
 * @return An array with the names of the supported cipher algorithms.
 */
external fun getCiphers(): js.core.ReadonlyArray<String>