package com.example.learningcicd

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.learningcicd.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)


        setContentView(binding.root)

        binding.textView.setOnClickListener {


            Toast.makeText(this@MainActivity, "Clicked", Toast.LENGTH_SHORT).show()
            performAction(5)
        }
        performAction(15)
    }

    //Some Function
    private fun performAction(someValue: Int) {

        if (someValue > 10) {
            if (someValue > 11) {
                if (someValue > 12) {
                    if (someValue > 13) {
                        if (someValue > 14) {

                        } else {

                        }
                    } else {

                    }
                } else {

                }
            } else {

            }
        } else {

        }
    }
}