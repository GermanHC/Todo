package com.germanhc.todo.util

import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.germanhc.todo.R

abstract class BottomSheetDialog : BottomSheetDialogFragment() {

    override fun getTheme(): Int = R.style.Dialog

}