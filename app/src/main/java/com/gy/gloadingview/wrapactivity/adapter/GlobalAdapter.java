package com.gy.gloadingview.wrapactivity.adapter;

import android.view.View;

import com.billy.android.loading.Gloading;
import com.gy.gloadingview.util.Constants;
import com.gy.gloadingview.wrapactivity.adapter.view.GlobalLoadingStatusView;


public class GlobalAdapter implements Gloading.Adapter {

    @Override
    public View getView(Gloading.Holder holder, View convertView, int status) {
        GlobalLoadingStatusView loadingStatusView = null;
        //reuse the old view, if possible
        if (convertView != null && convertView instanceof GlobalLoadingStatusView) {
            loadingStatusView = (GlobalLoadingStatusView) convertView;
        }
        if (loadingStatusView == null) {
            loadingStatusView = new GlobalLoadingStatusView(holder.getContext(), holder.getRetryTask());
        }
        loadingStatusView.setStatus(status);
        Object data = holder.getData();
        //show or not show msg view
        boolean hideMsgView = Constants.HIDE_LOADING_STATUS_MSG.equals(data);
        loadingStatusView.setMsgViewVisibility(!hideMsgView);
        return loadingStatusView;
    }

}