package com.deepaliverma.bottomnavmenudemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mfirst=firstFragment()
        val msecond= secondFragment()
        val mthird= thirdFragment()
        setCurrentFragment(mfirst)

        bottomnav.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.ihome->setCurrentFragment(mfirst)
                R.id.iperson->setCurrentFragment(msecond)
                R.id.isettings->setCurrentFragment(mthird)

            }
            true
        }
        }
    private fun setCurrentFragment(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment,fragment)
            commit()
        }
    }




