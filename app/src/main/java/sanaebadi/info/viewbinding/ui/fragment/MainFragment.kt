package sanaebadi.info.viewbinding.ui.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import sanaebadi.info.viewbinding.databinding.ActivityMainBinding
import sanaebadi.info.viewbinding.databinding.FragmentMainBinding

/**
 * A simple [Fragment] subclass.
 */
class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this sanaebadi.info.viewbinding.ui.activity.fragment
        binding=FragmentMainBinding.inflate(inflater,container,false)
        val view=binding.root

        binding.btnMore.setOnClickListener{


        }

        return view
    }

    override fun onDestroy() {
        super.onDestroy()
        binding=null!!
    }

}
