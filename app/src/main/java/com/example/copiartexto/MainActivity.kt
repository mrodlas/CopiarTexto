package com.example.copiartexto

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.copiartexto.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.boton.setOnClickListener{
            binding.saludo.text = "Hola, "  + binding.nombre.text.toString()
           // Toast.makeText(this, binding.nombre.text.toString(), Toast.LENGTH_LONG).show()
            Toast.makeText(this, "Esto es una tostada", Toast.LENGTH_LONG).show()
        }

        binding.limpiar.setOnClickListener{
            binding.nombre.text.clear()
            binding.saludo.text = ""
        }
        /*
        //Referencia al botón
        var btn = findViewById<Button>(R.id.boton)

        //Referencia al cuadro de texto
        var texto = findViewById<EditText>(R.id.nombre)

        //Referencia al cuadro de saludo
        var saludo = findViewById<TextView>(R.id.saludo)

        btn.setOnClickListener {
            saludo.text = "Hola, " + texto.text.toString()
            //saludo.setText(texto.text.toString())
        }

        var limpiar = findViewById<Button>(R.id.limpiar)

        limpiar.setOnClickListener{
            texto.text.clear()
            saludo.text = " "
        }
        */
    }
}