package com.example.laboratorio6.showResults


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.laboratorio6.R
import com.example.laboratorio6.databinding.ShowResultsBinding

/**
 * A simple [Fragment] subclass.
 */
class ShowResultsFragment : Fragment() {

    private lateinit var binding: ShowResultsBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {

        binding = DataBindingUtil.inflate(inflater,
            R.layout.show_results, container, false)

        return binding.root
    }


}
