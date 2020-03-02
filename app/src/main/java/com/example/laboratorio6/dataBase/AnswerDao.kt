package com.example.laboratorio6.dataBase

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface AnswerDao {

    @Insert
    fun insert(data: Answer)

    @Update
    fun update(data: Answer)

    @Query("SELECT * from answer_table WHERE answerId = :key")
    fun get(key: Answer)


}