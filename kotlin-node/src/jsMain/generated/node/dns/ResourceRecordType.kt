// Generated by Karakum - do not modify it manually!

package node.dns


@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@seskar.js.JsVirtual
sealed external interface ResourceRecordType {
    sealed interface A : ResourceRecordType
    sealed interface AAAA : ResourceRecordType
    sealed interface ANY : ResourceRecordType
    sealed interface CNAME : ResourceRecordType
    sealed interface MX : ResourceRecordType
    sealed interface NAPTR : ResourceRecordType
    sealed interface NS : ResourceRecordType
    sealed interface PTR : ResourceRecordType
    sealed interface SOA : ResourceRecordType
    sealed interface SRV : ResourceRecordType
    sealed interface TXT : ResourceRecordType
    sealed interface CAA : ResourceRecordType

    companion object {
        @seskar.js.JsValue("A")
        val A: A

        @seskar.js.JsValue("AAAA")
        val AAAA: AAAA

        @seskar.js.JsValue("ANY")
        val ANY: ANY

        @seskar.js.JsValue("CNAME")
        val CNAME: CNAME

        @seskar.js.JsValue("MX")
        val MX: MX

        @seskar.js.JsValue("NAPTR")
        val NAPTR: NAPTR

        @seskar.js.JsValue("NS")
        val NS: NS

        @seskar.js.JsValue("PTR")
        val PTR: PTR

        @seskar.js.JsValue("SOA")
        val SOA: SOA

        @seskar.js.JsValue("SRV")
        val SRV: SRV

        @seskar.js.JsValue("TXT")
        val TXT: TXT

        @seskar.js.JsValue("CAA")
        val CAA: CAA
    }
}
