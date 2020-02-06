package com.andressaggudelo.navigation


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.andressaggudelo.navigation.databinding.FragmentConfirmationBinding

/**
 * A simple [Fragment] subclass.
 */
class ConfirmationFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding: FragmentConfirmationBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_confirmation, container, false)

        var args = arguments?.let { ConfirmationFragmentArgs.fromBundle(it) }

        Toast.makeText(context, "Sent money: ${args?.amount}", Toast.LENGTH_LONG).show()

        return inflater.inflate(R.layout.fragment_confirmation, container, false)
    }


}
