package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlinscreenscanner.ui.login.fragment.MistakeBottomDialogFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomSheetDialogFragment = MistakeBottomDialogFragment()
        bottomSheetDialogFragment.isCancelable = false;
        bottomSheetDialogFragment.show(this.supportFragmentManager, bottomSheetDialogFragment.tag)
    }
}