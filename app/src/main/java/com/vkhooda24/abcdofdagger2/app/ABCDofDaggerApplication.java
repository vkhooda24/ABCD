package com.vkhooda24.abcdofdagger2.app;

import android.app.Activity;
import android.app.Application;
import android.support.v4.app.Fragment;

import com.vkhooda24.abcdofdagger2.dagger.DaggerAppComponent;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;
import dagger.android.support.HasSupportFragmentInjector;

public class ABCDofDaggerApplication extends Application implements HasActivityInjector, HasSupportFragmentInjector {

    private static final String TAG = ABCDofDaggerApplication.class.getSimpleName();
    @Inject
    DispatchingAndroidInjector<Activity> dispatchingActivityInjector;

    @Inject
    DispatchingAndroidInjector<Fragment> DispatchingFragmentInjector;

    @Override
    public void onCreate() {
        super.onCreate();

        //3rd Approach:
        DaggerAppComponent.builder().create(this).inject(this);

    }

    @Override
    public DispatchingAndroidInjector<Activity> activityInjector() {
        return dispatchingActivityInjector;
    }

    @Override
    public AndroidInjector<Fragment> supportFragmentInjector() {
        return DispatchingFragmentInjector;
    }
}