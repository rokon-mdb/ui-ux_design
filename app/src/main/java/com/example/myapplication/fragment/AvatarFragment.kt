package com.example.myapplication.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.example.myapplication.R
import com.example.myapplication.adapter.AvatarAdapter
import com.example.myapplication.databinding.FragmentAvatarBinding
import com.example.myapplication.model.Avatar

class AvatarFragment : Fragment() {
    private var _binding: FragmentAvatarBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentAvatarBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val list = listOf<Avatar>(
            Avatar(R.drawable.rkn, R.drawable.profile_frame, "Dragon"),
            Avatar(R.drawable.pp1, R.drawable.frame_1, "Golden Radiance"),
            Avatar(R.drawable.pp2, R.drawable.frame_2, "Dreamy Crystal"),
            Avatar(R.drawable.pp3, R.drawable.frame_5, "Love Rock"),
            Avatar(R.drawable.pp4, R.drawable.frame_6, "Golden Wings"),
            Avatar(R.drawable.pp5, R.drawable.frame_4, "Flower Garland"),
        )
        binding.rvAvatar.adapter = AvatarAdapter(requireContext(), list)
        binding.rvAvatar.layoutManager = GridLayoutManager(requireContext(), 2)
    }

}