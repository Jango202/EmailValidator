package com.project.emailvalidator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextUserInput = findViewById<EditText>(R.id.editTextUserInput)
        val buttonChangeText = findViewById<Button>(R.id.buttonChangeText)
        val buttonOpenActivityAndChangeText = findViewById<Button>(R.id.buttonOpenActivityAndChangeText)
        val textView = findViewById<TextView>(R.id.textView)

        buttonChangeText.setOnClickListener {
            val input = editTextUserInput.text.toString()
            textView.text = input
        }

        buttonOpenActivityAndChangeText.setOnClickListener {
            val input = editTextUserInput.text.toString()
            val intent = Intent(this, ShowTextActivity::class.java)
            intent.putExtra("user_input", input)
            startActivity(intent)
        }
    }
}
