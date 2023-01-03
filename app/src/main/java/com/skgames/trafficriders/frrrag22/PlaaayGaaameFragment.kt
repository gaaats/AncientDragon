package com.skgames.trafficriders.frrrag22

import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.skgames.trafficriders.R
import com.skgames.trafficriders.databinding.FragmentPlaaayGaaameBinding
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView


class PlaaayGaaameFragment : Fragment() {

    private var fragmentPlaaayGaaameBinding: FragmentPlaaayGaaameBinding? = null
    private val gaaameBinding
        get() = fragmentPlaaayGaaameBinding ?: throw RuntimeException("FragmentPlaaayGaaameBinding = null")


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentPlaaayGaaameBinding = FragmentPlaaayGaaameBinding.inflate(inflater, container, false)
        return gaaameBinding.root
    }

    private fun bgbggbgb() {
        Snackbar.make(
            gaaameBinding.root,
            "There is some error, try again",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {

            gaaameBinding.btnElem8.setOnClickListener {
                it.visibility = View.GONE
                nhmjmjfpfpfpfp()
            }
            gaaameBinding.btnElem9.setOnClickListener {
                it.visibility = View.GONE
                nhmjmjfpfpfpfp()
            }
            gaaameBinding.btnElem10.setOnClickListener {
                it.visibility = View.GONE
                nhmjmjfpfpfpfp()
            }
            gaaameBinding.btnElem13.setOnClickListener {
                it.visibility = View.GONE
                nhmjmjfpfpfpfp()
            }
            gaaameBinding.btnElem12.setOnClickListener {
                it.visibility = View.GONE
                nhmjmjfpfpfpfp()
            }

            gaaameBinding.root.background.alpha = 238

            gaaameBinding.btnElem1.setOnClickListener {
                it.visibility = View.GONE
                nhmjmjfpfpfpfp()
            }
            gaaameBinding.btnElem2.setOnClickListener {
                it.visibility = View.GONE
                nhmjmjfpfpfpfp()
            }
            gaaameBinding.btnElem3.setOnClickListener {
                it.visibility = View.GONE
                nhmjmjfpfpfpfp()
            }
            gaaameBinding.btnElem4.setOnClickListener {
                it.visibility = View.GONE
                nhmjmjfpfpfpfp()
            }
            gaaameBinding.btnElem5.setOnClickListener {
                it.visibility = View.GONE
                nhmjmjfpfpfpfp()
            }
            gaaameBinding.btnElem6.setOnClickListener {
                it.visibility = View.GONE
                nhmjmjfpfpfpfp()
            }
            gaaameBinding.btnElem7.setOnClickListener {
                it.visibility = View.GONE
                nhmjmjfpfpfpfp()
            }


        } catch (e: Exception) {
            bgbggbgb()
        }

        super.onViewCreated(view, savedInstanceState)
    }






    private fun slonny(imageView: ImageView) {
        lifecycleScope.launch {
            while (true) {
                var ismsms = bvvccccc
                var gtjitji = bnnmmmbbb
                imageView.alpha = ismsms
                if (ismsms >= 1f) {
                    gtjitji = -0.05f
                }
                if (ismsms <= 0.1f) {
                    gtjitji = 0.05f
                }
                delay(30)
                ismsms += gtjitji
            }
        }
    }

    private fun jujujju(imageView: ImageView): Boolean {
        if (imageView.visibility == View.GONE) {
            return true
        }
        return false
    }


    override fun onDestroy() {
        fragmentPlaaayGaaameBinding = null
        super.onDestroy()
    }

    private fun nhmjmjfpfpfpfp() {
        if (jujujju(gaaameBinding.btnElem1) && jujujju(gaaameBinding.btnElem2) && jujujju(
                gaaameBinding.btnElem3
            ) && jujujju(gaaameBinding.btnElem4) && jujujju(gaaameBinding.btnElem5) && jujujju(
                gaaameBinding.btnElem6
            ) && jujujju(gaaameBinding.btnElem7) && jujujju(gaaameBinding.btnElem8) && jujujju(
                gaaameBinding.btnElem9
            ) && jujujju(gaaameBinding.btnElem10) && jujujju(gaaameBinding.btnElem13) && jujujju(
                gaaameBinding.btnElem12
            )
        ) {
            findNavController().navigate(R.id.action_plaaayGaaameFragment_to_restartttttttFragment)
        }
    }

    var bvvccccc = 0.8f
    var bnnmmmbbb = 0.05f

}