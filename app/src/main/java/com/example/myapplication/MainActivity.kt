package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import com.example.myapplication.viewModel.MainViewModel

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {

    private val mainViewModel by viewModels<MainViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainViewModel.data.observe(this@MainActivity) {
            Log.d(TAG, "select -----------------------: $it")
        }

    }
}