import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import io.github.alexzhirkevich.cupertino.adaptive.AdaptiveTheme
import io.github.alexzhirkevich.cupertino.adaptive.ExperimentalAdaptiveApi
import io.github.alexzhirkevich.cupertino.adaptive.Theme
import io.github.alexzhirkevich.cupertino.theme.CupertinoTheme

expect fun getTheme(): Theme

@OptIn(ExperimentalAdaptiveApi::class)
@Composable
fun AppTheme(
    isDarkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit,
) {
    val colorScheme = if (isDarkTheme) {
        darkColorScheme(background = Color.Red)
    } else {
        lightColorScheme(background = Color.Red)
    }
    val cupertinoColorScheme = if (isDarkTheme) {
        io.github.alexzhirkevich.cupertino.theme.darkColorScheme(systemBackground = Color.Green)
    } else {
        io.github.alexzhirkevich.cupertino.theme.lightColorScheme(systemBackground = Color.Green)
    }
    AdaptiveTheme(
        target = getTheme(),
        material = { theContent ->
            MaterialTheme(
                colorScheme = colorScheme,
                content = theContent,
            )
        },
        cupertino = { theContent ->
            CupertinoTheme(
                colorScheme = cupertinoColorScheme,
                content = theContent,
            )
        },
        content = content,
    )
}
