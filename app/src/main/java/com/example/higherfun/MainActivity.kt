package com.example.higherfun

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatEditText
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {

    private val account by lazy {
        findViewById<AppCompatEditText>(R.id.account)
    }

    private val pwd by lazy {
        findViewById<AppCompatEditText>(R.id.pwd)
    }
    private val loginBtn by lazy {
        findViewById<MaterialButton>(R.id.loginBtn)
    }




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginBtn.enable(account) { isBtnEnable() }
        loginBtn.enable(pwd){ isBtnEnable()}

    }

    private fun isBtnEnable():Boolean{
        return account.text!!.isNotEmpty() && pwd.text!!.isNotEmpty()
    }

}