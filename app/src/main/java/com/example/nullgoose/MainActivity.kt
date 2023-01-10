package com.example.nullgoose

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button2)

        rollButton.setOnClickListener {
            rollDice()
        }

    }

    private fun rollDice() {
        val dice = Dice(12)
        val randomRoll = dice.roll()
        var textMy: TextView = findViewById(R.id.textView2)
        textMy.text = dice.roll().toString()
    }
}

class Dice (private var numsades: Int) {

    fun roll(): Int {
        return (1..numsades).random()
    }
}