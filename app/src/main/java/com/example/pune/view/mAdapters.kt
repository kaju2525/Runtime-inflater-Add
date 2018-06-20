package com.example.pune.view

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.pune.demo.R
import com.example.pune.demo.model.Result
import com.example.pune.demo.model.Ride
import kotlinx.android.synthetic.main.ist_item.view.*


class mAdapters(private val list : ArrayList<Result>) : RecyclerView.Adapter<mAdapters.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v=LayoutInflater.from(parent.context).inflate(R.layout.ist_item,parent,false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView),View.OnClickListener {
        private val context: Context =itemView.context
         private lateinit var llRootLayout:LinearLayout

        fun bindItems(model: Result){
            itemView.setOnClickListener(this) // bind the listener

            itemView.tvDate.text=model.date
            itemView.tvNoOfDeliveries.text= "No of scheduled: ${model.ride.size}"
            llRootLayout= itemView.findViewById(R.id.llRootLayout)


            /* runtime Binding Data .....inflater... */

            val layoutInflater: LayoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            var view: View? = null

            llRootLayout.removeAllViews()

            for(ride: Ride in model.ride) {
                view = layoutInflater.inflate(R.layout.row_schedule, llRootLayout, false)

                val avatar=view.findViewById<ImageView>(R.id.user_img)
                val pickup_location=view.findViewById<TextView>(R.id.pickup_location)
                val drop_location=view.findViewById<TextView>(R.id.drop_location)

                avatar.loadFromUrl(ride.avatar)
                pickup_location.text=ride.pickupLocationAddress
                drop_location.text=ride.dropLocationAddress
                llRootLayout.addView(view)

            }


             //itemView.img.loadFromUrl(model.shopAvatar)

        }

        override fun onClick(v: View?) {
         //   Toast.makeText(context,catg_name,Toast.LENGTH_SHORT).show()
        }


        fun ImageView.loadFromUrl(imageUrl:String){
            Glide.with(this).load(imageUrl).into(this)
        }

    }



}

