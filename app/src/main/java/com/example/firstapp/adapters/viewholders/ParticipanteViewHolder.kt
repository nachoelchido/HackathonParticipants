package com.example.firstapp.adapters.viewholders

import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.firstapp.R
import com.example.firstapp.listeners.ParticipanteListener
import com.example.firstapp.models.Participante

class ParticipanteViewHolder(val itemView: View) : RecyclerView.ViewHolder(itemView) {

    private var participanteListener:ParticipanteListener? = null
    private var participante:Participante? = null

    private var nameTextView: TextView = itemView.findViewById(R.id.participanteNombre)
    private var apTextView: TextView = itemView.findViewById(R.id.participanteApellido)
    private var edadTextView: TextView = itemView.findViewById(R.id.participanteEdad)

    fun bindBook(participante: Participante) {
        this.participante=participante
        nameTextView.text = this.participante?.name
        apTextView.text = this.participante?.lastname
        edadTextView.text = this.participante?.age.toString()

        itemView.setOnClickListener { view ->
            participanteListener?.onClickParticipante(this.participante!!)
        }
    }

    fun setParticipanteListener(listener: ParticipanteListener?){
        this.participanteListener=listener
    }
}