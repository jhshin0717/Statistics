package com.wideps.android.statistics.finance

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.wideps.android.statistics.R
import kotlinx.android.synthetic.main.activity_finance.*

class FinanceActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finance)

        viewPager.adapter = PageAdapter(supportFragmentManager).apply {
            addFragment(AssetFragment())
            addFragment(ExpenseFragment())
            addFragment(InvestFragment())

        }
    }
}
