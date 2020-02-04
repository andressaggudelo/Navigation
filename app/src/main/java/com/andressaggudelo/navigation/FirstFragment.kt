package com.andressaggudelo.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.andressaggudelo.navigation.databinding.ActivityMainBinding.inflate
import com.andressaggudelo.navigation.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_first, container, false)
        val binding: FragmentFirstBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_first, container, false)
        return binding.root
    }
}
