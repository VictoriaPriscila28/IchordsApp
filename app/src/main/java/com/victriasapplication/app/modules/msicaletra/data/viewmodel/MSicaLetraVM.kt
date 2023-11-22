package com.victriasapplication.app.modules.msicaletra.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.victriasapplication.app.modules.msicaletra.`data`.model.MSicaLetraModel
import com.victriasapplication.app.modules.msicaletra.`data`.model.MSicaLetraRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class MSicaLetraVM : ViewModel(), KoinComponent {
  val mSicaLetraModel: MutableLiveData<MSicaLetraModel> = MutableLiveData(MSicaLetraModel())

  var navArguments: Bundle? = null

  val msicaletraList: MutableLiveData<MutableList<MSicaLetraRowModel>> =
      MutableLiveData(mutableListOf())
}
