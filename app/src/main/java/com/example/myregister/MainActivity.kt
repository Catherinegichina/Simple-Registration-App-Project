package com.example.myregister

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var names=findViewById<TextView>(R.id.tvname)
        var nationalities=findViewById<TextView>(R.id.tvnationality)
        var email=findViewById<TextView>(R.id.tvemailaddress)
        var digits=findViewById<TextView>(R.id.tvnumber)
        var button=findViewById<Button>(R.id.btnButton)
        button.setOnClickListener{
          var register=button.text.toString()
            var email=button.text.toString()
            var digits=button.text.toString()
            var names=button.text.toString()
            var nationalities=button.text.toString()
            var student=Student(names=names,nationalities=nationalities,email=email,digits=digits)
            Toast.makeText(baseContext,student.toString(),Toast.LENGTH_LONG).show()
        }
    }
}
data class Student(var names:String,var nationalities:String,var email:String,var digits:String )