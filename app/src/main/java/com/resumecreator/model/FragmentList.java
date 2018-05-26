package com.resumecreator.model;

import android.app.Fragment;

import com.resumecreator.fragment.UserPersonalDataFragment;

/**
 * Created by Admin on 20-05-2018.
 */

public class FragmentList {
    private Fragment fragment;
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Fragment getFragment() {
        return fragment;
    }

    public void setFragment(Fragment fragment) {
        this.fragment = fragment;
    }

    public void setFragment(UserPersonalDataFragment userPersonalDataFragment) {

    }
}
