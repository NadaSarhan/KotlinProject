package com.nada.kotlinproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.nada.kotlinproject.model.Person

class ModelActivity : AppCompatActivity() {

    private lateinit var viewName: TextView
    private lateinit var viewPhone: TextView
    private lateinit var viewAge: TextView

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_model)

        viewName = findViewById(R.id.textView_name)
        viewPhone = findViewById(R.id.textView_phone)
        viewAge = findViewById(R.id.textView_age)

        //get data from intent
        val intent = intent
        val personData = intent.getSerializableExtra("person") as Person

        //setText
        viewName.text = personData.name
        viewPhone.text = personData.phone
        viewAge.text = personData.age

    }

}