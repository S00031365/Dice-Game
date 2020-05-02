package com.example.dicegame

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

//import android.R;
class DiceCounter : AppCompatActivity() {
    private var imageViewDice: ImageView? = null
    private val rng = Random()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        val imageViewDice = findViewById<View>(R.id.image_view_dice)
        imageViewDice.setOnClickListener {this.rollDice()}
        val reset =
            findViewById<View>(R.id.resetButton) as Button
        reset.setOnClickListener {
            val d1 = findViewById<View>(R.id.d1) as TextView
            d1.text = "0"
            val d2 = findViewById<View>(R.id.d2) as TextView
            d2.text = "0"
            val d3 = findViewById<View>(R.id.d3) as TextView
            d3.text = "0"
            val d4 = findViewById<View>(R.id.d4) as TextView
            d4.text = "0"
            val d5 = findViewById<View>(R.id.d5) as TextView
            d5.text = "0"
            val d6 = findViewById<View>(R.id.d6) as TextView
            d6.text = "0"
        }
    }

    private fun rollDice() {
        val rnd = rng.nextInt(6) + 1
        imageViewDice = findViewById(R.id.image_view_dice)
        when (rnd) {
            1 -> {
                imageViewDice!!.setImageResource(R.drawable.d1)
                val mTextView = findViewById<View>(R.id.d1) as TextView
                val x = mTextView.text.toString().toInt() + 1
                val y = x.toString()
                mTextView.text = y
            }
            2 -> {
                imageViewDice!!.setImageResource(R.drawable.d2)
                val mTextView = findViewById<View>(R.id.d2) as TextView
                val x = mTextView.getText().toString().toInt() + 1
                val y = x.toString()
                mTextView.setText(y)
            }
            3 -> {
                imageViewDice!!.setImageResource(R.drawable.d3)
                val mTextView = findViewById<View>(R.id.d3) as TextView
                val x = mTextView.getText().toString().toInt() + 1
                val y = x.toString()
                mTextView.setText(y)
            }
            4 -> {
                imageViewDice!!.setImageResource(R.drawable.d4)
                val mTextView = findViewById<View>(R.id.d4) as TextView
                val x = mTextView.getText().toString().toInt() + 1
                val y = x.toString()
                mTextView.setText(y)
            }
            5 -> {
                imageViewDice!!.setImageResource(R.drawable.d5)
                val mTextView = findViewById<View>(R.id.d5) as TextView
                val x = mTextView.getText().toString().toInt() + 1
                val y = x.toString()
                mTextView.setText(y)
            }
            6 -> {
                imageViewDice!!.setImageResource(R.drawable.d6)
                val mTextView = findViewById<View>(R.id.d6) as TextView
                val x = mTextView.getText().toString().toInt() + 1
                val y = x.toString()
                mTextView.setText(y)
            }
        }
    }
}