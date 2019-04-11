package com.gy.gloadingview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.gy.gloadingview.wrapactivity.WrapActivityActivity;
import com.gy.gloadingview.wrapfragment.WrapFragmentActivity;
import com.gy.gloadingview.wrapview.WrapViewActivity;

/**
 * demo for Gloading
 * Notice: pictures in this app are get from: https://www.thiswaifudoesnotexist.net/
 */
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toWrapActivity(View view) {
        startActivity(new Intent(this, WrapActivityActivity.class));
    }

    public void toWrapView(View view) {
        startActivity(new Intent(this, WrapViewActivity.class));
    }

    public void toWrapFragment(View view) {
        startActivity(new Intent(this, WrapFragmentActivity.class));
    }
}
