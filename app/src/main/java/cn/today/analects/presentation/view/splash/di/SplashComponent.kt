package cn.today.analects.presentation.view.splash.di

import cn.today.analects.presentation.view.splash.SplashActivity
import com.jess.arms.di.component.AppComponent
import com.jess.arms.di.scope.ActivityScope
import dagger.Component

/**
 * Author : zhongwenpeng
 * Email : 1340751953@qq.com
 * Time :  2018/5/23
 * Description :启动页面的
 */
@ActivityScope
@Component(modules = [SplashModule::class],dependencies = [AppComponent::class])
interface SplashComponent {
    fun inject(activity: SplashActivity)
}