package cn.today.analects.presentation.view.catalogue.mvp

import com.jess.arms.di.scope.FragmentScope
import com.jess.arms.mvp.BasePresenter
import javax.inject.Inject

@FragmentScope
class CataloguePresenter @Inject
constructor(model: CatalogueContract.Model, view: CatalogueContract.View):BasePresenter<CatalogueContract.Model, CatalogueContract.View>(model, view){


}