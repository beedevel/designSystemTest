package app.test.indicator.view

import android.content.Context
import android.util.AttributeSet
import android.widget.LinearLayout

class CounterXml @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null
) : LinearLayout(context, attrs) {

    init {

    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(
            MeasureSpec.makeMeasureSpec(widthMeasureSpec, MeasureSpec.EXACTLY),
            MeasureSpec.makeMeasureSpec(heightMeasureSpec, MeasureSpec.EXACTLY),
        )
    }
}