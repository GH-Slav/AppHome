package by.tms.homeapplication.FourFlower.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import by.tms.homeapplication.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.fragment_bottom_layout.*


class FlowerDataBottom : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_bottom_layout)

        nameBottom.text = intent.getStringExtra(NAME)
        priceBottom.text = intent.getDoubleExtra(PRICE, 0.0).toString()
        Picasso.get().load(intent.getStringExtra(URL))
            .placeholder(R.drawable.flower_01).into(imageFragmentBottom)


    }

}