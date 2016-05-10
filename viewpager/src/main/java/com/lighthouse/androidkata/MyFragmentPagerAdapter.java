package com.lighthouse.androidkata;


import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v13.app.FragmentPagerAdapter;


public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

    private static final int NUM_PAGES = 5;

    public MyFragmentPagerAdapter(FragmentManager supportFragmentManager) {
        super(supportFragmentManager);
    }

    @Override
    public Fragment getItem(int position) {
        return FragmentPage.create(position);
    }

    @Override
    public int getCount() {
        return NUM_PAGES;
    }
}
