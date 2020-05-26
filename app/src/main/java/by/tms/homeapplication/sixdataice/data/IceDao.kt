package by.tms.homeapplication.sixdataice.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import by.tms.homeapplication.sixdataice.activity.NameListIce
import by.tms.homeapplication.sixdataice.activity.WeightListIce

@Dao
interface IceDao {
    @Insert
    suspend fun addIce(ice: Ice)

    @Query("SELECT * FROM Ice")
    suspend fun getAllIce(): List<Ice>

    @Query("SELECT name FROM Ice")
    suspend fun getIceListName(): List<NameListIce>

    @Query("SELECT * FROM Ice WHERE types = :types")
    suspend fun getIceByTypes(types: String): List<Ice>

    @Query("SELECT DISTINCT weight FROM Ice WHERE weight > 2.2 AND weight < 50.5")
    suspend fun getIceListWeight(): List<WeightListIce>

    @Query("SELECT name FROM Ice WHERE price < 600 OR calorie >= 10")
    suspend fun getIceListNamesWhereCaloriePrice(): List<NameListIce>
}