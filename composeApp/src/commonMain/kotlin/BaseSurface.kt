import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
expect fun BaseSurface(modifier: Modifier = Modifier, content: @Composable () -> Unit)
