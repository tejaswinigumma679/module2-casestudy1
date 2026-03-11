package teja.example.mod2casestudy1

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val email = findViewById<TextInputEditText>(R.id.editTextRegisterEmail)
        val password = findViewById<TextInputEditText>(R.id.editTextRegisterPassword)

        val register = findViewById<MaterialButton>(R.id.buttonRegister)

        register.setOnClickListener {

            if (email.text.toString().isEmpty() || password.text.toString().isEmpty()) {

                Toast.makeText(this,"Fill all fields",Toast.LENGTH_SHORT).show()

            } else {

                Toast.makeText(this,"Registration Successful",Toast.LENGTH_SHORT).show()
                startActivity(Intent(this,HomeActivity::class.java))

            }

        }

    }
}