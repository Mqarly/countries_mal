package com.example.countries_mal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun onClicked(view:View){
        if (KE_checkBox.isChecked)textresult.text="Kenya:Correct answer!!"
        if (UG_checkBox3.isChecked)textresult.text="Uganda:Correct answer!!"
        if (tanzania.isChecked)textresult.text="Tanzania:Incorrect answer!!"
    }
    fun onclicked(view:View){
        if (radioButtonYes.isChecked)textresult2.text="I am Certified"
        if (radioButtonNo.isChecked)textresult2.text="I am not yet certified"
        if (radioButtonNotsure.isChecked)textresult2.text="I'm not really sure"

    }


    }

