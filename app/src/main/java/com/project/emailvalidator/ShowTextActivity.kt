package com.project.emailvalidator

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ShowTextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_text)

        val textViewShow = findViewById<TextView>(R.id.textViewShow)
        val input = intent.getStringExtra("user_input") ?: ""
        textViewShow.text = input
    }
}