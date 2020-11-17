package cn.today.analects.presentation.view.conclusion.di

import cn.today.analects.presentation.view.conclusion.ConclusionFragment
import com.jess.arms.di.component.AppComponent
import com.jess.arms.di.scope.FragmentScope
import dagger.Component

@FragmentScope
@Component(modules = [ConclusionModule::class],dependencies = [AppComponent::class])
interface ConclusionComponent {
    fun inject(fragment: ConclusionFragment)
}