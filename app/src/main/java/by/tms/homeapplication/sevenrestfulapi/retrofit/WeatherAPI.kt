package by.tms.homeapplication.sevenrestfulapi.retrofit

import by.tms.homeapplication.sevenrestfulapi.entity.WeatherData
import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherAPI {
    @GET ("data/2.5/find")
    fun getCityCoordinates(
    @Query ("lat")
    lat: Double,
    @Query ("lon")
    lon: Double,
    @Query ("cnt")
    cnt: Int,
    @Query ("units")
    units: String,
    @Query ("appid")
    appid: String)

    : Deferred<Response<WeatherData>>

}