package com.example.navapp

import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.navapp.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home,container,false)

        // Handle the click event on the button
        binding.btn.setOnClickListener{

            if(!TextUtils.isEmpty(binding.editTextHome.text.toString())){
                val bundle = bundleOf("name" to binding.editTextHome.text.toString())
                it.findNavController().navigate(R.id.action_homeFragment_to_secondFragment2, bundle)

            }

            else{
                Toast.makeText(activity,"Enter Your Name", Toast.LENGTH_LONG).show()
            }

        }

        return binding.root
    }


}