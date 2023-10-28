package com.example.unitconvertor

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val imagekm = findViewById<ImageView>(R.id.km_m)
        imagekm.setOnClickListener{
            val intent = Intent(this,km_to_m::class.java)
            startActivity(intent)
        }
        val imagekg = findViewById<ImageView>(R.id.kg_g)
        imagekg.setOnClickListener{
            val intent = Intent(this,kg_to_g::class.java)
            startActivity(intent)
        }
        val imagefahren = findViewById<ImageView>(R.id.c_fahren)
        imagefahren.setOnClickListener{
            val intent = Intent(this,c_to_fahren::class.java)
            startActivity(intent)
        }
        val imagemm = findViewById<ImageView>(R.id.mm_in)
        imagemm.setOnClickListener{
            val intent = Intent(this,mm_to_in::class.java)
            startActivity(intent)
        }

    }
}