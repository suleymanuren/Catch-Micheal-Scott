package com.example.catchthemichealscott

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.isVisible
import com.example.catchthemichealscott.R.id.imageView1

class MainActivity : AppCompatActivity() {

    private lateinit var scoreView : TextView
    private lateinit var timerView : TextView
    private var score = 0
    private lateinit var micheal1 : ImageView
    private lateinit var micheal2 : ImageView
    private lateinit var micheal3 : ImageView
    private lateinit var micheal4 : ImageView
    private lateinit var micheal5 : ImageView
    private lateinit var micheal6 : ImageView
    private lateinit var micheal7 : ImageView
    private lateinit var micheal8 : ImageView
    private lateinit var micheal9 : ImageView
    private lateinit var micheal10 : ImageView
    private lateinit var micheal11 : ImageView
    private lateinit var micheal12 : ImageView
    private lateinit var micheal13 : ImageView
    private lateinit var micheal14 : ImageView
    private lateinit var micheal15 : ImageView
    private lateinit var micheal16 : ImageView
    private lateinit var startButton : Button
    private lateinit var handler : Handler
    private lateinit var runnable : Runnable
    private lateinit var resetButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        scoreView = findViewById(R.id.scoreTextView)
        timerView = findViewById(R.id.stopwatchTextView)
        score = 0
        micheal1 = findViewById(R.id.imageView1)
        micheal2 = findViewById(R.id.imageView2)
        micheal3 = findViewById(R.id.imageView3)
        micheal4 = findViewById(R.id.imageView4)
        micheal5 = findViewById(R.id.imageView5)
        micheal6 = findViewById(R.id.imageView6)
        micheal7 = findViewById(R.id.imageView7)
        micheal8 = findViewById(R.id.imageView8)
        micheal9 = findViewById(R.id.imageView9)
        micheal10 = findViewById(R.id.imageView10)
        micheal11 = findViewById(R.id.imageView11)
        micheal12 = findViewById(R.id.imageView12)
        micheal13 = findViewById(R.id.imageView13)
        micheal14 = findViewById(R.id.imageView14)
        micheal15 = findViewById(R.id.imageView15)
        micheal16 = findViewById(R.id.imageView16)
        startButton = findViewById(R.id.startButton)
        resetButton = findViewById(R.id.resetButton)
        timerView.text = ""
        resetButton.isVisible = false

    }

fun startGame(view: View) {
    handler = Handler()
    runnable = Runnable {

        micheal1.visibility = View.INVISIBLE
        micheal2.visibility = View.INVISIBLE
        micheal3.visibility = View.INVISIBLE
        micheal4.visibility = View.INVISIBLE
        micheal5.visibility = View.INVISIBLE
        micheal6.visibility = View.INVISIBLE
        micheal7.visibility = View.INVISIBLE
        micheal8.visibility = View.INVISIBLE
        micheal9.visibility = View.INVISIBLE
        micheal10.visibility = View.INVISIBLE
        micheal11.visibility = View.INVISIBLE
        micheal12.visibility = View.INVISIBLE
        micheal13.visibility = View.INVISIBLE
        micheal14.visibility = View.INVISIBLE
        micheal15.visibility = View.INVISIBLE
        micheal16.visibility = View.INVISIBLE

        resetButton.setOnClickListener() {
            score = 0
            scoreView.text = "$score"
        }
        val random = (1..16).random()
        when (random) {
            1 -> micheal1.visibility = View.VISIBLE
            2 -> micheal2.visibility = View.VISIBLE
            3 -> micheal3.visibility = View.VISIBLE
            4 -> micheal4.visibility = View.VISIBLE
            5 -> micheal5.visibility = View.VISIBLE
            6 -> micheal6.visibility = View.VISIBLE
            7 -> micheal7.visibility = View.VISIBLE
            8 -> micheal8.visibility = View.VISIBLE
            9 -> micheal9.visibility = View.VISIBLE
            10 -> micheal10.visibility = View.VISIBLE
            11 -> micheal11.visibility = View.VISIBLE
            12 -> micheal12.visibility = View.VISIBLE
            13 -> micheal13.visibility = View.VISIBLE
            14 -> micheal14.visibility = View.VISIBLE
            15 -> micheal15.visibility = View.VISIBLE
            16 -> micheal16.visibility = View.VISIBLE
        }
        handler.postDelayed(runnable, 1000)
        startButton.visibility = View.INVISIBLE


    }
    val timer = object: CountDownTimer(10000, 1000) {
        override fun onTick(millisUntilFinished: Long) {

            timerView.text = "" + millisUntilFinished / 1000


        }

        override fun onFinish() {
            for (i in 1..16) {
                micheal1.isClickable = false
                micheal2.isClickable = false
                micheal3.isClickable = false
                micheal4.isClickable = false
                micheal5.isClickable = false
                micheal6.isClickable = false
                micheal7.isClickable = false
                micheal8.isClickable = false
                micheal9.isClickable = false
                micheal10.isClickable = false
                micheal11.isClickable = false
                micheal12.isClickable = false
                micheal13.isClickable = false
                micheal14.isClickable = false
                micheal15.isClickable = false
                micheal16.isClickable = false

            }


            timerView.text = "Time's up!"

            startButton.visibility = View.VISIBLE
            resetButton.isVisible = true
            handler.removeCallbacks(runnable)
        }
    }
    timer.start()
    handler.post(runnable)





}

    fun michealClick(view: View) {
        score++
        scoreView.text = score.toString()
    }
}