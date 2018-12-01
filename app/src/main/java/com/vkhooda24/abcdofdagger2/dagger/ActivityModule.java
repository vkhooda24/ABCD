package com.vkhooda24.abcdofdagger2.dagger;

import com.vkhooda24.abcdofdagger2.ui.activity.AActivity;
import com.vkhooda24.abcdofdagger2.ui.activity.BActivity;
import com.vkhooda24.abcdofdagger2.ui.activity.CActivity;
import com.vkhooda24.abcdofdagger2.ui.activity.DActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityModule {

    @ContributesAndroidInjector
    abstract AActivity provideAActivity();

    @ContributesAndroidInjector
    abstract BActivity provideBActivity();

    @ContributesAndroidInjector
    abstract CActivity provideCActivity();

    @ContributesAndroidInjector
    abstract DActivity provideDActivity();
}
