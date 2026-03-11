package teja.example.mod2casestudy1

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val email = findViewById<TextInputEditText>(R.id.editTextEmail)
        val password = findViewById<TextInputEditText>(R.id.editTextPassword)

        val login = findViewById<MaterialButton>(R.id.buttonLogin)
        val register = findViewById<MaterialButton>(R.id.buttonGoToRegister)

        login.setOnClickListener {

            if (email.text.toString().isEmpty() || password.text.toString().isEmpty()) {

                Toast.makeText(this,"Fill all fields",Toast.LENGTH_SHORT).show()

            } else {

                Toast.makeText(this,"Login Successful",Toast.LENGTH_SHORT).show()
                startActivity(Intent(this,HomeActivity::class.java))

            }

        }

        register.setOnClickListener {

            startActivity(Intent(this,RegisterActivity::class.java))

        }

    }
}