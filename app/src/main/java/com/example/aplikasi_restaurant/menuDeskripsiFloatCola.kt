package com.example.aplikasi_restaurant

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.aplikasi_restaurant.databinding.FragmentMenuDeskirpsiWhopperBinding
import com.example.aplikasi_restaurant.databinding.FragmentMenuDeskripsiFloatColaBinding


class menuDeskripsiFloatCola : Fragment() {
    private lateinit var binding: FragmentMenuDeskripsiFloatColaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMenuDeskripsiFloatColaBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Memberikan aksi pada menu kembali fragment
        binding.kembali.setOnClickListener{
            this.findNavController()
                .navigate(R.id.action_menuDeskripsiFloatCola_to_fragment2)
        }
    }
}