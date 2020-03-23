package by.tms.homeapplication.FiveFood.collections

import androidx.lifecycle.ViewModel
import by.tms.homeapplication.FiveFood.model.Food

class ViewModelFood : ViewModel() {

    val nut = ArrayList<Food>()

    var url = "url"
    var name = "name"
    var calorie = "calorie"
    var price = "price"

    fun getFood() {
        nut.add(Food("Грецкий орех",654,18.8,"https://cdn.pixabay.com/photo/2016/10/13/22/52/walnut-1739021__340.jpg"))
        nut.add(Food("Кешью", 553, 11.1, "https://cdn.pixabay.com/photo/2018/07/08/08/44/anacardium-3523449__340.jpg"))
        nut.add(Food("Арахис", 567, 14.4, "https://cdn.pixabay.com/photo/2018/11/18/15/08/peanuts-3823362__340.jpg"))
        nut.add(Food("Каштан", 131, 5.6, "https://cdn.pixabay.com/photo/2013/11/26/20/02/chestnuts-218781__340.jpg"))
        nut.add(Food("Кедровые орешки", 673, 17.7, "https://cdn.pixabay.com/photo/2018/01/29/21/50/pine-nuts-3117327__340.jpg"))
        nut.add(Food("Миндаль", 576, 12.1, "https://cdn.pixabay.com/photo/2016/08/05/08/58/almonds-1571810__340.jpg"))
        nut.add(Food("Пекан", 690, 18.8, "https://cdn.pixabay.com/photo/2016/02/22/03/51/pecans-1214711__340.jpg"))
        nut.add(Food("Фисташки", 562, 14.9, "https://cdn.pixabay.com/photo/2012/02/22/20/14/background-15638__340.jpg"))
        nut.add(Food("Фундук", 628, 9.3, "https://cdn.pixabay.com/photo/2019/10/11/19/17/nuts-4542581__340.jpg"))
        nut.add(Food("Грецкий орех",654,18.8,"https://cdn.pixabay.com/photo/2016/10/13/22/52/walnut-1739021__340.jpg"))
        nut.add(Food("Кешью", 553, 11.1, "https://cdn.pixabay.com/photo/2018/07/08/08/44/anacardium-3523449__340.jpg"))
        nut.add(Food("Арахис", 567, 14.4, "https://cdn.pixabay.com/photo/2018/11/18/15/08/peanuts-3823362__340.jpg"))
        nut.add(Food("Каштан", 131, 5.6, "https://cdn.pixabay.com/photo/2013/11/26/20/02/chestnuts-218781__340.jpg"))
        nut.add(Food("Кедровые орешки", 673, 17.7, "https://cdn.pixabay.com/photo/2018/01/29/21/50/pine-nuts-3117327__340.jpg"))
        nut.add(Food("Миндаль", 576, 12.1, "https://cdn.pixabay.com/photo/2016/08/05/08/58/almonds-1571810__340.jpg"))
        nut.add(Food("Пекан", 690, 18.8, "https://cdn.pixabay.com/photo/2016/02/22/03/51/pecans-1214711__340.jpg"))
        nut.add(Food("Фисташки", 562, 14.9, "https://cdn.pixabay.com/photo/2012/02/22/20/14/background-15638__340.jpg"))
        nut.add(Food("Фундук", 628, 9.3, "https://cdn.pixabay.com/photo/2019/10/11/19/17/nuts-4542581__340.jpg"))
    }
}