package com.example.aplikasi_restaurant

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.core.content.res.ResourcesCompat
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI.setupActionBarWithNavController
import androidx.navigation.ui.NavigationUI.setupWithNavController
import com.example.aplikasi_restaurant.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var navController: NavController
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        val btnpesan = findViewById<Button>(R.id.btn_pesan)
//        val btnlogout = findViewById<Button>(R.id.btn_logout)
//
//        btnpesan.setOnClickListener{
//            Toast.makeText(this,"Terima Kasih Telah Memesan",Toast.LENGTH_SHORT).show()
//        }
//        btnlogout.setOnClickListener{
//            Toast.makeText(this, "Terima Kasih Telah Memesan",Toast.LENGTH_SHORT).show()
//        }

        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController
        setupWithNavController(binding.bottomNav, navController)

    }
}