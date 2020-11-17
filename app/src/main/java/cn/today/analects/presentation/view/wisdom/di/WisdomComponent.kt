package cn.today.analects.presentation.view.wisdom.di

import cn.today.analects.presentation.view.wisdom.WisdomFragment
import com.jess.arms.di.component.AppComponent
import com.jess.arms.di.scope.FragmentScope
import dagger.Component

@FragmentScope
@Component(modules = [WisdomModule::class],dependencies = [AppComponent::class])
interface WisdomComponent {
    fun inject(fragment: WisdomFragment)
}