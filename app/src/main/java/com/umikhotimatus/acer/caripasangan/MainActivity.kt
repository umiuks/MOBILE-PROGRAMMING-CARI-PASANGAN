package com.umikhotimatus.acer.caripasangan

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnMatch.setOnClickListener {cariPasangan()}
    }

    fun cariPasangan(){
        val randomCewek = Random().nextInt(6)+1
        val randomCowok = Random().nextInt(16)+1
        val drawableResCewek = when (randomCewek){
            1 ->R.drawable.cewek1
            2 ->R.drawable.cewek2
            3 ->R.drawable.cewek3
            4 ->R.drawable.cewek4
            5 ->R.drawable.cewek5
            else ->R.drawable.cewek6
        }
        val drawableResCowok = when (randomCowok){
            1 ->R.drawable.cowok1
            2 ->R.drawable.cowok2
            3 ->R.drawable.cowok3
            4 ->R.drawable.cowok4
            5 ->R.drawable.cowok5
            6 ->R.drawable.cowok6
            7 ->R.drawable.cowok7
            8 ->R.drawable.cowok8
            9 ->R.drawable.cowok9
            10 ->R.drawable.cowok10
            11 ->R.drawable.cowok11
            else ->R.drawable.cowok12

        }
        cewek.setImageResource(drawableResCewek)
        cowok.setImageResource(drawableResCowok)
    }
}
