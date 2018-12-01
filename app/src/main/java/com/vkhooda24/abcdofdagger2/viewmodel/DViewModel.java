package com.vkhooda24.abcdofdagger2.viewmodel;

import com.vkhooda24.abcdofdagger2.viewmodel.abstractviewmodel.DAbstractViewModel;

public class DViewModel implements DAbstractViewModel {

    private static final String TAG = DViewModel.class.getSimpleName();

    @Override
    public String getName() {
        return TAG;
    }
}
