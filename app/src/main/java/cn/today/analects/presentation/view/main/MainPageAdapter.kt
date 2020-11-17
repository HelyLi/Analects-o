package cn.today.analects.presentation.view.main

import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class MainPageAdapter
constructor(@Nullable val fragmentManager: FragmentManager, private val fragments: List<Fragment>):
    FragmentStatePagerAdapter(
    fragmentManager) {

    override fun getItem(position: Int): Fragment = fragments[position]

    override fun getCount(): Int = fragments.count()

}