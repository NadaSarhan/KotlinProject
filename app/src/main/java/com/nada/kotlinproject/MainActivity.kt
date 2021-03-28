package com.nada.kotlinproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var name: EditText
    private lateinit var press1: Button
    private lateinit var view1: TextView
    private lateinit var press2: Button
    private lateinit var view2: TextView

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        name = findViewById(R.id.editText_name)
        press1 = findViewById(R.id.btn_press_1)
        view1 = findViewById(R.id.textView_view_1)
        press2 = findViewById(R.id.btn_press_2)
        view2 = findViewById(R.id.textView_view_2)

        press1.setOnClickListener {
            val givenName = name.text
            view1.text = "$givenName"
        }
        press2.setOnClickListener {
            val givenName = name.text
            view2.text = "$givenName"
        }

    }

//    override fun onClick(v: View?) {
//        TODO("Not yet implemented")
//        val givenName = name.text
//        view_1.text = "$givenName"

//        when ( v!!.id) {
//            R.id.btn_press_1-> { }
//            R.id.btn_press_2-> { }
//        }

//        if (v != null) {
//            when (v.getId()) {
//                R.id.btn_press_1 -> Toast.makeText(this, "press 1", Toast.LENGTH_SHORT).show()
//                R.id.btn_press_2 -> Toast.makeText(this, "press 2", Toast.LENGTH_SHORT).show()
//                else -> {/* do your code */}
//            }
//        } else {/* do your code */}
//    }

}