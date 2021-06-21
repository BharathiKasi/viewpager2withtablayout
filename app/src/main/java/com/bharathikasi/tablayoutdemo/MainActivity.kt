package com.bharathikasi.tablayoutdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import com.bharathikasi.tablayoutdemo.fragment.MainFragment

class MainActivity : AppCompatActivity() {

    private lateinit var mFrameLayout:FrameLayout
    private lateinit var mMainFragment:MainFragment
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mFrameLayout = findViewById(R.id.FrameLayout)
        mMainFragment = MainFragment.newInstance("MainFragment1","")
        supportFragmentManager.beginTransaction().add(R.id.FrameLayout,mMainFragment).addToBackStack("MainFragment").commit()
    }
}