package com.bchmsl.samplefragmenttutorial

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.bchmsl.samplefragmenttutorial.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
    }

    private fun init() {
        binding.btnNext.setOnClickListener {
            val value = binding.etParameter.text.toString().toInt()
            findNavController().navigate(MainFragmentDirections.actionMainFragmentToSecondFragment(value))
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}