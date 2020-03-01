package com.example.laboratorio6.results


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.laboratorio6.R

/**
 * A simple [Fragment] subclass.
 */
class ResultsFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {


        return TextView(activity).apply {
            setText(R.string.hello_blank_fragment)
        }
    }


}
