package dev.yasan.metro.tehran.ui.composable

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.colorResource
import com.google.accompanist.navigation.material.ExperimentalMaterialNavigationApi
import dev.yasan.metro.tehran.R
import dev.yasan.metro.tehran.ui.navigation.NavGraph
import dev.yasan.metro.tehran.ui.theme.TehroTheme

/**
 * Top level Composable function of Tehro.
 *
 * @see NavGraph
 */
@ExperimentalMaterialNavigationApi
@ExperimentalAnimationApi
@Composable
fun TehroApp() {
    TehroTheme {
        Surface(color = colorResource(id = R.color.layer_midground)) {
            NavGraph()
        }
    }
}
