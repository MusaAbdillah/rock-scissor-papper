package com.example.myapplication

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class GameActivity : AppCompatActivity() {
    lateinit var computerImageView: ImageView
    lateinit var rockImageButton: ImageButton
    lateinit var scissorImageButton: ImageButton
    lateinit var papperImageButton: ImageButton
    lateinit var resultImageView: ImageView

    private fun initComponents(){
        computerImageView = findViewById(R.id.computerImageView)
        rockImageButton = findViewById(R.id.rockImageButton)
        scissorImageButton = findViewById(R.id.scissorImageButton)
        papperImageButton = findViewById(R.id.papperImageButton)
        resultImageView = findViewById(R.id.resultImageView)
    }

    private fun initListeners(){
        rockImageButton.setOnClickListener { startGame("ROCK") }
        scissorImageButton.setOnClickListener { startGame("SCISSOR") }
        papperImageButton.setOnClickListener { startGame("PAPPER") }
    }

    private fun startGame(option: String){
        val computerOption = Game.pickRandomOption()
        computerImageView.setImageResource(Game.pickDrawable(computerOption))

        when {
            //            if draw then set resultImageView to drawable draw
//            if win then set resultImageView to drawable party
            //            else set resultImageView to drawable sad
            Game.isDraw(option, computerOption) -> resultImageView.setImageResource(R.drawable.draw)
            Game.isWin(option, computerOption) -> resultImageView.setImageResource(R.drawable.party)
            else -> resultImageView.setImageResource(R.drawable.sad)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.game)
        Log.i("INFO-MASE", "--------------LOG--------------")
        Log.i("INFO-MASE", "--------------I AM ON CREATE FUNCTION--------------")
        Log.i("INFO-MASE", "--------------LOG--------------")

//        call initComponent and initListeners
        initComponents()
        initListeners()
    }
}