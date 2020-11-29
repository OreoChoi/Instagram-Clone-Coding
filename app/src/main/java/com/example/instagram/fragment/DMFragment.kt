package com.example.instagram.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.instagram.R
import com.example.instagram.databinding.FragmentDmBinding

class DMFragment : Fragment() {

    lateinit var binding: FragmentDmBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_dm, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setTitle(view)
    }

    fun setTitle(view: View) {
      /*  binding.homeTitle.visibleMenu2(true)
        binding.homeTitle.visibleAccountMenu(true)

        ContextCompat.getDrawable(view.context, R.drawable.ic_back)?.let {
            binding.homeTitle.changeHomeIconImage(it)
        }
        ContextCompat.getDrawable(view.context, R.drawable.ic_note)?.let {
            binding.homeTitle.changeMenuIconImage(it)
        }*/
    }
}