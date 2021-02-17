package com.example.mapmyindia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var data = 12345
        val number = data % 10 //5

        while (data != 0){

            if (number == 1){
                //exists
            }else{
                //not exists
                 data = data / 10

            }


        }

    }
}