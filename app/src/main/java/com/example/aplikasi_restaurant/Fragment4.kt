package com.example.aplikasi_restaurant

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.aplikasi_restaurant.databinding.Fragment4Binding

class Fragment4 : Fragment() {
    private lateinit var binding: Fragment4Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = Fragment4Binding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnLogout.setOnClickListener {
            Toast.makeText(context, "Berhasil Logout", Toast.LENGTH_SHORT).show()
        }
    }
}