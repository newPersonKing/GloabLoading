package com.gy.gloadingview.wrapfragment;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.gy.gloadingview.R;


/**
 * demo: wrap fragment
 * @author billy.qi
 * @since 19/3/21 17:33
 */
public class WrapFragmentActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wrap_fragment);
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.add(R.id.frame_container, new WrapRootViewFragment());
        transaction.commit();
    }
}
