package dev.yasan.metro.tehran.ui.composable.common.teh

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.sharp.Info
import androidx.compose.material.icons.sharp.Refresh
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import dev.yasan.metro.tehran.R
import dev.yasan.metro.tehran.ui.theme.*
import dev.yasan.metro.tehran.util.LocaleHelper
import dev.yasan.metro.tehran.util.extension.getTextOnColor

/**
 * Tehro-themed button.
 * All buttons must use this instead of using the generic button composable.
 *
 * @param title The button's title text.
 * @param icon The icon shown on the start of the button.
 */
@Composable
fun TehButton(
    modifier: Modifier = Modifier,
    title: String,
    icon: ImageVector,
    onClick: () -> Unit,
    fontFamily: FontFamily = LocaleHelper.properFontFamily,
) {
    Row(
        modifier = modifier
            .background(color = themeAccent)
            .clickable {
                onClick()
            }
            .padding(grid(2)),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            modifier = Modifier,
            imageVector = icon,
            contentDescription = null,
            tint = onThemeAccent,
        )
        Spacer(modifier = Modifier.requiredWidth(grid(0.5f)))
        Text(
            modifier = Modifier,
            text = title.uppercase(),
            fontFamily = fontFamily,
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
            color = themeAccent.getTextOnColor(),
            textAlign = TextAlign.Center
        )
    }
}

@Preview(
    name = "Try Again Button [en]",
    group = "Try Again Button",
    locale = "en"
)
@Composable
private fun TehButtonPreviewEn() {
    Surface(color = colorResource(id = R.color.layer_midground)) {
        TehButton(
            title = stringResource(id = R.string.try_again),
            icon = TehroIcons.Refresh,
            onClick = {},
            fontFamily = rubikFamily,
        )
    }
}

@Preview(
    name = "Try Again Button [fa]",
    group = "Try Again Button",
    locale = "fa"
)
@Composable
private fun TehButtonPreviewFa() {
    Surface(color = colorResource(id = R.color.layer_midground)) {
        TehButton(
            title = stringResource(id = R.string.try_again),
            icon = TehroIcons.Refresh,
            onClick = {},
            fontFamily = vazirFamily,
        )
    }
}

@Preview(
    name = "About Button [en]",
    group = "About Button",
    locale = "en"
)
@Composable
private fun TehButtonPreviewEn2() {
    Surface(color = colorResource(id = R.color.layer_midground)) {
        TehButton(
            title = stringResource(id = R.string.about),
            icon = TehroIcons.Info,
            onClick = {},
            fontFamily = rubikFamily,
        )
    }
}

@Preview(
    name = "About Button [fa]",
    group = "About Button",
    locale = "fa"
)
@Composable
private fun TehButtonPreviewFa2() {
    Surface(color = colorResource(id = R.color.layer_midground)) {
        TehButton(
            title = stringResource(id = R.string.about),
            icon = TehroIcons.Info,
            onClick = {},
            fontFamily = vazirFamily,
        )
    }
}
