package com.example.lab2_xmllayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/**
 * Since we are building the layout for a basic tip calculator app, we have made changes only
 * in the activity_main.xml file
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}