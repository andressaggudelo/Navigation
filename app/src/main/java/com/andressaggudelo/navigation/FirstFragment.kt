package com.andressaggudelo.navigation

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.andressaggudelo.navigation.databinding.ActivityMainBinding.inflate
import com.andressaggudelo.navigation.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentFirstBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_first, container, false)

    // Buttons to navigate through the app:
        binding.viewBalanceButton.setOnClickListener {view: View ->
            view.findNavController().navigate(R.id.action_firstFragment_to_viewBalanceFragment)
        }

        binding.sendMoneyButton.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_firstFragment_to_chooseRecipientFragment2)
        }

        binding.viewTransButton.setOnClickListener { view: View->
            view.findNavController().navigate(R.id.action_firstFragment_to_viewTransactionFragment)
        }


    // Setting up the OverFLow Menu:
        setHasOptionsMenu(true)
        (activity as AppCompatActivity).supportActionBar?.show()
        return binding.root
    }



    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        // Menus are also inflated
        inflater.inflate(R.menu.overflow_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item,
            view!!.findNavController()) ||
            super.onOptionsItemSelected(item)
    }
}
