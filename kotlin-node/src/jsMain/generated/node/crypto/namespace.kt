@file:JsModule("node:crypto")

package node.crypto


/* import * as stream from 'node:stream'; */

/* import { PeerCertificate } from 'node:tls'; */

/** @deprecated since v10.0.0 */
external val fips: Boolean

/**
 * The `DiffieHellmanGroup` class takes a well-known modp group as its argument.
 * It works the same as `DiffieHellman`, except that it does not allow changing its keys after creation.
 * In other words, it does not implement `setPublicKey()` or `setPrivateKey()` methods.
 *
 * ```js
 * const { createDiffieHellmanGroup } = await import('node:crypto');
 * const dh = createDiffieHellmanGroup('modp1');
 * ```
 * The name (e.g. `'modp1'`) is taken from [RFC 2412](https://www.rfc-editor.org/rfc/rfc2412.txt) (modp1 and 2) and [RFC 3526](https://www.rfc-editor.org/rfc/rfc3526.txt):
 * ```bash
 * $ perl -ne 'print "$1\n" if /"(modp\d+)"/' src/node_crypto_groups.h
 * modp1  #  768 bits
 * modp2  # 1024 bits
 * modp5  # 1536 bits
 * modp14 # 2048 bits
 * modp15 # etc.
 * modp16
 * modp17
 * modp18
 * ```
 * @since v0.7.5
 */


/** @deprecated since v10.0.0 */
external val DEFAULT_ENCODING: node.buffer.BufferEncoding

/**
 * A convenient alias for `crypto.webcrypto.subtle`.
 * @since v17.4.0
 */
external val subtle: web.crypto.SubtleCrypto

/**
 * An implementation of the Web Crypto API standard.
 *
 * See the {@link https://nodejs.org/docs/latest/api/webcrypto.html Web Crypto API documentation} for details.
 * @since v15.0.0
 */
external val webcrypto: web.crypto.Crypto