package com.ngkai.recipesearcher.ui.components.buttons

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.ngkai.recipesearcher.R
import com.ngkai.recipesearcher.ui.theme.MyTheme

@Composable
fun PrimaryButton(
    modifier: Modifier,
    onClick: () -> Unit,
    text: String,
    leftIcon: Int? = null,
    leftIconContentDescription: String? = null,
    rightIcon: Int? = null,
    rightIconContentDescription: String? = null,
    enabled: Boolean = true
) {
    val normalButtonColor = ButtonDefaults.buttonColors(
        backgroundColor = MyTheme.colors.buttonPrimary,
        contentColor = MyTheme.colors.textPrimaryInverse,
        disabledBackgroundColor = MyTheme.colors.buttonDisabled,
        disabledContentColor = MyTheme.colors.textPrimaryInverse
    )

    val pressedButtonColor = ButtonDefaults.buttonColors(
        backgroundColor = MyTheme.colors.buttonPrimaryPressed,
        contentColor = MyTheme.colors.textPrimaryInverse
    )

    val buttonElevation = ButtonDefaults.elevation(
        defaultElevation = MyTheme.sizes.zeroDp,
        disabledElevation = MyTheme.sizes.zeroDp,
        pressedElevation = MyTheme.sizes.zeroDp
    )

    val interactionSource = remember { MutableInteractionSource() }
    val isPressed by interactionSource.collectIsPressedAsState()
    val color = if (isPressed) pressedButtonColor else normalButtonColor
    val scale = animateFloatAsState(if (isPressed) 0.95f else 1f)
    val leftPadding = if (leftIcon == null) MyTheme.sizes.twelveDp else MyTheme.sizes.eightDp
    val rightPadding =  if (rightIcon == null) MyTheme.sizes.twelveDp else MyTheme.sizes.eightDp

    Button(
        onClick = onClick,
        modifier = modifier
            .scale(scale.value),
        interactionSource = interactionSource,
        colors = color,
        elevation = buttonElevation,
        enabled = enabled
    ) {
        if (leftIcon != null) {
            Icon(
                painter = painterResource(id = leftIcon),
                modifier = Modifier
                    .size(MyTheme.sizes.sixteenDp),
                contentDescription = leftIconContentDescription,
                tint = MyTheme.colors.iconInverse
            )
        }
        Text(
            modifier = Modifier.padding(leftPadding, MyTheme.sizes.twelveDp, rightPadding, MyTheme.sizes.twelveDp),
            text = text,
            style = MyTheme.typography.body1Strong,
            color = MyTheme.colors.textPrimaryInverse
        )
        if (rightIcon != null) {
            Icon(
                painter = painterResource(id = rightIcon),
                modifier = Modifier
                    .padding(
                        MyTheme.sizes.zeroDp,
                        MyTheme.sizes.twelveDp,
                        MyTheme.sizes.twentyFourDp,
                        MyTheme.sizes.twelveDp
                    )
                    .size(MyTheme.sizes.sixteenDp),
                contentDescription = rightIconContentDescription,
                tint = MyTheme.colors.iconInverse
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PrimaryButtonPreview() {
    PrimaryButton(
        modifier = Modifier
            .padding(
                MyTheme.sizes.zeroDp,
                MyTheme.sizes.sixteenDp,
                MyTheme.sizes.zeroDp,
                MyTheme.sizes.sixteenDp
            ),
        onClick = {
        },
        text = stringResource(id = R.string.app_name)
    )
}
