package com.example.laboratorio6.results

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ResultsViewModel: ViewModel() {

    var inputAnswer = MutableLiveData<String>()

    private val _results = MutableLiveData<String>()
    val obtainedResults: LiveData<String>
        get() = _results

    private val _numberSurvey = MutableLiveData<String>()
    val numberSurvey: LiveData<String>
        get() = _numberSurvey

    private val _answersString = MutableLiveData<String>()
    val answersString: LiveData<String>
        get() = _answersString

    private var count: Int = 1

    private var answers: ArrayList<String> = ArrayList()

    fun add(){
        answers.add(inputAnswer.value.toString())
    }

    fun newSurvey(){
        count++
    }

    fun getAnswers(){
        var answers = "Tus Respuestas:\n"

        for (i in answers){
            answers += i + "\n"
        }

        this._answersString.value = answers
        this._numberSurvey.value = count.toString()
    }
}