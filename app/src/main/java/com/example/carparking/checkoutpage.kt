import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.Button
import com.example.carparking.R
import com.example.carparking.ticket

class checkoutpage : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checkoutpage)

        val checkout: Button = findViewById(R.id.checkout)
        checkout.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.checkout -> {
                // Perform navigation to the TicketActivity
                val intent = Intent(this, ticket::class.java)
                startActivity(intent)
            }
        }
    }
}
