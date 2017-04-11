package com.w.tvdemo.activity.recyclerview;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.StaggeredGridLayoutManager;

import com.w.tvdemo.R;
import com.w.tvdemo.activity.recyclerview.adapter.MyRecyclerAdapter;
import com.w.tvdemo.widget.recyclerview.VerticalRecyclerView;

/**
 * @author lewi
 * @Description 纵向RecyclerView
 * @date 2017/4/11 11:30
 */

public class VerticalRecyclerViewActivity extends Activity {
    private VerticalRecyclerView verticalRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vertical_recycler);
        verticalRecyclerView = (VerticalRecyclerView) findViewById(R.id.verticalRecyclerView);
        verticalRecyclerView.setLayoutManager(new StaggeredGridLayoutManager(5, OrientationHelper.VERTICAL));
        verticalRecyclerView.setAdapter(new MyRecyclerAdapter(this));
    }
}
