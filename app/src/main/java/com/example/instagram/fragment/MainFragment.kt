package com.example.instagram.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.instagram.R
import com.example.instagram.adapter.MainPagerAdapter
import com.example.instagram.databinding.FragmentMainBinding

class MainFragment :Fragment(){
    val PAGE_CAMERA:Int = 0
    val PAGE_HOME:Int = 1
    val PAGE_DM:Int = 2

    lateinit var binding:FragmentMainBinding
    lateinit var pagerAdapter:MainPagerAdapter


    fun newInstance():MainFragment {
        val args = Bundle()

        val fragment = MainFragment()
        fragment.arguments = args
        return fragment
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_main,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        pagerAdapter = MainPagerAdapter(this)
        binding.vpHome.adapter = pagerAdapter
        binding.vpHome.setCurrentItem(PAGE_HOME,false)
        binding.vpHome.orientation = ViewPager2.ORIENTATION_HORIZONTAL
    }
}