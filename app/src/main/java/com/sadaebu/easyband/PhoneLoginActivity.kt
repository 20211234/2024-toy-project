package com.sadaebu.easyband

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PhoneLoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phone_login)

        // 홈 화면으로 이동
        val goMyBands = findViewById<Button>(R.id.phonelogin_login)
        goMyBands.setOnClickListener {
            val intent = Intent(this@PhoneLoginActivity, MyBandsActivity::class.java)
            startActivity(intent)
        }
    }
}