package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollbutton: Button = findViewById(R.id.button)
        rollbutton.setOnClickListener { rolldice() }  /// condensing into one line !

    }

    private fun rolldice() {
        // add value to the numsides and place it into the dice variable
        val dice = Dice(6)
        val diceRoll = dice.roll()
        // update the screen with the roll dice
        val resultView: TextView = findViewById(R.id.textView)

        resultView.text = diceRoll.toString() // convert int number into the string value.
    }
}

class Dice(private val numsides: Int) {


    fun roll(): Int {
        return (1..numsides).random()
    }
}