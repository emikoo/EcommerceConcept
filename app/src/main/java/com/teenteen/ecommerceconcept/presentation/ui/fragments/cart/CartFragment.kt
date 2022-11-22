package com.teenteen.ecommerceconcept.presentation.ui.fragments.cart

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.teenteen.ecommerceconcept.databinding.FragmentCartBinding
import com.teenteen.ecommerceconcept.presentation.ui.base.BaseFragment

class CartFragment() : BaseFragment<FragmentCartBinding>() {

    override fun attachBinding(
        list: MutableList<FragmentCartBinding> ,
        layoutInflater: LayoutInflater ,
        container: ViewGroup? ,
        attachToRoot: Boolean
    ) {
        list.add(FragmentCartBinding.inflate(layoutInflater , container , attachToRoot))
    }

    override fun setupViews() {
        binding.ibBack.setOnClickListener { findNavController().popBackStack() }
    }

    override fun subscribeToLiveData() {}
}