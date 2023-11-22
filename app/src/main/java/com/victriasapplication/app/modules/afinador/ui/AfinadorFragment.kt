package com.victriasapplication.app.modules.afinador.ui

import androidx.fragment.app.viewModels
import com.victriasapplication.app.R
import com.victriasapplication.app.appcomponents.base.BaseFragment
import com.victriasapplication.app.databinding.FragmentAfinadorBinding
import com.victriasapplication.app.modules.afinador.`data`.viewmodel.AfinadorVM
import kotlin.String
import kotlin.Unit

class AfinadorFragment : BaseFragment<FragmentAfinadorBinding>(R.layout.fragment_afinador) {
  private val viewModel: AfinadorVM by viewModels<AfinadorVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.afinadorVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "AFINADOR_FRAGMENT"

  }
}
