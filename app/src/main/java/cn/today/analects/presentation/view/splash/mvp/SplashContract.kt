package cn.today.analects.presentation.view.splash.mvp

import androidx.fragment.app.FragmentActivity
import com.jess.arms.mvp.IModel
import com.jess.arms.mvp.IView

interface SplashContract {

    interface View :IView{
        fun getFragmentActivity(): FragmentActivity
        fun alreadyHavePermission()
    }

    interface Model :IModel{
        /**
         * 根据日期判断当前的图片是不是最新的,
         * 读取始终是读取的本地的  (会默默的下载一张图片)
         */
        fun loadSplashView()
    }
}