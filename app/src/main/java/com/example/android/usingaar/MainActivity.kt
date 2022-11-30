package com.example.android.usingaar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.android.thinhvh.EqualizerManager
import com.example.android.thinhvh.YourLibrary

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var yourLibraryManager: EqualizerManager? = null
        YourLibrary("thinhvh").prepare {
            yourLibraryManager = it
        }

        findViewById<Button>(R.id.btnChangeBass).setOnClickListener {
            yourLibraryManager?.changeBass()
        }

        findViewById<Button>(R.id.btnChangeVirtual).setOnClickListener {
            yourLibraryManager?.changeVirtual()
        }
    }
}