package com.vkhooda24.abcdofdagger2.viewmodel;

import com.vkhooda24.abcdofdagger2.viewmodel.abstractviewmodel.CAbstractViewModel;

public class CViewModel implements CAbstractViewModel {

    private static final String TAG = CViewModel.class.getSimpleName();

    @Override
    public String getName() {
        return TAG;
    }
}
