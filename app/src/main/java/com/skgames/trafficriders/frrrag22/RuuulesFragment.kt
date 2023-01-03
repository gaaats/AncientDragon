package com.skgames.trafficriders.frrrag22

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.navigation.fragment.findNavController
import com.skgames.trafficriders.R
import com.skgames.trafficriders.databinding.FragmentRuuulesBinding
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class RuuulesFragment : Fragment() {

    private fun bbgbggbbg() {
        Toast.makeText(requireContext(), "Error 505", Toast.LENGTH_SHORT).show()
    }

    private var fragmentRuuulesBinding: FragmentRuuulesBinding? = null
    private val fragmentRuuulesBinding1
        get() = fragmentRuuulesBinding ?: throw RuntimeException("FragmentRuuulesBinding = null")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentRuuulesBinding = FragmentRuuulesBinding.inflate(inflater, container, false)
        return fragmentRuuulesBinding1.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {
            fragmentRuuulesBinding1.btnPlayGameeee.setOnClickListener {
                initAlertDialog()
            }

        } catch (e: Exception) {
            bbgbggbbg()
        }
        super.onViewCreated(view, savedInstanceState)
    }


    private fun ggggooooo() {
        findNavController().navigate(R.id.action_enterotoFragment_to_ruuulesFragment)
    }

    override fun onDestroy() {
        fragmentRuuulesBinding = null
        super.onDestroy()
    }

    private fun initAlertDialog() {
        AlertDialog.Builder(requireContext())
            .setTitle("Start game")
            .setMessage("Are you ready")
            .setPositiveButton("Yes, go") { _, _ ->
                findNavController().navigate(R.id.action_ruuulesFragment_to_choooseDiffFragment)
            }
            .setNegativeButton("No") { _, _ ->

            }

            .setCancelable(true)
            .create()
            .show()
    }

}