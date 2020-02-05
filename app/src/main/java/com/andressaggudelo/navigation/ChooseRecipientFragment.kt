package com.andressaggudelo.navigation


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.andressaggudelo.navigation.databinding.FragmentChooseRecipientBinding

/**
 * A simple [Fragment] subclass.
 */
class ChooseRecipientFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding: FragmentChooseRecipientBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_choose_recipient, container, false)
        binding.nextRecipient.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_chooseRecipientFragment2_to_specifyAmountFragment)
        }
        binding.cancelRecipient.setOnClickListener { view: View ->
            view.findNavController().popBackStack()
        }

        return binding.root
    }
}
