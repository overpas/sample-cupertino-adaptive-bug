import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import io.github.alexzhirkevich.cupertino.adaptive.AdaptiveButton
import io.github.alexzhirkevich.cupertino.adaptive.AdaptiveDivider
import io.github.alexzhirkevich.cupertino.adaptive.AdaptiveIconButton
import io.github.alexzhirkevich.cupertino.adaptive.AdaptiveScaffold
import io.github.alexzhirkevich.cupertino.adaptive.AdaptiveTopAppBar
import io.github.alexzhirkevich.cupertino.adaptive.ExperimentalAdaptiveApi
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview
import sample_cupertino_adaptive_bug.composeapp.generated.resources.Res
import sample_cupertino_adaptive_bug.composeapp.generated.resources.compose_multiplatform

@OptIn(ExperimentalAdaptiveApi::class, ExperimentalResourceApi::class)
@Composable
@Preview
fun App() {
    AppTheme {
        BaseSurface(modifier = Modifier.fillMaxSize()) {
            AdaptiveScaffold(
                topBar = {
                    AdaptiveTopAppBar(
                        title = {
                            Text("Title")
                        },
                        actions = {
                            AdaptiveIconButton(
                                onClick = {},
                            ) {
                                Icon(
                                    painter = painterResource(Res.drawable.compose_multiplatform),
                                    contentDescription = "compose multiplatform"
                                )
                            }
                        }
                    )
                }
            ) { paddingValues ->
                val items by remember { mutableStateOf(listOf(1, 2, 3, 4, 5)) }
                LazyColumn(modifier = Modifier.padding(paddingValues)) {
                    itemsIndexed(items) { index, item ->
                        Surface {
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.SpaceBetween,
                                modifier = Modifier.fillMaxSize(),
                            ) {
                                Text("Item $item")
                                AdaptiveButton(
                                    onClick = {},
                                ) {
                                    Text("Item $item")
                                }
                            }
                        }
                        if (index < items.lastIndex) {
                            AdaptiveDivider()
                        }
                    }
                    item {
                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier.fillMaxWidth()
                                .background(color = testBgColor())
                        ) {
                            Text("Test background color")
                        }
                    }
                }
            }
        }
    }
}