package com.example.actitvity2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.actitvity2.data.DataProvider
import com.example.actitvity2.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.listEmailsActivityMainLayout.layoutManager =
            LinearLayoutManager(this)
        binding.listEmailsActivityMainLayout.adapter = BuzonAdapter(this,DataProvider.buzon)
    }
}