package cn.today.analects.presentation.view.conclusion

import android.view.View
import android.widget.TextView
import cn.today.analects.R
import cn.today.analects.presentation.view.conclusion.mvp.ConclusionInfo
import com.jess.arms.base.BaseHolder
import com.jess.arms.base.DefaultAdapter

class ConclusionPageAdapter
constructor(private val mDatas: List<ConclusionInfo>): DefaultAdapter<ConclusionInfo>(mDatas){

    override fun getHolder(v: View, viewType: Int): BaseHolder<ConclusionInfo> = ConclusionHolder(v)

    override fun getLayoutId(viewType: Int): Int = R.layout.conclusion_item_layout

    private class ConclusionHolder(itemView: View): BaseHolder<ConclusionInfo>(itemView){
        override fun setData(data: ConclusionInfo, position: Int) {
            itemView.findViewById<TextView>(R.id.vOriginalTv).text = data.original
            itemView.findViewById<TextView>(R.id.vTranslateTv).text = data.translate
        }

    }
}