package com.dalydays.android.roomwordsamplekotlin.data.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface WordDao {

    @Query("SELECT * FROM word ORDER BY word ASC")
    fun getAllWords(): LiveData<List<Word>>

    @Insert
    fun insert(word: Word)

    @Query("DELETE FROM word")
    fun deleteAll()
}