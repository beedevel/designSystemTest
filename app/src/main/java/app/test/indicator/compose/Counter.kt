package app.test.indicator.compose

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import app.test.indicator.R

@Composable
private fun Counter() {
    Box(
        modifier = Modifier
            .wrapContentSize()
    ) {
        val iconRes = R.drawable.indicator_background

        Text(
            modifier = Modifier,
            text = "99",
            style = TextStyle(
                fontSize = 12.sp,
                color = Color.Blue
            )
        )
        Icon(
            modifier = Modifier.size(24.dp),
            imageVector = ImageVector.vectorResource(id = iconRes),
            contentDescription = null,
            tint = Color.Blue,
        )
    }
}

@Preview
@Composable
fun CounterPreview() {
    MaterialTheme {
        Counter()
    }
}