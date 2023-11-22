package com.victriasapplication.app.modules.msicaacordes.`data`.model

import com.victriasapplication.app.R
import com.victriasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class StaggeredcloseRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtA: String? = MyApp.getInstance().resources.getString(R.string.lbl_am)

)
