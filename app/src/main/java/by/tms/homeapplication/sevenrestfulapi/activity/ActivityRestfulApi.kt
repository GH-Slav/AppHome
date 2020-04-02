package by.tms.homeapplication.sevenrestfulapi.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import by.tms.homeapplication.R
import by.tms.homeapplication.sevenrestfulapi.entity.WeatherData
import by.tms.homeapplication.sevenrestfulapi.retrofit.WeatherFactoryAPI
import kotlinx.android.synthetic.main.activity_restful_api.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class ActivityRestfulApi : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_restful_api)

        CoroutineScope(Dispatchers.IO).launch {
            val responseAll = WeatherFactoryAPI.getRetrofit()
                .getCityCoordinates(53.9, 27.57, 40, "metric","69e22b2e07699e771cde71bcb0d360b8").await()
//            val responseMinsk = WeatherFactoryAPI.getRetrofit()
//                .getCityCoordinates(53.9, 27.57, "69e22b2e07699e771cde71bcb0d360b8").await()
//            val responseVitebsk = WeatherFactoryAPI.getRetrofit()
//                .getCityCoordinates(55.19, 30.2, "2a067e2a3cc2caaba1c7f34e279e4e59").await()
//            val responseMogilev = WeatherFactoryAPI.getRetrofit()
//                .getCityCoordinates(53.91, 30.34, "69e22b2e07699e771cde71bcb0d360b8").await()
//            val responseGomel = WeatherFactoryAPI.getRetrofit()
//                .getCityCoordinates(52.43, 30.98, "69e22b2e07699e771cde71bcb0d360b8").await()
//            val responseBrest = WeatherFactoryAPI.getRetrofit()
//                .getCityCoordinates(52.1, 23.7, "69e22b2e07699e771cde71bcb0d360b8").await()
//            val responseGrodno = WeatherFactoryAPI.getRetrofit()
//                .getCityCoordinates(53.69, 23.83, "69e22b2e07699e771cde71bcb0d360b8").await()

            if (responseAll.isSuccessful) {
                val weatherAll = responseAll.body()
                withContext(Dispatchers.Main) {
                    recycleApi.adapter = AdapterApi(weatherAll)
                    recycleApi.layoutManager = LinearLayoutManager(applicationContext)
                    recycleApi.setHasFixedSize(true)
                }
            } else {
                Log.e("ERROR", responseAll.code().toString())
            }
        }
    }
}