package com.sadaebu.easyband

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 로그인 화면으로 이동
        val goLogin = findViewById<Button>(R.id.main_login)
        goLogin.setOnClickListener {
            val intent = Intent(this@MainActivity, LoginActivity::class.java)
            startActivity(intent)
        }

        // 회원가입 화면으로 이동
        val goSignUp = findViewById<Button>(R.id.main_signup)
        goSignUp.setOnClickListener {
            val intent = Intent(this@MainActivity, SignUpActivity::class.java)
            startActivity(intent)
        }

    }
}