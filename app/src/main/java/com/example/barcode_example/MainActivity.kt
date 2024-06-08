package com.example.barcode_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.barcode_example.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding:ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        // scan 버튼 누르면 인식 해보자
        binding.scan.setOnClickListener{

        }
    }

}