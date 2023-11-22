package com.victriasapplication.app.modules.perfil.ui

import android.view.View
import androidx.fragment.app.viewModels
import com.victriasapplication.app.R
import com.victriasapplication.app.appcomponents.base.BaseFragment
import com.victriasapplication.app.databinding.FragmentPerfilBinding
import com.victriasapplication.app.modules.perfil.`data`.model.PerfilRowModel
import com.victriasapplication.app.modules.perfil.`data`.viewmodel.PerfilVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class PerfilFragment : BaseFragment<FragmentPerfilBinding>(R.layout.fragment_perfil) {
  private val viewModel: PerfilVM by viewModels<PerfilVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val perfilAdapter = PerfilAdapter(viewModel.perfilList.value?:mutableListOf())
    binding.recyclerPerfil.adapter = perfilAdapter
    perfilAdapter.setOnItemClickListener(
    object : PerfilAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : PerfilRowModel) {
        onClickRecyclerPerfil(view, position, item)
      }
    }
    )
    viewModel.perfilList.observe(requireActivity()) {
      perfilAdapter.updateData(it)
    }
    binding.perfilVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerPerfil(
    view: View,
    position: Int,
    item: PerfilRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "PERFIL_FRAGMENT"

  }
}
