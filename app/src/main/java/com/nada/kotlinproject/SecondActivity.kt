package com.nada.kotlinproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    private lateinit var view2: TextView

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        //get data from intent
        var intent = intent
        val textValue = intent.getStringExtra("value")

        //textview
        view2 = findViewById(R.id.textView_view_2)
        //setText
        view2.text = textValue

    }

}