package com.example.moth5_lesson1

class Injector {

    companion object {
        fun getModel(): CountModel {
            return CountModel()
        }
        fun getPresenter(view: CounterView): CountPresenter{
            return CountPresenter(view)
        }
    }

}