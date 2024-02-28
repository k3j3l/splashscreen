package com.example.splashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlin.math.sign

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        var usernameEditText= findViewById<EditText>(R.id.editTextText)
        var emailEditText= findViewById<EditText>(R.id.editTextTextEmailAddress2)
        var phonenumberEditText= findViewById<EditText>(R.id.editTextPhone)
        var passwordEditText= findViewById<EditText>(R.id.editTextTextPassword)
        var confirmpasswordEditText= findViewById<EditText>(R.id.editTextTextPassword2)
        val signUpIntent= findViewById<TextView>(R.id.textview11)

        signUpIntent.setOnClickListener {

            val username= usernameEditText.text.toString()
            val email= emailEditText.text.toString()
            val phonenumber= phonenumberEditText.text.toString()
            val password= passwordEditText.text.toString()
            val confirmpassword= confirmpasswordEditText.text.toString()

            if(username.isNotEmpty() && email.isNotEmpty() && password.isNotEmpty() && phonenumber.isNotEmpty() && confirmpassword.isNotEmpty())



            {

                intent= Intent(applicationContext, MainActivity3::class.java)
                startActivity(intent)


            }
            else {
                Toast.makeText(this ,"please enter username, password, phone number , confirm password" , Toast.LENGTH_SHORT).show()

            }
        }



    }
}