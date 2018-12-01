package com.vkhooda24.abcdofdagger2.ui.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.vkhooda24.abcdofdagger2.R;

import dagger.android.AndroidInjection;


public class AActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        //Activity injected into graph before creating
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
    }
}
