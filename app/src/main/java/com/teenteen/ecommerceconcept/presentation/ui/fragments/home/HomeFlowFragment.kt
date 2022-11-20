package com.teenteen.ecommerceconcept.presentation.ui.fragments.home

import androidx.navigation.ui.setupWithNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.teenteen.ecommerceconcept.R
import com.teenteen.ecommerceconcept.databinding.FlowFragmentHomeBinding
import com.teenteen.ecommerceconcept.presentation.ui.base.BaseFlowFragment

class HomeFlowFragment : BaseFlowFragment(
    R.layout.flow_fragment_home , R.id.nav_host_fragment_home
) {
    private val binding by viewBinding(FlowFragmentHomeBinding::bind)

    override fun setupNavigation() {
        binding.chipBottomNavigation.setItemSelected(binding.bottomNavigation.selectedItemId , true)
        binding.bottomNavigation.setupWithNavController(navController)
    }
}