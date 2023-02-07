package com.gearsofdevelopment.onanimationclick

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var button = findViewById<Button>(R.id.btn);
        button.setOnClickListener(object : OnClickListener<Any>() {
            override fun onClick(v: View, t: Any?) {
                Toast.makeText(applicationContext, getString(R.string.clicked), Toast.LENGTH_SHORT)
                    .show()
            }

        })
    }

}