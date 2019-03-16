package com.englandstudio.basekt

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

@Suppress("UNCHECKED_CAST")
abstract class BaseFragment<V : BaseContract.View, P : BaseContract.Presenter<V>> : Fragment(),
    BaseContract.View {

    open lateinit var presenter: P

    protected abstract fun presenter(): P

    protected abstract fun layout(): Int

    protected abstract fun view(savedInstanceState: Bundle?)

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(layout(), container, false)
        presenter = presenter()
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view(savedInstanceState)
    }
}