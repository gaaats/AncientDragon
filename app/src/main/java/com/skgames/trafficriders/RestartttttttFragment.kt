package com.skgames.trafficriders

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.skgames.trafficriders.databinding.FragmentRestartttttttBinding
import kotlinx.coroutines.delay
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast



class RestartttttttFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        reeeeeloadBinding = FragmentRestartttttttBinding.inflate(inflater, container, false)
        return restartttttttBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {
            gooo()

        } catch (e: Exception) {
            vfvvf()
        }

        super.onViewCreated(view, savedInstanceState)
    }


    override fun onPause() {
        onDestroy()
        super.onPause()
    }

    override fun onDestroy() {
        reeeeeloadBinding = null
        super.onDestroy()
    }

    private fun vfvvf() {
        Snackbar.make(
            restartttttttBinding.root,
            "Some error...",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }

    private fun gooo() {
        lifecycleScope.launchWhenCreated {
            Toast.makeText(requireContext(), "Done! Good for you!", Toast.LENGTH_SHORT).show()
            delay(4500)
            findNavController().navigate(R.id.action_restartttttttFragment_to_choooseDiffFragment)
        }
    }


    private var reeeeeloadBinding: FragmentRestartttttttBinding? = null
    private val restartttttttBinding
        get() = reeeeeloadBinding ?: throw RuntimeException("FragmentRestartttttttBinding = null")

}