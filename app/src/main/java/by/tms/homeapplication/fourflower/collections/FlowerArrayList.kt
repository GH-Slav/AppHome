package by.tms.homeapplication.fourflower.collections

import by.tms.homeapplication.fourflower.model.Flower

open class FlowerArrayList {
  val list = ArrayList<Flower>()

    companion object {
        val instance = FlowerArrayList()
    }
}

