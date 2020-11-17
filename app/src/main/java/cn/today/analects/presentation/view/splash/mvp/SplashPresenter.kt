package cn.today.analects.presentation.view.splash.mvp

import android.content.Intent
import cn.today.analects.presentation.view.main.MainActivity
import com.jess.arms.di.scope.ActivityScope
import com.jess.arms.mvp.BasePresenter
import com.jess.arms.utils.RxLifecycleUtils
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import me.jessyan.rxerrorhandler.core.RxErrorHandler
import me.jessyan.rxerrorhandler.handler.ErrorHandleSubscriber
import java.util.concurrent.TimeUnit
import javax.inject.Inject

@ActivityScope
class SplashPresenter @Inject
constructor(model: SplashContract.Model, view: SplashContract.View): BasePresenter<SplashContract.Model, SplashContract.View>(model, view){

    @Inject
    lateinit var mErrorHandler: RxErrorHandler

    /**
     * 获取首页信息
     */
    fun getSplashViewInfo(){

    }

    /**
     * 倒计时
     */
    fun startCountDown(){
        println("startCountDown")
        Observable.intervalRange(1, 4, 0, 1, TimeUnit.SECONDS)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .compose(RxLifecycleUtils.bindToLifecycle(mRootView))
            .subscribe(object : ErrorHandleSubscriber<Long>(mErrorHandler) {
                override fun onNext(t: Long) {
                    val currentCount = 4 - t
                    println("currentCount:${currentCount}")
                    if (currentCount == 0L) {
//                        if (mRootView.getFragmentActivity().intent.getBooleanExtra("isFirst", true)) {
//                            if (mUserInfoString.isEmpty()) {
//                                mRootView.getFragmentActivity().startActivity<LoginActivity>()
//                            } else {
//                                mRootView.getFragmentActivity().startActivity<MainActivity>()
//                            }
//                        }
                        mRootView.launchActivity(Intent(mRootView.getFragmentActivity(),
                                MainActivity::class.java
                            ))
                        mRootView.killMyself()
                    }
                }
            })
    }
}