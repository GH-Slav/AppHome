package by.tms.homeapplication.twoanimationsandflags

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import by.tms.homeapplication.R
import kotlinx.android.synthetic.main.activity_two.*

class ActivityTwo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two)

        buttonFlag.setOnClickListener {
            val intent = Intent(this, Flags::class.java)
            startActivity(intent)
        }

        buttonAnimated.setOnClickListener {
            val intent = Intent(this, Animations::class.java)
            startActivity(intent)
        }

    }


}