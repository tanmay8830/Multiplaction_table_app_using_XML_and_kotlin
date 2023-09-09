package com.example.multiplactiontableprintingapp
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.lang.StringBuilder

class MainActivity : AppCompatActivity() {

    private lateinit var numberInput: EditText
    private lateinit var resultText: TextView
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        numberInput = findViewById(R.id.numberInput)
        resultText = findViewById(R.id.resultText)
        button = findViewById(R.id.button)


        button.setOnClickListener{
            val inputText = numberInput.text.toString()

            if(inputText.isEmpty()){
                resultText.text = "Please enter a number"
            }else{
                val number = inputText.toInt()

                val table = generateMultiplicationTable(number)
                resultText.text = table
            }
        }

        }
    }


    private fun generateMultiplicationTable(number: Int): String {
        val tableBuilder = StringBuilder()
        for (i in 1..10) {
            val result = number * i
            tableBuilder.append("$number x $i = $result\n")
        }
        return tableBuilder.toString()
    }

