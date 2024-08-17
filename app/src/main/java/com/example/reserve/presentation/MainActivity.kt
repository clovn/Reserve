package com.example.reserve.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.reserve.R
import com.example.reserve.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var viewBinding: ActivityMainBinding? = null

    private var controller: NavController? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater).also {
            setContentView(it.root)
        }
        controller = (supportFragmentManager.findFragmentById(R.id.container) as NavHostFragment)
            .navController
        viewBinding?.apply {
            navigation.setupWithNavController(controller!!)
        }
    }
}