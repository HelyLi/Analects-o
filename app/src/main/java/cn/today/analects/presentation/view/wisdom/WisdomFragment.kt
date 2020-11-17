package cn.today.analects.presentation.view.wisdom

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import cn.today.analects.R
import cn.today.analects.presentation.view.conclusion.mvp.WisdomContract
import cn.today.analects.presentation.view.conclusion.mvp.WisdomPresenter
import cn.today.analects.presentation.view.wisdom.di.DaggerWisdomComponent
import cn.today.analects.presentation.view.wisdom.di.WisdomModule
import com.jess.arms.base.BaseFragment
import com.jess.arms.di.component.AppComponent

/**
 *  论道的智慧
 */

class WisdomFragment : BaseFragment<WisdomPresenter>(), WisdomContract.View {

    override fun setupFragmentComponent(appComponent: AppComponent) {
        DaggerWisdomComponent.builder()
            .appComponent(appComponent)
            .wisdomModule(WisdomModule(this))
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
        return inflater.inflate(R.layout.fragment_wisdom, container, false)
    }

    override fun showMessage(message: String) {

    }
}