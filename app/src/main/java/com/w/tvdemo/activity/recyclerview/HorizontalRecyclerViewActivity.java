package com.w.tvdemo.activity.recyclerview;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.StaggeredGridLayoutManager;

import com.w.tvdemo.R;
import com.w.tvdemo.activity.recyclerview.adapter.MyRecyclerAdapter;
import com.w.tvdemo.widget.recyclerview.HorizontalRecyclerView;

/**
 * @author lewi
 * @Description 横向RecyclerView
 * @date 2017/4/11 11:30
 */

public class HorizontalRecyclerViewActivity extends Activity {
    private HorizontalRecyclerView horizontalRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horizontal_recycler);
        horizontalRecyclerView = (HorizontalRecyclerView) findViewById(R.id.horizontalRecyclerView);
        horizontalRecyclerView.setLayoutManager(new StaggeredGridLayoutManager(3, OrientationHelper.HORIZONTAL));
        horizontalRecyclerView.setAdapter(new MyRecyclerAdapter(this));
    }
}
