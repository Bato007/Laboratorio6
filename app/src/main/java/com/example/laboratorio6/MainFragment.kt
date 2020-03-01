package com.example.laboratorio6


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.laboratorio6.R
import com.example.laboratorio6.databinding.MainFragmentBinding

/**
 * A simple [Fragment] subclass.
 */
class MainFragment : Fragment() {

    // Binding
    private lateinit var mainBinding: MainFragmentBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {

        // Inicializando el binding
        mainBinding = DataBindingUtil.inflate(inflater,
            R.layout.main_fragment, container, false)

        // Cambiando a la encuesta
        mainBinding.nextButt.setOnClickListener { view: View->

        }

        // Cambiando a agregar
        mainBinding.addQuestion.setOnClickListener{view: View ->
            view.findNavController().navigate(R.id.action_mainFragment_to_addFragment)
        }

        return mainBinding.root
    }


}
