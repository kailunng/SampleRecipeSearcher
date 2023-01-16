package com.ngkai.recipesearcher.ui.theme

import androidx.compose.material.Colors
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color

private val PR120 = Color(0xFFC23100)
private val PR110 = Color(0xFFD63600)
private val PR100 = Color(0xFFFC5400)
private val PR70 = Color(0xFFFD7633)
private val PR10 = Color(0xFFFEEDE5)
private val S110 = Color(0xFFD0CCBF)
private val S100 = Color(0xFFEEE9DD)
private val S100alpha50 = S100.copy(alpha = 0.5f)
private val S70 = Color(0xFFF9F8F4)
private val S10 = Color(0xFFFDFCFB)
private val T150 = Color(0xFF296566)
private val T130 = Color(0xFF398D8F)
private val T100 = Color(0xFF52C9CC)
private val T70 = Color(0xFFA9E4E6)
private val T10 = Color(0xFFEEFAFA)
private val NA120 = Color(0xFF124D5F)
private val NA100 = Color(0xFF176077)
private val NA70 = Color(0xFF5D90A0)
private val NA10 = Color(0xFFE8EFF1)
private val Y110 = Color(0xFF8C7300)
private val Y100 = Color(0xFFFFD10A)
private val Y70 = Color(0xFFFFDE53)
private val Y10 = Color(0xFFFFFBED)
private val L100 = Color(0xFF9D87D2)
private val BU100 = Color(0xFFA61D13)
private val G110 = Color(0xFF1E8830)
private val G100 = Color(0xFF2DCB48)
private val G70 = Color(0xFF6CDA7E)
private val G10 = Color(0xFFE5F4EA)
private val O110 = Color(0xFFC55400)
private val O100 = Color(0xFFFC5400)
private val O70 = Color(0xFFFD7633)
private val O10 = Color(0xFFFFF0E5)
private val R110 = Color(0xFFE6250B)
private val R100 = Color(0xFFF43319)
private val R70 = Color(0xFFF7705E)
private val R10 = Color(0xFFFDEAE8)
private val N100 = Color(0xFF000000)
private val N95 = Color(0xFF0D0D0D)
private val N90 = Color(0xFF1A1A1A)
private val N85 = Color(0xFF2A2A2A)
private val N80 = Color(0xFF333333)
private val N75 = Color(0xFF404040)
private val N70 = Color(0xFF4D4D4D)
private val N65 = Color(0xFF595959)
private val N60 = Color(0xFF666666)
private val N55 = Color(0xFF737373)
private val N50 = Color(0xFF808080)
private val N45 = Color(0xFF8C8C8C)
private val N40 = Color(0xFF999999)
private val N35 = Color(0xFFA6A6A6)
private val N30 = Color(0xFFB3B3B3)
private val N25 = Color(0xFFBFBFBF)
private val N20 = Color(0xFFCCCCCC)
private val N15 = Color(0xFFD9D9D9)
private val N10 = Color(0xFFE6E6E6)
private val N5 = Color(0xFFF2F2F2)
private val N0 = Color(0xFFFFFFFF)

class MyColorPalette (
    textPrimary: Color,
    textSecondary: Color,
    textTertiary: Color,
    textQuaternary: Color,
    textQuinary: Color,
    textPrimaryInverse: Color,
    textSecondaryInverse: Color,
    textTertiaryInverse: Color,
    textLink: Color,
    textLinkHover: Color,
    textWarning: Color,
    textNegative: Color,
    textPositive: Color,
    buttonPrimary: Color,
    buttonPrimaryPressed: Color,
    buttonSecondaryEnabled: Color,
    buttonSecondaryPressed: Color,
    buttonTextPressed: Color,
    buttonDisabled: Color,
    buttonBorder: Color,
    buttonBorderPressed: Color,
    buttonDangerEnabled: Color,
    buttonDangerPressed: Color,
    buttonToggleSelected: Color,
    buttonToggleUnselected: Color,
    buttonToggleBorder: Color,
    iconEnabled: Color,
    iconActive: Color,
    iconDisabled: Color,
    iconInverse: Color,
    iconTitle: Color,
    backgroundAfternoon: Color,
    backgroundMorning: Color,
    backgroundEvening: Color,
    backgroundPrimary: Color,
    backgroundSecondary: Color,
    backgroundDark: Color,
    backgroundWarning: Color,
    backgroundInverse: Color,
    cardBorder: Color,
    cardBorderSecondary: Color,
    radioUnselectedBorder: Color,
    radioSelectedBorder: Color,
    barChart: Color,
    divider: Color,
    progressPrimary: Color,
    progressBackground: Color,
    progressSecondary: Color,
    progressTertiary: Color,
    switchChecked: Color,
    switchUnchecked: Color,
    materialColors: Colors,
    isLight: Boolean
) {
    var textPrimary by mutableStateOf(textPrimary)
        private set
    var textSecondary by mutableStateOf(textSecondary)
        private set
    var textTertiary by mutableStateOf(textTertiary)
        private set
    var textQuaternary by mutableStateOf(textQuaternary)
        internal set
    var textQuinary by mutableStateOf(textQuinary)
        internal set
    var textPrimaryInverse by mutableStateOf(textPrimaryInverse)
        internal set
    var textSecondaryInverse by mutableStateOf(textSecondaryInverse)
        internal set
    var textTertiaryInverse by mutableStateOf(textTertiaryInverse)
        internal set
    var textLink by mutableStateOf(textLink)
        internal set
    var textLinkHover by mutableStateOf(textLinkHover)
        internal set
    var textWarning by mutableStateOf(textWarning)
        internal set
    var textNegative by mutableStateOf(textNegative)
        internal set
    var textPositive by mutableStateOf(textPositive)
        internal set
    var buttonPrimary by mutableStateOf(buttonPrimary)
        internal set
    var buttonPrimaryPressed by mutableStateOf(buttonPrimaryPressed)
        internal set
    var buttonSecondaryEnabled by mutableStateOf(buttonSecondaryEnabled)
        internal set
    var buttonSecondaryPressed by mutableStateOf(buttonSecondaryPressed)
        internal set
    var buttonTextPressed by mutableStateOf(buttonTextPressed)
        internal set
    var buttonDisabled by mutableStateOf(buttonDisabled)
        internal set
    var buttonBorder by mutableStateOf(buttonBorder)
        internal set
    var buttonBorderPressed by mutableStateOf(buttonBorderPressed)
        internal set
    var buttonDangerEnabled by mutableStateOf(buttonDangerEnabled)
        internal set
    var buttonDangerPressed by mutableStateOf(buttonDangerPressed)
        internal set
    var buttonToggleSelected by mutableStateOf(buttonToggleSelected)
        internal set
    var buttonToggleUnselected by mutableStateOf(buttonToggleUnselected)
        internal set
    var buttonToggleBorder by mutableStateOf(buttonToggleBorder)
        internal set
    var iconEnabled by mutableStateOf(iconEnabled)
        internal set
    var iconActive by mutableStateOf(iconActive)
        internal set
    var iconDisabled by mutableStateOf(iconDisabled)
        internal set
    var iconInverse by mutableStateOf(iconInverse)
        internal set
    var iconTitle by mutableStateOf(iconTitle)
        internal set
    var backgroundAfternoon by mutableStateOf(backgroundAfternoon)
        internal set
    var backgroundMorning by mutableStateOf(backgroundMorning)
        internal set
    var backgroundEvening by mutableStateOf(backgroundEvening)
        internal set
    var backgroundPrimary by mutableStateOf(backgroundPrimary)
        internal set
    var backgroundSecondary by mutableStateOf(backgroundSecondary)
        internal set
    var backgroundDark by mutableStateOf(backgroundDark)
        internal set
    var backgroundWarning by mutableStateOf(backgroundWarning)
        internal set
    var backgroundInverse by mutableStateOf(backgroundInverse)
        internal set
    var cardBorder by mutableStateOf(cardBorder)
        internal set
    var cardBorderSecondary by mutableStateOf(cardBorderSecondary)
        internal set
    var radioUnselectedBorder by mutableStateOf(radioUnselectedBorder)
        internal set
    var radioSelectedBorder by mutableStateOf(radioSelectedBorder)
        internal set
    var barChart by mutableStateOf(barChart)
        internal set
    var divider by mutableStateOf(divider)
        internal set
    var progressPrimary by mutableStateOf(progressPrimary)
        internal set
    var progressBackground by mutableStateOf(progressBackground)
        internal set
    var progressSecondary by mutableStateOf(progressSecondary)
        internal set
    var progressTertiary by mutableStateOf(progressTertiary)
        internal set
    var switchChecked by mutableStateOf(switchChecked)
        internal set
    var switchUnchecked by mutableStateOf(switchUnchecked)
        internal set
    var materialColors by mutableStateOf(materialColors)
        internal set
    var isLight by mutableStateOf(isLight)
        internal set

    fun copy(
        textPrimary: Color = this.textPrimary,
        textSecondary: Color = this.textSecondary,
        textTertiary: Color = this.textTertiary,
        textQuaternary: Color = this.textQuaternary,
        textQuinary: Color = this.textQuinary,
        textSecondaryInverse: Color = this.textSecondaryInverse,
        textTertiaryInverse: Color = this.textTertiaryInverse,
        textLink: Color = this.textLink,
        textLinkHover: Color = this.textLinkHover,
        textWarning: Color = this.textWarning,
        textNegative: Color = this.textNegative,
        textPositive: Color = this.textPositive,
        buttonPrimary: Color = this.buttonPrimary,
        buttonPrimaryPressed: Color = this.buttonPrimaryPressed,
        buttonSecondaryEnabled: Color = this.buttonSecondaryEnabled,
        buttonSecondaryPressed: Color = this.buttonSecondaryPressed,
        buttonTextPressed: Color = this.buttonTextPressed,
        buttonDisabled: Color = this.buttonDisabled,
        buttonBorder: Color = this.buttonBorder,
        buttonBorderPressed: Color = this.buttonBorderPressed,
        buttonDangerEnabled: Color = this.buttonDangerEnabled,
        buttonDangerPressed: Color = this.buttonDangerPressed,
        buttonToggleSelected: Color = this.buttonToggleSelected,
        buttonToggleUnselected: Color = this.buttonToggleUnselected,
        buttonToggleBorder: Color = this.buttonToggleBorder,
        iconEnabled: Color = this.iconEnabled,
        iconActive: Color = this.iconActive,
        iconDisabled: Color = this.iconDisabled,
        iconInverse: Color = this.iconInverse,
        iconTitle: Color = this.iconTitle,
        backgroundAfternoon: Color = this.backgroundAfternoon,
        backgroundMorning: Color = this.backgroundMorning,
        backgroundEvening: Color = this.backgroundEvening,
        backgroundPrimary: Color = this.backgroundPrimary,
        backgroundSecondary: Color = this.backgroundSecondary,
        backgroundDark: Color = this.backgroundDark,
        backgroundWarning: Color = this.backgroundWarning,
        backgroundInverse: Color = this.backgroundInverse,
        cardBorder: Color = this.cardBorder,
        cardBorderSecondary: Color = this.cardBorderSecondary,
        radioUnselectedBorder: Color = this.radioUnselectedBorder,
        radioSelectedBorder: Color = this.radioSelectedBorder,
        barChart: Color = this.barChart,
        divider: Color = this.divider,
        progressPrimary: Color = this.progressPrimary,
        progressBackground: Color = this.progressBackground,
        progressSecondary: Color = this.progressSecondary,
        progressTertiary: Color = this.progressTertiary,
        switchChecked: Color = this.switchChecked,
        switchUnchecked: Color = this.switchUnchecked,
        materialColors: Colors = this.materialColors,
        isLight: Boolean = this.isLight
    ): MyColorPalette = MyColorPalette(
        textPrimary,
        textSecondary,
        textTertiary,
        textQuaternary,
        textQuinary,
        textPrimaryInverse,
        textSecondaryInverse,
        textTertiaryInverse,
        textLink,
        textLinkHover,
        textWarning,
        textNegative,
        textPositive,
        buttonPrimary,
        buttonPrimaryPressed,
        buttonSecondaryEnabled,
        buttonSecondaryPressed,
        buttonTextPressed,
        buttonDisabled,
        buttonBorder,
        buttonBorderPressed,
        buttonDangerEnabled,
        buttonDangerPressed,
        buttonToggleSelected,
        buttonToggleUnselected,
        buttonToggleBorder,
        iconEnabled,
        iconActive,
        iconDisabled,
        iconInverse,
        iconTitle,
        backgroundAfternoon,
        backgroundMorning,
        backgroundEvening,
        backgroundPrimary,
        backgroundSecondary,
        backgroundDark,
        backgroundWarning,
        backgroundInverse,
        cardBorder,
        cardBorderSecondary,
        radioUnselectedBorder,
        radioSelectedBorder,
        barChart,
        divider,
        progressPrimary,
        progressBackground,
        progressSecondary,
        progressTertiary,
        switchChecked,
        switchUnchecked,
        materialColors,
        isLight
    )

    fun updateColorsFrom(other: MyColorPalette) {
        textPrimary = other.textPrimary
        textSecondary = other.textSecondary
        textTertiary = other.textTertiary
        textQuaternary = other.textQuaternary
        textQuinary = other.textQuinary
        textPrimaryInverse = other.textPrimaryInverse
        textSecondaryInverse = other.textSecondaryInverse
        textTertiaryInverse = other.textTertiaryInverse
        textLink = other.textLink
        textLinkHover = other.textLinkHover
        textWarning = other.textWarning
        textNegative = other.textNegative
        textPositive = other.textPositive
        buttonPrimary = other.buttonPrimary
        buttonPrimaryPressed = other.buttonPrimaryPressed
        buttonSecondaryEnabled = other.buttonSecondaryEnabled
        buttonSecondaryPressed = other.buttonSecondaryPressed
        buttonTextPressed = other.buttonTextPressed
        buttonDisabled = other.buttonDisabled
        buttonBorder = other.buttonBorder
        buttonBorderPressed = other.buttonBorderPressed
        buttonDangerEnabled = other.buttonDangerEnabled
        buttonDangerPressed = other.buttonDangerPressed
        buttonToggleSelected = other.buttonToggleSelected
        buttonToggleUnselected = other.buttonToggleUnselected
        buttonToggleBorder = other.buttonToggleBorder
        iconEnabled = other.iconEnabled
        iconActive = other.iconActive
        iconDisabled = other.iconDisabled
        iconInverse = other.iconInverse
        iconTitle = other.iconTitle
        backgroundAfternoon = other.backgroundAfternoon
        backgroundMorning = other.backgroundMorning
        backgroundEvening = other.backgroundEvening
        backgroundPrimary = other.backgroundPrimary
        backgroundSecondary = other.backgroundSecondary
        backgroundDark = other.backgroundDark
        backgroundWarning = other.backgroundWarning
        backgroundInverse = other.backgroundInverse
        cardBorder = other.cardBorder
        cardBorderSecondary = other.cardBorderSecondary
        radioUnselectedBorder = other.radioUnselectedBorder
        radioSelectedBorder = other.radioSelectedBorder
        barChart = other.barChart
        divider = other.divider
        progressPrimary = other.progressPrimary
        progressBackground = other.progressBackground
        progressSecondary = other.progressSecondary
        progressTertiary = other.progressTertiary
        switchChecked = other.switchChecked
        switchUnchecked = other.switchUnchecked
        materialColors = other.materialColors
        isLight = other.isLight
    }
}

fun lightColorPalette(
    textPrimary: Color = N90,
    textSecondary: Color = N80,
    textTertiary: Color = N60,
    textQuaternary: Color = T150,
    textQuinary: Color = NA100,
    textPrimaryInverse: Color = N0,
    textSecondaryInverse: Color = N5,
    textTertiaryInverse: Color = N10,
    textLink: Color = T130,
    textLinkHover: Color = T150,
    textWarning: Color = PR110,
    textNegative: Color = R110,
    textPositive: Color = G110,
    buttonPrimary: Color = PR100,
    buttonPrimaryPressed: Color = PR110,
    buttonSecondaryEnabled: Color = N0,
    buttonSecondaryPressed: Color = N90,
    buttonTextPressed: Color = N0,
    buttonDisabled: Color = N60,
    buttonBorder: Color = N40,
    buttonBorderPressed: Color = N90,
    buttonDangerEnabled: Color = R100,
    buttonDangerPressed: Color = PR110,
    buttonToggleSelected: Color = N0,
    buttonToggleUnselected: Color = N5,
    buttonToggleBorder: Color = N10,
    iconEnabled: Color = N90,
    iconActive: Color = PR100,
    iconDisabled: Color = N60,
    iconInverse: Color = N0,
    iconTitle: Color = NA100,
    backgroundAfternoon: Color = T70,
    backgroundMorning: Color = S100alpha50,
    backgroundEvening: Color = NA120,
    backgroundPrimary: Color = PR100,
    backgroundSecondary: Color = S100,
    backgroundDark: Color = NA100,
    backgroundWarning: Color = Y100,
    backgroundInverse: Color = N0,
    cardBorder: Color = S100,
    cardBorderSecondary: Color = N10,
    radioUnselectedBorder: Color = N40,
    radioSelectedBorder: Color = PR100,
    barChart: Color = T100,
    divider: Color = N10,
    progressPrimary: Color = PR100,
    progressBackground: Color = N10,
    progressSecondary: Color = S110,
    progressTertiary: Color = T100,
    switchChecked: Color = G100,
    switchUnchecked: Color = S100,
    materialColors: Colors = darkColors(
        primary = PR100,
        background = PR100,
        surface = PR100
    )
): MyColorPalette = MyColorPalette(
    textPrimary = textPrimary,
    textSecondary = textSecondary,
    textTertiary = textTertiary,
    textQuaternary = textQuaternary,
    textQuinary = textQuinary,
    textPrimaryInverse = textPrimaryInverse,
    textSecondaryInverse = textSecondaryInverse,
    textTertiaryInverse = textTertiaryInverse,
    textLink = textLink,
    textLinkHover = textLinkHover,
    textWarning = textWarning,
    textNegative = textNegative,
    textPositive = textPositive,
    buttonPrimary = buttonPrimary,
    buttonPrimaryPressed = buttonPrimaryPressed,
    buttonSecondaryEnabled = buttonSecondaryEnabled,
    buttonSecondaryPressed = buttonSecondaryPressed,
    buttonTextPressed = buttonTextPressed,
    buttonDisabled = buttonDisabled,
    buttonBorder = buttonBorder,
    buttonBorderPressed = buttonBorderPressed,
    buttonDangerEnabled = buttonDangerEnabled,
    buttonDangerPressed = buttonDangerPressed,
    buttonToggleSelected = buttonToggleSelected,
    buttonToggleUnselected = buttonToggleUnselected,
    buttonToggleBorder = buttonToggleBorder,
    iconEnabled = iconEnabled,
    iconActive = iconActive,
    iconDisabled = iconDisabled,
    iconInverse = iconInverse,
    iconTitle = iconTitle,
    backgroundAfternoon = backgroundAfternoon,
    backgroundMorning = backgroundMorning,
    backgroundEvening = backgroundEvening,
    backgroundPrimary = backgroundPrimary,
    backgroundSecondary = backgroundSecondary,
    backgroundDark = backgroundDark,
    backgroundWarning = backgroundWarning,
    backgroundInverse = backgroundInverse,
    cardBorder = cardBorder,
    cardBorderSecondary = cardBorderSecondary,
    radioUnselectedBorder = radioUnselectedBorder,
    radioSelectedBorder = radioSelectedBorder,
    barChart = barChart,
    divider = divider,
    progressPrimary = progressPrimary,
    progressBackground = progressBackground,
    progressSecondary = progressSecondary,
    progressTertiary = progressTertiary,
    switchChecked = switchChecked,
    switchUnchecked = switchUnchecked,
    materialColors = materialColors,
    isLight = true
)

fun darkColorPalette(
    textPrimary: Color = N90,
    textSecondary: Color = N80,
    textTertiary: Color = N60,
    textQuaternary: Color = T150,
    textQuinary: Color = NA100,
    textPrimaryInverse: Color = N0,
    textSecondaryInverse: Color = N5,
    textTertiaryInverse: Color = N10,
    textLink: Color = T130,
    textLinkHover: Color = T150,
    textWarning: Color = PR110,
    textNegative: Color = R110,
    textPositive: Color = G110,
    buttonPrimary: Color = PR100,
    buttonPrimaryPressed: Color = PR110,
    buttonSecondaryEnabled: Color = N0,
    buttonSecondaryPressed: Color = N90,
    buttonTextPressed: Color = N0,
    buttonDisabled: Color = N60,
    buttonBorder: Color = N40,
    buttonBorderPressed: Color = N90,
    buttonDangerEnabled: Color = R100,
    buttonDangerPressed: Color = PR110,
    buttonToggleSelected: Color = N0,
    buttonToggleUnselected: Color = N5,
    buttonToggleBorder: Color = N10,
    iconEnabled: Color = N90,
    iconActive: Color = PR100,
    iconDisabled: Color = N60,
    iconInverse: Color = N0,
    iconTitle: Color = NA100,
    backgroundAfternoon: Color = T70,
    backgroundMorning: Color = S100alpha50,
    backgroundEvening: Color = NA120,
    backgroundPrimary: Color = PR100,
    backgroundSecondary: Color = S100,
    backgroundDark: Color = NA100,
    backgroundWarning: Color = Y100,
    backgroundInverse: Color = N0,
    cardBorder: Color = S100,
    cardBorderSecondary: Color = N10,
    radioUnselectedBorder: Color = N40,
    radioSelectedBorder: Color = PR100,
    barChart: Color = T100,
    divider: Color = N10,
    progressPrimary: Color = PR100,
    progressBackground: Color = N10,
    progressSecondary: Color = S110,
    progressTertiary: Color = T100,
    switchChecked: Color = G100,
    switchUnchecked: Color = S100,
    materialColors: Colors = lightColors(
        primary = PR100,
        background = PR100,
        surface = PR100
    )
): MyColorPalette = MyColorPalette(
    textPrimary = textPrimary,
    textSecondary = textSecondary,
    textTertiary = textTertiary,
    textQuaternary = textQuaternary,
    textQuinary = textQuinary,
    textPrimaryInverse = textPrimaryInverse,
    textSecondaryInverse = textSecondaryInverse,
    textTertiaryInverse = textTertiaryInverse,
    textLink = textLink,
    textLinkHover = textLinkHover,
    textWarning = textWarning,
    textNegative = textNegative,
    textPositive = textPositive,
    buttonPrimary = buttonPrimary,
    buttonPrimaryPressed = buttonPrimaryPressed,
    buttonSecondaryEnabled = buttonSecondaryEnabled,
    buttonSecondaryPressed = buttonSecondaryPressed,
    buttonTextPressed = buttonTextPressed,
    buttonDisabled = buttonDisabled,
    buttonBorder = buttonBorder,
    buttonBorderPressed = buttonBorderPressed,
    buttonDangerEnabled = buttonDangerEnabled,
    buttonDangerPressed = buttonDangerPressed,
    buttonToggleSelected = buttonToggleSelected,
    buttonToggleUnselected = buttonToggleUnselected,
    buttonToggleBorder = buttonToggleBorder,
    iconEnabled = iconEnabled,
    iconActive = iconActive,
    iconDisabled = iconDisabled,
    iconInverse = iconInverse,
    iconTitle = iconTitle,
    backgroundAfternoon = backgroundAfternoon,
    backgroundMorning = backgroundMorning,
    backgroundEvening = backgroundEvening,
    backgroundPrimary = backgroundPrimary,
    backgroundSecondary = backgroundSecondary,
    backgroundDark = backgroundDark,
    backgroundWarning = backgroundWarning,
    backgroundInverse = backgroundInverse,
    cardBorder = cardBorder,
    cardBorderSecondary = cardBorderSecondary,
    radioUnselectedBorder = radioUnselectedBorder,
    radioSelectedBorder = radioSelectedBorder,
    barChart = barChart,
    divider = divider,
    progressPrimary = progressPrimary,
    progressBackground = progressBackground,
    progressSecondary = progressSecondary,
    progressTertiary = progressTertiary,
    switchChecked = switchChecked,
    switchUnchecked = switchUnchecked,
    materialColors = materialColors,
    isLight = false
)