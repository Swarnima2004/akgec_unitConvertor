package com.example.unitconvertor

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.unitconvertor.R.id

class kg_to_g : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kg_to_g)
        val textView = findViewById<EditText>(id.editText)
        val edit = findViewById<TextView>(id.Gram)
        val convert = findViewById<Button>(id.con)
        val Convert = findViewById<Button>(id.Convert)
        val meter = findViewById<EditText>(id.gram)
        val kilometer = findViewById<TextView>(id.kilogram)

        convert.setOnClickListener{
            val kg = textView.getText().toString()
            val g = 1000*kg.toInt()
            edit.setText("VALUE IN GRAM : $g")
        }
        Convert.setOnClickListener{
            val meter = meter.getText().toString()
            val k = meter.toInt()
            val kilo = k/1000.toDouble()
            kilometer.setText("VALUE IN KILOGRAM : $kilo")
        }

    }
}