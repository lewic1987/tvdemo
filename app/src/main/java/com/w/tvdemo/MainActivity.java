package com.w.tvdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.w.tvdemo.activity.recyclerview.HorizontalRecyclerViewActivity;
import com.w.tvdemo.activity.recyclerview.VerticalRecyclerViewActivity;

/**
 * @Description
 * @author lewi
 * @date 2017/4/11 15:53
*/
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onMyClick(View v) {
        switch (v.getId()) {
            case R.id.horizontalRecyclerView:
                startActivity(new Intent(this, HorizontalRecyclerViewActivity.class));
                break;
            case R.id.verticalRecyclerView:
                startActivity(new Intent(this, VerticalRecyclerViewActivity.class));
                break;
        }
    }
}
