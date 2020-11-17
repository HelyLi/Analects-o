package cn.today.analects.presentation.view.catalogue

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import cn.today.analects.R
import cn.today.analects.presentation.view.catalogue.di.CatalogueModule
import cn.today.analects.presentation.view.catalogue.di.DaggerCatalogueComponent
import cn.today.analects.presentation.view.catalogue.mvp.CatalogueContract
import cn.today.analects.presentation.view.catalogue.mvp.CataloguePresenter
import com.jess.arms.base.BaseFragment
import com.jess.arms.di.component.AppComponent

/**
 * 目录
 */

class CatalogueFragment : BaseFragment<CataloguePresenter> (), CatalogueContract.View{

    override fun setupFragmentComponent(appComponent: AppComponent) {
        DaggerCatalogueComponent.builder()
            .appComponent(appComponent)
            .catalogueModule(CatalogueModule(this))
            .build()
            .inject(this)
    }

    override fun initData(savedInstanceState: Bundle?) {

    }

    override fun setData(data: Any?) {

    }

    override fun initView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_catalogue, container, false)
    }

    override fun showMessage(message: String) {

    }

    companion object {
        fun newInstance() = CatalogueFragment()
    }
}