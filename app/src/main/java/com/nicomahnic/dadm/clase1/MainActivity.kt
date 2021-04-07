package com.nicomahnic.dadm.clase1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var tvMain : TextView
    lateinit var btnUp: Button
    lateinit var btnDown: Button
    lateinit var btnChange: Button

    var tvMainSize: Float = 20.0F

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvMain = findViewById(R.id.tvMain)
        btnChange = findViewById(R.id.btnChange)
        btnUp = findViewById(R.id.btnUp)
        btnDown = findViewById(R.id.btnDown)

        btnChange.setOnClickListener {
            tvMain.text = "CHAU"
        }

        btnUp.setOnClickListener {
            tvMainSize += 1.0F
            Log.d("NM", "UP: ${tvMainSize}")
            tvMain.textSize = tvMainSize
        }

        btnDown.setOnClickListener {
            tvMainSize -= 1.0F
            Log.d("NM", "DOWN: ${tvMainSize}")
            tvMain.textSize = tvMainSize
        }
    }
}