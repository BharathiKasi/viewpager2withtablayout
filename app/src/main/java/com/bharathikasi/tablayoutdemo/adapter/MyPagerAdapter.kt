package com.bharathikasi.tablayoutdemo.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.bharathikasi.tablayoutdemo.fragment.Fragment1
import com.bharathikasi.tablayoutdemo.fragment.Fragment2
import com.bharathikasi.tablayoutdemo.fragment.Fragment3

class MyPagerAdapter(pActivity:FragmentActivity,val pListsize:Int) : FragmentStateAdapter(pActivity) {
    override fun getItemCount(): Int {
        return pListsize
    }

    override fun createFragment(position: Int): Fragment {
        when (position) {
            1 -> {
                return Fragment1.newInstance("Fragment1", "")
            }
            2 -> {
                return Fragment2.newInstance("Fragment2", "")
            }
            3 -> {
                return Fragment3.newInstance("Fragemnt3", "")
            }
        }
        return Fragment1.newInstance("Fragment1", "")
    }

}