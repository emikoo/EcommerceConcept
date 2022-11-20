package com.teenteen.ecommerceconcept.presentation.ui.fragments.cart

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.teenteen.ecommerceconcept.databinding.FragmentCardBinding
import com.teenteen.ecommerceconcept.presentation.ui.base.BaseFragment

class CartFragment() : BaseFragment<FragmentCardBinding>() {

    override fun attachBinding(
        list: MutableList<FragmentCardBinding> ,
        layoutInflater: LayoutInflater ,
        container: ViewGroup? ,
        attachToRoot: Boolean
    ) {
        list.add(FragmentCardBinding.inflate(layoutInflater , container , attachToRoot))
    }

    override fun setupViews() {
        binding.ibBack.setOnClickListener { findNavController().popBackStack() }
    }

    override fun subscribeToLiveData() {}
}