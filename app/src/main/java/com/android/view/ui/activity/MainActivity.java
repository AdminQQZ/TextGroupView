package com.android.view.ui.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;

import com.android.view.R;


/**
 * 页面标题
 *
 * @author - qqz
 * @date -2019-11-12
 * @note -
 * ---------------------------------------------------------------------------------------------------------------------
 * @modified -
 * @date -
 * @note -
 */
public class MainActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
