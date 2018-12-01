package com.vkhooda24.abcdofdagger2.dagger;


import com.vkhooda24.abcdofdagger2.app.ABCDofDaggerApplication;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(
        modules = {
                AModule.class,
                BModule.class,
                CModule.class,
                DModule.class,
                ActivityModule.class,
                AndroidInjectionModule.class,
                AndroidSupportInjectionModule.class
        }
)
public interface AppComponent extends AndroidInjector<ABCDofDaggerApplication> {

    //3rd Approach:

    @Component.Builder
    abstract class Builder extends AndroidInjector.Builder<ABCDofDaggerApplication>{ }
}
