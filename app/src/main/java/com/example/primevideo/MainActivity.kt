package com.example.primevideo

import android.annotation.SuppressLint
import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.inflate
import android.webkit.WebStorage
import android.widget.HorizontalScrollView
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.res.ColorStateListInflaterCompat.inflate
import com.example.primevideo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var imageViewPueblo : ImageView

    lateinit var hsvOriginals : HorizontalScrollView
    lateinit var hsvSeguir : HorizontalScrollView
    lateinit var hsvtaquilleras : HorizontalScrollView
    lateinit var txOriginals : TextView
    lateinit var txSeguir : TextView
    lateinit var txtaquilleras : TextView

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)


        imageViewPueblo = findViewById(R.id.pueblo)

        txOriginals = findViewById(R.id.originalestx)
        hsvOriginals = findViewById(R.id.originales)
        txSeguir = findViewById(R.id.seguirtx)
        hsvSeguir = findViewById(R.id.seguir)
        txtaquilleras = findViewById(R.id.taquillerastx)
        hsvtaquilleras = findViewById(R.id.taquilleras)


        imageViewPueblo.setOnClickListener {
            saludaAAmazon()
        }

        hsvOriginals.visibility = View.GONE
        hsvSeguir.visibility = View.INVISIBLE
        hsvtaquilleras.visibility = View.GONE

        txOriginals.setOnClickListener{
            if(hsvOriginals.visibility == View.VISIBLE)
                hsvOriginals.visibility = View.GONE
            else
                hsvOriginals.visibility = View.VISIBLE
        }
        txSeguir.setOnClickListener{
            if(hsvSeguir.visibility == View.VISIBLE)
                hsvSeguir.visibility = View.GONE
            else
                hsvSeguir.visibility = View.VISIBLE
        }
        txtaquilleras.setOnClickListener{
            if(hsvtaquilleras.visibility == View.VISIBLE)
                hsvtaquilleras.visibility = View.GONE
            else
                hsvtaquilleras.visibility = View.VISIBLE
        }
    }

    fun saludaAAmazon(){
        Toast.makeText(this, "Hola Amazon!", Toast.LENGTH_LONG).show()
    }
}