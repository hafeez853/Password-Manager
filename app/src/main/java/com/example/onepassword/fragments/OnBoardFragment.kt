package com.example.onepassword.fragments

import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2
import com.example.onepassword.R
import com.example.onepassword.adapter.ViewPagerAdapter
import com.example.onepassword.databinding.FragmentOnBoardBinding

class OnBoardFragment : Fragment() {
    private var titleList = mutableListOf<SpannableString>()
    private var desList = mutableListOf<String>()
    private lateinit var binding: FragmentOnBoardBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentOnBoardBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        postToList()
        binding.viewPager2.adapter = ViewPagerAdapter(titleList, desList)
        binding.viewPager2.orientation = ViewPager2.ORIENTATION_HORIZONTAL
        binding.indicator.setViewPager(binding.viewPager2)
        logoBtnClick()
        signUpBtnClick()
    }

    private fun addToList(title: SpannableString, description: String) {
        titleList.add(title)
        desList.add(description)
    }

    private fun postToList() {
        val title = "Generate\nSecure\nPasswords."
        val description = "Stop using unsecure passwords for your online" +
                " accounts, level up with OnePass." +
                " Get the most secure and difficult-to-crack passwords."

        val spannableTitle = SpannableString(title)
        val startIndexOfSecure = title.indexOf("Secure")
        spannableTitle.setSpan(
            ForegroundColorSpan(ContextCompat.getColor(requireContext(), R.color.primary_default)),
            startIndexOfSecure,
            startIndexOfSecure + "Secure".length,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )

        val spannableParagraph = SpannableString("ALL YOUR\nPASSWORDS ARE\nHERE.")
        val startIndexOfPasswordsInParagraph = spannableParagraph.indexOf("PASSWORDS")
        spannableParagraph.setSpan(
            ForegroundColorSpan(ContextCompat.getColor(requireContext(), R.color.primary_default)),
            startIndexOfPasswordsInParagraph,
            startIndexOfPasswordsInParagraph + "PASSWORDS".length,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )

        val spannableAutofill = SpannableString("DON’T TYPE,\nAUTOFILL YOUR\nCREDENTIALS.")
        val startIndexOfAutofill = spannableAutofill.indexOf("AUTOFILL")
        spannableAutofill.setSpan(
            ForegroundColorSpan(ContextCompat.getColor(requireContext(), R.color.primary_default)),
            startIndexOfAutofill,
            startIndexOfAutofill + "AUTOFILL".length,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )

        addToList(spannableTitle, description)
        addToList(
            spannableParagraph,
            "Store and manage all of your passwords from one place. " +
                    "Don’t remember hundreds of passwords, just remember one."
        )
        addToList(
            spannableAutofill,
            "Don’t compromise your passwords by typing them in public," +
                    " let OnePass autofill those and keep your credentials secure."
        )
    }

    private fun logoBtnClick() {
        binding.logInBtn.setOnClickListener {
            findNavController().navigate(R.id.action_onBoardFragment2_to_logInFragment)
        }
    }

    private fun signUpBtnClick() {
        binding.registerBtn.setOnClickListener {
            findNavController().navigate(R.id.action_onBoardFragment2_to_signUpFragment)
        }
    }
}
