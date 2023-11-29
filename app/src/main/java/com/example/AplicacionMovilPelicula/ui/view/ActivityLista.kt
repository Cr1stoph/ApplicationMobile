package com.example.AplicacionMovilPelicula.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.AplicacionMovilPelicula.R
import com.example.AplicacionMovilPelicula.domain.SelectedListener
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ActivityLista : AppCompatActivity(), SelectedListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista)
    }

    override fun onSelected(id: Int) {
        val bundle = Bundle()
        bundle.putInt("id", id)

        val detailsFragment = DetailsFragment()
        detailsFragment.arguments = bundle

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainerView, detailsFragment)
            .addToBackStack(null)
            .commit()
    }
}