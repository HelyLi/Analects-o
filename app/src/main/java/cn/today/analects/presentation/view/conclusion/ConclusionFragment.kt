package cn.today.analects.presentation.view.conclusion

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import cn.today.analects.R
import cn.today.analects.presentation.view.conclusion.di.ConclusionModule
import cn.today.analects.presentation.view.conclusion.di.DaggerConclusionComponent
import cn.today.analects.presentation.view.conclusion.mvp.ConclusionContract
import cn.today.analects.presentation.view.conclusion.mvp.ConclusionInfo
import cn.today.analects.presentation.view.conclusion.mvp.ConclusionPresenter
import com.jess.arms.base.BaseFragment
import com.jess.arms.di.component.AppComponent
import kotlinx.android.synthetic.main.activity_main.*

/**
 * 论道的结语
 */

class ConclusionFragment : BaseFragment<ConclusionPresenter>(), ConclusionContract.View{


    override fun setupFragmentComponent(appComponent: AppComponent) {
        DaggerConclusionComponent.builder()
            .appComponent(appComponent)
            .conclusionModule(ConclusionModule(this))
            .build()
            .inject(this)
    }

    override fun initData(savedInstanceState: Bundle?) {

//        val fragments: List<Fragment> = listOf(mWisdomFragment, mConclusionFragment);
//        var mPagerAdapter = MainPageAdapter(childFragmentManager,lifecycle, fragments)
        val conclusion: List<ConclusionInfo> = listOf(ConclusionInfo("学天时习之", "不亦说乎"),ConclusionInfo("有朋至远方来", "不亦乐乎"))

        var mPagerAdapter = ConclusionPageAdapter(conclusion)
        vViewpager.adapter = mPagerAdapter
        vViewpager.offscreenPageLimit = 2
        //        vViewpager.addOnPageChangeListener(this)
        vViewpager.currentItem = 1

    }

    override fun setData(data: Any?) {

    }

    override fun initView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_conclusion, container, false)
    }


    fun initViewPager(){

    }

    override fun showMessage(message: String) {

    }

    companion object {
        fun newInstance() = ConclusionFragment()
    }
}