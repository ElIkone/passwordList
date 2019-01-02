package com.example.benmunoz.passwordlist

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val password: ArrayList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addPassword()
        password_list.layoutManager = LinearLayoutManager(this)
    }

    fun addPassword() {
        password.add("test123")
        password.add("test123")
        password.add("test123")
        password.add("test123")
        password.add("test123")
        password.add("test123")
        password.add("test123")
        password.add("test123")
        password.add("test123")
        password.add("test123")
        password.add("test123")
        password.add("test123")
        password.add("test123")
        password.add("test123")
        password.add("test123")
        password.add("test123")
    }
}
