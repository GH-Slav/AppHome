package by.tms.homeapplication.twoanimationsandflags

import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import by.tms.homeapplication.R
import kotlinx.android.synthetic.main.animations.*


class Animations: AppCompatActivity() {


    private lateinit var rocketAnimation: AnimationDrawable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.animations)

        val rocketImage = viewAnimations.apply {
            setBackgroundResource(R.drawable.cat)
            rocketAnimation = background as AnimationDrawable
        }
        rocketImage.setOnClickListener { rocketAnimation.start()}
    }
}
