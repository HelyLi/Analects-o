package cn.today.analects.presentation.view.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import cn.today.analects.R
import cn.today.analects.presentation.view.conclusion.ConclusionFragment
import cn.today.analects.presentation.view.conclusion.mvp.MainContract
import cn.today.analects.presentation.view.conclusion.mvp.MainPresenter
import cn.today.analects.presentation.view.wisdom.WisdomFragment
import com.jess.arms.base.BaseFragment
import com.jess.arms.di.component.AppComponent
import kotlinx.android.synthetic.main.activity_main.*

class MainFragment : BaseFragment<MainPresenter>(), ViewPager.OnPageChangeListener, MainContract.View{

    final val mTitle: List<String> = listOf("智慧","结语")

//    @Inject
//    lateinit
    var mWisdomFragment: WisdomFragment = WisdomFragment()

//    @Inject
//    lateinit
    var mConclusionFragment: ConclusionFragment = ConclusionFragment()

    override fun setupFragmentComponent(appComponent: AppComponent) {

    }

    override fun initData(savedInstanceState: Bundle?) {
        val fragments: List<Fragment> = listOf(mWisdomFragment, mConclusionFragment);
        var mPagerAdapter = MainPageAdapter(childFragmentManager, fragments)
        vViewpager.adapter = mPagerAdapter
        vViewpager.offscreenPageLimit = 2
        vViewpager.addOnPageChangeListener(this)
        vViewpager.currentItem = 1
    }

    override fun setData(data: Any?) {

    }

    override fun initView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun showMessage(message: String) {

    }

    companion object{
        fun newInstance() = MainFragment()
    }

    override fun onPageScrollStateChanged(state: Int) {

    }

    override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {

    }

    override fun onPageSelected(position: Int) {

    }
}