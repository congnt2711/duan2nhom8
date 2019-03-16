package com.englandstudio.basekt

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

abstract class BasePagerAdapter(
    fm: FragmentManager,
    private var list: List<Fragment>,
    private var title: List<CharSequence>? = null
) : FragmentPagerAdapter(fm) {

    open fun getTitleItem(position: Int): CharSequence? = null

    override fun getItem(position: Int): Fragment {
        return list[position]
    }

    override fun getCount(): Int {
        return list.size
    }

    override fun getPageTitle(position: Int) = title?.get(position)
}