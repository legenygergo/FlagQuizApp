package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_startflag : Button = findViewById(R.id.btn_startflag)
        val et_name : EditText = findViewById(R.id.et_name)
        btn_startflag.setOnClickListener{
            if(et_name.text.isEmpty()){
                Toast.makeText(this, "Please enter your name", Toast.LENGTH_LONG).show()
            }else{
                val intent = Intent(this, QuizQuestionActivity::class.java)
                intent.putExtra(ConstantFlags.USER_NAME, et_name.text.toString())
                startActivity(intent)
                finish()
            }

        }
        val btn_startcap: Button = findViewById(R.id.btn_startcap)
        btn_startcap.setOnClickListener{
            if(et_name.text.isEmpty()){
                Toast.makeText(this, "Please enter your name", Toast.LENGTH_LONG).show()
            }else{
                val intent = Intent(this, QuizQuestionCapitals::class.java)
                intent.putExtra(ConstantFlags.USER_NAME, et_name.text.toString())
                startActivity(intent)
                finish()
            }

        }


    }
}