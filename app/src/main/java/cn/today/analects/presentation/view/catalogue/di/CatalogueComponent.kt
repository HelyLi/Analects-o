package cn.today.analects.presentation.view.catalogue.di

import cn.today.analects.presentation.view.catalogue.CatalogueFragment
import com.jess.arms.di.component.AppComponent
import com.jess.arms.di.scope.FragmentScope
import dagger.Component

@FragmentScope
@Component(modules = [CatalogueModule::class],dependencies = [AppComponent::class])
interface CatalogueComponent {
    fun inject(fragment: CatalogueFragment)
}