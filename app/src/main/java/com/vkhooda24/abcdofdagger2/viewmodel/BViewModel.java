package com.vkhooda24.abcdofdagger2.viewmodel;

import com.vkhooda24.abcdofdagger2.viewmodel.abstractviewmodel.BAbstractViewModel;

public class BViewModel implements BAbstractViewModel {

    private static final String TAG = BViewModel.class.getSimpleName();

    @Override
    public String getName() {
        return TAG;
    }
}
