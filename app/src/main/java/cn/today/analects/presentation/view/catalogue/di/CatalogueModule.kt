package cn.today.analects.presentation.view.catalogue.di

import cn.today.analects.presentation.view.catalogue.mvp.CatalogueContract
import cn.today.analects.presentation.view.catalogue.mvp.CatalogueModel
import com.jess.arms.di.scope.FragmentScope
import dagger.Module
import dagger.Provides

@Module
class CatalogueModule(val view: CatalogueContract.View) {
    @FragmentScope
    @Provides
    internal fun provideCatalogueView(): CatalogueContract.View {
        return this.view
    }

    @FragmentScope
    @Provides
    internal fun provideCatalogueModel(model: CatalogueModel): CatalogueContract.Model {
        return model
    }

}