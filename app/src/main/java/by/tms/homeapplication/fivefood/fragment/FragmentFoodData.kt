package by.tms.homeapplication.fivefood.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import by.tms.homeapplication.fivefood.collections.ViewModelFood
import by.tms.homeapplication.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_food_data_fragment.*

class FragmentFoodData : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.activity_food_data_fragment, container, false)

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val model = activity?.run { ViewModelProvider(this).get(ViewModelFood::class.java) }
        nameFoodDataFragment.text = model?.name
        calorieFoodDataFragment.text = model?.calorie
        priceFoodDataFragment.text = model?.price
        Picasso.get().load(model?.url).into(imageFoodDataFragment)
    }
}