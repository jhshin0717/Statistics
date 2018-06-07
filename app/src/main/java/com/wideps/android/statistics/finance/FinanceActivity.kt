package com.wideps.android.statistics.finance

import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v7.app.AppCompatActivity
import com.wideps.android.statistics.R
import kotlinx.android.synthetic.main.activity_finance.*

class FinanceActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finance)
        toolbar.title = resources.getString(R.string.app_name)

        financePager.apply {
            adapter = PageAdapter(supportFragmentManager, listOf(AssetFragment(), ExpenseFragment(), InvestFragment()))
            addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabLayout))
        }
    }
}
