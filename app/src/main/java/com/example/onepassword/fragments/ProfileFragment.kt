package com.example.onepassword.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.onepassword.R
import com.example.onepassword.databinding.FragmentProfileBinding

class ProfileFragment : Fragment() {
    private lateinit var binding: FragmentProfileBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentProfileBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        changePassword()
        hideProfileNameOnUpdateClick()
//        showHiddenViewsOnEditProfileClick()
    }

    private fun changePassword() {
        binding.password.setOnClickListener {
            findNavController().navigate(R.id.action_profileFragment_to_changePasswordFragment)
        }
    }

    private fun hideProfileNameOnUpdateClick() {
        binding.updateProfile.setOnClickListener {
//            binding.logoHeading.visibility = View.GONE
            binding.profileName.visibility = View.GONE
            binding.proDesc.visibility = View.GONE
            binding.password.visibility = View.GONE
            binding.edit.visibility = View.GONE
            binding.darkMode.visibility = View.GONE
            binding.logOut.visibility = View.GONE
            binding.version.visibility = View.GONE
            binding.updateProfile.visibility = View.GONE
//            binding.EditProfile.visibility = View.VISIBLE
            binding.topNav.visibility = View.VISIBLE
            binding.Changeprofile.visibility = View.VISIBLE
            binding.nameText.visibility = View.VISIBLE
            binding.nameEditText.visibility = View.VISIBLE
            binding.registerBtn.visibility = View.VISIBLE
            binding.logInBtn.visibility = View.VISIBLE

        }
    }

    private fun showHiddenViewsOnEditProfileClick() {
        binding.updateProfile.setOnClickListener {

            binding.EditProfile.visibility = View.VISIBLE

        }

    }
}
