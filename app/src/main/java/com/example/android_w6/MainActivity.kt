package com.example.android_w6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.android_w6.R
import java.util.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val itemsList = arrayListOf<ItemModel>()

        // Danh sách các tên ứng dụng
        val appNames = listOf(
            "Facebook",
            "Instagram",
            "Messenger",
            "Pinterest",
            "Snapchat",
            "Tinder",
            "Twitter",
            "WhatsApp"
        )

        val random = Random()

        for (i in 0 until 8) { // Tạo 8 ứng dụng
            val appName = appNames[i]
            val imageResourceName = "thumb${i + 1}"

            itemsList.add(
                ItemModel(
                    resources.getIdentifier(imageResourceName, "drawable", packageName),
                    appName
                )
            )
        }

        val adapter = ItemAdapter(itemsList)
        val recyclerView1 = findViewById<RecyclerView>(R.id.recyclerView1)
        val recyclerView2 = findViewById<RecyclerView>(R.id.recyclerView2)
        val recyclerView3 = findViewById<RecyclerView>(R.id.recyclerView3)
        val recyclerView4 = findViewById<RecyclerView>(R.id.recyclerView4)

        recyclerView1.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView1.adapter = adapter
        recyclerView2.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView2.adapter = adapter
        recyclerView3.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView3.adapter = adapter
        recyclerView4.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView4.adapter = adapter
    }
}
