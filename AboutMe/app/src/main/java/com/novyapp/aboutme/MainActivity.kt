package com.novyapp.aboutme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var createNameButton: Button
    lateinit var editNickname : EditText
    lateinit var nicknameView: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        createNameButton = findViewById(R.id.button)
        editNickname = findViewById(R.id.nickname_edit)
        nicknameView = findViewById(R.id.nickname_text)

        createNameButton.setOnClickListener{
            addNickname(it)
        }
    }

    private fun addNickname(view: View){
        nicknameView.text = editNickname.text

        editNickname.visibility = View.GONE
        view.visibility = View.GONE
        nicknameView.visibility = View.VISIBLE

        //Hide Keyboard
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }
}
