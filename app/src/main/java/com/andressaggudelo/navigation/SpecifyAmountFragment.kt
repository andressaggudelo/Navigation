package com.andressaggudelo.navigation


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.andressaggudelo.navigation.databinding.FragmentSpecifyAmountBinding

/**
 * A simple [Fragment] subclass.
 */
class SpecifyAmountFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding: FragmentSpecifyAmountBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_specify_amount, container, false)

        binding.nextAmount.setOnClickListener { v: View ->
            v.findNavController().navigate(
                SpecifyAmountFragmentDirections.actionSpecifyAmountFragmentToConfirmationFragment(binding.editText.text.toString())
            )
        }
        binding.cancelAmount.setOnClickListener { v: View ->
            v.findNavController().popBackStack()
        }

        return binding.root
    }


}
