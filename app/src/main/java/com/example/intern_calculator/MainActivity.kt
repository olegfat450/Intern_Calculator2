package com.example.intern_calculator

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

       private lateinit var textResult: TextView
       private lateinit var buttonMain: Button






    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

              textResult = findViewById(R.id.textResult)
              buttonMain = findViewById(R.id.buttonMain)

             val result = intent.getStringExtra("key")
             textResult.text = result



        }

       fun secondActivity(v: View) = startActivity(Intent(this,Activity2::class.java))

    }
