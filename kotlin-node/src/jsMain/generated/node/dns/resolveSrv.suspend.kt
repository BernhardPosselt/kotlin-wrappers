// Generated by Karakum - do not modify it manually!

package node.dns

suspend fun resolveSrv(hostname: String): js.array.ReadonlyArray<SrvRecord> =
    resolveSrvAsync(
        hostname
    ).await()
