import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import io.github.alexzhirkevich.cupertino.Surface

@Composable
actual fun BaseSurface(
    modifier: Modifier,
    content: @Composable () -> Unit,
) {
    Surface(modifier = modifier, content = content)
}
