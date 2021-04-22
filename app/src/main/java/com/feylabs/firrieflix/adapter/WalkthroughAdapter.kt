package com.feylabs.firrieflix.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.feylabs.firrieflix.view.onboarding.OnBoardFragmentFinal
import com.feylabs.firrieflix.view.onboarding.OnboardFragment1
import com.feylabs.firrieflix.view.onboarding.OnboardFragment2
import com.feylabs.firrieflix.view.onboarding.OnboardFragment3


class WalkthroughAdapter(fm: FragmentManager,lf : Lifecycle) : FragmentStateAdapter(fm,lf) {

    val fragmentList = arrayListOf<Fragment>(
        OnboardFragment1(),
        OnboardFragment2(),
        OnboardFragment3(),
        OnBoardFragmentFinal(),
    )

    override fun getItemCount(): Int {
        return fragmentList.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragmentList[position]
    }


}