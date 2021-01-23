package com.example.firstapp.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.firstapp.R
import com.example.firstapp.adapters.viewholders.ParticipanteViewHolder
import com.example.firstapp.listeners.ParticipanteListener
import com.example.firstapp.models.Participante

class ParticipanteAdapter(val participantes: List<Participante>) : RecyclerView.Adapter<ParticipanteViewHolder>() {

    private var participanteListener: ParticipanteListener? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ParticipanteViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.participante, parent, false)
        val participanteViewHolder = ParticipanteViewHolder(itemView)
        participanteViewHolder.setParticipanteListener(participanteListener)
        return participanteViewHolder
    }

    override fun onBindViewHolder(holder: ParticipanteViewHolder, position: Int) {
        holder.bindBook(participantes[position])
    }

    override fun getItemCount(): Int {
        return participantes.size
    }

    fun setBookListener(listener: ParticipanteListener?){
        this.participanteListener=listener
    }
}