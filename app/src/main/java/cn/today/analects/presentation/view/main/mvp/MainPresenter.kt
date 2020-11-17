package cn.today.analects.presentation.view.conclusion.mvp

import android.app.Application
import com.jess.arms.di.scope.ActivityScope
import com.jess.arms.integration.AppManager
import com.jess.arms.mvp.BasePresenter
import javax.inject.Inject

@ActivityScope
class MainPresenter @Inject
constructor(model: MainContract.Model, view: MainContract.View):BasePresenter<MainContract.Model, MainContract.View>(model, view){

    @Inject
    lateinit var mApplication: Application

    @Inject
    lateinit var mAppManager: AppManager

}