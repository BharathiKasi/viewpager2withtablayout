package com.bharathikasi.tablayoutdemo.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.bharathikasi.tablayoutdemo.R
import com.bharathikasi.tablayoutdemo.adapter.MyPagerAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [MainFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MainFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private val lTitles = arrayOf("Tab1","Tab2","Tab3")
    private lateinit var mTabLayout: TabLayout
    private lateinit var mViewPager2: ViewPager2
    private lateinit var mAdapter:FragmentStateAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val lView =  inflater.inflate(R.layout.fragment_main, container, false)
        mTabLayout = lView.findViewById(R.id.tab_layout)
        mViewPager2 = lView.findViewById(R.id.mypager)
        mAdapter = MyPagerAdapter(requireActivity(),lTitles.size)
        mViewPager2.adapter = mAdapter

        val lTablayoutMediator = TabLayoutMediator(mTabLayout, mViewPager2
        ) { tab, position ->  tab.text = lTitles[position]}.attach()
        return lView
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment MainFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            MainFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}