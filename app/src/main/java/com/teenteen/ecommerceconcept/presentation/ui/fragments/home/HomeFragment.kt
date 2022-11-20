package com.teenteen.ecommerceconcept.presentation.ui.fragments.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.teenteen.ecommerceconcept.R
import com.teenteen.ecommerceconcept.databinding.FragmentHomeBinding
import com.teenteen.ecommerceconcept.presentation.ui.base.BaseFragment
import com.teenteen.ecommerceconcept.presentation.ui.utils.isGone
import com.teenteen.ecommerceconcept.presentation.ui.utils.isVisible

class HomeFragment : BaseFragment<FragmentHomeBinding>() {
    override fun attachBinding(
        list: MutableList<FragmentHomeBinding> ,
        layoutInflater: LayoutInflater ,
        container: ViewGroup? ,
        attachToRoot: Boolean
    ) {
        list.add(FragmentHomeBinding.inflate(layoutInflater, container, attachToRoot))
    }

    override fun setupViews() {
        setupNavigation()
    }

    private fun setupNavigation() {
        binding.chipBottomNavigation.setItemSelected(binding.bottomNavigation.selectedItemId , true)
        binding.chipBottomNavigation.setOnItemSelectedListener { itemId ->
            when(itemId) {
                R.id.cardFragment -> {
                    findNavController().navigate(R.id.action_homeFragment_to_cardFragment)
                    binding.chipBottomNavigation.setItemSelected(R.id.homeFragment , true)
                }
            }
        }
    }

    override fun subscribeToLiveData() {}
}