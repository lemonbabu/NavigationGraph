package com.fashol.navigationgraph

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.fashol.navigationgraph.databinding.FragmentBlankBinding


class BlankFragment : Fragment(R.layout.fragment_blank) {

    private lateinit var binding: FragmentBlankBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentBlankBinding.bind(view)

        binding.button.setOnClickListener {
            findNavController().navigate(R.id.action_blankFragment_to_blankFragment2)
        }
    }

//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        // Inflate the layout for this fragment
//        val view = inflater.inflate(R.layout.fragment_blank, container, false)
//        val button = view.findViewById<Button>(R.id.button)
//        button.setOnClickListener {
//
//        }
//        return view
//    }

}