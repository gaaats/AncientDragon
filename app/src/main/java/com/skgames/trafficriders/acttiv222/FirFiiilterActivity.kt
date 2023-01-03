package com.skgames.trafficriders.acttiv222

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import com.orhanobut.hawk.Hawk
import com.skgames.trafficriders.R
import com.skgames.trafficriders.aaaactiv.PlayyyGammmerActivity
import com.skgames.trafficriders.ooother.AppliccationClso
import com.skgames.trafficriders.ooother.AppliccationClso.Companion.MAIN_IDffrrfrrf
import com.skgames.trafficriders.ooother.AppliccationClso.Companion.appsCheckfrr6
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class FirFiiilterActivity : AppCompatActivity() {

    private fun gtgttggtgt(): String? {
        val bgbgbggb: String? = Hawk.get(appsCheckfrr6)
        return bgbgbggb
    }

    private fun countryfrfrfrr() {

        val nhnhnhnhhn = gtgttggtgt()

        if (nhnhnhnhhn == "0") {
            aLonehyhyyfrrf()

        } else {
            GlobalScope.launch(Dispatchers.Default) {
                jjkddcvv()
            }
            bvvcffre()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fir_fiiilter)
        countryfrfrfrr()
    }

    private fun aLonehyhyyfrrf() {
        val ddede = Intent(this@FirFiiilterActivity, PlayyyGammmerActivity::class.java)
        Hawk.put(AppliccationClso.geomeogtgt, null)
        Hawk.put(AppliccationClso.countryCodefrrfrfrfrrf, null)
        Hawk.put(AppliccationClso.appsCheckfrr6, null)
        startActivity(ddede)
        finish()
    }

    private fun jjkddcvv() {
        val advertisingIdClient = AdvertisingIdClient(applicationContext)
        advertisingIdClient.start()
        val infofrrrf = advertisingIdClient.info.id
        Hawk.put(MAIN_IDffrrfrrf, infofrrrf)
    }

    private fun bvvcffre() {
        val hyhyyhyhy = Intent(this@FirFiiilterActivity, SeeeciFilllteriActivity2::class.java)
        startActivity(hyhyyhyhy)
        finish()
    }

}