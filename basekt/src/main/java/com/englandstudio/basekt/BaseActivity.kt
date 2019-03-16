package com.englandstudio.basekt

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import com.englandstudio.basekt.library.showLog

@Suppress("UNCHECKED_CAST")
abstract class BaseActivity<V : BaseContract.View, P : BaseContract.Presenter<V>> : AppCompatActivity(),
    BaseContract.View {

    open lateinit var presenter: P

    protected abstract fun presenter(): P

    protected abstract fun layout(): Int

    protected abstract fun view(savedInstanceState: Bundle?)

    open fun menuLayout(): Int? = null

    open fun menuItem(item: MenuItem): MenuItem? = null

    open fun screen(): Int = 0

    open fun fragment(screen: String): Fragment = Fragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout())
        presenter = presenter()

        view(savedInstanceState)
    }

    override fun onResume() {
        super.onResume()
        BaseApplication.activity = this
        showLog("Ahihi")
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        menuLayout()?.let { inflater.inflate(it, menu) }
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        return super.onOptionsItemSelected(menuItem(item!!))
    }

    fun replaceFragment(screen: String) {
        if (screen() == 0) {
            return
        }
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(screen(), createFragment(screen))
        ft.commit()
    }

    private fun createFragment(screen: String): Fragment {
        return fragment(screen)
    }


}