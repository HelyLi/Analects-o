package cn.today.analects.presentation.view.wisdom.di

import cn.today.analects.presentation.view.conclusion.mvp.WisdomContract
import cn.today.analects.presentation.view.conclusion.mvp.WisdomModel
import com.jess.arms.di.scope.FragmentScope
import dagger.Module
import dagger.Provides

@Module
class WisdomModule(val view: WisdomContract.View) {
    @FragmentScope
    @Provides
    internal fun provideWisdomView(): WisdomContract.View {
        return this.view
    }

    @FragmentScope
    @Provides
    internal fun provideWisdomModel(model: WisdomModel): WisdomContract.Model {
        return model
    }

}