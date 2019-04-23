package com.example.android.testing.unittesting.BasicSample

/**
 * Created by meng on 2019-04-24.
 */

interface IPresenter {

    fun loadData()
}

interface IView {

    fun renderData(data: String)
}

class Presenter(
    private val view: IView,
    private var loadListener: OnDataLoadListener<Boolean>
) : IPresenter {

    override fun loadData() {
        view.renderData("test")
        loadListener.invoke(true)
    }
}

typealias OnDataLoadListener<T> = (param1: T) -> Boolean
