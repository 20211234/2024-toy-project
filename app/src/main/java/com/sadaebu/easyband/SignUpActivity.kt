package com.sadaebu.easyband

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        // 프로필 화면으로 이동
        val goProfile = findViewById<Button>(R.id.signup_enter)
        goProfile.setOnClickListener {
            val intent = Intent(this@SignUpActivity, ProfileActivity::class.java)
            startActivity(intent)
        }
    }
}