package com.example.fromfragmenttoactivity

import android.widget.EditText
import android.widget.TextView

interface MyListener {




    fun sayilariTopla(sayi1:Int, sayi2:Int){

        var toplam = sayi1 + sayi2
        //sonuc.setText("SONUC: " +toplam)


    }
}