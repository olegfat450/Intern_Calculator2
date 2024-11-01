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

class Activity2 : AppCompatActivity() {

    private lateinit var operand1: EditText
    private lateinit var operand2: EditText
    private lateinit var operationTv: TextView

    private lateinit var buttonSum: Button
    private lateinit var buttonDif: Button
    private lateinit var buttonMult: Button
    private lateinit var buttonDiv: Button

    private lateinit var buttonResult: Button

    var result = 0.0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_2)

        operand1 = findViewById(R.id.operand1)
        operand2 = findViewById(R.id.operand2)
        operationTv = findViewById(R.id.operationTv)

        buttonSum = findViewById(R.id.buttonSum)
        buttonDif = findViewById(R.id.buttonDif)
        buttonMult = findViewById(R.id.buttonMult)
        buttonDiv = findViewById(R.id.buttonDiv)
        buttonResult = findViewById(R.id.buttonResult)


    }

    fun mainActivity(v: View) {

        val intent = Intent(this, MainActivity::class.java)
        intent.putExtra("key",result.toString())
        startActivity(intent)
    }

    fun onClickButton(v: View) {
        var op1: Double;
        var op2: Double;
        try { op1 = operand1.text.toString().toDouble() } catch (_: Exception) { op1 = 0.0 }
        try { op2 = operand2.text.toString().toDouble() } catch (_: Exception) { op2 = 0.0 }

         when (v.id) {
            R.id.buttonSum -> { result = op1 + op2 ; operationTv.setText("+")}
            R.id.buttonDif ->  { result = op1 - op2; operationTv.setText("-") }
            R.id.buttonMult -> { result = op1 * op2; operationTv.setText("*") }
            R.id.buttonDiv -> { result = op1 / op2; operationTv.setText("/") }
        }

    }
}