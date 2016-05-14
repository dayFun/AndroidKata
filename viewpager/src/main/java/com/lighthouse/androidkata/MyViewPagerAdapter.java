package com.lighthouse.androidkata;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v13.app.FragmentPagerAdapter;


public class MyViewPagerAdapter extends FragmentPagerAdapter {

    public MyViewPagerAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    @Override
    public Fragment getItem(int position) {
        return FragmentPage.create(position);
    }

    @Override
    public int getCount() {
        return 5;
    }
}
