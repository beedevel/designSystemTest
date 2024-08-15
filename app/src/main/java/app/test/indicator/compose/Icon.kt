package app.test.indicator.compose

import androidx.appcompat.content.res.AppCompatResources
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.dp
import androidx.core.graphics.drawable.toBitmap

@Composable
internal fun ComposeIcon(
    modifier: Modifier,
    imageRes: Int,
    imageWidth: Int,
) {
    Box(
        modifier = modifier
            .wrapContentSize()
    ) {
        val itemDrawable = AppCompatResources.getDrawable(
            LocalContext.current,
            imageRes,
        )
        val itemBitmap = itemDrawable?.toBitmap()
        val image = itemBitmap?.asImageBitmap() ?: ImageBitmap(height = 0, width = 0)

        Canvas(
            modifier = Modifier
                .width(imageWidth.dp)
                .aspectRatio(image.width.toFloat() / image.height.toFloat())
                .clipToBounds()
                .padding(10.dp),
        ) {
            val canvasWidth = size.width.toInt()
            val canvasHeight = size.height.toInt()
            drawImage(
                image = image,
                dstSize = IntSize(canvasWidth, canvasHeight)
            )
        }
    }
}