package com.example.math

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.math.databinding.ActivityMainBinding
import ru.noties.jlatexmath.JLatexMathDrawable

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnTranslate.setOnClickListener {
            val latexCode = binding.etLatex.text.toString()
            val drawable: JLatexMathDrawable = JLatexMathDrawable.builder(latexCode)
                .textSize(70F)
                .padding(8)
                .align(JLatexMathDrawable.ALIGN_RIGHT)
                .build()

            binding.jLatexMathView.setLatexDrawable(drawable)
        }



    }
}