package dev.yasan.metro.tehran.ui.composable.common.teh

import androidx.compose.foundation.layout.padding
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import dev.yasan.metro.tehran.R
import dev.yasan.metro.tehran.ui.theme.grid

/**
 * Tehro-themed progress indicator.
 * The generic progress indicator composable functions must never be used
 * as all progresses should look the same in the app.
 */
@Composable
fun TehProgress(modifier: Modifier = Modifier) {
    CircularProgressIndicator(
        modifier = modifier.padding(grid(2)),
        color = colorResource(id = R.color.text_desc),
    )
}

@Preview
@Composable
private fun TehProgressPreview() {
    Surface(color = colorResource(id = R.color.layer_midground)) {
        TehProgress()
    }
}
