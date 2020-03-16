package by.tms.homeapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import by.tms.homeapplication.FourFlower.activity.ActivityFlower
import by.tms.homeapplication.OneMyFirstApp.ActivityOne
import by.tms.homeapplication.Three.CoronaVirus
import by.tms.homeapplication.Two.ActivityTwo
import kotlinx.android.synthetic.main.activity_main.*

open class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener {
            val intent = Intent(this, ActivityOne::class.java)
            startActivity(intent)
        }

        button2.setOnClickListener {
            val intent = Intent(this, ActivityTwo::class.java)
            startActivity(intent)
        }

        button3.setOnClickListener {
            val intent = Intent(this, CoronaVirus::class.java)
            startActivity(intent)
        }

        button4.setOnClickListener {
            val intent = Intent(this, ActivityFlower::class.java)
            startActivity(intent)
        }


    }
}
