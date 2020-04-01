package by.tms.homeapplication.sevenrestfulapi.activity

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import by.tms.homeapplication.R
import by.tms.homeapplication.sevenrestfulapi.entity.CityWeatherData
import by.tms.homeapplication.sevenrestfulapi.model.CircleTransform
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_list_api.view.*
import java.util.ArrayList

class AdapterApi(private val cityWeatherData: CityWeatherData?) : RecyclerView.Adapter<AdapterApi.ApiViewHolder>() {


    class ApiViewHolder(view: View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ApiViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.item_list_api, parent, false)
        return ApiViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return cityWeatherData?.weather?.size!!
    }

    override fun onBindViewHolder(holder: ApiViewHolder, position: Int) {
        val myView = holder.itemView

        myView.title_text_api.text = cityWeatherData?.name
        myView.one_text_api.text = cityWeatherData?.main.toString()
        myView.two_text_api.text = (cityWeatherData?.timezone.toString())
        Picasso.get().load(cityWeatherData?.weather.toString()).transform(CircleTransform()).into(myView.list_icon_api)

    }
}


