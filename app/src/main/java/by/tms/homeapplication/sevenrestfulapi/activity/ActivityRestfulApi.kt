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