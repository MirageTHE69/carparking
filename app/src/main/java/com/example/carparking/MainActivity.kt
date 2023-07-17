package com.example.carparking

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.widget.Button
import com.example.carparking.R
import com.example.carparking.dashboard


class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loginbtn: Button = findViewById(R.id.loginbtn)
        loginbtn.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.loginbtn -> {
                // Perform navigation to the dashboard page
                val intent = Intent(this, dashboard::class.java)
                startActivity(intent)
            }
        }
    }
}
