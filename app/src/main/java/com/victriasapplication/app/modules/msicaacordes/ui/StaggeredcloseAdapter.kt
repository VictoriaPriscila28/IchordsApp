package com.victriasapplication.app.modules.msicaacordes.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.victriasapplication.app.R
import com.victriasapplication.app.databinding.RowStaggeredcloseBinding
import com.victriasapplication.app.modules.msicaacordes.`data`.model.StaggeredcloseRowModel
import kotlin.Int
import kotlin.collections.List

class StaggeredcloseAdapter(
  var list: List<StaggeredcloseRowModel>
) : RecyclerView.Adapter<StaggeredcloseAdapter.RowStaggeredcloseVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowStaggeredcloseVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_staggeredclose,parent,false)
    return RowStaggeredcloseVH(view)
  }

  override fun onBindViewHolder(holder: RowStaggeredcloseVH, position: Int) {
    val staggeredcloseRowModel = StaggeredcloseRowModel()
    // TODO uncomment following line after integration with data source
    // val staggeredcloseRowModel = list[position]
    holder.binding.staggeredcloseRowModel = staggeredcloseRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<StaggeredcloseRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: StaggeredcloseRowModel
    ) {
    }
  }

  inner class RowStaggeredcloseVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowStaggeredcloseBinding = RowStaggeredcloseBinding.bind(itemView)
  }
}
