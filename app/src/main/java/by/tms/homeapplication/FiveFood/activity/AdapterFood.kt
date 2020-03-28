package by.tms.homeapplication.FiveFood.activity

import android.content.Intent
import android.content.pm.ActivityInfo
import android.content.res.Configuration
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStoreOwner
import androidx.recyclerview.widget.RecyclerView
import by.tms.homeapplication.FiveFood.collections.ViewModelFood
import by.tms.homeapplication.FiveFood.fragment.FragmentFoodData
import by.tms.homeapplication.FiveFood.model.Food
import by.tms.homeapplication.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_food.view.*

class AdapterFood(val list: ArrayList<Food>) : RecyclerView.Adapter<AdapterFood.FoodViewHolder>() {


    class FoodViewHolder(view: View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.item_food, parent, false)
        return FoodViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        val myView = holder.itemView

        myView.nameFood.text = list.get(position).name
        myView.calorieFood.text = list.get(position).calorie.toString()
        myView.priceFood.text = (list.get(position).price.toString() + "  USD")
        Picasso.get().load(list.get(position).urlImage).into(myView.imageFood)

        myView.setOnClickListener {
            val orientation = myView.context.resources.configuration.orientation
            val vertical = Configuration.ORIENTATION_PORTRAIT
            if (orientation == vertical) {
                val intent = Intent(holder.itemView.context, DataFood::class.java)
                intent.putExtra(NAME, list.get(position).name)
                intent.putExtra(CALORIE, list.get(position).calorie.toString())
                intent.putExtra(PRICE, (list.get(position).price.toString() + "  USD"))
                intent.putExtra(URL, list.get(position).urlImage)
                holder.itemView.context.startActivity(intent)
            } else {
                val model =
                    ViewModelProvider(holder.itemView.context as ActivityFood).get(ViewModelFood::class.java)
                model.name = list.get(position).name
                model.calorie = list.get(position).calorie.toString()
                model.price = (list.get(position).price.toString() + "  USD")
                model.url = list.get(position).urlImage
                val fragmentFood = FragmentFoodData()
                (holder.itemView.context as ActivityFood).supportFragmentManager.beginTransaction()
                    .replace(R.id.fragmentFood, fragmentFood)
                    .commit()
            }

        }
    }


}