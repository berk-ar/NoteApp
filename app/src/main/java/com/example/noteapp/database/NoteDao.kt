package com.example.noteapp.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.noteapp.models.Note

@Dao
interface NoteDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert (note : Note)

    @Delete
    suspend fun delete(note : Note)

    @Query("SELECT * FROM note_table order by id ASC")
    fun tumNotlar() : LiveData<List<Note>>

    @Update
    suspend fun update(id: Int?, title: String?, note: String?)
}