package com.teenteen.ecommerceconcept.presentation.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.teenteen.ecommerceconcept.R
import com.teenteen.ecommerceconcept.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_EcommerceConcept)
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupNavigation()
    }

    private fun setupNavigation() {
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController
        binding.chipBottomNavigation.setItemSelected(binding.bottomNavigation.selectedItemId , true)
        binding.chipBottomNavigation.setOnItemSelectedListener { itemId ->
            binding.bottomNavigation.selectedItemId = itemId
        }
        binding.bottomNavigation.setupWithNavController(navController)
    }
}