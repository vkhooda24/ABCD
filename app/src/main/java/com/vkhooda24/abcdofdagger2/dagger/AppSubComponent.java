package com.vkhooda24.abcdofdagger2.dagger;

import dagger.Subcomponent;

@Subcomponent(modules = {
        CModule.class,
        DModule.class
})
public interface AppSubComponent {

    @Subcomponent.Builder
    interface AppSubComponentBuilder {
        AppSubComponent buildSubComponentBuilder();
    }
}
