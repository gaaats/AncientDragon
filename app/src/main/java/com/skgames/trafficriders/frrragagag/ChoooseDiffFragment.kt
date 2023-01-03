package com.skgames.trafficriders.frrragagag

import android.os.Bundle
import com.skgames.trafficriders.R
import com.skgames.trafficriders.databinding.FragmentChoooseDiffBinding
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController



class ChoooseDiffFragment : Fragment() {


    private var fragmentChoooseDiffBinding: FragmentChoooseDiffBinding? = null
    private val choooseDiffBinding
        get() = fragmentChoooseDiffBinding
            ?: throw RuntimeException("FragmentChoooseDiffBinding = null")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentChoooseDiffBinding = FragmentChoooseDiffBinding.inflate(inflater, container, false)
        return choooseDiffBinding.root
    }

    private fun jjjjjjjjjjj() {
        Toast.makeText(requireContext(), "Error 505", Toast.LENGTH_SHORT).show()
    }


    private fun goo() {
        findNavController().navigate(R.id.action_choooseDiffFragment_to_plaaayGaaameFragment)
    }


    override fun onDestroy() {
        fragmentChoooseDiffBinding = null
        super.onDestroy()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {

            choooseDiffBinding.skullEasy.setOnClickListener {
                goo()
            }
            choooseDiffBinding.skullNormal1.setOnClickListener {
                goo()
            }
            choooseDiffBinding.skullNormal2.setOnClickListener {
                goo()
            }
            choooseDiffBinding.skullHard1.setOnClickListener {
                goo()
            }
            choooseDiffBinding.skullHard2.setOnClickListener {
                goo()
            }
            choooseDiffBinding.skullHard3.setOnClickListener {
                goo()
            }


        } catch (e: Exception) {
            jjjjjjjjjjj()
        }


        super.onViewCreated(view, savedInstanceState)
    }

}