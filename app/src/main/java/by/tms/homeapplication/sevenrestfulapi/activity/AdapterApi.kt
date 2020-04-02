package by.tms.homeapplication.sevenrestfulapi.activity

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import by.tms.homeapplication.R
import by.tms.homeapplication.sevenrestfulapi.entity.WeatherData
import by.tms.homeapplication.sevenrestfulapi.model.CircleTransform
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_list_api.view.*
import kotlin.collections.ArrayList

class AdapterApi(val listWeatherData: WeatherData?) :
    RecyclerView.Adapter<AdapterApi.ApiViewHolder>() {


    class ApiViewHolder(view: View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ApiViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.item_list_api, parent, false)
        return ApiViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return listWeatherData?.list?.size!!
    }

    override fun onBindViewHolder(holder: ApiViewHolder, position: Int) {
        val myView = holder.itemView

        myView.title_text_api.text = listWeatherData?.list?.get(position)?.name
        myView.one_text_api.text =
            (listWeatherData?.list?.get(position)?.main?.temp.toString() + "   °C")
        myView.two_text_api.text =
            ("lat  " + listWeatherData?.list?.get(position)?.coord?.lat.toString() + "    "
                    + "lon  " + listWeatherData?.list?.get(position)?.coord?.lon.toString())
        var iconWeatherURL: String = "https://"
        Picasso.get().load(iconWeatherURL).placeholder(R.drawable.weather_icon)
            .transform(CircleTransform()).into(myView.list_icon_api)

        when (listWeatherData?.list?.get(position)?.weather?.get(position)?.icon) {
            "01n" -> iconWeatherURL = "https://openweathermap.org/img/wn/01n@2x.png"
            "02n" -> iconWeatherURL = "https://openweathermap.org/img/wn/02n@2x.png"
            "03n" -> iconWeatherURL = "https://openweathermap.org/img/wn/03n@2x.png"
            "04n" -> iconWeatherURL = "https://openweathermap.org/img/wn/04n@2x.png"
            "05n" -> iconWeatherURL = "https://openweathermap.org/img/wn/05n@2x.png"
            "06n" -> iconWeatherURL = "https://openweathermap.org/img/wn/06n@2x.png"
            "07n" -> iconWeatherURL = "https://openweathermap.org/img/wn/07n@2x.png"
            "08n" -> iconWeatherURL = "https://openweathermap.org/img/wn/08n@2x.png"
            "09n" -> iconWeatherURL = "https://openweathermap.org/img/wn/09n@2x.png"
            "10n" -> iconWeatherURL = "https://openweathermap.org/img/wn/10n@2x.png"
            "11n" -> iconWeatherURL = "https://openweathermap.org/img/wn/11n@2x.png"
            "12n" -> iconWeatherURL = "https://openweathermap.org/img/wn/12n@2x.png"
            "13n" -> iconWeatherURL = "https://openweathermap.org/img/wn/13n@2x.png"
            "50n" -> iconWeatherURL = "https://openweathermap.org/img/wn/50n@2x.png"
            "01d" -> iconWeatherURL = "https://openweathermap.org/img/wn/01d@2x.png"
            "02d" -> iconWeatherURL = "https://openweathermap.org/img/wn/02d@2x.png"
            "03d" -> iconWeatherURL = "https://openweathermap.org/img/wn/03d@2x.png"
            "04d" -> iconWeatherURL = "https://openweathermap.org/img/wn/04d@2x.png"
            "05d" -> iconWeatherURL = "https://openweathermap.org/img/wn/05d@2x.png"
            "06d" -> iconWeatherURL = "https://openweathermap.org/img/wn/06d@2x.png"
            "07d" -> iconWeatherURL = "https://openweathermap.org/img/wn/07d@2x.png"
            "08d" -> iconWeatherURL = "https://openweathermap.org/img/wn/08d@2x.png"
            "09d" -> iconWeatherURL = "https://openweathermap.org/img/wn/09d@2x.png"
            "10d" -> iconWeatherURL = "https://openweathermap.org/img/wn/10d@2x.png"
            "11d" -> iconWeatherURL = "https://openweathermap.org/img/wn/11d@2x.png"
            "12d" -> iconWeatherURL = "https://openweathermap.org/img/wn/12d@2x.png"
            "13d" -> iconWeatherURL = "https://openweathermap.org/img/wn/13d@2x.png"
            "50d" -> iconWeatherURL = "https://openweathermap.org/img/wn/50d@2x.png"
        }
    }
}


