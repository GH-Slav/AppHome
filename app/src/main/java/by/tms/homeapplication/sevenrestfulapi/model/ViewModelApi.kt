package by.tms.homeapplication.sevenrestfulapi.model

import androidx.lifecycle.ViewModel
import by.tms.homeapplication.fivefood.model.Food
import by.tms.homeapplication.sevenrestfulapi.entity.CityWeatherData

class ViewModelApi : ViewModel() {

    var data: CityWeatherData? = null

}