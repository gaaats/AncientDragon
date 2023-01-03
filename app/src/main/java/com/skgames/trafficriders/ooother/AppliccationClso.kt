package com.skgames.trafficriders.ooother

import android.app.Application
import com.orhanobut.hawk.Hawk
import com.skgames.trafficriders.hkhkhkh.Connsta.oneSfrgtftrgt
import com.onesignal.OneSignal


class AppliccationClso : Application() {
    override fun onCreate() {
        super.onCreate()
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)
        OneSignal.initWithContext(this)
        OneSignal.setAppId(oneSfrgtftrgt)
        Hawk.init(this).build()
    }

    companion object {
        var countryCodefrrfrfrfrrf: String? = "countryCode"

        var appsCheckfrr6 = "appsChecker"
        var geomeogtgt = "geo"
        var C1gttggtgt: String? = "c11"
        var linkfrrrfrffr = "link"
        var MAIN_IDffrrfrrf: String? = "mainid"
        var DEEPLfrfrfrfr: String? = "d11"


    }


}