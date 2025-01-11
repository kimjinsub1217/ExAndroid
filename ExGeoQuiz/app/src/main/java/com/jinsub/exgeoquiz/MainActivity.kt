package com.jinsub.exgeoquiz

import android.os.Bundle
import android.view.Gravity
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.jinsub.exgeoquiz.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.trueButton.setOnClickListener {
            val toast=Toast.makeText(this,R.string.correctToast,Toast.LENGTH_SHORT)
            toast.setGravity(Gravity.CENTER_VERTICAL,0,0)
            toast.show()
        }

        binding.falseButton.setOnClickListener {
            val toast =Toast.makeText(this,R.string.incorrectToast,Toast.LENGTH_SHORT)
            toast.setGravity(Gravity.TOP, 0, 0)
            toast.show()
        }

    }
}