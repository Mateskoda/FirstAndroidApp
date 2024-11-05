package com.example.hellokotlin

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var myTextView: TextView
    lateinit var myEditText: EditText
    lateinit var myEditTextOfName: EditText
    lateinit var myEditTExtOfLanguage: EditText
    lateinit var mySayButton:Button
    lateinit var myButton: Button
    lateinit var myImageView: ImageView
    lateinit var myImageViewSecond: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        // set the content view
        setContentView(R.layout.activity_main)

        myTextView = findViewById(R.id.textView77)
        myEditTextOfName = findViewById(R.id.editText2)
        myEditTExtOfLanguage = findViewById(R.id.editText3)
        myEditText = findViewById(R.id.myEditText)
        myButton = findViewById(R.id.myButton)
        mySayButton = findViewById(R.id.buttonSecond)
        myImageView = findViewById(R.id.myImage)
        myImageViewSecond = findViewById(R.id.imageview3)


        val enteredText = myEditText.text.toString()
        mySayButton.setOnClickListener{
            //Getting the name of the user
            var userName = myEditTextOfName.text.toString()
            //Getting language
            var languageSelected = myEditTExtOfLanguage.text.toString()
            Toast.makeText(this,"Hello $userName",Toast.LENGTH_LONG).show()

            if (languageSelected.equals("fb")){
            myImageViewSecond.setImageResource(R.drawable.fb_logo)
            }else{
                myImageViewSecond.setImageResource(R.drawable.rock)
            }
        }
        myButton.setOnClickListener{
            //when the button is clicked
            Toast.makeText(this,"Hello,You clicked me",Toast.LENGTH_LONG).show()

            myImageView.setImageResource(R.drawable.rock)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}