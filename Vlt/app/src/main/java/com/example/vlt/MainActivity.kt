package com.example.vlt

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var textView: TextView
    lateinit var editText: EditText
    lateinit var button: Button
    lateinit var result: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.textCím)
        editText = findViewById(R.id.editUSD)
        button = findViewById(R.id.buttonConvert)
        result = findViewById(R.id.result)

        button.setOnClickListener{
            //Code to be executed when the button is clicked
            var enteredUsd:String = editText.text.toString()
            var enteredUSDdouble:Double = enteredUsd.toDouble()

            var euros = makeConversion(enteredUSDdouble)

            result.text = "$euros Euros "

        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    fun makeConversion(usd:Double):Double{
        //var euros : Double = usd *0.94
        return usd *0.94
    }
}