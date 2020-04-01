package by.tms.homeapplication.sevenrestfulapi.entity

data class CityWeatherData(
    val main: Main,
    val name: String,
    val timezone: Int,
    val weather: List<Weather>
)