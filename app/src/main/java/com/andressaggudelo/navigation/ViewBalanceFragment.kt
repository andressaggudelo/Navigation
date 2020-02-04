package com.andressaggudelo.navigation


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.andressaggudelo.navigation.databinding.FragmentViewBalanceBinding

/**
 * A simple [Fragment] subclass.
 */
class ViewBalanceFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentViewBalanceBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_view_balance, container, false
        )
        return binding.root
    }


}
