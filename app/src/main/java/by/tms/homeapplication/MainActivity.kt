package by.tms.homeapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import by.tms.homeapplication.fivefood.activity.ActivityFood
import by.tms.homeapplication.fourflower.activity.ActivityFlower
import by.tms.homeapplication.onemyfirstapp.ActivityOne
import by.tms.homeapplication.sevenrestfulapi.activity.ActivityRestfulApi
import by.tms.homeapplication.sixdataice.activity.ActivityDataIce
import by.tms.homeapplication.threecoronavm.CoronaVirus
import by.tms.homeapplication.twoanimationsandflags.ActivityTwo
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

        button5.setOnClickListener {
            val intent = Intent(this, ActivityFood::class.java)
            startActivity(intent)
        }

        button6.setOnClickListener {
            val intent = Intent(this, ActivityDataIce::class.java)
            startActivity(intent)
        }

        button7.setOnClickListener {
            val intent = Intent(this, ActivityRestfulApi::class.java)
            startActivity(intent)
        }


    }
}
