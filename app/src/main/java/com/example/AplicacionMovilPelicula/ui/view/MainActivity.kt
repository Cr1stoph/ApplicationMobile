package com.example.AplicacionMovilPelicula.ui.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.AplicacionMovilPelicula.R
//import com.example.AplicacionMovilPelicula.databinding.ActivityMenuBinding


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val Menu = findViewById<TextView>(R.id.btnAdministrar)
        Menu.setOnClickListener {
            goToMenu()
        }

        val Peliculas = findViewById<TextView>(R.id.btnListaPeliculas)
        Peliculas.setOnClickListener {
            goToAMIN()
        }
    }

    private fun goToMenu(){
        val i = Intent(this, ActivityMenu::class.java)
        startActivity(i)
    }
    private fun goToAMIN(){
        val i = Intent(this, ActivityLista::class.java)
        startActivity(i)
    }

}