package com.example.navigationfinal

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigationfinal.databinding.FragmentPage1Binding

class Page1 : Fragment() {
    private val page1Binding:FragmentPage1Binding ?= null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = FragmentPage1Binding.inflate(inflater, container, false)
        binding.back.setOnClickListener { Navigation.findNavController(binding.root).navigate(R.id.page1_to_dashboard) }
        return binding.root
    }

}