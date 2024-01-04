package com.example.onepassword.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.onepassword.R
import com.example.onepassword.databinding.FragmentUpdatePassBinding


class UpdatePassFragment : Fragment() {
    private lateinit var binding: FragmentUpdatePassBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
       binding = FragmentUpdatePassBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        generateNewPass()
        clickOnLogIn()
    }

    private fun generateNewPass() {
        binding.generateNew.setOnClickListener{
            findNavController().navigate(R.id.action_updatePassFragment_to_generateNewFragment)
        }
    }
    private fun clickOnLogIn() {
        binding.logIn.setOnClickListener {
//            binding.logoHeading2.visibility = View.GONE
//            binding.logoHeading.visibility = View.VISIBLE
            binding.logIn.visibility = View.GONE
            binding.logIn2.visibility = View.VISIBLE

        }
    }


}