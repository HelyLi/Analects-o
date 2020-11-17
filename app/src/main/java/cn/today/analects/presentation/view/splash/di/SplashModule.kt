package cn.today.analects.presentation.view.splash.di

import cn.today.analects.presentation.view.splash.mvp.SplashContract
import cn.today.analects.presentation.view.splash.mvp.SplashModel
import com.jess.arms.di.scope.ActivityScope
import com.tbruyelle.rxpermissions2.RxPermissions
import dagger.Module
import dagger.Provides

/**
 * Author : zhongwenpeng
 * Email : 1340751953@qq.com
 * Time :  2018/5/23
 * Description :启动
 */
@Module
class SplashModule(val view: SplashContract.View) {
    @ActivityScope
    @Provides
    internal fun provideSplashView(): SplashContract.View {
        return this.view
    }

    @ActivityScope
    @Provides
    internal fun provideSplashModel(model: SplashModel): SplashContract.Model {
        return model
    }

    @ActivityScope
    @Provides
    internal fun provideRxPermission() = RxPermissions(view.getFragmentActivity())

}