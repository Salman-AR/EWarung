package com.example.ewarung

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun setPembayaran(view: View) {
        val intent= Intent(this,Pembayaran::class.java)
        startActivity(intent)
        finish()
    }
}