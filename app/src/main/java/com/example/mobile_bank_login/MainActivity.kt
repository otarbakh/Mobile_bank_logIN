package com.example.mobile_bank_login

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    var password:EditText = findViewById(R.id.Et_PassInput)
    var passwordWrong:TextView =findViewById(R.id.Tv_password)
    var loginButton: Button = findViewById(R.id.Bt_Login)
        loginButton.setOnClickListener {
            if (password.text.toString() == "Admin"){
                val intent = Intent(this,dashboard::class.java)
                startActivity(intent)

            }else(passwordWrong.setTextColor(Color.RED))
        }

    }
}