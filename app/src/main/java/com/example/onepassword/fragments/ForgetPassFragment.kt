package com.example.onepassword.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.onepassword.R
import com.example.onepassword.databinding.FragmentForgetPassBinding

class ForgetPassFragment : Fragment() {
    private lateinit var binding: FragmentForgetPassBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentForgetPassBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.submitBtn.setOnClickListener {
            toggleVisibility(binding.logodesc)
            toggleVisibility(binding.emailText)
            toggleVisibility(binding.emailEditText)

            if (binding.emailText.visibility == View.GONE) {
                binding.logodesc.text = getString(R.string.resetlinktext)
                binding.submitBtn.text = getString(R.string.resend)
            } else {
                binding.emailText.visibility = View.GONE
                binding.emailEditText.visibility = View.GONE
                binding.logoHeading.text = getString(R.string.resetpass)
                binding.submitBtn.text = getString(R.string.reset)
                toggleVisibility(binding.passwordText)
                toggleVisibility(binding.passwordEditText)

                binding.submitBtn.isEnabled = false
            }
        }
    }

    private fun toggleVisibility(view: View) {
        if (view.visibility == View.VISIBLE) {
            view.visibility = View.GONE
        } else {
            view.visibility = View.VISIBLE
        }
    }
}
