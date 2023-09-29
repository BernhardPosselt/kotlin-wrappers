package node.fs


sealed external interface BigIntStats : StatsBase<js.core.BigInt> {
    var atimeNs: js.core.BigInt
    var mtimeNs: js.core.BigInt
    var ctimeNs: js.core.BigInt
    var birthtimeNs: js.core.BigInt
}
