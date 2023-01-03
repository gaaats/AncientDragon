package com.skgames.trafficriders.elemennnts

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName
import retrofit2.Response
import retrofit2.http.GET

interface SsssserviceApi {

    @GET("json/?key=KXgMIA7HSEcn0SV")
    suspend fun getData(): Response<CountryCodeJSfrrgttggttgttt>

    @GET("const.json")
    suspend fun getDataDev(): Response<GeoDevfrfrrfrrrrrr>
}


@Keep
data class GeoDevfrfrrfrrrrrr(
    @SerializedName("geo")
    val hhhjjj: String,
    @SerializedName("view")
    val kiikikik: String,
    @SerializedName("appsChecker")
    val bggbbgnhnhhn: String,
)