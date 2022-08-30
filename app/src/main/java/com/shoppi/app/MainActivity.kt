package com.shoppi.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.constraintlayout.helper.widget.MotionEffect.TAG

class MainActivity : AppCompatActivity() {
    // section 5 화면 추가 및 앱 호환성 대응 , fragment 추가 및 화면 연결
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

}