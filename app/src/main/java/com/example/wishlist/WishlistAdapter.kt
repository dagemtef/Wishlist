package com.example.wishlist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class WishlistAdapter(private val items: List<Item>) : RecyclerView.Adapter<WishlistAdapter.ViewHolder>(){

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val itemname: TextView
        val itemprice: TextView
        val itemstore: TextView

        init {
            itemname = itemView.findViewById(R.id.name)
            itemprice = itemView.findViewById(R.id.price)
            itemstore = itemView.findViewById(R.id.store)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        val contactView = inflater.inflate(R.layout.wishlist_layout, parent, false)
        return ViewHolder(contactView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items.get(position)

        holder.itemname.text = item.name
        holder.itemprice.text = item.price
        holder.itemstore.text = item.store
    }

    override fun getItemCount(): Int {
        return items.size
    }
}