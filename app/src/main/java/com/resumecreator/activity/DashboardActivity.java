package com.resumecreator.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.resumecreator.R;
import com.resumecreator.adapter.DashboardAdapter;
import com.resumecreator.baseclass.BaseRecyclerAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DashboardActivity extends AppCompatActivity {


    @BindView(R.id.rvMenu)
    RecyclerView rvMenu;

    private List<String> mListOfOption = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deshboard);
        ButterKnife.bind(this);
        initialization();


    }

    private void initialization() {

        mListOfOption.add("Create resume");
        mListOfOption.add("Cover Letter");
        mListOfOption.add("Invite Friends");
        mListOfOption.add("Feedback");
        mListOfOption.add("Rate Now");


        LinearLayoutManager gridLayoutManager = new LinearLayoutManager( this);
        rvMenu.setLayoutManager(gridLayoutManager);
        rvMenu.setAdapter(new DashboardAdapter(mListOfOption, DashboardActivity.this).setRecycleOnItemClickListener(
                mRecycleOnItemClickListener));


    }


    private BaseRecyclerAdapter.RecycleOnItemClickListener mRecycleOnItemClickListener = new BaseRecyclerAdapter.RecycleOnItemClickListener() {
        @Override
        public void onItemClick(View view, int position) {

        }
    };


}