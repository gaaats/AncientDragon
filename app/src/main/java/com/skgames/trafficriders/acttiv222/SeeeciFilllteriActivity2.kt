package com.skgames.trafficriders.acttiv222

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.skgames.trafficriders.aaaactiv.PlayyyGammmerActivity
import com.skgames.trafficriders.databinding.ActivitySeeeciFilllteri2Binding
import com.skgames.trafficriders.ooother.AppliccationClso.Companion.C1gttggtgt
import com.skgames.trafficriders.ooother.AppliccationClso.Companion.DEEPLfrfrfrfr
import com.skgames.trafficriders.ooother.AppliccationClso.Companion.appsCheckfrr6
import com.skgames.trafficriders.ooother.AppliccationClso.Companion.countryCodefrrfrfrfrrf
import com.skgames.trafficriders.ooother.AppliccationClso.Companion.geomeogtgt
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib
import com.orhanobut.hawk.Hawk
import com.skgames.trafficriders.aaaactiv.LinkaaaaaActivity2


class SeeeciFilllteriActivity2 : AppCompatActivity() {

    val aaaaaps = "srmuDX28j3BZvycbbtyai8"
    lateinit var bgbgbgbgnnjj: ActivitySeeeciFilllteri2Binding





    private fun xccfvfvffv() {
        val kikloololol = Intent(this@SeeeciFilllteriActivity2, LinkaaaaaActivity2::class.java)
        Hawk.put(geomeogtgt, null)
        Hawk.put(countryCodefrrfrfrfrrf, null)
        Hawk.put(appsCheckfrr6, null)
        startActivity(kikloololol)
        finish()
    }

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        bgbgbgbgnnjj = ActivitySeeeciFilllteri2Binding.inflate(layoutInflater)
        setContentView(bgbgbgbgnnjj.root)

        val vbvbvvbv: String? = Hawk.get(appsCheckfrr6, "null")

        if (vbvbvvbv == "1") {
            kohyohykhykohyk()
        }

        vbvvbbv()

    }

    private fun kohyohykhykohyk() {
        AppsFlyerLib.getInstance()
            .init(aaaaaps, hyhyjujuujkiikik, applicationContext)
        AppsFlyerLib.getInstance().start(this)
    }

    private fun xcvbbtrr() {
        val gtgthyhyhyju = Intent(this@SeeeciFilllteriActivity2, PlayyyGammmerActivity::class.java)
        Hawk.put(geomeogtgt, null)
        Hawk.put(countryCodefrrfrfrfrrf, null)
        Hawk.put(appsCheckfrr6, null)
        startActivity(gtgthyhyhyju)
        hkyhkyyhkhyk()
    }

    private fun hkyhkyyhkhyk() {
        finish()
    }


    private fun vbvvbbv() {

        val vfvbgbghhn: String = Hawk.get(geomeogtgt)
        var bhnhnjj: String? = Hawk.get(C1gttggtgt)
        val fdfdfdfd: String? = Hawk.get(DEEPLfrfrfrfr, "null")
        val cvcvcv: String = Hawk.get(countryCodefrrfrfrfrrf, "null")
        val uujjkiikik: String? = Hawk.get(appsCheckfrr6, "null")



        if (uujjkiikik == "1") {


            val gfgfgfgf = Executors.newSingleThreadScheduledExecutor()
            gfgfgfgf.scheduleAtFixedRate({
                if (bhnhnjj != null) {

                    if (bhnhnjj!!.contains("tdb2") || vfvbgbghhn.contains(cvcvcv) || fdfdfdfd!!.contains("tdb2")) {
                        gfgfgfgf.shutdown()
                        xccfvfvffv()
                    } else {
                        gfgfgfgf.shutdown()
                        xcvbbtrr()

                    }
                } else {
                    bhnhnjj = Hawk.get(C1gttggtgt)

                }
            }, 0, 1, TimeUnit.SECONDS)
        }  else if (vfvbgbghhn.contains(cvcvcv)) {

            xccfvfvffv()
        } else {

            xcvbbtrr()
        }

    }

    private val hyhyjujuujkiikik = object : AppsFlyerConversionListener {
        override fun onConversionDataSuccess(data: MutableMap<String, Any>?) {
            val dataGotten = data?.get("campaign").toString()
            Hawk.put(C1gttggtgt, dataGotten)
        }
        override fun onConversionDataFail(p0: String?) {}
        override fun onAppOpenAttribution(p0: MutableMap<String, String>?) {}
        override fun onAttributionFailure(p0: String?) {}
    }



}