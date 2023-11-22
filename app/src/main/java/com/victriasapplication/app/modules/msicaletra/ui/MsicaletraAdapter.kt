package com.victriasapplication.app.modules.msicaletra.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.victriasapplication.app.R
import com.victriasapplication.app.databinding.RowMSicaLetraBinding
import com.victriasapplication.app.modules.msicaletra.`data`.model.MSicaLetraRowModel
import kotlin.Int
import kotlin.collections.List

class MsicaletraAdapter(
  var list: List<MSicaLetraRowModel>
) : RecyclerView.Adapter<MsicaletraAdapter.RowMSicaLetraVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowMSicaLetraVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_m_sica_letra,parent,false)
    return RowMSicaLetraVH(view)
  }

  override fun onBindViewHolder(holder: RowMSicaLetraVH, position: Int) {
    val mSicaLetraRowModel = MSicaLetraRowModel()
    // TODO uncomment following line after integration with data source
    // val mSicaLetraRowModel = list[position]
    holder.binding.mSicaLetraRowModel = mSicaLetraRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<MSicaLetraRowModel>) {
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
      item: MSicaLetraRowModel
    ) {
    }
  }

  inner class RowMSicaLetraVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowMSicaLetraBinding = RowMSicaLetraBinding.bind(itemView)
  }
}
