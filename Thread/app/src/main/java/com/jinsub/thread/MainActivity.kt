package com.jinsub.thread

import android.os.AsyncTask
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.jinsub.thread.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    fun buttonClick(view: View) {
        val task = MyTask().execute()
    }

    private inner class MyTask : AsyncTask<String, Int, String>() {
        override fun onPreExecute() {
        }

        override fun doInBackground(vararg params: String): String {
            var i = 0
            while (i <= 20) {
                try {
                    Thread.sleep(1000)
                    publishProgress(i)
                    i++
                } catch (e: Exception) {
                    return(e.localizedMessage)
                }
            }

            return "Button Pressed"
        }

        override fun onProgressUpdate(vararg values: Int?) {
            super.onProgressUpdate(*values)
            val counter = values.get(0)
            binding.myTextView.text = "Counter = $counter"
        }

        override fun onPostExecute(result: String) {
            binding.myTextView.text = result
        }
    }
}