package com.legacys.imcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.w("lifecycle", "entrei no onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.w("lifecycle", "entrei no onSTART")
    }

    override fun onResume() {
        super.onResume()
        Log.w("lifeCycle", "entrei no onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.w("lifeCycle", "entrei no onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.w("lifeCycle", "entrei no onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.w("lifeCycle", "entrei no onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.w("lifeCycle", "entrei no onDestroy")
    }
}