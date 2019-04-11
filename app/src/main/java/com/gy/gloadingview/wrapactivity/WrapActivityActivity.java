package com.gy.gloadingview.wrapactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.gy.gloadingview.BaseActivity;
import com.gy.gloadingview.R;


/**
 * entrance of wrap activity demos
 * @author billy.qi
 * @since 19/3/19 21:09
 */
public class WrapActivityActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wrap_activity);
    }

    public void toLoadSuccess(View view) {
        startActivity(new Intent(this, GlobalSuccessActivity.class));
    }

    public void toLoadFailed(View view) {
        startActivity(new Intent(this, GlobalFailedActivity.class));
    }

    public void toEmpty(View view) {
        startActivity(new Intent(this, GlobalEmptyActivity.class));
    }

    public void toWrapView(View view) {
        startActivity(new Intent(this, SpecialActivity.class));
    }

}
