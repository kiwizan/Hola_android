package com.whgutierezr.holaandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() { // el extend o herencia se hace solo con los dos puntos :
    override fun onCreate(savedInstanceState: Bundle?) {    //sobre escribiendo la clase
                                                            // fun hace refeerencia a que es una funcion
        super.onCreate(savedInstanceState)                  // llama al atributo metodo de la clase padre
        setContentView(R.layout.activity_main)
    }

}