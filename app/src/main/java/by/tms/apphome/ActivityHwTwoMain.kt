package by.tms.apphome

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_hw_two_layout_main.*
import kotlinx.android.synthetic.main.activity_main.*

class ActivityHwTwoMain : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hw_two_layout_main)

        buttonFlag.setOnClickListener {
            val intent = Intent(this, ActivityHwTwoOne::class.java)
            startActivity(intent)
        }

        buttonAnimated.setOnClickListener {
            val intent = Intent(this, ActivityHwTwoTwoAnimations::class.java)
            startActivity(intent)
        }

    }


}