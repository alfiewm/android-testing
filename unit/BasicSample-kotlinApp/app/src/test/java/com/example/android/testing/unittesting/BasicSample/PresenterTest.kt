package com.example.android.testing.unittesting.BasicSample

import com.nhaarman.mockitokotlin2.eq
import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.verify
import org.junit.Before
import org.junit.Test

/**
 * Created by meng on 2019-04-24.
 */
class PresenterTest {

    private lateinit var view: IView
    private lateinit var dataLoadListener: OnDataLoadListener<Boolean>
    private lateinit var presenter: Presenter

    @Before
    fun setup() {
        view = mock()
        dataLoadListener = mock()
        presenter = Presenter(view, dataLoadListener)
    }

    @Test
    fun loadDataTest() {
        presenter.loadData()
        verify(view).renderData(eq("test"))
        verify(dataLoadListener).invoke(false)
    }
}