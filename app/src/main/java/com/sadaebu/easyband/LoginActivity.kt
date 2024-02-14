package com.sadaebu.easyband

import android.content.Intent
import android.graphics.Typeface
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableStringBuilder
import android.text.Spanned
import android.text.TextPaint
import android.text.method.LinkMovementMethod
import android.text.style.ClickableSpan
import android.text.style.StyleSpan
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.ButtonBarLayout
import androidx.core.content.ContextCompat

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // 메인 화면으로 이동
        val goMain = findViewById<ImageView>(R.id.login_close)
        goMain.setOnClickListener {
            val intent = Intent(this@LoginActivity, MainActivity::class.java)
            startActivity(intent)
        }

        // 도움말 화면으로 이동
        val goHelpCenter = findViewById<ImageView>(R.id.login_help)
        goHelpCenter.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://band.us/cs/help"))
            startActivity(intent)
        }

        // (추가 예정) 네이버 로그인 화면으로 이동

        // (추가 예정) 카카오톡 로그인 화면으로 이동

        // (추가 예정) 구글 로그인 화면으로 이동

        // 휴대폰 로그인 화면으로 이동
        val goPhoneLogin = findViewById<Button>(R.id.login_phone)
        goPhoneLogin.setOnClickListener {
            val intent = Intent(this@LoginActivity, PhoneLoginActivity::class.java)
            startActivity(intent)
        }

        // 회원가입 화면으로 이동
        val signUpText: TextView = findViewById(R.id.login_signup)
        val str = "밴드가 처음이신가요? 회원가입"
        val spannableString = SpannableStringBuilder(str)
        val start = str.indexOf("회원가입")
        val end = start + "회원가입".length

        val boldSpan = StyleSpan(Typeface.BOLD)
        val clickableSpan: ClickableSpan = object : ClickableSpan() {
            override fun onClick(widget: View) {
                val intent = Intent(this@LoginActivity, SignUpActivity::class.java)
                startActivity(intent)
            }
            override fun updateDrawState(text: TextPaint) {
                super.updateDrawState(text)
                text.isUnderlineText = false
                text.color = ContextCompat.getColor(this@LoginActivity, R.color.black)
            }
        }

        spannableString.setSpan(boldSpan, start, end, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        spannableString.setSpan(clickableSpan, start, end, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)

        signUpText.text = spannableString
        signUpText.movementMethod = LinkMovementMethod.getInstance()

    }
}