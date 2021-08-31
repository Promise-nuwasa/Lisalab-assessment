package com.example.calc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var number1 = findViewById<EditText>(R.id.etnum1)
        var number2 = findViewById<EditText>(R.id.etresult)
        var add = findViewById<Button>(R.id.btnadd)
        var subtract = findViewById<Button>(R.id.btnsubtract)
        var multiply = findViewById<Button>(R.id.btnmultiply)
        var modulus = findViewById<Button>(R.id.btndevide)
        var etresult = findViewById<Button>(R.id.btntotal)

        add.setOnClickListener {
            var number1 = number1.text.toString().toInt()
            var number2 = number2.text.toString().toInt()
            var result = number1 + number2

            etresult.text = "Result:$result"
        }

        subtract.setOnClickListener {
            var number1 = number1.text.toString().toInt()
            var number2 = number2.text.toString().toInt()
            var result = number1 - number2

            etresult.text = "Result:$result"
        }
        multiply.setOnClickListener {
            var number1 = number1.text.toString().toInt()
            var number2 = number2.text.toString().toInt()
            var result = number1 * number2

            etresult.text = "Result:$result"

        }
        modulus.setOnClickListener {
            var number1 = number1.text.toString().toInt()
            var number2 = number2.text.toString().toInt()
            var result = number1 / number2

            etresult.text = "Result:$result"
        }
    }
}
