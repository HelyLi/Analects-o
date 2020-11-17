package cn.today.analects.presentation.view.main

import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class MainPageAdapter
constructor(@Nullable val fragmentManager: FragmentManager, @Nullable val lifecycle : Lifecycle,@Nullable val fragments: List<Fragment>): FragmentStateAdapter(
    fragmentManager, lifecycle) {

    override fun getItemCount(): Int = fragments.count()

    override fun createFragment(position: Int): Fragment = fragments[position]

}