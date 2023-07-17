package com.example.carparking
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import androidx.cardview.widget.CardView
import com.example.carparking.R
import com.example.carparking.bookiing

class booklinglist : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_booklinglist)

        val cardView: CardView = findViewById(R.id.cardView)
        cardView.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.cardView -> {
                // Perform navigation to the BookingListActivity
                val intent = Intent(this, bookiing::class.java)
                startActivity(intent)
            }
        }
    }
}
