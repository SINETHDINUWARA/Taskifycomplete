package com.example.thenotesapp.adapter

import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.notesroompractice.databinding.NoteLayoutBinding
import com.example.thenotesapp.model.Note

class NoteAdapter : RecyclerView.Adapter<NoteAdapter.NoteViewHolder>() {

    class NoteViewHolder(val itemBinding: NoteLayoutBinding): RecyclerView.ViewHolder(itemBinding.root)

    private val differcallback = object : DiffUtil.ItemCallback<Note>(){
        override fun areItemsTheSame(oldItem: Note, newItem: Note): Boolean {
            TODO("Not yet implemented")
        }

        override fun areContentsTheSame(oldItem: Note, newItem: Note): Boolean {
            TODO("Not yet implemented")
        }

    }
}