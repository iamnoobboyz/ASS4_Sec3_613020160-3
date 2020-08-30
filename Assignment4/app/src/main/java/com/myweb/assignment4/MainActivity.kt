package com.myweb.assignment4

import DatePickerFragment
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun showInfo(view:View){
        val radio: RadioButton = findViewById(radioGroup.checkedRadioButtonId)
        text_show.text = "Name: ${edit_usr.text}\nPassword: ${edit_pass.text}\nGender: ${radio.text}\nE-mail: ${edit_email.text}\nBirthday: ${text_date.text}"
    }
    fun showDatePickerDialog(v: View){
        val newDateFragment = DatePickerFragment()
        newDateFragment.show(supportFragmentManager, "Date Picker")
    }
    fun radio_button_click(view: View){
        val radio: RadioButton = findViewById(radioGroup.checkedRadioButtonId)
    }

    fun reset(v:View){
        edit_usr.text.clear()
        edit_pass.text.clear()
        male.setChecked(false)
        female.setChecked(false)
        edit_email.text.clear()
        text_date.text = "mm /dd/yy"
        text_show.text = "Show Information"
    }

}