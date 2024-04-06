import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
actual fun BaseSurface(
    modifier: Modifier,
    content: @Composable () -> Unit,
) {
    Surface(color = MaterialTheme.colorScheme.background, modifier = modifier, content = content)
}
