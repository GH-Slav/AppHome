package by.tms.homeapplication.fourflower.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import by.tms.homeapplication.fourflower.collections.FlowerArrayList
import by.tms.homeapplication.fourflower.fragment.FragmentBottom
import by.tms.homeapplication.fourflower.fragment.FragmentTop
import by.tms.homeapplication.fourflower.model.ViewModelFlower
import by.tms.homeapplication.R
import kotlinx.android.synthetic.main.activity_flower.*

const val URL = "URL"
const val NAME = "NAME"
const val PRICE = "PRICE"

class ActivityFlower : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flower)

        //Вызываем нажатие по ид
        addTopFragment.setOnClickListener(this)
        addBottomFragment.setOnClickListener(this)
        removeTopFragment.setOnClickListener(this)
        removeBottomFragment.setOnClickListener(this)
        addFlower.setOnClickListener(this)
        topFragment.setOnClickListener(this)
        bottomFragment.setOnClickListener(this)

        val model = ViewModelProvider(this).get(ViewModelFlower::class.java)
    }

    override fun onClick(v: View?) {

        when (v?.id) {
            R.id.addTopFragment -> {
                val model = ViewModelProvider(this).get(ViewModelFlower::class.java)
                val list = FlowerArrayList.instance.list[0]
                model.name = list.name
                model.price = list.price.toString()
                model.url = list.url
                val fragmentTop = FragmentTop()
                supportFragmentManager.beginTransaction().replace(R.id.topFragment, fragmentTop)
                    .commit()
            }
            R.id.addBottomFragment -> {
                val model = ViewModelProvider(this).get(ViewModelFlower::class.java)
                val list = FlowerArrayList.instance.list[1]
                model.name = list.name
                model.price = list.price.toString()
                model.url = list.url
                val fragmentBottom = FragmentBottom()
                supportFragmentManager.beginTransaction()
                    .replace(R.id.bottomFragment, fragmentBottom)
                    .commit()
            }
            R.id.removeTopFragment -> {
                val currentTopFragment =
                    supportFragmentManager.findFragmentById(R.id.topFragment)
                currentTopFragment?.let { thisFragment ->
                    supportFragmentManager.beginTransaction().remove(thisFragment).commit()
                }
            }
            R.id.removeBottomFragment -> {
                val currentBottomFragment =
                    supportFragmentManager.findFragmentById(R.id.bottomFragment)
                currentBottomFragment?.let { thisFragment ->
                    supportFragmentManager.beginTransaction().remove(thisFragment).commit()
                }
            }
            R.id.addFlower -> {
                val intent = Intent(this, AddFlower::class.java)
                startActivity(intent)
            }

            R.id.topFragment -> {
                val list = FlowerArrayList.instance.list[0]
                val intent = Intent(this, FlowerDataTop::class.java)
                intent.putExtra(URL, list.url)
                intent.putExtra(NAME, list.name)
                intent.putExtra(PRICE, list.price)
                startActivity(intent)
            }
            R.id.bottomFragment -> {
                val list = FlowerArrayList.instance.list[1]
                val intent = Intent(this, FlowerDataBottom::class.java)
                intent.putExtra(URL, list.url)
                intent.putExtra(NAME, list.name)
                intent.putExtra(PRICE, list.price)
                startActivity(intent)
            }

        }
    }
}