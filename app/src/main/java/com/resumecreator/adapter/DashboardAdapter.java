package com.resumecreator.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.resumecreator.R;
import com.resumecreator.baseclass.BaseRecyclerAdapter;


import java.util.List;

import butterknife.BindView;

public class DashboardAdapter extends BaseRecyclerAdapter<DashboardAdapter.DataViewHolder, String> {

    private List<String> mListOfOption;
    private Context context;



    public DashboardAdapter(List<String> mListOfOption, Context context) {
        super(mListOfOption);
        this.mListOfOption = mListOfOption;
        this.context = context;
    }


    @Override
    public DashboardAdapter.DataViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new DashboardAdapter.DataViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_dashboard, parent, false));
    }




    @Override
    public void onBindViewHolder(DashboardAdapter.DataViewHolder holder, int position) {
        String text = mListOfOption.get(position);
        holder.tvListOfOption.setText(text);



    }


    class DataViewHolder extends BaseRecyclerAdapter.ViewHolder {

        @BindView(R.id.tvListOfOption)
        TextView tvListOfOption;

        public DataViewHolder(View itemView) {
            super(itemView);
            clickableViews(tvListOfOption);

        }
    }


}