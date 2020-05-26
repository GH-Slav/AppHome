package by.tms.homeapplication.sevenrestfulapi.retrofit

import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Response
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.create

const val BASEURL = "https://api.openweathermap.org/"

object WeatherFactoryAPI {
private val KEY_NAME = "appid"
private val KEY_VALUE = "69e22b2e07699e771cde71bcb0d360b8"

    val httpClient = OkHttpClient.Builder()
        .addInterceptor(object : Interceptor {
            override fun intercept(chain: Interceptor.Chain): Response {
                val request = chain
                    .request()
                    .newBuilder()
                    .addHeader(KEY_NAME, KEY_VALUE)
                    .build()
                return chain.proceed(request)
            }
        })

    fun getRetrofit(): WeatherAPI {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASEURL)
            .addConverterFactory(MoshiConverterFactory.create())
            .addCallAdapterFactory(CoroutineCallAdapterFactory())
//            .client(httpClient.build())
            .build()
        return retrofit.create()
    }
}
