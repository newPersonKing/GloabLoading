package com.gy.gloadingview.wrapactivity.adapter.view.anim;

import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.gy.gloadingview.R;

public class LoadingLayout extends RelativeLayout {

    public LoadingLayout(Context context,int resId, Runnable retryTask) {
        super(context);
        LayoutInflater.from(context).inflate(resId,this,true);
        setGravity(Gravity.CENTER);
    }
}
