package com.sriyank.javatokotlindemo.activities

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputLayout
import com.sriyank.javatokotlindemo.R
import com.sriyank.javatokotlindemo.app.Constants
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(toolbar)

    }

    /**Save app username in SharedPreferences*/
    fun saveName(view: View) {
        Toast.makeText(applicationContext,"Feature is currently unavailable",Toast.LENGTH_LONG).show()
    }

    /**Search repositories on github after passing data to DisplayActivity*/
    fun listRepositories(view: View) {
        if (isNotEmpty(etRepoName, inputLayoutRepoName)) {
            val queryRepo = etRepoName.text.toString()
            val repoLanguage = etLanguage.text.toString()

            val intent = Intent(this, DisplayActivity::class.java)
            intent.putExtra(Constants.KEY_QUERY_TYPE, Constants.SEARCH_BY_REPO)
            intent.putExtra(Constants.KEY_REPO_SEARCH, queryRepo)
            intent.putExtra(Constants.KEY_LANGUAGE, repoLanguage)
            startActivity(intent)
        }
    }


    /**Search repositories of a particular github user after passing data to DisplayActivity*/
    fun listUserRepositories(view: View) {
        if (isNotEmpty(etGithubUser, inputLayoutGithubUser)) {
            val githubUser = etGithubUser.text.toString()

            val intent = Intent(this, DisplayActivity::class.java)
            intent.putExtra(Constants.KEY_QUERY_TYPE, Constants.SEARCH_BY_USER)
            intent.putExtra(Constants.KEY_GITHUB_USER, githubUser)
            startActivity(intent)
        }
    }


    private fun isNotEmpty(editText: EditText, textInputLayout: TextInputLayout): Boolean {
        return if (editText.text.toString().isEmpty()) {
            textInputLayout.error = "Cannot be blank!"
            false
        }
        else {
            textInputLayout.isErrorEnabled = false
            true
        }
    }
}