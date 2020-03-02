package com.example.laboratorio6.dataBase

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(tableName = "answer_table")
class Answer {

    @PrimaryKey(autoGenerate = true)
    var answerId: Int = 0

    @ForeignKey(entity = Question::class, parentColumns = [],
        childColumns = [], onDelete = 5)
    var questionBase: Question = Question()
    
    @ForeignKey(entity = Poll::class, parentColumns = [],
        childColumns = [], onDelete = 5)
    var pollBase: Poll = Poll()

    @ColumnInfo(name = "answer_text")
    var inputString: String = ""

    @ColumnInfo(name = "answer_number")
    var inputNumber: Int = 0
}