package com.example.moth5_lesson1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.moth5_lesson1.databinding.ActivityMainBinding
import android.widget.Toast

class MainActivity : AppCompatActivity(), CounterView {

    private lateinit var binding: ActivityMainBinding
    private val presenter = Injector.getPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initClickers()
    }

    private fun initClickers() {
        with(binding) {
            plusBtn.setOnClickListener {
                presenter.increment()
            }
            minusBtn.setOnClickListener {
                presenter.decrement()
            }
        }
    }

    override fun showChangeCount(count: Int) {
        binding.countTv.text = count.toString()
    }

    override fun Toast(toast: String) {
        Toast.makeText(applicationContext, toast, Toast.LENGTH_SHORT).show()
    }

    override fun Color(color: Int) {
        binding.countTv.setTextColor(color)
    }
}