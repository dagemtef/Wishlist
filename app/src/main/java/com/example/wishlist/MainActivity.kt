package com.example.wishlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.wishlist.WishlistAdapter

class MainActivity : AppCompatActivity() {
    var items: List<Item> = emptyList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.userinput)

        val button = findViewById<Button>(R.id.submitButton)
        val itemInput = findViewById<EditText>(R.id.itemInput)
        val priceInput = findViewById<EditText>(R.id.priceInput)
        val storeInput = findViewById<EditText>(R.id.storeInput)
        var counter = 0
        button.setOnClickListener {
            counter++
            val itemName = itemInput.text.toString()
            val itemPrice = priceInput.text.toString()
            val itemStore = storeInput.text.toString()
            itemInput.text.clear()
            priceInput.text.clear()
            storeInput.text.clear()


            var myItem = Item()
            myItem.name = itemName
            myItem.price = itemPrice
            myItem.store = itemStore
            items += myItem

            val wishAdapter = WishlistAdapter(items)
            val recycle = findViewById<RecyclerView>(R.id.recycler2)
            recycle.adapter = wishAdapter
            recycle.layoutManager = LinearLayoutManager(this)

        }
    }
}


