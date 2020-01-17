package com.example.snakerproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.snakerproject.adapter.SnakerAdapter

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recyclerview)

        val recyclerview: RecyclerView = findViewById(R.id.snaker_recycler)

        recyclerview.layoutManager = GridLayoutManager(this, 2)

        val snakerArray = ArrayList<Snakerdataclass>()
        snakerArray.add(Snakerdataclass("001","Snaker tide \nElite FG",R.drawable.snaker1,1999.00))
        snakerArray.add(Snakerdataclass("002","AirForce v2  \nFlyknit",R.drawable.snaker2,1249.00))
        snakerArray.add(Snakerdataclass("003","Jordan ave s2\nRestrose",R.drawable.snaker3,2213.00))
        snakerArray.add(Snakerdataclass("004","Lebron XVI 2\nLow EP IR",R.drawable.snaker4,1234.00))
        snakerArray.add(Snakerdataclass("005","King Bardon\nZer0.2PF" ,R.drawable.snaker5,4522.00))
        snakerArray.add(Snakerdataclass("006","LEBronXXX \nSB EP2",R.drawable.snaker2,3342.00))

        val snakerAdapter = SnakerAdapter(snakerArray)

        recyclerview.adapter = snakerAdapter
    }
}
