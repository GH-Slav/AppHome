package by.tms.homeapplication.FiveFood.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import by.tms.homeapplication.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_food_data.*
import kotlinx.android.synthetic.main.activity_food_data.view.*
import kotlinx.android.synthetic.main.activity_food_data.view.calorieFoodData
import kotlinx.android.synthetic.main.activity_food_data.view.imageFoodData
import kotlinx.android.synthetic.main.activity_food_data.view.nameFoodData
import kotlinx.android.synthetic.main.activity_food_data.view.priceFoodData

class DataFood : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_data)

        nameFoodData.text = intent.getStringExtra(NAME)
        calorieFoodData.text = intent.getStringExtra(CALORIE)
        priceFoodData.text = intent.getStringExtra(PRICE)
        Picasso.get().load(intent.getStringExtra(URL)).into(imageFoodData)
    }
}
