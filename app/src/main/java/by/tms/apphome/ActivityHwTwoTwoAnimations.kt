package by.tms.apphome

import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_hw_two_layout_two_animations.*


class ActivityHwTwoTwoAnimations: AppCompatActivity() {


    private lateinit var rocketAnimation: AnimationDrawable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hw_two_layout_two_animations)

        val rocketImage = viewAnimations.apply {
            setBackgroundResource(R.drawable.cat)
            rocketAnimation = background as AnimationDrawable
        }
        rocketImage.setOnClickListener { rocketAnimation.start()}
    }
}
