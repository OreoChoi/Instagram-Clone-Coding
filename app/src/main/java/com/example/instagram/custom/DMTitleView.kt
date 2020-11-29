package com.example.instagram.custom

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.instagram.R
import com.example.instagram.databinding.ViewTitleDmBinding

class DMTitleView @JvmOverloads constructor(
    context: Context,
    attributeSet: AttributeSet? = null,
    def: Int = 0
) : HomeTitleView(context,true) {
    private lateinit var binding: ViewTitleDmBinding

    init{
        val inflater =
            context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        binding = DataBindingUtil.inflate(inflater, R.layout.view_title_dm, this, false)
        addView(binding.root)
    }

    /**
     * jhChoi - 20201101
     * 계정을 변경할 메뉴버튼을 보이거나 감춥니다.
     * @param isVisible true == VISIBLE , false == GONE
     * */
    fun visibleAccountMenu(isVisible: Boolean) {
        Log.e("TITLE_VIEW", "visible")
        binding.ivAccountMenu.visibility = if (isVisible) {
            View.VISIBLE
        } else {
            View.GONE
        }
    }

    /**
     * jhChoi - 20201101
     * Menu icon2을 보이거나 감춥니다.
     * @param isVisible true == VISIBLE , false == GONE
     * */
    fun visibleMenu2(isVisible: Boolean) {
        Log.e("TITLE_VIEW", "visible2")
        binding.ivMenu2.visibility = if (isVisible) {
            View.VISIBLE
        } else {
            View.GONE
        }
    }
}

