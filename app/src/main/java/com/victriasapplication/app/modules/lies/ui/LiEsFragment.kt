package com.victriasapplication.app.modules.lies.ui

import androidx.fragment.app.viewModels
import com.victriasapplication.app.R
import com.victriasapplication.app.appcomponents.base.BaseFragment
import com.victriasapplication.app.databinding.FragmentLiEsBinding
import com.victriasapplication.app.modules.lies.`data`.viewmodel.LiEsVM
import kotlin.String
import kotlin.Unit

class LiEsFragment : BaseFragment<FragmentLiEsBinding>(R.layout.fragment_li_es) {
  private val viewModel: LiEsVM by viewModels<LiEsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.liEsVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "LI_ES_FRAGMENT"

  }
}
