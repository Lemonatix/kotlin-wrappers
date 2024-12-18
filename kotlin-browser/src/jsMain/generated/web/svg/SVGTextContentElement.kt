// Automatically generated - do not modify!

package web.svg

import web.geometry.DOMPoint
import web.geometry.DOMPointInit
import web.geometry.DOMPointReadOnly
import web.geometry.DOMRect

/**
 * Implemented by elements that support rendering child text content. It is inherited by various text-related interfaces, such as SVGTextElement, SVGTSpanElement, SVGTRefElement, SVGAltGlyphElement and SVGTextPathElement.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTextContentElement)
 */
open external class SVGTextContentElement
private constructor() :
    SVGGraphicsElement {
    val lengthAdjust: SVGAnimatedEnumeration<LengthAdjust>
    val textLength: SVGAnimatedLength
    fun getCharNumAtPosition(point: DOMPointInit = definedExternally): Int
    fun getCharNumAtPosition(point: DOMPointReadOnly /* DOMPointInit */): Int
    fun getComputedTextLength(): Float
    fun getEndPositionOfChar(charnum: UInt): DOMPoint
    fun getExtentOfChar(charnum: UInt): DOMRect
    fun getNumberOfChars(): Int
    fun getRotationOfChar(charnum: UInt): Float
    fun getStartPositionOfChar(charnum: UInt): DOMPoint
    fun getSubStringLength(
        charnum: UInt,
        nchars: UInt,
    ): Float

    val LENGTHADJUST_UNKNOWN: LengthAdjust
    val LENGTHADJUST_SPACING: LengthAdjust
    val LENGTHADJUST_SPACINGANDGLYPHS: LengthAdjust

    companion object {
        val LENGTHADJUST_UNKNOWN: LengthAdjust
        val LENGTHADJUST_SPACING: LengthAdjust
        val LENGTHADJUST_SPACINGANDGLYPHS: LengthAdjust
    }

    sealed interface LengthAdjust
}
