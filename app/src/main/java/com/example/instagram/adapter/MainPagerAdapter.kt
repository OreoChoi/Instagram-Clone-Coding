package com.example.instagram.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.instagram.fragment.CameraFragment
import com.example.instagram.fragment.DMFragment
import com.example.instagram.fragment.HomeFragment

class MainPagerAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {

    val PAGE_COUNT:Int = 3

    override fun getItemCount(): Int = PAGE_COUNT

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> CameraFragment()
            1 -> HomeFragment()
            else -> DMFragment()
        }
    }
}