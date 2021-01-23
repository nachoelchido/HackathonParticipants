package com.example.firstapp

import com.example.firstapp.adapters.ParticipanteAdapter
import com.example.firstapp.listeners.ParticipanteListener
import com.example.firstapp.models.Participante
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.LinearLayout.VERTICAL
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.participante.*


class MainActivity : AppCompatActivity(), ParticipanteListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val participantes = arrayListOf<Participante>(
            Participante(1,
                "Nacho",
                "Hernández",
                24,
                "Desarrollador",
            "Nacido en Puebla"),
            Participante(2,
                "Toñita",
                "Pérez",
                25,
                "Diseñador",
                "Nacido en Guadalajara")
        )
        val participanteAdapter = ParticipanteAdapter(participantes)
        participanteAdapter.setBookListener(this)
        participantesRecyclerView.adapter=participanteAdapter
        val layoutManager = StaggeredGridLayoutManager(3,RecyclerView.VERTICAL)
        participantesRecyclerView.layoutManager=layoutManager
    }

    override fun onClickParticipante(participante: Participante) {
        Toast.makeText(this, "Le dio click a ${participante.name}",Toast.LENGTH_LONG).show()
    }

    override fun onShareParticipante(participante: Participante) {
        Toast.makeText(this,"Le dio click al button",Toast.LENGTH_LONG).show()
    }
}