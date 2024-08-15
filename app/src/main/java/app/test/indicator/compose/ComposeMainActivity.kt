package app.test.indicator.compose

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import app.test.indicator.R
import app.test.indicator.view.IconXml

@Composable
fun ComposeMainActivityContent(
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier.padding(horizontal = 16.dp)) {
        Text(
            modifier = Modifier
                .padding(top = 64.dp)
                .wrapContentSize(),
            text = "Задание на лайвкодинг:",
            style = TextStyle(
                color = Color.Black,
                fontSize = 24.sp
            )
        )
        Text(
            modifier = Modifier
                .padding(top = 12.dp)
                .wrapContentSize(),
            text = "Создание компонента Индикатор, содержащий внутри себя компонент Counter. " +
                    "\nИндикатор должен находиться в центре правого угла любого другого компонента, например Icon" +
                    "\nКомпоненты Counter и Icon уже реализованы",
            style = TextStyle(
                color = Color.Black,
                fontSize = 16.sp
            )
        )
        ComposeIcon(
            modifier = Modifier
                .padding(24.dp),
            imageRes = R.drawable.indicator_test,
            imageWidth = 300
        )

        Text(
            modifier = Modifier.padding(top = 24.dp),
            text = "Результат Compose:",
            style = TextStyle(
                color = Color.Black,
                fontSize = 24.sp
            )
        )
        ComposeIcon(
            modifier = Modifier
                .padding(24.dp),
            imageRes = R.drawable.icon,
            imageWidth = 56
        )
        Text(
            modifier = Modifier.padding(top = 24.dp),
            text = "Результат XML:",
            style = TextStyle(
                color = Color.Black,
                fontSize = 24.sp
            )
        )
        AndroidView(
            modifier = Modifier
                .padding( 24.dp),
            factory = { context ->
                IconXml(context)
            },
            update = { view ->

            },
        )
    }
}

@Preview
@Composable
fun MainContentPreview() {
    MaterialTheme {
        ComposeMainActivityContent()
    }
}