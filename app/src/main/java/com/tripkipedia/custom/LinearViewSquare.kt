package com.tripkipedia.custom

import android.content.Context
import android.util.AttributeSet
import android.widget.LinearLayout


/**
 * Created by Bhavesh Hirpara on 25-05-2020
 */
class LinearViewSquare : LinearLayout {

    constructor(context: Context, attrs: AttributeSet, defStyle: Int) : super(context, attrs, defStyle) {

    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {}

    constructor(context: Context) : super(context) {}

    public override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, widthMeasureSpec)
    }
}