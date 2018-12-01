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

    /*1st Approach: Empty interface AppComponent*/

     /*
    //2nd Approach:

    @Component.Builder
    interface AppBuilder {
        @BindsInstance
        AppBuilder appBuilder(ABCDofDaggerApplication application);

        AppComponent buildGraph();
    }

    void injectApplication(ABCDofDaggerApplication application);*/

    /*
    //3rd Approach:

    @Component.Builder
    abstract class Builder extends AndroidInjector.Builder<ABCDofDaggerApplication>{ }*/

    /*
    //Get injected object from component

    AAbstractViewModel getAAbstractViewModel(); */

}
