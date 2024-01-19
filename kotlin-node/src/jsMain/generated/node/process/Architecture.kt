// Generated by Karakum - do not modify it manually!


package node.process


@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@seskar.js.JsVirtual
sealed external interface Architecture {
    companion object {
        @seskar.js.JsValue("arm")
        val arm: Architecture

        @seskar.js.JsValue("arm64")
        val arm64: Architecture

        @seskar.js.JsValue("ia32")
        val ia32: Architecture

        @seskar.js.JsValue("mips")
        val mips: Architecture

        @seskar.js.JsValue("mipsel")
        val mipsel: Architecture

        @seskar.js.JsValue("ppc")
        val ppc: Architecture

        @seskar.js.JsValue("ppc64")
        val ppc64: Architecture

        @seskar.js.JsValue("riscv64")
        val riscv64: Architecture

        @seskar.js.JsValue("s390")
        val s390: Architecture

        @seskar.js.JsValue("s390x")
        val s390x: Architecture

        @seskar.js.JsValue("x64")
        val x64: Architecture
    }
}
