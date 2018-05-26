package com.resumecreator.activity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.resumecreator.R;
import com.resumecreator.adapter.TabPagerAdapterUser;
import com.resumecreator.baseclass.BaseActivity;
import com.resumecreator.fragment.UserPersonalDataFragment;
import com.resumecreator.model.FragmentList;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Admin on 20-05-2018.
 */

public class UserDataActivity extends BaseActivity {
    @BindView(R.id.ivHome)
    ImageView ivHome;
    @BindView(R.id.tab)
    TabLayout tab;
    @BindView(R.id.viewpager)
    ViewPager viewpager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_data);
        ButterKnife.bind(this);

        initialization();
    }

    private void initialization() {

        tab.setTabMode(TabLayout.MODE_SCROLLABLE);
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<Fragment> fragmentArrayList = new ArrayList<>();
        arrayList.add("personal");
        fragmentArrayList.add(new UserPersonalDataFragment());
  arrayList.add("personal");
        fragmentArrayList.add(new UserPersonalDataFragment());
  arrayList.add("personal");
        fragmentArrayList.add(new UserPersonalDataFragment());
        arrayList.add("personal");
        fragmentArrayList.add(new UserPersonalDataFragment());




        TabPagerAdapterUser tabPagerAdapter = new TabPagerAdapterUser(getSupportFragmentManager(), fragmentArrayList, arrayList);
        viewpager.setAdapter(tabPagerAdapter);
        tab.setupWithViewPager(viewpager);


        for (int i = 0; i < tab.getTabCount(); i++) {
            TabLayout.Tab tab1 = tab.getTabAt(i);
            if (tab != null) {
                LinearLayout t = (LinearLayout) ((ViewGroup) tab.getChildAt(0)).getChildAt(tab1.getPosition());
                TextView tabTextView = (TextView) t.getChildAt(1);
                tabTextView.setText(tab1.getText());
                tabTextView.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/sansation_regular.ttf"));

            }

        }


    }
}
