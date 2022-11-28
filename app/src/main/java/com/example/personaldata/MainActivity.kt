package com.example.personaldata

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import java.util.*


class MainActivity : AppCompatActivity() {

    private var etName : EditText? = null
    private var etPhone : EditText? = null
    private var etEmail : EditText? = null
    private var etCountry : EditText? = null
    private var btSubmit : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etName = findViewById(R.id.et_name)
        etPhone = findViewById(R.id.et_phone)
        etEmail = findViewById(R.id.et_email)
        etCountry = findViewById(R.id.et_country)
        btSubmit = findViewById(R.id.bt_submit)

        btSubmit?.setOnClickListener{

            val bundle = Bundle()
            bundle.putString("name",etName?.text.toString())
            bundle.putString("phone",etPhone?.text.toString())
            bundle.putString("email",etEmail?.text.toString())
            bundle.putString("country",etCountry?.text.toString())

            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }
    }
}