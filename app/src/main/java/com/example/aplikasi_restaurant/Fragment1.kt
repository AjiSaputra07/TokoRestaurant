package com.example.aplikasi_restaurant

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.aplikasi_restaurant.databinding.Fragment1Binding


class Fragment1 : Fragment() {
    private lateinit var binding: Fragment1Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = Fragment1Binding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?){
        super.onViewCreated(view, savedInstanceState)
        // Memberikan aksi pada menu deskripsi fragment
        binding.viewDetail1.setOnClickListener{
            this.findNavController()
                .navigate(R.id.action_fragment1_to_menuDeskripsi)
        }
        binding.viewDetail2.setOnClickListener{
            this.findNavController()
                .navigate(R.id.action_fragment1_to_menuDeskirpsiWhopper)
        }
        binding.viewDetail3.setOnClickListener{
            this.findNavController()
                .navigate(R.id.action_fragment1_to_menuDeskripsiMushroom)
        }
    }
}