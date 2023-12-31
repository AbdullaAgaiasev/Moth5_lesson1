package com.example.moth5_lesson1

import android.graphics.Color

class CountPresenter(private val counterView: CounterView) {

    private var model = Injector.getModel()

    fun increment(){
        model.increment()
        counterView.showChangeCount(model.count)
        if (model.count == 10) {
            counterView.Toast("Поздравляем!")
        }
        if (model.count == 15) {
            counterView.Color(Color.GREEN)
        }
    }
    fun decrement(){
        model.decrement()
        counterView.showChangeCount(model.count)
        if (model.count <= 15) {
            counterView.Color(Color.BLACK)
        }
    }

}