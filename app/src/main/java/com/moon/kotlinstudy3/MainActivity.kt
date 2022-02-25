package com.moon.kotlinstudy3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn = findViewById<Button>(R.id.button)
        val lambda = {x:Int, y:Int ->
            Toast.makeText(this, "입력된 두 수는 ${x} 와 $y 입니다",Toast.LENGTH_SHORT).show()
        }
        btn.setOnClickListener {
            lambda(20,10)
        }
    }
}