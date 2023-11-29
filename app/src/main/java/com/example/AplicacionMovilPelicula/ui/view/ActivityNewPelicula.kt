package com.example.AplicacionMovilPelicula.ui.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.example.AplicacionMovilPelicula.R
import com.example.AplicacionMovilPelicula.databinding.ActivityNewPeliculaBinding

class ActivityNewPelicula : AppCompatActivity() {
    lateinit var binding: ActivityNewPeliculaBinding
//    lateinit var peliculaDBHelper: MiSQLLiteHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewPeliculaBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_new_pelicula)

//        peliculaDBHelper = MiSQLLiteHelper(this)
//
//        binding.btnGuardar.setOnClickListener{
//            if(binding.txtTitulo.text.isNotBlank() && binding.txtImage.text.isNotBlank() && binding.txtYear.text.isNotBlank() && binding.txtDescripcion.text.isNotBlank()){
//                peliculaDBHelper.agregarDato(binding.txtTitulo.text.toString(), binding.txtImage.text.toString(), binding.txtYear.text.toString(), binding.txtDescripcion.text.toString())
//                binding.txtTitulo.text.clear()
//                binding.txtImage.text.clear()
//                binding.txtYear.text.clear()
//                binding.txtDescripcion.text.clear()
//                Toast.makeText(this, "Guardado", Toast.LENGTH_LONG).show()
//            }else{
//                Toast.makeText(this, "No se ha podido guardar", Toast.LENGTH_LONG).show()
//            }
//        }


        val Backing = findViewById<TextView>(R.id.btnRegresar)
        Backing.setOnClickListener {
            goToBack()
        }
    }
    private fun goToBack(){
        val i = Intent(this, ActivityMenu::class.java)
        startActivity(i)
    }
}