package com.example.laboratorio6.dataBase

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "poll_table")
class Poll {

    @PrimaryKey(autoGenerate = true)
    var pollId: Int = 0

    @ColumnInfo(name = "created-date")
    var createdDat: Int = 1

}