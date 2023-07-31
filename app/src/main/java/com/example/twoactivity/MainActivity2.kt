package com.example.twoactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {

    private lateinit var aUserName : TextView
    private lateinit var bUserPassword :TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        aUserName = findViewById(R.id.text_view1)
        bUserPassword = findViewById(R.id.text_view2)

        val username11 = intent.getStringExtra("username11")
        val userpassword22 = intent.getStringExtra("userpassword22")
        aUserName.text = "$username11"
        bUserPassword.text = "$userpassword22"




    }

}