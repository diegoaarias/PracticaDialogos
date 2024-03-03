package com.example.practicadialogos.dialog

import android.app.AlertDialog
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.fragment.app.DialogFragment
import com.example.practicadialogos.R

class DialogNombre: DialogFragment() {
    private lateinit var vista: View;

    override fun onAttach(context: Context) {
        super.onAttach(context)
        vista = LayoutInflater.from(context).inflate(R.layout.dialog_nombre, null);
    }

        override fun onCreate(savedInstanceState: Bundle?) {
            var builder = AlertDialog.Builder(requireContext())
            super.onCreate(savedInstanceState)
        }

    override fun onStart() {
        super.onStart()
    }
}