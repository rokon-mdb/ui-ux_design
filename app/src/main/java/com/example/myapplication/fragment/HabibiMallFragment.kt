package com.example.myapplication.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.myapplication.R
import com.example.myapplication.adapter.VIewPagerAdapter
import com.example.myapplication.databinding.FragmentHabibiMallBinding
import com.google.android.material.tabs.TabLayoutMediator

class HabibiMallFragment : Fragment() {
    private var _binding: FragmentHabibiMallBinding? = null
    private val binding get() = _binding!!

    private val tabTitles = arrayListOf<String>("Avatar", "Party Theme", "Entrance effect")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentHabibiMallBinding.inflate(layoutInflater)
        setUpTabLayoutWithViewPager()
        return binding.root
    }

    private fun setUpTabLayoutWithViewPager() {
        binding.viewPager.adapter = VIewPagerAdapter(this)
        TabLayoutMediator(binding.tabLayout, binding.viewPager) { tab, position ->
            tab.text = tabTitles[position]
        }.attach()

        for(i in 0..2){
            val textView = LayoutInflater.from(requireContext())
                .inflate(R.layout.tab_title, null) as TextView
            binding.tabLayout.getTabAt(i)?.customView = textView
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }

}