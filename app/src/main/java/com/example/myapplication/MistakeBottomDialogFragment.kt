package com.example.kotlinscreenscanner.ui.login.fragment


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myapplication.R
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.android.synthetic.main.fragment_mistake_dialog_sheet.*
import kz.putinbyte.iszhfermer.presentation.adapters.OwnersAdapter

class MistakeBottomDialogFragment() : BottomSheetDialogFragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_mistake_dialog_sheet, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initClick()
    }

    override fun getTheme(): Int {
        return R.style.BottomSheetDialogThemeNoFloating
    }

    private fun initClick() {
        val ownerAdapter = OwnersAdapter()

        val list: ArrayList<String> = arrayListOf()
        for (i in 0..100){
            list.add("$i Грибок")
            ownerAdapter.update(list)
        }

        ownersRecycler.adapter = ownerAdapter
    }
}