package by.tms.myapphome

import android.graphics.drawable.AnimatedImageDrawable
import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_hw_two_layout_two_animations.*


class ActivityHwTwoTwoAnimations: AppCompatActivity(){


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hw_two_layout_two_animations)

        val image = viewAnimations

        image.setBackgroundResource(R.drawable.cat)

        val startAnimations = AnimationDrawable(image.background)

        startAnimations.start()
    }
}