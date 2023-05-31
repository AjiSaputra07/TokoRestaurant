package com.example.aplikasi_restaurant

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.aplikasi_restaurant.databinding.FragmentMenuDeskirpsiWhopperBinding
import com.example.aplikasi_restaurant.databinding.FragmentMenuDeskripsiMushroomBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class menuDeskripsiMushroom : Fragment() {
    private lateinit var binding: FragmentMenuDeskripsiMushroomBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMenuDeskripsiMushroomBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Memberikan aksi pada menu kembali fragment
        binding.kembali.setOnClickListener{
            this.findNavController()
                .navigate(R.id.action_menuDeskripsiMushroom_to_fragment1)
        }
    }
}