package by.tms.homeapplication.fivefood.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import by.tms.homeapplication.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_food_data.*

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
