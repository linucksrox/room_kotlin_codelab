package com.dalydays.android.roomwordsamplekotlin.data.repository

import androidx.annotation.WorkerThread
import androidx.lifecycle.LiveData
import com.dalydays.android.roomwordsamplekotlin.data.db.Word
import com.dalydays.android.roomwordsamplekotlin.data.db.WordDao

class WordRepository(private val wordDao: WordDao) {
    val allWords: LiveData<List<Word>> = wordDao.getAllWords()

    @WorkerThread
    suspend fun insert(word: Word) {
        wordDao.insert(word)
    }
}