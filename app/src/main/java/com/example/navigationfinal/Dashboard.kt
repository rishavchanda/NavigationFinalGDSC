package com.example.navigationfinal

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavAction
import androidx.navigation.Navigation
import com.example.navigationfinal.databinding.FragmentDashboardBinding

class Dashboard : Fragment() {

    private val dashboardBinding:FragmentDashboardBinding ?=null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = FragmentDashboardBinding.inflate(inflater, container, false)
        binding.button1.setOnClickListener { Navigation.findNavController(binding.root).navigate(R.id.goTo_page1) }
        binding.button2.setOnClickListener { Navigation.findNavController(binding.root).navigate(R.id.goTopage2) }

        return binding.root
    }
}