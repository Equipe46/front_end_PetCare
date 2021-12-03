package com.example.petcare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val buttonAbrirLoginHomepage = findViewById<Button>(R.id.button_homepage_login)
        val buttonAbrirCadastrarMeHomepage = findViewById<Button>(R.id.button_homepage_cadastrar_me)
        val buttonAbrirCadastrarClinicasHomepage = findViewById<Button>(R.id.button_homepage_cadastrar_clinicas)
        val buttonAbrirLoginClinica = findViewById<Button>(R.id.button_homepage_eu_sou_uma_clinica)

        buttonAbrirLoginHomepage.setOnClickListener {
            val abrirTelaLogin = Intent(this, FazerLoginActivity::class.java)
            startActivity(abrirTelaLogin)
        }

        buttonAbrirCadastrarMeHomepage.setOnClickListener {
            val abrirTelaCadastarMe = Intent(this, CadastrarMectivity::class.java)
            startActivity(abrirTelaCadastarMe)
        }

        buttonAbrirCadastrarClinicasHomepage.setOnClickListener {
            val abrirTelaCadastrarClinicas = Intent(this, CadastrarClinicasActivity::class.java)
            startActivity(abrirTelaCadastrarClinicas)
        }

        buttonAbrirLoginClinica.setOnClickListener {
            val abrirTelaLoginClinicas = Intent(this, FazerLoginClinicaActivity::class.java)
            startActivity(abrirTelaLoginClinicas)
        }



    }
}



