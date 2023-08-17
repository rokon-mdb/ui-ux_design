package com.example.myapplication.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.example.myapplication.R
import com.example.myapplication.adapter.LevelAdapter
import com.example.myapplication.databinding.FragmentEntryEffectBinding
import com.example.myapplication.model.Levels

class EntryEffectFragment : Fragment() {
    private var _binding: FragmentEntryEffectBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentEntryEffectBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val list = listOf<String>("hi","hello", "bye", "hi","hello", "bye")
        val levels = listOf<Levels>(
            Levels(R.drawable.fight6, true),
            Levels(R.drawable.fight5, true),
            Levels(R.drawable.fight4, true),
            Levels(R.drawable.fight3, true),
            Levels(R.drawable.fight2, true),
            Levels(R.drawable.fight1, false)
        )

        val adapter = LevelAdapter(requireContext(), levels)

        binding.rvGameLevel.adapter = adapter
        binding.rvGameLevel.layoutManager = GridLayoutManager(requireContext(), 2)
    }
}