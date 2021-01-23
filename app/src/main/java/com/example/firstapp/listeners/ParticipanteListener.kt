package com.example.firstapp.listeners

import com.example.firstapp.models.Participante

interface ParticipanteListener {

    fun onClickParticipante(participante: Participante)

    fun onShareParticipante(participante: Participante)
}