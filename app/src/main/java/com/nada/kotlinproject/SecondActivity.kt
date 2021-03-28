package com.nada.kotlinproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.nada.kotlinproject.model.Person

class SecondActivity : AppCompatActivity() {

    private lateinit var view2: TextView
    private lateinit var press3: Button

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        //get data from intent
        val intent = intent
        val textValue = intent.getStringExtra("value")

        view2 = findViewById(R.id.textView_view_2)
        press3 = findViewById(R.id.btn_press_3)

        //setText
        view2.text = textValue

        //handle button click
        press3.setOnClickListener {
            val person = Person("nada", "01023400755", "26")
            //intent to start activity
            val intent = Intent(this@SecondActivity, ModelActivity::class.java)
            intent.putExtra("person", person)
            startActivity(intent)
        }

    }

}