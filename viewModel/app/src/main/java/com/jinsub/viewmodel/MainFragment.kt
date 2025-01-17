package com.jinsub.viewmodel

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.jinsub.viewmodel.databinding.FragmentMainBinding
import com.jinsub.viewmodel.BR.myViewModel


class MainFragment : Fragment() {

    lateinit var binding: FragmentMainBinding

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: ViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_main, container, false
        )
        binding.setLifecycleOwner(this)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ViewModel::class.java)
        binding.setVariable(myViewModel, viewModel)
//        binding.resultText.text = viewModel.getResult().toString()
//        val resultObserver = Observer<Float> { result ->
//            binding.resultText.text = result.toString()
//        }


//        viewModel.getResult().observe(viewLifecycleOwner, resultObserver)
//
//        binding.convertButton.setOnClickListener {
//            if (binding.dollarText.text.isNotEmpty()) {
//                viewModel.setAmount(binding.dollarText.text.toString())
////                binding.resultText.text = viewModel.getResult().toString()
//            } else {
//                binding.resultText.text = "No Value"
//            }
//        }
    }

}