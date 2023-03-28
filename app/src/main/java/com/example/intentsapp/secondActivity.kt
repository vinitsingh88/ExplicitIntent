package com.example.intentsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class secondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val btn2Intent= findViewById<Button>(R.id.button2)

        btn2Intent.setOnClickListener{
            //go back to main activity
            intent= Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
        }

    }
}