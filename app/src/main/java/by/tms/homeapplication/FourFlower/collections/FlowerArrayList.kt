package by.tms.homeapplication.FourFlower.collections

import by.tms.homeapplication.FourFlower.model.Flower

open class FlowerArrayList {
  val list = ArrayList<Flower>()

    companion object {
        val instance = FlowerArrayList()
    }
}

