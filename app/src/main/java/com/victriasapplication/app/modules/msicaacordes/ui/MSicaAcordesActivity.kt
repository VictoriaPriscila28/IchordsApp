package com.victriasapplication.app.modules.msicaacordes.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.victriasapplication.app.R
import com.victriasapplication.app.appcomponents.base.BaseActivity
import com.victriasapplication.app.databinding.ActivityMSicaAcordesBinding
import com.victriasapplication.app.modules.msicaacordes.`data`.model.StaggeredcloseRowModel
import com.victriasapplication.app.modules.msicaacordes.`data`.viewmodel.MSicaAcordesVM
import com.victriasapplication.app.modules.msicaletra.ui.MSicaLetraActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class MSicaAcordesActivity :
    BaseActivity<ActivityMSicaAcordesBinding>(R.layout.activity_m_sica_acordes) {
  private val viewModel: MSicaAcordesVM by viewModels<MSicaAcordesVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val staggeredcloseAdapter =
    StaggeredcloseAdapter(viewModel.staggeredcloseList.value?:mutableListOf())
    binding.recyclerStaggeredclose.adapter = staggeredcloseAdapter
    staggeredcloseAdapter.setOnItemClickListener(
    object : StaggeredcloseAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : StaggeredcloseRowModel) {
        onClickRecyclerStaggeredclose(view, position, item)
      }
    }
    )
    viewModel.staggeredcloseList.observe(this) {
      staggeredcloseAdapter.updateData(it)
    }
    binding.mSicaAcordesVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.txtLetra.setOnClickListener {
      val destIntent = MSicaLetraActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerStaggeredclose(
    view: View,
    position: Int,
    item: StaggeredcloseRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "M_SICA_ACORDES_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MSicaAcordesActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
