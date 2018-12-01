package com.vkhooda24.abcdofdagger2.app;

import android.app.Activity;
import android.app.Application;
import android.support.v4.app.Fragment;

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

        //1st Approach:
//        DaggerAppComponent.builder().build().inject(this);

        /*This line equivalent to below line. create() returns new Builder().build()*/
//        DaggerAppComponent.create().inject(this);

        //2nd Approach:
//        DaggerAppComponent.builder().appBuilder(this).buildGraph().injectApplication(this);

        //3rd Approach:
//        DaggerAppComponent.builder().create(this).inject(this);

        /*
        //Get any injected object from component
        AppComponent appComponent = DaggerAppComponent.builder().build();
        appComponent.inject(this);

        AAbstractViewModel aAbstractViewModel = appComponent.getAAbstractViewModel();
        //Access any method of injected object class
        String name = aAbstractViewModel.getName();
        Log.d(TAG, name);
        */

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