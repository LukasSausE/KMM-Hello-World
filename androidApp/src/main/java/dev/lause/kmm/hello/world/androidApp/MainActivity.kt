package dev.lause.kmm.hello.world.androidApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.lause.kmm.hello.world.shared.Greeting
import android.widget.TextView
import dev.lause.androidApp.databinding.ActivityMainBinding

fun greet(): String {
    return Greeting().greeting()
}

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val tv: TextView = binding.textView
        tv.text = greet()
    }
}
