package cn.today.analects.presentation.view.conclusion.mvp

import com.jess.arms.di.scope.FragmentScope
import com.jess.arms.mvp.BasePresenter
import javax.inject.Inject

@FragmentScope
class WisdomPresenter @Inject
constructor(model: WisdomContract.Model, view: WisdomContract.View):BasePresenter<WisdomContract.Model, WisdomContract.View>(model, view){


}