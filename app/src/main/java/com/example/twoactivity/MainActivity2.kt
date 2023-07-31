package com.example.twoactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {

    private lateinit var aUserName : TextView
    private lateinit var bUserPassword :TextView
   // private lateinit var btn :Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        aUserName = findViewById(R.id.text_view1)
        bUserPassword = findViewById(R.id.text_view2)

        val username11 = intent.getStringExtra("Username")
        val userpassword22 = intent.getStringExtra("UserPassword")
        aUserName.text = "$username11"
        bUserPassword.text = "$userpassword22"

        var backbutton=findViewById<Button>(R.id.btn2)
        backbutton.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))

            Toast.makeText(this,"BACK Clicked", Toast.LENGTH_SHORT).show()
        }




    }

}