package by.tms.homeapplication.OneMyFirstApp

import android.os.Bundle
import by.tms.homeapplication.MainActivity
import by.tms.homeapplication.R

open class ActivityOne: MainActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_one)
    }
}