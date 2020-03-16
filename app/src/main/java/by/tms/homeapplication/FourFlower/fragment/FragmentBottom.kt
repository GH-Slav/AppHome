package by.tms.homeapplication.FourFlower.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import by.tms.homeapplication.FourFlower.collections.FlowerArrayList
import by.tms.homeapplication.FourFlower.model.ViewModelFlower
import by.tms.homeapplication.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.fragment_bottom_layout.*
import kotlinx.android.synthetic.main.fragment_top_layout.*


open class FragmentBottom : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_bottom_layout, container, false)

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val model = activity?.run  {ViewModelProvider(this).get(ViewModelFlower::class.java)}
        nameBottom.text = model?.name
        priceBottom.text = model?.price.toString()
        Picasso.get().load(model?.url)
            .placeholder(R.drawable.flower_01).into(imageFragmentBottom)


    }
}
