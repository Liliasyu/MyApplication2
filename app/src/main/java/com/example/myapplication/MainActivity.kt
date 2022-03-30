package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var myii:TextView=findViewById<TextView>(R.id.ii)
        myii.text="ok i saw you"

        var butt=findViewById<Button>(R.id.button)
        var butt2=findViewById<Button>(R.id.button2)
    }
}