@file:Suppress("DEPRECATION")

package com.example.laboratorio6.addQuestion


import android.os.Bundle
import android.view.*
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.findNavController
import com.example.laboratorio6.R
import com.example.laboratorio6.databinding.AddFragmentBinding
import com.example.laboratorio6.survey.SurveyViewModel

/**
 * A simple [Fragment] subclass.
 */
@Suppress("DEPRECATION")
class AddFragment : Fragment() {

    // Binding
    private lateinit var binding: AddFragmentBinding

    // ViewModel
    private lateinit var surveyViewModel: SurveyViewModel

    // Lista de opciones
    private var type = arrayOf("Text", "Number", "Rating")

    // ViewModels

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {

        // Inicializando variables
        binding = DataBindingUtil.inflate(inflater, R.layout.add_fragment, container, false)

        binding.questionType.adapter = ArrayAdapter<String>(this.activity!!, R.layout.support_simple_spinner_dropdown_item, type)

        surveyViewModel = ViewModelProviders.of(activity!!).get(SurveyViewModel::class.java)

        setHasOptionsMenu(true)
        return binding.root
    }

    // Inicializando el menu para poder guardar las cosas
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.add_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        surveyViewModel.addQuesiton(item.toString())
        binding.inputQuestion.text.clear()
        view!!.findNavController().navigate(R.id.action_addFragment_to_mainFragment)
        return super.onOptionsItemSelected(item)
    }
}
