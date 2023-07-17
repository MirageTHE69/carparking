package com.example.carparking

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent

import android.view.View
import com.example.carparking.R
import com.example.carparking.bookiing
import com.example.carparking.booklinglist
import com.google.android.material.floatingactionbutton.FloatingActionButton

class dashboard : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val floatingActionButton: FloatingActionButton = findViewById(R.id.floatingActionButton)
        floatingActionButton.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.floatingActionButton -> {
                // Perform navigation to the BookingListActivity
                val intent = Intent(this, booklinglist::class.java)
                startActivity(intent)
            }
        }
    }
}
