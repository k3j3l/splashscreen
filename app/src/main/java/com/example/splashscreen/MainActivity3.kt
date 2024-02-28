package com.example.splashscreen

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.splashscreen.R.id.sign_in_button

class MainActivity3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        var emailEditText= findViewById<EditText>(R.id.editTextTextEmailAddress)
        var passwordEditText= findViewById<EditText>(R.id.editTextNumberPassword)
        val signInIntent= findViewById<TextView>(R.id.ed4)

        signInIntent.setOnClickListener {
            intent= Intent(applicationContext,MainActivity4::class.java) 
            startActivity(intent)


            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()

            if (email.isNotEmpty() && password.isNotEmpty()) {


            Toast.makeText(this, "Sign in successful", Toast.LENGTH_SHORT).show()
        }
        else {
            Toast.makeText(this,"Please enter email and password", Toast.LENGTH_SHORT).show()
            }







        }
    }
}