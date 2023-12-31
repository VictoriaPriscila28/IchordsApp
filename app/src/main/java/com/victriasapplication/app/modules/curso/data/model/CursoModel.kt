package com.victriasapplication.app.modules.curso.`data`.model

import com.victriasapplication.app.R
import com.victriasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class CursoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAula5Comoaf: String? = MyApp.getInstance().resources.getString(R.string.msg_aula_5_como_af)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtComofuncionau: String? =
      MyApp.getInstance().resources.getString(R.string.msg_como_funciona_u2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMduloCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_m_dulo_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrimeirocontat: String? =
      MyApp.getInstance().resources.getString(R.string.msg_primeiro_contat)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHome: String? = MyApp.getInstance().resources.getString(R.string.lbl_home)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLies: String? = MyApp.getInstance().resources.getString(R.string.lbl_li_es)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAulas: String? = MyApp.getInstance().resources.getString(R.string.lbl_aulas)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAfinador: String? = MyApp.getInstance().resources.getString(R.string.lbl_afinador)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPerfil: String? = MyApp.getInstance().resources.getString(R.string.lbl_perfil)

)
