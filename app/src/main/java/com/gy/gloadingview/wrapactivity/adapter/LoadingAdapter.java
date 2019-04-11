package com.gy.gloadingview.wrapactivity.adapter;

import android.view.LayoutInflater;
import android.view.View;

import com.billy.android.loading.Gloading;
import com.gy.gloadingview.R;
import com.gy.gloadingview.wrapactivity.adapter.view.anim.LoadingLayout;

import static com.billy.android.loading.Gloading.STATUS_LOADING;

public class LoadingAdapter implements Gloading.Adapter {

    @Override
    public View getView(Gloading.Holder holder, View convertView, int status) {
        if(status == STATUS_LOADING){
            return new LoadingLayout(holder.getContext(),R.layout.item_loading,holder.getRetryTask());
        }else{
            return null;
        }
    }
}
