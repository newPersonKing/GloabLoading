package com.gy.gloadingview.wrapactivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ImageView;


import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.gy.gloadingview.BaseActivity;
import com.gy.gloadingview.R;

import static com.gy.gloadingview.util.Util.getErrorImage;
import static com.gy.gloadingview.util.Util.getRandomImage;

/**
 * demo: loading and load failed and click to retry
 * @author billy.qi
 * @since 19/3/19 21:09
 */
public class GlobalFailedActivity extends BaseActivity {

    private ImageView imageView;
    private String picUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        imageView = new ImageView(this);
        imageView.setBackgroundColor(getResources().getColor(R.color.main_bg));
        setContentView(imageView);
        picUrl = getErrorImage(); //failed
        loadData();
    }

    private void loadData() {
        showLoading();
        Glide.with(this)
                .load(picUrl)
                .listener(new RequestListener<Drawable>() {
                    @Override
                    public boolean onLoadFailed(@Nullable GlideException e, Object model, Target<Drawable> target, boolean isFirstResource) {
                        showLoadFailed();
                        return false;
                    }

                    @Override
                    public boolean onResourceReady(Drawable resource, Object model, Target<Drawable> target, DataSource dataSource, boolean isFirstResource) {
                        showLoadSuccess();
                        return false;
                    }
                })
                .into(imageView);
    }

    @Override
    protected void onLoadRetry() {
        picUrl = getRandomImage(); //change picture url to a correct one
        loadData();
    }
}
