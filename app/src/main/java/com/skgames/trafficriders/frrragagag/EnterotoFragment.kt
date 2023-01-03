package com.skgames.trafficriders.frrragagag

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.skgames.trafficriders.R
import com.skgames.trafficriders.databinding.FragmentEnterotoBinding
import android.view.LayoutInflater
import android.view.View



class EnterotoFragment : Fragment() {


    private fun bbgbggbbg() {
        Toast.makeText(requireContext(), "Error 505", Toast.LENGTH_SHORT).show()
    }

    private var fragmentEnterotoBinding: FragmentEnterotoBinding? = null
    private val binding get() = fragmentEnterotoBinding ?: throw RuntimeException("FragmentEnterotoBinding = null")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentEnterotoBinding = FragmentEnterotoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {

            binding.imgTitpleGame1.setOnClickListener {
                ggggooooo()
            }
            binding.imgTitpleGame2.setOnClickListener {
                ggggooooo()
            }
            jojojooj()

        } catch (e: Exception) {
            bbgbggbbg()
        }


        super.onViewCreated(view, savedInstanceState)
    }

    private fun jojojooj() {
        binding.tvTitle1.setOnClickListener {
            ggggooooo()
        }
        binding.tvTitle2.setOnClickListener {
            ggggooooo()
        }
    }

    private fun ggggooooo() {
        findNavController().navigate(R.id.action_enterotoFragment_to_ruuulesFragment)
    }

    override fun onDestroy() {
        fragmentEnterotoBinding = null
        super.onDestroy()
    }

}