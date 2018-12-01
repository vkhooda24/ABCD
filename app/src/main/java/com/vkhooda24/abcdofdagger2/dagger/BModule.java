package com.vkhooda24.abcdofdagger2.dagger;

import com.vkhooda24.abcdofdagger2.viewmodel.BViewModel;
import com.vkhooda24.abcdofdagger2.viewmodel.abstractviewmodel.BAbstractViewModel;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class BModule {

    @Singleton
    @Provides
    BAbstractViewModel provideBViewModel() {
        return new BViewModel();
    }
}
