package com.example.roombatest1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import com.gigamole.infinitecycleviewpager.HorizontalInfiniteCycleViewPager

import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    internal var lstImages: MutableList<Int> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initData()

        val pager = findViewById(R.id.horizontal_cycle) as HorizontalInfiniteCycleViewPager
        val adapter = MyAdapter(lstImages, baseContext)
        pager.adapter = adapter
    }

    private fun initData() {
        lstImages.add(R.drawable.cyclos)
        lstImages.add(R.drawable.night)
        lstImages.add(R.drawable.meggan)
    }
}