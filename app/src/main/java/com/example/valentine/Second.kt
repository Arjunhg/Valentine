package com.example.valentine

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView

class Second : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        supportActionBar?.hide()

        val history = findViewById<TextView>(R.id.textView2)
        val message = findViewById<TextView>(R.id.textView3)

        val text = findViewById<TextView>(R.id.textView4)

        history.setOnClickListener {
            intent = Intent(this, History::class.java)
            startActivity(intent) }

        message.setOnClickListener {
            intent = Intent(this, secret::class.java)
            startActivity(intent)
            }


        text.setOnClickListener {
            Toast.makeText(applicationContext, "Then, Now and Forever;) ...!", Toast.LENGTH_SHORT).show()
        }

    }}