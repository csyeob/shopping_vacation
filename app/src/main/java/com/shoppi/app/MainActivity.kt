package com.shoppi.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.constraintlayout.helper.widget.MotionEffect.TAG

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detail)
        Log.d(TAG, "OnCreate") // 최초 한번
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "OnRestart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "OnResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "OnPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "OnStop")
    }

}