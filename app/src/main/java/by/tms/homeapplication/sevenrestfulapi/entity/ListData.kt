package by.tms.homeapplication.sevenrestfulapi.entity

data class ListData(
    val coord: Coord,
    val main: Main,
    val name: String,
    val weather: List<Weather>
)