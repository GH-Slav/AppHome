package by.tms.homeapplication.fourflower.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import by.tms.homeapplication.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.fragment_top_layout.*

class FlowerDataTop : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_top_layout)

        nameTop.text = intent.getStringExtra(NAME)
        priceTop.text = intent.getDoubleExtra(PRICE, 0.0).toString()
        Picasso.get().load(intent.getStringExtra(URL))
            .placeholder(R.drawable.flower_01).into(imageFragmentTop)

    }

}