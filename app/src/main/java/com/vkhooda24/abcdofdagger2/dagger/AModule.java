package com.vkhooda24.abcdofdagger2.dagger;

import com.vkhooda24.abcdofdagger2.viewmodel.AViewModel;
import com.vkhooda24.abcdofdagger2.viewmodel.abstractviewmodel.AAbstractViewModel;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AModule {

    @Provides
    @Singleton
    AAbstractViewModel provideAViewModel() {
        return new AViewModel();
    }
}
