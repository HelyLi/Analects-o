package cn.today.analects.application.di;

import java.lang.annotation.Documented;

import javax.inject.Scope;

import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.Retention;

@Scope
@Documented
@Retention(AnnotationRetention.RUNTIME)
public @interface TodayScope {
}
