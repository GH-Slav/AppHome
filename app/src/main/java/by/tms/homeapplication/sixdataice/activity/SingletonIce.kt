package by.tms.homeapplication.sixdataice.activity

import android.content.Context
import androidx.room.Room
import by.tms.homeapplication.sixdataice.data.IceDataBase

class SingletonIce(context: Context) {
    val databaseIce by lazy {
        Room.databaseBuilder(
            context,
            IceDataBase::class.java,
            "ice-database"
        ).build()
    }

    companion object {
        fun getInstance(context: Context) = SingletonIce(context)
    }

}
