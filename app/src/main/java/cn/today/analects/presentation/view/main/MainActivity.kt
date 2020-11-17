package cn.today.analects.presentation.view.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import cn.today.analects.R
import cn.today.analects.presentation.base.BaseBackExitActivity
import cn.today.analects.presentation.view.catalogue.CatalogueFragment
import cn.today.analects.presentation.view.conclusion.mvp.MainContract
import cn.today.analects.presentation.view.conclusion.mvp.MainPresenter
import com.jess.arms.di.component.AppComponent
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseBackExitActivity<MainPresenter>(), MainContract.View {

    final val mTitle: List<String> = listOf("正文","目录")

//    @Inject
//    lateinit
    private var mMainFragment: MainFragment = MainFragment()

//    @Inject
//    lateinit var
    var mCatalogueFragment: CatalogueFragment = CatalogueFragment()

    override fun setupActivityComponent(appComponent: AppComponent) {

    }

    override fun initData(savedInstanceState: Bundle?) {
        val fragments: List<Fragment> = listOf(mMainFragment, mCatalogueFragment);
        var mPagerAdapter = MainPageAdapter(supportFragmentManager, fragments)
        val currentIndex = intent.getIntExtra("index", 0)
        vViewpager.adapter = mPagerAdapter
        vViewpager.offscreenPageLimit = 2
//        vViewpager.registerOnPageChangeCallback( ViewPager2.OnPageChangeCallback())

        vViewpager.currentItem = currentIndex
    }

    override fun initView(savedInstanceState: Bundle?): Int {
        return R.layout.activity_main
    }

    override fun showMessage(message: String) {

    }



}