package by.tms.homeapplication.sixdataice.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Ice(
    @PrimaryKey
    val id: Int,
    @ColumnInfo(name = "name")
    val name: String,
    @ColumnInfo(name = "calorie")
    val calorie: Int,
    @ColumnInfo(name = "types")
    val types: String,
    @ColumnInfo(name = "weight")
    val weight: Double,
    @ColumnInfo(name = "price")
    val price: Double
)