package com.example.aplikasi_restaurant

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.aplikasi_restaurant.databinding.Fragment1Binding
import com.example.aplikasi_restaurant.databinding.Fragment2Binding


class Fragment2 : Fragment() {
    private lateinit var binding: Fragment2Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = Fragment2Binding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?){
        super.onViewCreated(view, savedInstanceState)
        // Memberikan aksi pada menu deskripsi fragment
        binding.viewDetail1.setOnClickListener{
            this.findNavController()
                .navigate(R.id.action_fragment2_to_menuDespskripsiCocacola)
        }
        binding.viewDetail2.setOnClickListener{
            this.findNavController()
                .navigate(R.id.action_fragment2_to_menuDeskripsiFloatCola)
        }
        binding.viewDetail3.setOnClickListener{
            this.findNavController()
                .navigate(R.id.action_fragment2_to_menuDeskripsiAdes)
        }
    }

}