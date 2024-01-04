package com.example.onepassword.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.onepassword.R
import com.example.onepassword.databinding.FragmentLogInBinding

class LogInFragment : Fragment() {
    private lateinit var binding: FragmentLogInBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLogInBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        registerText()
        forgetPass()
        logInScreen()

    }
    private fun registerText(){
        binding.registerText.setOnClickListener{
            findNavController().navigate(R.id.action_logInFragment_to_signUpFragment)
        }

    }
    private fun forgetPass(){
        binding.forgetText.setOnClickListener{
            findNavController().navigate(R.id.action_logInFragment_to_forgetPassFragment)
        }
    }
    private fun logInScreen(){
        binding.logIn.setOnClickListener{
            findNavController().navigate(R.id.action_logInFragment_to_homeFragment)
        }
    }



}