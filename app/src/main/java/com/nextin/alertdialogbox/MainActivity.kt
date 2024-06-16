package com.nextin.alertdialogbox


import android.content.DialogInterface
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var quetionOne :Button = findViewById(R.id.btnOne)
        var quetionTwo :Button = findViewById(R.id.btnTwo)
        var quetionThree :Button = findViewById(R.id.btnThree)
        var exit :Button = findViewById(R.id.btnClosed)

        val builder = AlertDialog.Builder(this)
        quetionOne.setOnClickListener {
            val optionList = arrayOf("Java","Python", "Kotlin" ,"C#")
            builder.setTitle("Which is your favorite Coding Language ?")
            builder.setSingleChoiceItems(optionList,0,DialogInterface.OnClickListener
            { dialog, which ->
                Toast.makeText(this,
                    "That's Greate ${optionList[which]} is a Good Language",
                    Toast.LENGTH_SHORT).show()
            })
            builder.setPositiveButton("Submit",DialogInterface.OnClickListener { dialog, which ->  })
            builder.setNegativeButton("Cancel", DialogInterface.OnClickListener { dialog, which ->  })
            builder.show()
        }

        quetionTwo.setOnClickListener {
            val optionList = arrayOf("Java","Python", "Kotlin" ,"C#")
            builder.setTitle("Choose Any Two Programming Language for Code ")
            builder.setMultiChoiceItems(optionList,null,DialogInterface.OnMultiChoiceClickListener
            { dialog, which, isChecked ->
                Toast.makeText(this,
                    "WoW ! You Have Checked ${optionList[which]} ",
                    Toast.LENGTH_SHORT).show()
            })
            builder.setPositiveButton("Submit",DialogInterface.OnClickListener { dialog, which ->
                Toast.makeText(this,
                    "WoW ! You can speak in  ${optionList[which]} ",
                    Toast.LENGTH_SHORT).show()
            })
            builder.setNegativeButton("Cancel", DialogInterface.OnClickListener { dialog, which ->  })
            builder.show()
        }

        quetionThree.setOnClickListener {
            val optionList = arrayOf("Marathi","Hindi", "English" ,"Telugu1", "Kannada","Kannada")
            builder.setTitle("In how Many Languages you can speak ??")
            builder.setMultiChoiceItems(optionList,null,DialogInterface.OnMultiChoiceClickListener 
            { dialog, which, isChecked ->
                Toast.makeText(this,
                    "WoW ! You can speak in  ${optionList[which]} ",
                    Toast.LENGTH_SHORT).show()
            })
            builder.setPositiveButton("Submit",DialogInterface.OnClickListener { dialog, which ->
                Toast.makeText(this,
                    "WoW ! You can speak in  ${optionList[which]} ",
                    Toast.LENGTH_SHORT).show()
            })
            builder.setNegativeButton("Cancel", DialogInterface.OnClickListener { dialog, which ->  })
            builder.show()
        }

        exit.setOnClickListener {
            builder.setTitle("Exit The App")
            builder.setMessage("Do you want to Closed the App ?")
            builder.setIcon(R.drawable.baseline_exit)
            builder.setPositiveButton("Yes", DialogInterface.OnClickListener
            { dialog, which ->
                finish()
            })
            builder.setNegativeButton("No",DialogInterface.OnClickListener { dialog, which ->  })
            builder.show()
        }
    }
}