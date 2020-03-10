package by.tms.homeapplication.Three

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import by.tms.homeapplication.R
import kotlinx.android.synthetic.main.activity_corona_virus.*

class CoronaVirus : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_corona_virus)
        val model = ViewModelProvider(this).get(MyViewModel::class.java)
        lifecycle.addObserver(MyLifeObserver())
        plusConfBtn.setOnClickListener(this)
        plusDeadBtn.setOnClickListener(this)
        plusRecBtn.setOnClickListener(this)

        showStats()

        model.currentStats.observe(this, Observer {
            confirmedCount.text = it.get(0).toString()
            recoveredCount.text = it.get(1).toString()
            deadCount.text = it.get(2).toString()
        })

        refreshData.setOnClickListener { model.getDataFromInternet() }
    }

    private fun showStats() {
        val model = ViewModelProvider(this).get(MyViewModel::class.java)
        confirmedCount.text = model.confirmed.toString()
        recoveredCount.text = model.recovered.toString()
        deadCount.text = model.dead.toString()
    }

    override fun onClick(v: View?) {
        val model = ViewModelProvider(this).get(MyViewModel::class.java)
        when (v?.id) {
            R.id.plusConfBtn -> {
                model.confirmed++
                confirmedCount.text = model.confirmed.toString()
            }
            R.id.plusDeadBtn -> {
                model.dead++
                deadCount.text = model.confirmed.toString()
            }
            R.id.plusRecBtn -> {
                model.recovered++
                recoveredCount.text = model.confirmed.toString()
            }

        }
    }
}