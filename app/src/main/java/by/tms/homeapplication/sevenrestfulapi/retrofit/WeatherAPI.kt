package by.tms.homeapplication.sevenrestfulapi.retrofit

import by.tms.homeapplication.sevenrestfulapi.entity.CityWeatherData
import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherAPI {
    @GET ("data/2.5/weather?")
    fun getCityCoordinates(
    @Query ("lat")
    lat: Double,
    @Query ("lon")
    lon: Double)
    : Deferred<Response<CityWeatherData>>

}