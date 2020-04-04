package com.example.rand

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(supportActionBar != null){
            supportActionBar!!.hide()
        }

        buttonRandon.setOnClickListener(this)
        textNumber.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if(v?.id == R.id.buttonRandon || v?.id == R.id.textNumber){
            textNumber.text  = Randon().toString()

        }

    }

    fun Randon(): Int{
        return Random.nextInt(50) + 1
    }

}
