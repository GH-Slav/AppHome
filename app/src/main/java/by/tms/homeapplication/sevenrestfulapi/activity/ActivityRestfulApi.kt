package by.tms.homeapplication.sevenrestfulapi.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import by.tms.homeapplication.R
import by.tms.homeapplication.sevenrestfulapi.model.ViewModelApi
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
            val response = WeatherFactoryAPI.getRetrofit().getCityCoordinates(53.9, 27.57).await()

            if (response.isSuccessful) {
                val weather = response.body()
                val model = ViewModelProvider(this as ActivityRestfulApi).get(ViewModelApi::class.java)
                model.data = weather
                withContext(Dispatchers.Main) {
                    recycleApi.adapter = AdapterApi(model.data)
                    recycleApi.layoutManager = LinearLayoutManager(this as ActivityRestfulApi)
                    recycleApi.setHasFixedSize(true)

                }
            } else {
                Log.e("ERROR", response.code().toString())
            }
        }
    }
}