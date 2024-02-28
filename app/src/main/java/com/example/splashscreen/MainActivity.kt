package com.example.splashscreen

import android.annotation.SuppressLint
import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imgIntent= findViewById<ImageView>(R.id.imageView)

        imgIntent.setOnClickListener {

            intent= Intent(applicationContext,MainActivity2::class.java)
            startActivity(intent)
        }





    }
}