package by.tms.homeapplication.sixdataice.data

import androidx.room.Database
import androidx.room.RoomDatabase


@Database(entities = arrayOf(Ice::class), version = 1)
abstract class IceDataBase : RoomDatabase() {
    abstract fun getIceDao(): IceDao
}


