package org.hyperscala.css

import attributes._
import org.powerscala.Color
import org.hyperscala.{Tag, InclusionMode, PropertyAttribute}
import org.hyperscala.event.StylePropertyChangeEvent
import org.powerscala.hierarchy.event.StandardHierarchyEventProcessor

/**
 * @author Matt Hicks <mhicks@outr.com>
 */
class StyleSheetProperty(_name: String, inclusionMode: InclusionMode = InclusionMode.NotEmpty)
                        (implicit tag: Tag) extends PropertyAttribute[StyleSheet](_name, StyleSheet(), inclusionMode)(StyleSheet, tag, implicitly[Manifest[StyleSheet]]) {
  lazy val styleChange = new StandardHierarchyEventProcessor[StylePropertyChangeEvent]("styleChange")

  def alignmentAdjust = get[String](Style.alignmentAdjust)
  def alignmentAdjust_=(v: String) = set(Style.alignmentAdjust, v)

  def alignmentBaseline = get[String](Style.alignmentBaseline)
  def alignmentBaseline_=(v: String) = set(Style.alignmentBaseline, v)

  def animation = get[String](Style.animation)
  def animation_=(v: String) = set(Style.animation, v)

  def animationDelay = get[String](Style.animationDelay)
  def animationDelay_=(v: String) = set(Style.animationDelay, v)

  def animationDirection = get[String](Style.animationDirection)
  def animationDirection_=(v: String) = set(Style.animationDirection, v)

  def animationDuration = get[String](Style.animationDuration)
  def animationDuration_=(v: String) = set(Style.animationDuration, v)

  def animationIterationCount = get[String](Style.animationIterationCount)
  def animationIterationCount_=(v: String) = set(Style.animationIterationCount, v)

  def animationName = get[String](Style.animationName)
  def animationName_=(v: String) = set(Style.animationName, v)

  def animationPlayState = get[String](Style.animationPlayState)
  def animationPlayState_=(v: String) = set(Style.animationPlayState, v)

  def animationTimingFunction = get[String](Style.animationTimingFunction)
  def animationTimingFunction_=(v: String) = set(Style.animationTimingFunction, v)

  def appearance = get[String](Style.appearance)
  def appearance_=(v: String) = set(Style.appearance, v)

  def backfaceVisibility = get[String](Style.backfaceVisibility)
  def backfaceVisibility_=(v: String) = set(Style.backfaceVisibility, v)

  def background = get[String](Style.background)
  def background_=(v: String) = set(Style.background, v)

  def backgroundAttachment = get[String](Style.backgroundAttachment)
  def backgroundAttachment_=(v: String) = set(Style.backgroundAttachment, v)

  def backgroundClip = get[String](Style.backgroundClip)
  def backgroundClip_=(v: String) = set(Style.backgroundClip, v)

  def backgroundColor = get[Color](Style.backgroundColor)
  def backgroundColor_=(v: Color) = set(Style.backgroundColor, v)

  def backgroundImage = get[Resource](Style.backgroundImage)
  def backgroundImage_=(v: Resource) = set(Style.backgroundImage, v)

  def backgroundOrigin = get[String](Style.backgroundOrigin)
  def backgroundOrigin_=(v: String) = set(Style.backgroundOrigin, v)

  def backgroundPosition = get[String](Style.backgroundPosition)
  def backgroundPosition_=(v: String) = set(Style.backgroundPosition, v)

  def backgroundRepeat = get[String](Style.backgroundRepeat)
  def backgroundRepeat_=(v: String) = set(Style.backgroundRepeat, v)

  def backgroundSize = get[String](Style.backgroundSize)
  def backgroundSize_=(v: String) = set(Style.backgroundSize, v)

  def baselineShift = get[String](Style.baselineShift)
  def baselineShift_=(v: String) = set(Style.baselineShift, v)

  def bookmarkLabel = get[String](Style.bookmarkLabel)
  def bookmarkLabel_=(v: String) = set(Style.bookmarkLabel, v)

  def bookmarkLevel = get[String](Style.bookmarkLevel)
  def bookmarkLevel_=(v: String) = set(Style.bookmarkLevel, v)

  def bookmarkTarget = get[String](Style.bookmarkTarget)
  def bookmarkTarget_=(v: String) = set(Style.bookmarkTarget, v)

  def border = get[String](Style.border)
  def border_=(v: String) = set(Style.border, v)

  def borderBottom = get[String](Style.borderBottom)
  def borderBottom_=(v: String) = set(Style.borderBottom, v)

  def borderBottomColor = get[Color](Style.borderBottomColor)
  def borderBottomColor_=(v: Color) = set(Style.borderBottomColor, v)

  def borderBottomLeftRadius = get[Length](Style.borderBottomLeftRadius)
  def borderBottomLeftRadius_=(v: Length) = set(Style.borderBottomLeftRadius, v)

  def borderBottomRightRadius = get[Length](Style.borderBottomRightRadius)
  def borderBottomRightRadius_=(v: Length) = set(Style.borderBottomRightRadius, v)

  def borderBottomStyle = get[String](Style.borderBottomStyle)
  def borderBottomStyle_=(v: String) = set(Style.borderBottomStyle, v)

  def borderBottomWidth = get[Length](Style.borderBottomWidth)
  def borderBottomWidth_=(v: Length) = set(Style.borderBottomWidth, v)

  def borderCollapse = get[String](Style.borderCollapse)
  def borderCollapse_=(v: String) = set(Style.borderCollapse, v)

  def borderColor = get[Color](Style.borderColor)
  def borderColor_=(v: Color) = set(Style.borderColor, v)

  def borderImage = get[String](Style.borderImage)
  def borderImage_=(v: String) = set(Style.borderImage, v)

  def borderImageOutset = get[String](Style.borderImageOutset)
  def borderImageOutset_=(v: String) = set(Style.borderImageOutset, v)

  def borderImageRepeat = get[String](Style.borderImageRepeat)
  def borderImageRepeat_=(v: String) = set(Style.borderImageRepeat, v)

  def borderImageSlice = get[String](Style.borderImageSlice)
  def borderImageSlice_=(v: String) = set(Style.borderImageSlice, v)

  def borderImageSource = get[String](Style.borderImageSource)
  def borderImageSource_=(v: String) = set(Style.borderImageSource, v)

  def borderImageWidth = get[Length](Style.borderImageWidth)
  def borderImageWidth_=(v: Length) = set(Style.borderImageWidth, v)

  def borderLeft = get[String](Style.borderLeft)
  def borderLeft_=(v: String) = set(Style.borderLeft, v)

  def borderLeftColor = get[Color](Style.borderLeftColor)
  def borderLeftColor_=(v: Color) = set(Style.borderLeftColor, v)

  def borderLeftStyle = get[String](Style.borderLeftStyle)
  def borderLeftStyle_=(v: String) = set(Style.borderLeftStyle, v)

  def borderLeftWidth = get[Length](Style.borderLeftWidth)
  def borderLeftWidth_=(v: Length) = set(Style.borderLeftWidth, v)

  def borderRadius = get[Length](Style.borderRadius)
  def borderRadius_=(v: Length) = set(Style.borderRadius, v)

  def borderRight = get[String](Style.borderRight)
  def borderRight_=(v: String) = set(Style.borderRight, v)

  def borderRightColor = get[Color](Style.borderRightColor)
  def borderRightColor_=(v: Color) = set(Style.borderRightColor, v)

  def borderRightStyle = get[String](Style.borderRightStyle)
  def borderRightStyle_=(v: String) = set(Style.borderRightStyle, v)

  def borderRightWidth = get[Length](Style.borderRightWidth)
  def borderRightWidth_=(v: Length) = set(Style.borderRightWidth, v)

  def borderSpacing = get[String](Style.borderSpacing)
  def borderSpacing_=(v: String) = set(Style.borderSpacing, v)

  def borderStyle = get[String](Style.borderStyle)
  def borderStyle_=(v: String) = set(Style.borderStyle, v)

  def borderTop = get[String](Style.borderTop)
  def borderTop_=(v: String) = set(Style.borderTop, v)

  def borderTopColor = get[Color](Style.borderTopColor)
  def borderTopColor_=(v: Color) = set(Style.borderTopColor, v)

  def borderTopLeftRadius = get[Length](Style.borderTopLeftRadius)
  def borderTopLeftRadius_=(v: Length) = set(Style.borderTopLeftRadius, v)

  def borderTopRightRadius = get[Length](Style.borderTopRightRadius)
  def borderTopRightRadius_=(v: Length) = set(Style.borderTopRightRadius, v)

  def borderTopStyle = get[String](Style.borderTopStyle)
  def borderTopStyle_=(v: String) = set(Style.borderTopStyle, v)

  def borderTopWidth = get[Length](Style.borderTopWidth)
  def borderTopWidth_=(v: Length) = set(Style.borderTopWidth, v)

  def borderWidth = get[Length](Style.borderWidth)
  def borderWidth_=(v: Length) = set(Style.borderWidth, v)

  def bottom = get[String](Style.bottom)
  def bottom_=(v: String) = set(Style.bottom, v)

  def boxAlign = get[String](Style.boxAlign)
  def boxAlign_=(v: String) = set(Style.boxAlign, v)

  def boxDecorationBreak = get[String](Style.boxDecorationBreak)
  def boxDecorationBreak_=(v: String) = set(Style.boxDecorationBreak, v)

  def boxDirection = get[String](Style.boxDirection)
  def boxDirection_=(v: String) = set(Style.boxDirection, v)

  def boxFlex = get[String](Style.boxFlex)
  def boxFlex_=(v: String) = set(Style.boxFlex, v)

  def boxFlexGroup = get[String](Style.boxFlexGroup)
  def boxFlexGroup_=(v: String) = set(Style.boxFlexGroup, v)

  def boxLines = get[String](Style.boxLines)
  def boxLines_=(v: String) = set(Style.boxLines, v)

  def boxOrdinalGroup = get[String](Style.boxOrdinalGroup)
  def boxOrdinalGroup_=(v: String) = set(Style.boxOrdinalGroup, v)

  def boxOrient = get[String](Style.boxOrient)
  def boxOrient_=(v: String) = set(Style.boxOrient, v)

  def boxPack = get[String](Style.boxPack)
  def boxPack_=(v: String) = set(Style.boxPack, v)

  def boxShadow = get[String](Style.boxShadow)
  def boxShadow_=(v: String) = set(Style.boxShadow, v)

  def boxSizing = get[String](Style.boxSizing)
  def boxSizing_=(v: String) = set(Style.boxSizing, v)

  def captionSide = get[String](Style.captionSide)
  def captionSide_=(v: String) = set(Style.captionSide, v)

  def clear = get[Clear](Style.clear)
  def clear_=(v: Clear) = set(Style.clear, v)

  def clip = get[String](Style.clip)
  def clip_=(v: String) = set(Style.clip, v)

  def color = get[Color](Style.color)
  def color_=(v: Color) = set(Style.color, v)

  def colorProfile = get[String](Style.colorProfile)
  def colorProfile_=(v: String) = set(Style.colorProfile, v)

  def columnCount = get[String](Style.columnCount)
  def columnCount_=(v: String) = set(Style.columnCount, v)

  def columnFill = get[String](Style.columnFill)
  def columnFill_=(v: String) = set(Style.columnFill, v)

  def columnGap = get[String](Style.columnGap)
  def columnGap_=(v: String) = set(Style.columnGap, v)

  def columnRule = get[String](Style.columnRule)
  def columnRule_=(v: String) = set(Style.columnRule, v)

  def columnRuleColor = get[Color](Style.columnRuleColor)
  def columnRuleColor_=(v: Color) = set(Style.columnRuleColor, v)

  def columnRuleStyle = get[String](Style.columnRuleStyle)
  def columnRuleStyle_=(v: String) = set(Style.columnRuleStyle, v)

  def columnRuleWidth = get[Length](Style.columnRuleWidth)
  def columnRuleWidth_=(v: Length) = set(Style.columnRuleWidth, v)

  def columnSpan = get[String](Style.columnSpan)
  def columnSpan_=(v: String) = set(Style.columnSpan, v)

  def columnWidth = get[Length](Style.columnWidth)
  def columnWidth_=(v: Length) = set(Style.columnWidth, v)

  def columns = get[String](Style.columns)
  def columns_=(v: String) = set(Style.columns, v)

  def content = get[String](Style.content)
  def content_=(v: String) = set(Style.content, v)

  def counterIncrement = get[String](Style.counterIncrement)
  def counterIncrement_=(v: String) = set(Style.counterIncrement, v)

  def counterReset = get[String](Style.counterReset)
  def counterReset_=(v: String) = set(Style.counterReset, v)

  def crop = get[String](Style.crop)
  def crop_=(v: String) = set(Style.crop, v)

  def cursor = get[String](Style.cursor)
  def cursor_=(v: String) = set(Style.cursor, v)

  def direction = get[String](Style.direction)
  def direction_=(v: String) = set(Style.direction, v)

  def display = get[Display](Style.display)
  def display_=(v: Display) = set(Style.display, v)

  def dominantBaseline = get[String](Style.dominantBaseline)
  def dominantBaseline_=(v: String) = set(Style.dominantBaseline, v)

  def dropInitialAfterAdjust = get[String](Style.dropInitialAfterAdjust)
  def dropInitialAfterAdjust_=(v: String) = set(Style.dropInitialAfterAdjust, v)

  def dropInitialAfterAlign = get[String](Style.dropInitialAfterAlign)
  def dropInitialAfterAlign_=(v: String) = set(Style.dropInitialAfterAlign, v)

  def dropInitialBeforeAdjust = get[String](Style.dropInitialBeforeAdjust)
  def dropInitialBeforeAdjust_=(v: String) = set(Style.dropInitialBeforeAdjust, v)

  def dropInitialBeforeAlign = get[String](Style.dropInitialBeforeAlign)
  def dropInitialBeforeAlign_=(v: String) = set(Style.dropInitialBeforeAlign, v)

  def dropInitialSize = get[String](Style.dropInitialSize)
  def dropInitialSize_=(v: String) = set(Style.dropInitialSize, v)

  def dropInitialValue = get[String](Style.dropInitialValue)
  def dropInitialValue_=(v: String) = set(Style.dropInitialValue, v)

  def emptyCells = get[String](Style.emptyCells)
  def emptyCells_=(v: String) = set(Style.emptyCells, v)

  def fit = get[String](Style.fit)
  def fit_=(v: String) = set(Style.fit, v)

  def fitPosition = get[String](Style.fitPosition)
  def fitPosition_=(v: String) = set(Style.fitPosition, v)

  def float = get[Float](Style.float)
  def float_=(v: Float) = set(Style.float, v)

  def floatOffset = get[String](Style.floatOffset)
  def floatOffset_=(v: String) = set(Style.floatOffset, v)

  def font = get[String](Style.font)
  def font_=(v: String) = set(Style.font, v)

  def fontFace = get[String](Style.fontFace)
  def fontFace_=(v: String) = set(Style.fontFace, v)

  def fontFamily = get[String](Style.fontFamily)
  def fontFamily_=(v: String) = set(Style.fontFamily, v)

  def fontSize = get[FontSize](Style.fontSize)
  def fontSize_=(v: FontSize) = set(Style.fontSize, v)

  def fontSizeAdjust = get[String](Style.fontSizeAdjust)
  def fontSizeAdjust_=(v: String) = set(Style.fontSizeAdjust, v)

  def fontStretch = get[String](Style.fontStretch)
  def fontStretch_=(v: String) = set(Style.fontStretch, v)

  def fontStyle = get[String](Style.fontStyle)
  def fontStyle_=(v: String) = set(Style.fontStyle, v)

  def fontVariant = get[String](Style.fontVariant)
  def fontVariant_=(v: String) = set(Style.fontVariant, v)

  def fontWeight = get[String](Style.fontWeight)
  def fontWeight_=(v: String) = set(Style.fontWeight, v)

  def gridColumns = get[String](Style.gridColumns)
  def gridColumns_=(v: String) = set(Style.gridColumns, v)

  def gridRows = get[String](Style.gridRows)
  def gridRows_=(v: String) = set(Style.gridRows, v)

  def hangingPunctuation = get[String](Style.hangingPunctuation)
  def hangingPunctuation_=(v: String) = set(Style.hangingPunctuation, v)

  def height = get[Length](Style.height)
  def height_=(v: Length) = set(Style.height, v)

  def hyphenateAfter = get[String](Style.hyphenateAfter)
  def hyphenateAfter_=(v: String) = set(Style.hyphenateAfter, v)

  def hyphenateBefore = get[String](Style.hyphenateBefore)
  def hyphenateBefore_=(v: String) = set(Style.hyphenateBefore, v)

  def hyphenateCharacter = get[String](Style.hyphenateCharacter)
  def hyphenateCharacter_=(v: String) = set(Style.hyphenateCharacter, v)

  def hyphenateLines = get[String](Style.hyphenateLines)
  def hyphenateLines_=(v: String) = set(Style.hyphenateLines, v)

  def hyphenateResource = get[String](Style.hyphenateResource)
  def hyphenateResource_=(v: String) = set(Style.hyphenateResource, v)

  def hyphens = get[String](Style.hyphens)
  def hyphens_=(v: String) = set(Style.hyphens, v)

  def icon = get[String](Style.icon)
  def icon_=(v: String) = set(Style.icon, v)

  def imageOrientation = get[String](Style.imageOrientation)
  def imageOrientation_=(v: String) = set(Style.imageOrientation, v)

  def imageResolution = get[String](Style.imageResolution)
  def imageResolution_=(v: String) = set(Style.imageResolution, v)

  def inlineBoxAlign = get[String](Style.inlineBoxAlign)
  def inlineBoxAlign_=(v: String) = set(Style.inlineBoxAlign, v)

  def left = get[Length](Style.left)
  def left_=(v: Length) = set(Style.left, v)

  def letterSpacing = get[String](Style.letterSpacing)
  def letterSpacing_=(v: String) = set(Style.letterSpacing, v)

  def lineHeight = get[String](Style.lineHeight)
  def lineHeight_=(v: String) = set(Style.lineHeight, v)

  def lineStacking = get[String](Style.lineStacking)
  def lineStacking_=(v: String) = set(Style.lineStacking, v)

  def lineStackingRuby = get[String](Style.lineStackingRuby)
  def lineStackingRuby_=(v: String) = set(Style.lineStackingRuby, v)

  def lineStackingShift = get[String](Style.lineStackingShift)
  def lineStackingShift_=(v: String) = set(Style.lineStackingShift, v)

  def lineStackingStrategy = get[String](Style.lineStackingStrategy)
  def lineStackingStrategy_=(v: String) = set(Style.lineStackingStrategy, v)

  def listStyle = get[String](Style.listStyle)
  def listStyle_=(v: String) = set(Style.listStyle, v)

  def listStyleImage = get[String](Style.listStyleImage)
  def listStyleImage_=(v: String) = set(Style.listStyleImage, v)

  def listStylePosition = get[String](Style.listStylePosition)
  def listStylePosition_=(v: String) = set(Style.listStylePosition, v)

  def listStyleType = get[String](Style.listStyleType)
  def listStyleType_=(v: String) = set(Style.listStyleType, v)

  def margin = get[String](Style.margin)
  def margin_=(v: String) = set(Style.margin, v)

  def marginBottom = get[Length](Style.marginBottom)
  def marginBottom_=(v: Length) = set(Style.marginBottom, v)

  def marginLeft = get[Length](Style.marginLeft)
  def marginLeft_=(v: Length) = set(Style.marginLeft, v)

  def marginRight = get[Length](Style.marginRight)
  def marginRight_=(v: Length) = set(Style.marginRight, v)

  def marginTop = get[Length](Style.marginTop)
  def marginTop_=(v: Length) = set(Style.marginTop, v)

  def marginAll = get[Length](Style.marginTop)
  def marginAll_=(v: Length) = {
    set(Style.marginTop, v)
    set(Style.marginBottom, v)
    set(Style.marginLeft, v)
    set(Style.marginRight, v)
  }

  def mark = get[String](Style.mark)
  def mark_=(v: String) = set(Style.mark, v)

  def markAfter = get[String](Style.markAfter)
  def markAfter_=(v: String) = set(Style.markAfter, v)

  def markBefore = get[String](Style.markBefore)
  def markBefore_=(v: String) = set(Style.markBefore, v)

  def marks = get[String](Style.marks)
  def marks_=(v: String) = set(Style.marks, v)

  def marqueeDirection = get[String](Style.marqueeDirection)
  def marqueeDirection_=(v: String) = set(Style.marqueeDirection, v)

  def marqueePlayCount = get[String](Style.marqueePlayCount)
  def marqueePlayCount_=(v: String) = set(Style.marqueePlayCount, v)

  def marqueeSpeed = get[String](Style.marqueeSpeed)
  def marqueeSpeed_=(v: String) = set(Style.marqueeSpeed, v)

  def marqueeStyle = get[String](Style.marqueeStyle)
  def marqueeStyle_=(v: String) = set(Style.marqueeStyle, v)

  def maxHeight = get[Length](Style.maxHeight)
  def maxHeight_=(v: Length) = set(Style.maxHeight, v)

  def maxWidth = get[Length](Style.maxWidth)
  def maxWidth_=(v: Length) = set(Style.maxWidth, v)

  def minHeight = get[Length](Style.minHeight)
  def minHeight_=(v: Length) = set(Style.minHeight, v)

  def minWidth = get[Length](Style.minWidth)
  def minWidth_=(v: Length) = set(Style.minWidth, v)

  def moveTo = get[String](Style.moveTo)
  def moveTo_=(v: String) = set(Style.moveTo, v)

  def navDown = get[String](Style.navDown)
  def navDown_=(v: String) = set(Style.navDown, v)

  def navIndex = get[String](Style.navIndex)
  def navIndex_=(v: String) = set(Style.navIndex, v)

  def navLeft = get[String](Style.navLeft)
  def navLeft_=(v: String) = set(Style.navLeft, v)

  def navRight = get[String](Style.navRight)
  def navRight_=(v: String) = set(Style.navRight, v)

  def navUp = get[String](Style.navUp)
  def navUp_=(v: String) = set(Style.navUp, v)

  def opacity = get[Opacity](Style.opacity)
  def opacity_=(v: Opacity) = set(Style.opacity, v)

  def orphans = get[String](Style.orphans)
  def orphans_=(v: String) = set(Style.orphans, v)

  def outline = get[String](Style.outline)
  def outline_=(v: String) = set(Style.outline, v)

  def outlineColor = get[Color](Style.outlineColor)
  def outlineColor_=(v: Color) = set(Style.outlineColor, v)

  def outlineOffset = get[String](Style.outlineOffset)
  def outlineOffset_=(v: String) = set(Style.outlineOffset, v)

  def outlineStyle = get[String](Style.outlineStyle)
  def outlineStyle_=(v: String) = set(Style.outlineStyle, v)

  def outlineWidth = get[Length](Style.outlineWidth)
  def outlineWidth_=(v: Length) = set(Style.outlineWidth, v)

  def overflow = get[Overflow](Style.overflow)
  def overflow_=(v: Overflow) = set(Style.overflow, v)

  def overflowStyle = get[String](Style.overflowStyle)
  def overflowStyle_=(v: String) = set(Style.overflowStyle, v)

  def overflowX = get[Overflow](Style.overflowX)
  def overflowX_=(v: Overflow) = set(Style.overflowX, v)

  def overflowY = get[Overflow](Style.overflowY)
  def overflowY_=(v: Overflow) = set(Style.overflowY, v)

  def padding = get[String](Style.padding)
  def padding_=(v: String) = set(Style.padding, v)

  def paddingBottom = get[Length](Style.paddingBottom)
  def paddingBottom_=(v: Length) = set(Style.paddingBottom, v)

  def paddingLeft = get[Length](Style.paddingLeft)
  def paddingLeft_=(v: Length) = set(Style.paddingLeft, v)

  def paddingRight = get[Length](Style.paddingRight)
  def paddingRight_=(v: Length) = set(Style.paddingRight, v)

  def paddingTop = get[Length](Style.paddingTop)
  def paddingTop_=(v: Length) = set(Style.paddingTop, v)

  def paddingAll = get[Length](Style.paddingTop)
  def paddingAll_=(v: Length) = {
    set(Style.paddingTop, v)
    set(Style.paddingBottom, v)
    set(Style.paddingLeft, v)
    set(Style.paddingRight, v)
  }

  def page = get[String](Style.page)
  def page_=(v: String) = set(Style.page, v)

  def pageBreakAfter = get[String](Style.pageBreakAfter)
  def pageBreakAfter_=(v: String) = set(Style.pageBreakAfter, v)

  def pageBreakBefore = get[String](Style.pageBreakBefore)
  def pageBreakBefore_=(v: String) = set(Style.pageBreakBefore, v)

  def pageBreakInside = get[String](Style.pageBreakInside)
  def pageBreakInside_=(v: String) = set(Style.pageBreakInside, v)

  def pagePolicy = get[String](Style.pagePolicy)
  def pagePolicy_=(v: String) = set(Style.pagePolicy, v)

  def perspective = get[String](Style.perspective)
  def perspective_=(v: String) = set(Style.perspective, v)

  def perspectiveOrigin = get[String](Style.perspectiveOrigin)
  def perspectiveOrigin_=(v: String) = set(Style.perspectiveOrigin, v)

  def phonemes = get[String](Style.phonemes)
  def phonemes_=(v: String) = set(Style.phonemes, v)

  def position = get[Position](Style.position)
  def position_=(v: Position) = set(Style.position, v)

  def punctuationTrim = get[String](Style.punctuationTrim)
  def punctuationTrim_=(v: String) = set(Style.punctuationTrim, v)

  def quotes = get[String](Style.quotes)
  def quotes_=(v: String) = set(Style.quotes, v)

  def renderingIntent = get[String](Style.renderingIntent)
  def renderingIntent_=(v: String) = set(Style.renderingIntent, v)

  def resize = get[String](Style.resize)
  def resize_=(v: String) = set(Style.resize, v)

  def rest = get[String](Style.rest)
  def rest_=(v: String) = set(Style.rest, v)

  def restAfter = get[String](Style.restAfter)
  def restAfter_=(v: String) = set(Style.restAfter, v)

  def restBefore = get[String](Style.restBefore)
  def restBefore_=(v: String) = set(Style.restBefore, v)

  def right = get[String](Style.right)
  def right_=(v: String) = set(Style.right, v)

  def rotation = get[String](Style.rotation)
  def rotation_=(v: String) = set(Style.rotation, v)

  def rotationPoint = get[String](Style.rotationPoint)
  def rotationPoint_=(v: String) = set(Style.rotationPoint, v)

  def rubyAlign = get[String](Style.rubyAlign)
  def rubyAlign_=(v: String) = set(Style.rubyAlign, v)

  def rubyOverhang = get[String](Style.rubyOverhang)
  def rubyOverhang_=(v: String) = set(Style.rubyOverhang, v)

  def rubyPosition = get[String](Style.rubyPosition)
  def rubyPosition_=(v: String) = set(Style.rubyPosition, v)

  def rubySpan = get[String](Style.rubySpan)
  def rubySpan_=(v: String) = set(Style.rubySpan, v)

  def size = get[String](Style.size)
  def size_=(v: String) = set(Style.size, v)

  def stringSet = get[String](Style.stringSet)
  def stringset_=(v: String) = set(Style.stringSet, v)

  def tableLayout = get[String](Style.tableLayout)
  def tableLayout_=(v: String) = set(Style.tableLayout, v)

  def target = get[String](Style.target)
  def target_=(v: String) = set(Style.target, v)

  def targetName = get[String](Style.targetName)
  def targetName_=(v: String) = set(Style.targetName, v)

  def targetPosition = get[String](Style.targetPosition)
  def targetPosition_=(v: String) = set(Style.targetPosition, v)

  def targetNew = get[String](Style.targetNew)
  def targetNew_=(v: String) = set(Style.targetNew, v)

  def textAlign = get[Alignment](Style.textAlign)
  def textAlign_=(v: Alignment) = set(Style.textAlign, v)

  def textAlignLast = get[Alignment](Style.textAlignLast)
  def textAlignLast_=(v: Alignment) = set(Style.textAlignLast, v)

  def textDecoration = get[String](Style.textDecoration)
  def textDecoration_=(v: String) = set(Style.textDecoration, v)

  def textHeight = get[String](Style.textHeight)
  def textHeight_=(v: String) = set(Style.textHeight, v)

  def textIndent = get[String](Style.textIndent)
  def textIndent_=(v: String) = set(Style.textIndent, v)

  def textJustify = get[String](Style.textJustify)
  def textJustify_=(v: String) = set(Style.textJustify, v)

  def textOutline = get[String](Style.textOutline)
  def textOutline_=(v: String) = set(Style.textOutline, v)

  def textOverflow = get[String](Style.textOverflow)
  def textOverflow_=(v: String) = set(Style.textOverflow, v)

  def textShadow = get[String](Style.textShadow)
  def textShadow_=(v: String) = set(Style.textShadow, v)

  def textTransform = get[String](Style.textTransform)
  def textTransform_=(v: String) = set(Style.textTransform, v)

  def textWrap = get[String](Style.textWrap)
  def textWrap_=(v: String) = set(Style.textWrap, v)

  def top = get[Length](Style.top)
  def top_=(v: Length) = set(Style.top, v)

  def transform = get[String](Style.transform)
  def transform_=(v: String) = set(Style.transform, v)

  def transformOrigin = get[String](Style.transformOrigin)
  def transformOrigin_=(v: String) = set(Style.transformOrigin, v)

  def transformStyle = get[String](Style.transformStyle)
  def transformStyle_=(v: String) = set(Style.transformStyle, v)

  def transition = get[String](Style.transition)
  def transition_=(v: String) = set(Style.transition, v)

  def transitionDelay = get[String](Style.transitionDelay)
  def transitionDelay_=(v: String) = set(Style.transitionDelay, v)

  def transitionDuration = get[String](Style.transitionDuration)
  def transitionDuration_=(v: String) = set(Style.transitionDuration, v)

  def transitionProperty = get[String](Style.transitionProperty)
  def transitionProperty_=(v: String) = set(Style.transitionProperty, v)

  def transitionTimingFunction = get[String](Style.transitionTimingFunction)
  def transitionTimingFunction_=(v: String) = set(Style.transitionTimingFunction, v)

  def unicodeBidi = get[String](Style.unicodeBidi)
  def unicodeBidi_=(v: String) = set(Style.unicodeBidi, v)

  def verticalAlign = get[Length](Style.verticalAlign)
  def verticalAlign_=(v: Length) = set(Style.verticalAlign, v)

  def visibility = get[String](Style.visibility)
  def visibility_=(v: String) = set(Style.visibility, v)

  def voiceBalance = get[String](Style.voiceBalance)
  def voiceBalance_=(v: String) = set(Style.voiceBalance, v)

  def voiceDuration = get[String](Style.voiceDuration)
  def voiceDuration_=(v: String) = set(Style.voiceDuration, v)

  def voicePitch = get[String](Style.voicePitch)
  def voicePitch_=(v: String) = set(Style.voicePitch, v)

  def voicePitchRange = get[String](Style.voicePitchRange)
  def voicePitchRange_=(v: String) = set(Style.voicePitchRange, v)

  def voiceRate = get[String](Style.voiceRate)
  def voiceRate_=(v: String) = set(Style.voiceRate, v)

  def voiceStress = get[String](Style.voiceStress)
  def voiceStress_=(v: String) = set(Style.voiceStress, v)

  def voiceVolume = get[String](Style.voiceVolume)
  def voiceVolume_=(v: String) = set(Style.voiceVolume, v)

  def whiteSpace = get[WhiteSpace](Style.whiteSpace)
  def whiteSpace_=(v: WhiteSpace) = set(Style.whiteSpace, v)

  def widows = get[String](Style.widows)
  def widows_=(v: String) = set(Style.widows, v)

  def width = get[Length](Style.width)
  def width_=(v: Length) = set(Style.width, v)

  def wordBreak = get[String](Style.wordBreak)
  def wordBreak_=(v: String) = set(Style.wordBreak, v)

  def wordSpacing = get[String](Style.wordSpacing)
  def wordSpacing_=(v: String) = set(Style.wordSpacing, v)

  def wordWrap = get[String](Style.wordWrap)
  def wordWrap_=(v: String) = set(Style.wordWrap, v)

  def zIndex = get[String](Style.zIndex)
  def zIndex_=(v: String) = set(Style.zIndex, v)

  def get[T](style: Style[T]) = value.get[T](style)
  def set[T](style: Style[T], v: T) = {
    StyleSheetProperty.styleLocal.set(style)
    StyleSheetProperty.oldValueLocal.set(value.getOrElse[T](style, null.asInstanceOf[T]).asInstanceOf[AnyRef])
    StyleSheetProperty.newValueLocal.set(v.asInstanceOf[AnyRef])
    try {
      value = value.set[T](style, v)
    } finally {
      StyleSheetProperty.styleLocal.remove()
      StyleSheetProperty.oldValueLocal.remove()
      StyleSheetProperty.newValueLocal.remove()
    }
  }

  change.on {
    case evt => {
      val style = StyleSheetProperty.styleLocal.get()
      val oldStyleValue = StyleSheetProperty.oldValueLocal.get()
      val newStyleValue = StyleSheetProperty.newValueLocal.get()
      val event = new StylePropertyChangeEvent(evt.newValue, style, oldStyleValue, newStyleValue, this, evt.oldValue, evt.newValue)
      styleChange.fire(event)
    }
  }
}

object StyleSheetProperty {
  private val styleLocal = new ThreadLocal[Style[_]]
  private val oldValueLocal = new ThreadLocal[AnyRef]
  private val newValueLocal = new ThreadLocal[AnyRef]
}