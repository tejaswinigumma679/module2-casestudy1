package teja.example.mod2casestudy1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val logout = findViewById<MaterialButton>(R.id.buttonLogout)

        logout.setOnClickListener {

            startActivity(Intent(this,MainActivity::class.java))
            finish()

        }

    }
}