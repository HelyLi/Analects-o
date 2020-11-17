package cn.today.analects.presentation.view.conclusion.mvp

import com.jess.arms.di.scope.FragmentScope
import com.jess.arms.mvp.BasePresenter
import javax.inject.Inject

@FragmentScope
class ConclusionPresenter @Inject
constructor(model: ConclusionContract.Model, view: ConclusionContract.View):BasePresenter<ConclusionContract.Model, ConclusionContract.View>(model, view){


}