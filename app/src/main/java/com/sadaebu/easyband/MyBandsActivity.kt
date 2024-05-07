package com.sadaebu.easyband
import androidx.fragment.app.Fragment
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MyBandsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_bands)

        // Home Fragment를 초기 화면으로 설정
        replaceFragment(HomeFragment())

        // Home Fragment로 이동
        val goHomeFragment: TextView = findViewById(R.id.mybands_home_fragment)
        goHomeFragment.setOnClickListener {
            replaceFragment(HomeFragment())
        }

        // Alert Fragment로 이동
        val goAlertFragment: TextView = findViewById(R.id.mybands_alert_fragment)
        goAlertFragment.setOnClickListener {
            replaceFragment(AlertFragment())
        }
    }

    // Fragment 화면 전환
    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentContainer, fragment)
        fragmentTransaction.commit()
    }
}