package com.example.omar.scpuv

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_selecionar_aulas.*
import android.view.View
import android.view.WindowId
import android.widget.*
import java.text.FieldPosition

class SelecionarAulas : AppCompatActivity(), AdapterView.OnItemSelectedListener {
    var aulas = arrayOf("Aula 102","Aula 103","Aula 104","Aula 105","Aula 106","Aula 108",
            "Aula 111","Aula 112","Aula 113",)
    var spinner: Spinner? = null
    var txtAula: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selecionar_aulas)

        txtAula = this.aula_txt

        spinner = this.aulas_spinner
        spinner!!.setOnItemSelectedListener(this)

        // Se crea un ArrarAdapter para utilizar el spinner con el layout y el arreglo de aulas

        val aula = ArrayAdapter(this, android.R.layout.simple_spinner_item, aulas)
        aula.setDropDownViewResource(android.R.layout.simple_spinner_item)
        spinner!!.setAdapter(aula)

        fun onItemSelected(arg0:AdapterView<*>, arg1:View, position: Int, id: Long){
                txtAula!!.text = "Seleccione: "+ aulas[position]

        }
        fun onNothingSelected(arg0: AdapterView<*>) {

        }
    }
}
