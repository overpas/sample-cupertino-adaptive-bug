import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
actual fun testBgColor(): Color {
    return MaterialTheme.colorScheme.background
}
