package com.feylabs.firrieflix.view

import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.feylabs.firrieflix.adapter.WalkthroughAdapter
import com.feylabs.firrieflix.databinding.ActivityWalkthroughBinding
import com.feylabs.firrieflix.util.BaseActivity


class WalkthroughActivity : BaseActivity() {

    val vbind by lazy { ActivityWalkthroughBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(vbind.root)

        val tabAdapter = WalkthroughAdapter(supportFragmentManager, lifecycle)
        vbind.viewPager.adapter = tabAdapter

        vbind.indicator.setViewPager(vbind.viewPager)

        vbind.viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)

                val arrayTitle =
                    arrayListOf<String>("Best Film", "Staycation Mate", "Access from anywhere")
                val arrayDesc = arrayListOf<String>(
                    "Guarantee for Quality, Only best film",
                    "Enjoy your staycation with us, Firriflix and Chill",
                    "Access from any device, no limitation"
                )

                if (position <= 2) {
                    vbind.labelTitleJargon?.text = arrayTitle[position]
                    vbind.labelDescJargon?.text = arrayDesc[position]
                    vbind.labelDescJargon.textSize = 14.0f
                }

            }
        })


    }
}

