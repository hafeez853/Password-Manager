package com.example.onepassword.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.onepassword.R
import com.example.onepassword.adapter.MainRecycler
import com.example.onepassword.databinding.FragmentHomeBinding
import com.example.onepassword.dataclasses.DataList

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<DataList>
    private lateinit var imgId: Array<Int>
    private lateinit var imge2: Array<Int>
    private lateinit var heading: Array<String>


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        imgId = arrayOf(
            R.drawable.facebook,
            R.drawable.amazon,
            R.drawable.apple,
            R.drawable.netflix,

            )
        heading = arrayOf(
            "FaceBook",
            "Amazon",
            "Apple",
            "Netflix"
        )
        imge2 = arrayOf(
            R.drawable.copy,
            R.drawable.copy,
            R.drawable.copy,
            R.drawable.copy,


        )


        newRecyclerView = binding.webRecycle
        newRecyclerView.layoutManager = LinearLayoutManager(requireContext())
        newRecyclerView.setHasFixedSize(true)
        newArrayList = arrayListOf<DataList>()
        getUserData()
        clickOnProfileImg()
        addImage()

    }

    private fun getUserData() {
        for (i in imgId.indices) {
            val dataListt = DataList(imgId[i], heading[i], imge2[i])
            newArrayList.add(dataListt)
        }
        newRecyclerView.adapter = MainRecycler(newArrayList)
    }

    private fun clickOnProfileImg() {
        binding.profileImg.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_profileFragment)
        }
    }
    private fun addImage(){
        binding.addImg.setOnClickListener{
            findNavController().navigate(R.id.action_homeFragment_to_updatePassFragment)
        }
    }


}