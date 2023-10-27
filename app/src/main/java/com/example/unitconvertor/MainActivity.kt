package com.example.unitconvertor

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

import android.widget.TextView
import androidx.core.os.postDelayed

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView)
        val label = "UNIT CONVERTOR"
        val stringBuilder = StringBuilder()

        Thread{
            for (letter in label){
                stringBuilder.append(letter)
                Thread.sleep(300)
                runOnUiThread {
                    textView.text = stringBuilder.toString()
                }
            }
        }.start()
        //add second activity
        Handler(Looper.getMainLooper()).postDelayed(5000){
            val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)

        }
//        val imagekm = findViewById<ImageView>(R.id.kmTOm)
//        imagekm.setOnClickListener{
//            val intent = Intent(this,km_to_m::class.java)
//            startActivity(intent)
//        }




    }
}