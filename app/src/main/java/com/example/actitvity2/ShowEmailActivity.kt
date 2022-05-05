package com.example.actitvity2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.actitvity2.data.DataProvider
import com.example.actitvity2.data.entities.Email
import com.example.actitvity2.databinding.ActivityShowEmailBinding

class ShowEmailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityShowEmailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityShowEmailBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val idEmail = intent.getIntExtra(INDEX_EMAL, -1)
        if (idEmail > -1) {
            val email = DataProvider.buzon.firstOrNull { email: Email -> email.id == idEmail }
            if (email != null) {
                binding.txtNameUserFromShoeEmailLayout.text = email.User
                binding.txtShowMessageFromShowEmailLayout.text = email.Resume
            }
        }
    }
}