package com.w.tvdemo.widget.recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;

/**
 * @author lewi
 * @Description 纵向滚动RecyclerView
 * @date 2017/4/11 14:18
 */
public class VerticalRecyclerView extends RecyclerView {

    public VerticalRecyclerView(Context context) {
        super(context);
        // TODO Auto-generated constructor stub
    }

    public VerticalRecyclerView(Context context, AttributeSet attrs,
                                int defStyle) {
        super(context, attrs, defStyle);
        // TODO Auto-generated constructor stub
    }

    public VerticalRecyclerView(Context context, AttributeSet attrs) {
        super(context, attrs);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void smoothScrollBy(int dx, int dy) {
        if (dy > 0) {
            super.scrollBy(dx, dy + 100);
        } else if (dy < 0) {
            super.scrollBy(dx, dy - 100);
        } else {
            super.scrollBy(dx, dy);
        }

    }

}
