package com.example.sendactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val name = findViewById<EditText>(R.id.name)
        val sdt = findViewById<EditText>(R.id.sdt)
        val address = findViewById<EditText>(R.id.address)
        val email = findViewById<EditText>(R.id.email)
        val saveBtn = findViewById<Button>(R.id.add)

        //button click
        saveBtn.setOnClickListener {
            var name = name.text.toString()
            var sdt = sdt.text.toString()
            var address = address.text.toString()
            var email = email.text.toString()

    //intent to start activity
            var intent = Intent(this, Activity2::class.java)
            intent.putExtra("Name", name)
            intent.putExtra("sdt", sdt)
            intent.putExtra("address",address)
            intent.putExtra("email", email)

            startActivity(intent)
        }
    }

}
