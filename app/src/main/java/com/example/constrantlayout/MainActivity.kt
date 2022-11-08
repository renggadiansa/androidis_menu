package com.example.constrantlayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Button
import android.widget.ListView
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle item selection
        return when (item.itemId) {
            R.id.new_game -> {
                Toast.makeText(this, "hshshhshs", Toast.LENGTH_SHORT).show()
                startActivity(Intent(this@MainActivity, Rumus::class.java))
                true
            }
            R.id.help -> {
                Toast.makeText(this, "oke brow", Toast.LENGTH_SHORT).show()
                startActivity(Intent(this@MainActivity, About::class.java))
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }


}