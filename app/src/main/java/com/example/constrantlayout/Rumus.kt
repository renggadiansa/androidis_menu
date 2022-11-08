package com.example.constrantlayout

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

var jawaban : MutableList<String> = mutableListOf<String>()

class Rumus : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rumus)

        val htr: Button = findViewById(R.id.hasil)
        htr.setOnClickListener {ha()}
    }
    private fun ha(){
        val password : EditText = findViewById(R.id.nomer)
        val input : EditText = findViewById(R.id.edittxt)
        val pw = password.text.toString()
        val wp = input.text.toString()

        val tt = Intent(this@Rumus, hasil::class.java)
        tt.putExtra("data", "$pw" )
        tt.putExtra("ada", "$wp")
        startActivity(tt)
    }
}