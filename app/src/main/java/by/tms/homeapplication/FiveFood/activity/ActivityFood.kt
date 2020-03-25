package by.tms.homeapplication.FiveFood.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import by.tms.homeapplication.FiveFood.collections.ViewModelFood
import by.tms.homeapplication.R
import kotlinx.android.synthetic.main.activity_food.*

const val NAME = "NAME"
const val PRICE = "PRICE"
const val URL = "URL"
const val CALORIE = "CALORIE"

class ActivityFood : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food)

        val model = ViewModelProvider(this).get(ViewModelFood::class.java)
        model.getFood()

        recycleFood.adapter = AdapterFood(model.nut)
        recycleFood.layoutManager = LinearLayoutManager(this)
        recycleFood.setHasFixedSize(true)
    }
}
