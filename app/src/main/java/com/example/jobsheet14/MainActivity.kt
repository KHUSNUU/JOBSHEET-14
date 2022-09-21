package com.example.jobsheet14

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pplg = findViewById<Button>(R.id.PPLG)
        val tl = findViewById<Button>(R.id.TL)
        val to = findViewById<Button>(R.id.TO)
        val kuliner = findViewById<Button>(R.id.KULINER)
        val busana = findViewById<Button>(R.id.BUSANA)


        pplg.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, pplgFragment())
            fragmentTransaction.commit()
        }

        kuliner.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, KulinerFragment())
            fragmentTransaction.commit()
        }

        tl.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, TLFragment())
            fragmentTransaction.commit()
        }
        to.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, ToFragment())
            fragmentTransaction.commit()
        }

        busana.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, BusanaFragment())
            fragmentTransaction.commit()
        }

    }
}