package com.example.affirmations.data

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations.R
import com.example.affirmations.adapter.ItemAdapter
import com.example.affirmations.model.Item


class Datasource {

    fun loadAffirmations(): List<Item> {
        return listOf<Item>(
            Item(R.string.crop1, R.drawable.parsnip, 35),
            Item(R.string.crop2, R.drawable.potato, 80),
            Item(R.string.crop3, R.drawable.kale, 110),
            Item(R.string.crop4, R.drawable.strawberry, 120),
            Item(R.string.crop5, R.drawable.cauliflower, 175),
            Item(R.string.crop6, R.drawable.garlic, 60),
            Item(R.string.crop7, R.drawable.green_bean, 40),
            Item(R.string.crop8, R.drawable.rhubarb, 220),
            Item(R.string.crop9, R.drawable.blue_jazz, 50),
            Item(R.string.crop10, R.drawable.coffee_bean, 15)
        )
    }
}