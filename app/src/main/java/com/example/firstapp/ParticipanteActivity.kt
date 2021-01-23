package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_participante.*

class ParticipanteActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_participante)

        theName.text=intent.getStringExtra("name")
        theLastname.text=intent.getStringExtra("lastname")
        theAge.text=intent.getStringExtra("age")
        theCareer.text=intent.getStringExtra("career")
        theBiography.text=intent.getStringExtra("biography")
    }
}