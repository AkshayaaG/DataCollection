package com.example.personaldata

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {

    private var tvName2 : TextView? = null
    private var tvPhone2 : TextView? = null
    private var tvEmail2 : TextView? = null
    private var tvCountry2 : TextView? = null

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        tvName2 = findViewById(R.id.tv_name2)
        tvPhone2 = findViewById(R.id.tv_phone2)
        tvEmail2 = findViewById(R.id.tv_email2)
        tvCountry2= findViewById(R.id.tv_country2)

        val bundle = intent.extras
        if (bundle != null){
            tvName2?.text = "Name = ${bundle.getString("name")}"
            tvPhone2?.text = "Phone = ${bundle.getString("phone")}"
            tvEmail2?.text = "Email = ${bundle.getString("email")}"
            tvCountry2?.text = "Country = ${bundle.getString("country")}"
        }
    }
}