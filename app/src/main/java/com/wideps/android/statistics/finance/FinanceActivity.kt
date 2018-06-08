package com.wideps.android.statistics.finance

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.wideps.android.statistics.R
import kotlinx.android.synthetic.main.activity_finance.*

class FinanceActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finance)

        val pageAdapter = PageAdapter(supportFragmentManager)
        linkedMapOf(
                R.string.ST_ASSET to AssetFragment(),
                R.string.ST_EXPENSE to ExpenseFragment(),
                R.string.ST_INVEST to InvestFragment()
        ).forEach { id, fragment ->
            pageAdapter.addFragment(fragment)
            tabLayout.addTab(tabLayout.newTab(), id)
        }
        viewPager.adapter = pageAdapter
    }
}
