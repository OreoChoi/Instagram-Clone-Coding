package com.example.instagram.custom

import android.content.Context
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.databinding.DataBindingUtil
import androidx.viewbinding.ViewBinding
import com.example.instagram.R
import com.example.instagram.databinding.ViewTitleBinding
import kotlinx.android.synthetic.main.view_title_dm.view.*

open class HomeTitleView : ConstraintLayout {
    private lateinit var binding: ViewTitleBinding

    constructor(context: Context) : super(context) {
        showTitle()
    }

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        showTitle()
    }

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
        showTitle()
    }

    constructor(context: Context, isChild: Boolean = false) : super(context)
    constructor(context: Context, attrs: AttributeSet?, isChild: Boolean = false) : super(
        context,
        attrs
    )
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int, isChild: Boolean = false) : super(
        context,
        attrs,
        defStyleAttr
    )

    private fun showTitle() {
        Log.e("TITLE_VIEW", "new init")
        val inflater: LayoutInflater =
            context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        binding = DataBindingUtil.inflate(inflater, R.layout.view_title, this, false)
        addView(binding.root)
    }

    fun changeTitleText(text: String) = tv_title.setText(text)

    /**
     * jhChoi - 20201101
     * Menu icon을 보이거나 감춥니다.
     * @param isVisible true == VISIBLE , false == GONE
     * */
    fun visibleMenu(isVisible: Boolean) {
        iv_menu.visibility = if (isVisible) {
            View.VISIBLE
        } else {
            View.GONE
        }
    }

    /**
     * jhChoi - 20201101
     * Home 아이콘의 이미지를 변경합니다.
     * @param drawable 변경할 이미지
     * */
    fun changeHomeIconImage(drawable: Drawable) {
        Log.e("tag", "atag")
        iv_home.setImageDrawable(drawable)
    }

    /**
     * jhChoi - 20201101
     * Menu 아이콘의 이미지를 변경합니다.
     * @param drawable 변경할 이미지
     * */
    fun changeMenuIconImage(drawable: Drawable) = iv_menu.setImageDrawable(drawable)
}

