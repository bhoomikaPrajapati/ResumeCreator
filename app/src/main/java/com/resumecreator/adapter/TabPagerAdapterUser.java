package com.resumecreator.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

public class TabPagerAdapterUser extends FragmentStatePagerAdapter {


    private ArrayList<Fragment> fragmentArrayList;
    private ArrayList<String> titleArrayList;
    public TabPagerAdapterUser(FragmentManager fm, ArrayList<Fragment> fragmentArrayList, ArrayList<String> titleArrayList) {
        super(fm);
        this.fragmentArrayList=fragmentArrayList;
        this.titleArrayList=titleArrayList;
    }


    @Override
    public Fragment getItem(int position) {
        return fragmentArrayList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentArrayList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titleArrayList.get(position) ;
    }

}
