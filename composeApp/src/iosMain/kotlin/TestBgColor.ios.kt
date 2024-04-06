import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import io.github.alexzhirkevich.cupertino.theme.CupertinoTheme

@Composable
actual fun testBgColor(): Color {
    return CupertinoTheme.colorScheme.systemBackground
}
