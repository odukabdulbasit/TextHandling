package com.odukabdulbasit.texthandling

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText: EditText = findViewById(R.id.editText)
        val buttonShowText: Button = findViewById(R.id.buttonShowText)
        val textView: TextView = findViewById(R.id.textView)

        buttonShowText.setOnClickListener {
            val inputText = editText.text.toString()
            textView.text = "You entered: $inputText"
        }
    }
}
