package com.andressaggudelo.navigation


import android.content.Intent
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import android.widget.Toast
import androidx.core.app.ShareCompat
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



        //Toast.makeText(context, "Sent money: \$${args?.amount}", Toast.LENGTH_LONG).show()

        setHasOptionsMenu(true)


        return inflater.inflate(R.layout.fragment_confirmation, container, false)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.share_menu, menu)
        if(null == getShareIntent().resolveActivity(activity!!.packageManager)){
            menu.findItem(R.id.share).setVisible(false)
        }
    }

    private fun getShareIntent(): Intent{
        var args = arguments?.let { ConfirmationFragmentArgs.fromBundle(it) }   // Brought my data from the other Fragment
        return ShareCompat.IntentBuilder.from(activity)
            .setText(getString(R.id.cancel_amount.toInt(), args?.amount))
            .setType("text/plain")
            .intent
    }

    private fun shareSuccess(){
        startActivity(getShareIntent())
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item!!.itemId){
            R.id.share -> shareSuccess()
        }
        return super.onOptionsItemSelected(item)
    }

}
