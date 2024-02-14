package com.sadaebu.easyband

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        // 홈 화면으로 이동
        val goMyBands = findViewById<Button>(R.id.profile_save)
        goMyBands.setOnClickListener {
            val intent = Intent(this@ProfileActivity, MyBandsActivity::class.java)
            startActivity(intent)
        }
    }
}