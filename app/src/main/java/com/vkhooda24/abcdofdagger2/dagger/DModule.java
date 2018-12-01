package com.vkhooda24.abcdofdagger2.dagger;

import com.vkhooda24.abcdofdagger2.viewmodel.DViewModel;
import com.vkhooda24.abcdofdagger2.viewmodel.abstractviewmodel.DAbstractViewModel;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class DModule {

    @Singleton
    @Provides
    DAbstractViewModel provideDViewModel() {
        return new DViewModel();
    }
}
