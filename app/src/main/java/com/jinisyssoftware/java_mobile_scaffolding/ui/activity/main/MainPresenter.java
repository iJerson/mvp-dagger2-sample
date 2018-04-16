package com.jinisyssoftware.java_mobile_scaffolding.ui.activity.main;

import com.jinisyssoftware.java_mobile_scaffolding.data.interfaces.ISecurityDataSource;

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
