package com.example.bmi.ui.theme

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.bmi.R

class MainActivity2 : AppCompatActivity() {

    val button by lazy  { findViewById<Button>(com.example.bmi.R.id.button) }
    val editTextTextWeight by lazy { findViewById<EditText>(com.example.bmi.R.id.editTextTextWeight) }
    val editTextTextHeight by lazy { findViewById<EditText>(com.example.bmi.R.id.editTextTextHeight) }
    val editTextBMI  by lazy { findViewById<EditText>(com.example.bmi.R.id.editTextBMI) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        button.setOnClickListener {

            val Weighttext: String = editTextTextWeight.getText().toString()

            val Weight = Weighttext.toFloat()
            val Heighttext: String = editTextTextHeight.getText().toString()

            val Height = Heighttext.toFloat()
            val Bmi = Weight/(Height*Height)
            editTextBMI.setText(Bmi.toInt())

        }
    }
}