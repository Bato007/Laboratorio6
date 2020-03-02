@file:Suppress("DEPRECATION")

package com.example.laboratorio6.results


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.findNavController
import com.example.laboratorio6.R
import com.example.laboratorio6.databinding.ResultsFragmentBinding
import com.example.laboratorio6.survey.SurveyViewModel

/**
 * A simple [Fragment] subclass.
 */
@Suppress("DEPRECATION")
class ResultsFragment : Fragment() {

    // Data binding
    private lateinit var binding: ResultsFragmentBinding

    // ViewModel
    private lateinit var surveyViewModel: SurveyViewModel
    private lateinit var resultViewModel: ResultsViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {

        binding = DataBindingUtil.inflate(inflater,
            R.layout.results_fragment, container, false)

        surveyViewModel = ViewModelProviders.of(activity!!).get(SurveyViewModel::class.java)
        resultViewModel = ViewModelProviders.of(activity!!).get(ResultsViewModel::class.java)

        // Binding
        binding.lifecycleOwner = this

        binding.seeResults.setOnClickListener{ view: View? ->
            resultViewModel.getAnswers()
            view!!.findNavController().navigate(R.id.action_resultsFragment_to_showResultsFragment)
        }

        binding.newSurvey.setOnClickListener { view: View ->
            resultViewModel.newSurvey()
            view.findNavController().navigate(R.id.action_resultsFragment_to_mainFragment)
        }

        binding.lifecycleOwner = this

        return binding.root
    }


}
