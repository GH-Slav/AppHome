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
                    + "lon  " + listWeatherData?.list?.get(position)?.coord?.lon.toString()
                    + listWeatherData?.list?.get(position)?.weather?.get(0)?.icon)

        val iconWeatherURL: String = "https://openweathermap.org/img/wn/${
        listWeatherData?.list?.get(position)?.weather?.get(0)?.icon
        }@2x.png"

        Picasso.get().load(iconWeatherURL).placeholder(R.drawable.weather_icon)
            .transform(CircleTransform()).into(myView.list_icon_api)
    }
}


