package cn.today.analects.presentation.view.catalogue.mvp

import com.jess.arms.di.scope.FragmentScope
import com.jess.arms.integration.IRepositoryManager
import com.jess.arms.mvp.BaseModel
import javax.inject.Inject

@FragmentScope
class CatalogueModel
@Inject
constructor(repositoryManager: IRepositoryManager): BaseModel(repositoryManager), CatalogueContract.Model{

}