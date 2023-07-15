import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.Button
import com.example.carparking.R
import com.example.carparking.checkoutpage

class slotpage : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_slotpage)

        val nextbtn: Button = findViewById(R.id.nextbtn)
        nextbtn.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.nextbtn -> {
                // Perform navigation to the CheckoutActivity
                val intent = Intent(this, checkoutpage::class.java)
                startActivity(intent)
            }
        }
    }
}
