package cn.today.analects.presentation.view.conclusion.di

import cn.today.analects.presentation.view.conclusion.mvp.ConclusionContract
import cn.today.analects.presentation.view.conclusion.mvp.ConclusionModel
import com.jess.arms.di.scope.FragmentScope
import dagger.Module
import dagger.Provides

@Module
class ConclusionModule(val view: ConclusionContract.View) {
    @FragmentScope
    @Provides
    internal fun provideCatalogueView(): ConclusionContract.View {
        return this.view
    }

    @FragmentScope
    @Provides
    internal fun provideCatalogueModel(model: ConclusionModel): ConclusionContract.Model {
        return model
    }

}