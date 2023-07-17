package com.example.carparking

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.Button
import com.example.carparking.R
import com.example.carparking.slotpage

class bookiing : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bookiing)

        val bookbtn: Button = findViewById(R.id.bookbtn)
        bookbtn.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.bookbtn -> {
                // Perform navigation to the SlotActivity
                val intent = Intent(this, slotpage::class.java)
                startActivity(intent)
            }
        }
    }
}
