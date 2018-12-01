package com.vkhooda24.abcdofdagger2.viewmodel;

import com.vkhooda24.abcdofdagger2.viewmodel.abstractviewmodel.AAbstractViewModel;

public class AViewModel implements AAbstractViewModel {

    private static final String TAG = AViewModel.class.getSimpleName();

    @Override
    public String getName() {
        return TAG;
    }
}
