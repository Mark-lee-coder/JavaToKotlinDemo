package com.sriyank.javatokotlindemo.activities

import androidx.appcompat.app.AppCompatActivity
import android.widget.EditText
import com.google.android.material.textfield.TextInputLayout
import android.os.Bundle
import com.sriyank.javatokotlindemo.R
import android.content.SharedPreferences
import android.content.Intent
import android.view.View
import androidx.appcompat.widget.Toolbar
import com.sriyank.javatokotlindemo.activities.DisplayActivity
import com.sriyank.javatokotlindemo.activities.MainActivity
import com.sriyank.javatokotlindemo.app.Constants

class MainActivity : AppCompatActivity() {
    private var etName: EditText? = null
    private var etGithubRepoName: EditText? = null
    private var etLanguage: EditText? = null
    private var etGithubUser: EditText? = null
    private var inputLayoutName: TextInputLayout? = null
    private var inputLayoutRepoName: TextInputLayout? = null
    private var inputLayoutGithubUser: TextInputLayout? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        etName = findViewById(R.id.etName)
        etGithubRepoName = findViewById(R.id.etRepoName)
        etLanguage = findViewById(R.id.etLanguage)
        etGithubUser = findViewById(R.id.etGithubUser)
        inputLayoutName = findViewById(R.id.inputLayoutName)
        inputLayoutRepoName = findViewById(R.id.inputLayoutRepoName)
        inputLayoutGithubUser = findViewById(R.id.inputLayoutGithubUser)
    }
}