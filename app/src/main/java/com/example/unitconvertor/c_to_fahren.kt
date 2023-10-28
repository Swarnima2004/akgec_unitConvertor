package com.example.unitconvertor

import android.annotation.SuppressLint
import android.os.Bundle
import android.text.InputType
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class c_to_fahren : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cto_fahren)
        val textView = findViewById<EditText>(R.id.editText)
        val edit = findViewById<TextView>(R.id.Fahren)
        val convert = findViewById<Button>(R.id.con)
        val Convert = findViewById<Button>(R.id.Convert)
        val meter = findViewById<EditText>(R.id.fahren)
        val kilometer = findViewById<TextView>(R.id.celsius)

        convert.setOnClickListener{
            val cel = textView.getText().toString()
            val c = cel.toDouble()
            val fah = (1.8*c+32).toDouble()
            edit.setText("VALUE IN FAHRENHIET : $fah")
        }
        Convert.setOnClickListener{
            val fahren = meter.getText().toString()
            val f = fahren.toDouble()
            val cel =(0.555*(f-32))
            kilometer.setText("VALUE IN CELSIUS : $cel")
        }
    }
}


