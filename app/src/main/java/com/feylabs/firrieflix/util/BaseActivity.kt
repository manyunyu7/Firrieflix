package com.feylabs.firrieflix.util

import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

open class BaseActivity : AppCompatActivity() {

    fun String.showLongToast(){
        Toast.makeText(applicationContext,this,Toast.LENGTH_LONG).show()
    }
    fun String.showShortToast(){
        Toast.makeText(applicationContext,this,Toast.LENGTH_LONG).show()
    }

    fun View.MakeViewVisible(){
        this.visibility = View.VISIBLE
    }
    fun View.MakeViewGone(){
        this.visibility = View.GONE
    }

}