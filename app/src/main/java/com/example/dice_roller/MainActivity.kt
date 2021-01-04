package com.example.dice_roller

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val scoreTxt: TextView = findViewById(R.id.scoreText)
        val diceImg: ImageView = findViewById(R.id.diceImage)
        val rollBtn: Button = findViewById(R.id.rollButton)

        rollBtn.setOnClickListener(View.OnClickListener {
            val score = Random.nextInt(6)+1
            scoreTxt.setText(score.toString())
            when(score)
            {
                1-> diceImg.setBackgroundResource(R.drawable.dice1)
                2-> diceImg.setBackgroundResource(R.drawable.dice2)
                3-> diceImg.setBackgroundResource(R.drawable.dice3)
                4-> diceImg.setBackgroundResource(R.drawable.dice4)
                5-> diceImg.setBackgroundResource(R.drawable.dice5)
                6-> diceImg.setBackgroundResource(R.drawable.dice6)
            }

        })
    }

}
