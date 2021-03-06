package com.resumecreator.customeview;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v4.widget.SwipeRefreshLayout;
import android.util.AttributeSet;

import com.resumecreator.R;

public class CustomSwipeRefreshLayout extends SwipeRefreshLayout {
  public CustomSwipeRefreshLayout(Context context) {
    super(context);
    init();
  }

  public CustomSwipeRefreshLayout(Context context, AttributeSet attrs) {
    super(context, attrs);
    init();
  }

  private void init() {
    setColorSchemeColors(ContextCompat.getColor(getContext(), R.color.colorPrimary));
  }
}