package com.example.laboratorio6.survey

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SurveyViewModel: ViewModel() {

    var newQuestion = MutableLiveData<String>()

    //Pregunta que se le mostrara al usuario
    private val _showQuestion = MutableLiveData<String>()
    val showQuestion: LiveData<String>
        get() = _showQuestion

    // Tipo de la pregunta
    private  var questionType: String

    private var questionLeft: Int = 1

    // Las preguntas
    private var questions: ArrayList<String> = ArrayList()
    private var questionsType: ArrayList<String> = ArrayList()

    // Las que no se borran
    private var allQuestions: ArrayList<String> = ArrayList()
    private var allTypes: ArrayList<String> = ArrayList()

    init {
        // Questions
        questions.add("Do you have any Comments or Suggestions?")
        questions.add("How was our Service?")
        allQuestions.add("Do you have any Comments or Suggestions?")
        allQuestions.add("How was our Service?")

        // Type
        questionsType.add("Text")
        questionsType.add("Rating")

        allTypes.add("Text")
        allTypes.add("Rating")

        questionType = questionsType[questionsType.size - 1]
        _showQuestion.value = questions[questions.size - 1]
    }

    fun updateQuestions(){
        questions.clear()
        questionsType.clear()
        questions = allQuestions
        questionsType = allTypes
    }

    fun addQuesiton(type: String){
        allQuestions.add(newQuestion.value.toString())
        allTypes.add(type)
    }

    fun nextQuestion(){
        _showQuestion.value = questions[this.questionLeft - 1]
        questionType = questionsType[this.questionLeft - 1]
        this.questionLeft++
    }

    fun restartQuestions(){
        this.questionLeft = 1
    }

    fun getListSize(): Int{
        return questions.size
    }

    fun getQuestionLeft(): Int{
        return questionLeft
    }

    fun getQuestionType(): String{
        return questionType
    }
}