package cn.today.analects.presentation.view.splash

import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import cn.today.analects.R
import cn.today.analects.presentation.view.splash.di.DaggerSplashComponent
import cn.today.analects.presentation.view.splash.di.SplashModule
import cn.today.analects.presentation.view.splash.mvp.SplashContract
import cn.today.analects.presentation.view.splash.mvp.SplashPresenter
import com.jess.arms.base.BaseActivity
import com.jess.arms.di.component.AppComponent

class SplashActivity : BaseActivity<SplashPresenter>(), SplashContract.View {

    override fun setupActivityComponent(appComponent: AppComponent) {
        DaggerSplashComponent.builder()
            .appComponent(appComponent)
            .splashModule(SplashModule(this))
            .build()
            .inject(this)
    }

    override fun initData(savedInstanceState: Bundle?) {
        println("SplashActivity")
        mPresenter?.startCountDown()
        println("SplashActivity.1")
    }

    override fun initView(savedInstanceState: Bundle?): Int {
        return R.layout.activity_splash
    }

    override fun getFragmentActivity(): FragmentActivity {
        return this
    }

    override fun killMyself(){
        finish()
    }

    override fun alreadyHavePermission() {

    }

    override fun showMessage(message: String) {

    }
}