package dataBase

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "question_table")
class Question {

    @PrimaryKey(autoGenerate = true)
    var questionId: Int = 0

    @ColumnInfo(name = "question")
    var questionText: String = ""

    @ColumnInfo(name = "question_type")
    var typeBase: String = ""

    @ColumnInfo(name = "default")
    var defaul: Boolean = true

}