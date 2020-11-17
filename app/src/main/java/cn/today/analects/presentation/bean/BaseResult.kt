package cn.today.analects.presentation.bean

open class BaseResult<T>(val code: Int, val msg: String = "", val data: T? = null) {
}