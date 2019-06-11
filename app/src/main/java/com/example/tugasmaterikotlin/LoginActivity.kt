package com.example.tugasmaterikotlin
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.tugasmaterikotlin.Konstanta
import com.example.tugasmaterikotlin.Konstanta.Companion.username
import com.example.tugasmaterikotlin.MainActivity
import com.example.tugasmaterikotlin.R
import kotlinx.android.synthetic.main.login_activity.*
import kotlinx.android.synthetic.main.login_activity.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_activity)

        btn_login.setOnClickListener {
            if (!username.text.toString().equals("")) {
                Konstanta.setJK(spinner.selectedItem.toString())
                Konstanta.username = username.text.toString()
                startActivity(Intent(this, MainActivity::class.java))
                finish()
            } else {
                Toast.makeText(this, "Eitt !! Username Harus Di Isi !!!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}