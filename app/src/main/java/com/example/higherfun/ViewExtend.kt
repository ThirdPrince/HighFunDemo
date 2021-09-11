package com.example.higherfun

import android.text.Editable
import android.text.TextWatcher
import androidx.appcompat.widget.AppCompatEditText
import com.google.android.material.button.MaterialButton

/**
 * @Title: $
 * @Package $
 * @Description: $(用一句话描述)
 * @author $
 * @date $
 * @version V1.0
 */

    fun MaterialButton.enable(et:AppCompatEditText,method:()->Boolean){
        val btn = this
        et.addTextChangedListener(object :TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

            }

            override fun afterTextChanged(s: Editable?) {

                btn.isEnabled = method()
            }

        })
    }
