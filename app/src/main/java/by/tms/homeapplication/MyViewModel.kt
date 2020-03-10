package by.tms.homeapplication

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.util.ArrayList

class MyViewModel: ViewModel() {

    val currentStats = MutableLiveData<ArrayList<Int>>()

    var confirmed = 0
    var recovered = 0
    var dead = 0

 fun getDataFromInternet() {viewModelScope.launch { delay(2000)

     val list = ArrayList<Int>()
     list.add(2000000)
     list.add(10000)
     list.add(444)

     currentStats.postValue(list) }

    }
}