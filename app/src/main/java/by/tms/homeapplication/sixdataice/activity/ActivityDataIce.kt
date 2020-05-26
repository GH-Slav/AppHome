package by.tms.homeapplication.sixdataice.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import by.tms.homeapplication.R
import by.tms.homeapplication.sixdataice.data.Ice
import kotlinx.android.synthetic.main.activity_data_ice.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class ActivityDataIce : AppCompatActivity(), View.OnClickListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_ice)

        addDataIce.setOnClickListener(this)
        resultAllDataIce.setOnClickListener(this)
        resultNameDataIce.setOnClickListener(this)
        resultNamesCaloriePriceDataIce.setOnClickListener(this)
        resultTypesDataIce.setOnClickListener(this)
        resultWeightDataIce.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val databaseIce = SingletonIce.getInstance(this).databaseIce
        when (v?.id) {
            addDataIce.id -> {
                CoroutineScope(Dispatchers.IO).launch {

                    databaseIce.getIceDao().addIce(
                                Ice(editId.text.toString().toInt(),
                                    "${editName.text}",
                                    editCalorie.text.toString().toInt(),
                                    "${editTypes.text}",
                                    editWeight.text.toString().toDouble(),
                                    editPrice.text.toString().toDouble())
                    )
                    withContext(Dispatchers.Main) {
                        editId.text.clear()
                        editName.text.clear()
                        editCalorie.text.clear()
                        editTypes.text.clear()
                        editWeight.text.clear()
                        editPrice.text.clear()
                        Toast.makeText(applicationContext, R.string.added, Toast.LENGTH_SHORT).show()
                    }
                }
            }
            resultAllDataIce.id -> {
                CoroutineScope(Dispatchers.IO).launch {
                    val dataIce = databaseIce.getIceDao().getAllIce()
                    withContext(Dispatchers.Main) {
                        resultTextDataIce.text = dataIce.toString()
                    }
                }
            }
            resultNameDataIce.id -> {
                CoroutineScope(Dispatchers.IO).launch {
                    val dataIce = databaseIce.getIceDao().getIceListName()
                    withContext(Dispatchers.Main) {
                        resultTextDataIce.text = dataIce.toString()
                    }
                }
            }
            resultTypesDataIce.id -> {
                CoroutineScope(Dispatchers.IO).launch {
                    val dataIce = databaseIce.getIceDao().getIceByTypes("Стакан")
                    withContext(Dispatchers.Main) {
                        resultTextDataIce.text = dataIce.toString()
                    }
                }
            }
            resultWeightDataIce.id -> {
                CoroutineScope(Dispatchers.IO).launch {
                    val dataIce = databaseIce.getIceDao().getIceListWeight()
                    withContext(Dispatchers.Main) {
                        resultTextDataIce.text = dataIce.toString()
                    }
                }
            }
            resultNamesCaloriePriceDataIce.id -> {
                CoroutineScope(Dispatchers.IO).launch {
                    val dataIce = databaseIce.getIceDao().getIceListNamesWhereCaloriePrice()
                    withContext(Dispatchers.Main) {
                        resultTextDataIce.text = dataIce.toString()
                    }
                }
            }
        }
    }
}

