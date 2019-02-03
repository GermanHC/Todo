package com.germanhc.todo.ui.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.germanhc.todo.R
import kotlinx.android.synthetic.main.activity_main.*

abstract class BaseActivity : AppCompatActivity() {

    protected fun setUpToolbar(homeIsEnabled: Boolean) {
        val toolbar = findViewById<Toolbar>(R.id.toolbar).apply {
            setSubtitle(null)
        }

        setSupportActionBar(toolbar)
        supportActionBar?.setHomeButtonEnabled(homeIsEnabled)
        supportActionBar?.setDisplayShowHomeEnabled(homeIsEnabled)
    }

}