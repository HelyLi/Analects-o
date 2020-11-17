package cn.today.analects.presentation.view.splash.mvp

import com.jess.arms.di.scope.ActivityScope
import com.jess.arms.integration.IRepositoryManager
import com.jess.arms.mvp.BaseModel
import javax.inject.Inject

@ActivityScope
class SplashModel @Inject
constructor(repositoryManager: IRepositoryManager): BaseModel(repositoryManager), SplashContract.Model{

    override fun loadSplashView() {

    }
}