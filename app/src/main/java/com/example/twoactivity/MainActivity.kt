package com.example.twoactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var  SendData : Button
    private lateinit var userName : EditText
    private lateinit var  userpassword :EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        SendData = findViewById(R.id.Btn)
        userName = findViewById(R.id.edit_text1)
        userpassword = findViewById(R.id.edit_text2)



        SendData.setOnClickListener {
            startActivity(Intent(this,MainActivity2::class.java)
                .putExtra("Username", userName.text.toString())
                .putExtra("UserPassword", userpassword.text.toString())
            )


            Toast.makeText(this,"NEXT",Toast.LENGTH_SHORT).show()
        }



//        var BTN = findViewById<Button>(R.id.Btn)
//        BTN.setOnClickListener {
//            val intent = Intent(this, MainActivity2::class.java)
//            startActivity(intent)
//
//            Toast.makeText(this,"Button was Clicked",Toast.LENGTH_SHORT).show()
//
//
//        }
    }
}