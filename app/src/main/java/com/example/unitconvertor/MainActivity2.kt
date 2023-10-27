package com.example.unitconvertor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val imagekm = findViewById<ImageView>(R.id.kmTOm)
        imagekm.setOnClickListener{
            val intent = Intent(this,km_to_m::class.java)
            startActivity(intent)
        }

    }
}