package com.example.onepassword.activities.dialogs

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.LayoutInflater
import com.example.onepassword.databinding.AbsentPlayerDialogBinding

class AbsendtDialog(context: Context): Dialog(context) {
    private var dialog: Dialog
    private var binding :AbsentPlayerDialogBinding = AbsentPlayerDialogBinding.inflate(
        LayoutInflater.from(context))

    init {
        dialog = Dialog(context)
        dialog.setContentView(binding.root)
        dialog.setCancelable(false)
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        binding.registerBtn.setOnClickListener {
            dialog.dismiss()

        }
    }
    override fun show() {
        dialog.show()
    }
    override fun dismiss() {
        dialog.dismiss()
    }
    private fun setupAutoComplete() {
    
    }

}