package app.test.indicator.view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import app.test.indicator.R

class IconXml @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null
) : LinearLayout(context, attrs) {

    init {
        LayoutInflater.from(context).inflate(R.layout.icon_view, this)
    }
}