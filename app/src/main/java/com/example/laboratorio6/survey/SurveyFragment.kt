package com.example.laboratorio6.survey


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.laboratorio6.R
import com.example.laboratorio6.databinding.SurveyFragmentBinding

/**
 * A simple [Fragment] subclass.
 */
class SurveyFragment : Fragment() {

    // Binding
    private lateinit var binding: SurveyFragmentBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {

        binding = DataBindingUtil.inflate(inflater,
            R.layout.survey_fragment, container, false)

        return binding.root
    }


}
