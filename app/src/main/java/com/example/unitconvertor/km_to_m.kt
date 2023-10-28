package com.example.unitconvertor

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class km_to_m : AppCompatActivity() {
//
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_km_to_m)
        val textView = findViewById<EditText>(R.id.editText)
        val edit = findViewById<TextView>(R.id.METER)
        val convert = findViewById<Button>(R.id.con)
        val Convert = findViewById<Button>(R.id.Convert)
        val meter = findViewById<EditText>(R.id.meter)
        val kilometer = findViewById<TextView>(R.id.kilometer)

        convert.setOnClickListener{
            val km = textView.getText().toString()
            val m = 1000*km.toInt()
            edit.setText("VALUE IN METER : $m")
        }
        Convert.setOnClickListener{
            val meter = meter.getText().toString()
            val k = meter.toInt()
            val kilo = k/1000.toDouble()
            kilometer.setText("VALUE IN KILOMETER : $kilo")
        }
    }
}


