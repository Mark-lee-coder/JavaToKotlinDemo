package com.sriyank.javatokotlindemo.extensions

import android.widget.EditText
import com.google.android.material.textfield.TextInputLayout

//the boolean is a return value
fun EditText.isNotEmpty(textInputLayout: TextInputLayout) : Boolean {
    return if (text.toString().isEmpty()) {
        textInputLayout.error = "Cannot be blank!"
        false
    }
    else {
        textInputLayout.isErrorEnabled = false
        true
    }
}