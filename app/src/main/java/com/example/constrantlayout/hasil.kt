package com.example.constrantlayout

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class hasil : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hasil)

        val hasil :TextView = findViewById(R.id.txtview)
        val es : TextView = findViewById(R.id.hsl)
        val ss1 : String = intent.getStringExtra("data").toString()
        val ss :  String = intent.getStringExtra("ada").toString()
        hasil.text = ss1
        es.text = ss



    }
}