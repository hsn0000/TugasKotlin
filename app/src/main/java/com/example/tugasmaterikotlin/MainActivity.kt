package com.example.tugasmaterikotlin


import android.content.Intent
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        t_username.text = Konstanta.username
        when(Konstanta.getJK()) {
            "L"->t_username.setTextColor(Color.GREEN)
            "P"->t_username.setTextColor(Color.MAGENTA)
        }
        btn_logout.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }
    }
}