// Generated by Karakum - do not modify it manually!

package node.test.it

import node.test.TestFn
import node.test.TestOptions


suspend fun skip(
    name: String = undefined.unsafeCast<Nothing>(),
    options: TestOptions = undefined.unsafeCast<Nothing>(),
    fn: TestFn = undefined.unsafeCast<Nothing>(),
): Unit =
    skipAsync(
        name, options, fn
    ).await()


suspend fun skip(name: String = undefined.unsafeCast<Nothing>(), fn: TestFn = undefined.unsafeCast<Nothing>()): Unit =
    skipAsync(
        name, fn
    ).await()


suspend fun skip(
    options: TestOptions = undefined.unsafeCast<Nothing>(),
    fn: TestFn = undefined.unsafeCast<Nothing>(),
): Unit =
    skipAsync(
        options, fn
    ).await()


suspend fun skip(fn: TestFn = undefined.unsafeCast<Nothing>()): Unit =
    skipAsync(
        fn
    ).await()


suspend fun skip(): Unit =
    skipAsync(

    ).await()
