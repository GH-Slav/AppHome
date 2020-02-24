package by.tms.myapphome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View


open class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonOne = findViewById<View>(R.id.button1)
        buttonOne.setOnClickListener(this)


    }

    override fun onClick(v: View?) {

        val intent = Intent(this, ActivityTwo::class.java)
        startActivity(intent)
    }




}
