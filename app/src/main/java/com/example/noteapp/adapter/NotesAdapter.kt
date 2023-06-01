package com.example.noteapp.adapter

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.noteapp.models.Note

class NotesAdapter(private val context : Context) : RecyclerView.Adapter<NotesAdapter.NoteViewHolder> {

    private val notesList : ArrayList<Note>()
    private val fullList : ArrayList<Note>()

    inner class NoteViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

        val notes_layout = itemView.findViewById<CardView>(R.id.)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return notesList.size
    }

    override fun onBindViewHolder(holder: NoteViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

}