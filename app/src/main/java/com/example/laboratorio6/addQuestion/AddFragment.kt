package com.example.laboratorio6.addQuestion


import android.os.Bundle
import android.view.*
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.laboratorio6.R
import com.example.laboratorio6.databinding.AddFragmentBinding

/**
 * A simple [Fragment] subclass.
 */
class AddFragment : Fragment() {

    // Binding
    private lateinit var addBinding: AddFragmentBinding

    // Lista de opciones
    private var type = arrayOf("Text", "Number", "Rating")

    // ViewModels

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {

        // Inicializando variables
        addBinding = DataBindingUtil.inflate(inflater, R.layout.add_fragment, container, false)

        addBinding.questionType.adapter = ArrayAdapter<String>(this.activity!!, R.layout.support_simple_spinner_dropdown_item, type)

        setHasOptionsMenu(true)
        return addBinding.root
    }

    // Inicializando el menu para poder guardar las cosas
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.add_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        view!!.findNavController().navigate(R.id.action_addFragment_to_mainFragment)
        return super.onOptionsItemSelected(item)
    }
}
