package com.example.unitconvertor

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class mm_to_in : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mm_to_in)

        val textView = findViewById<EditText>(R.id.editText)
        val edit = findViewById<TextView>(R.id.Mili)
        val convert = findViewById<Button>(R.id.con)
        val Convert = findViewById<Button>(R.id.Convert)
        val meter = findViewById<EditText>(R.id.mili)
        val kilometer = findViewById<TextView>(R.id.inch)

        convert.setOnClickListener{
            val inch = textView.getText().toString()
            val m = inch.toDouble()
            val mil = (25.4*m)
            edit.setText("VALUE IN MILIMETERS : $mil")
        }
        Convert.setOnClickListener{
            val milim = meter.getText().toString()
            val i = milim.toDouble()
            val inch = 0.0394*i
            kilometer.setText("VALUE IN INCHES : $inch")
        }
    }
}