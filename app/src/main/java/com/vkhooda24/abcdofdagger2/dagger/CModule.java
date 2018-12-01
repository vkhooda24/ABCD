package com.vkhooda24.abcdofdagger2.dagger;

import com.vkhooda24.abcdofdagger2.viewmodel.CViewModel;
import com.vkhooda24.abcdofdagger2.viewmodel.abstractviewmodel.CAbstractViewModel;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class CModule {

    @Singleton
    @Provides
    CAbstractViewModel provideCViewModel() {
        return new CViewModel();
    }

}
