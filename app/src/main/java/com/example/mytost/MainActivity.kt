package com.example.mytost

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Toast1 = findViewById<Button>(R.id.btn)

        Toast1.setOnClickListener {
         Toast.makeText(this, "Pressed Me", Toast.LENGTH_SHORT).show()
        }
    }
}