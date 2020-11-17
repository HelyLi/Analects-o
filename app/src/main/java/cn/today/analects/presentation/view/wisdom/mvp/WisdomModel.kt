package cn.today.analects.presentation.view.conclusion.mvp

import com.jess.arms.di.scope.FragmentScope
import com.jess.arms.integration.IRepositoryManager
import com.jess.arms.mvp.BaseModel
import javax.inject.Inject

@FragmentScope
class WisdomModel
@Inject
constructor(repositoryManager: IRepositoryManager): BaseModel(repositoryManager), WisdomContract.Model{

}