package by.tms.homeapplication.FourFlower.activity

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import by.tms.homeapplication.FourFlower.collections.FlowerArrayList
import by.tms.homeapplication.FourFlower.model.Flower
import by.tms.homeapplication.R
import kotlinx.android.synthetic.main.add_flower.*


class AddFlower : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.add_flower)

        addFlowerToList.setOnClickListener {
            if (imageUrl.text.isNotEmpty() && flowerName.text.isNotEmpty() && editFlowerPrice.text.isNotEmpty()) {
                FlowerArrayList.instance.list.add(
                    Flower(
                        imageUrl.text.toString(),
                        flowerName.text.toString(),
                        editFlowerPrice.text.toString().toDouble()
                    )
                )
            }
            Toast.makeText(this, R.string.added, Toast.LENGTH_SHORT).show()
            imageUrl.text.clear()
            flowerName.text.clear()
            editFlowerPrice.text.clear()

        }
    }
}

