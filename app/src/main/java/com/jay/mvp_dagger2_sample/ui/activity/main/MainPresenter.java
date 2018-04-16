package com.jay.mvp_dagger2_sample.ui.activity.main;

import com.jay.mvp_dagger2_sample.data.interfaces.ISecurityDataSource;

import javax.inject.Inject;

/**
 * Created by JINISYS on 26/03/2018.
 */

public class MainPresenter implements IMainPresenter{
    private static final String TAG = MainPresenter.class.getName();
    private IMainView view;
    private ISecurityDataSource securityDataSource;

    @Inject
    public MainPresenter(IMainView view, ISecurityDataSource securityDataSource){
        this.view = view;
        this.securityDataSource = securityDataSource;
    }
}
