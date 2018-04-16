package com.jinisyssoftware.java_mobile_scaffolding.ui.activity.splash;

import com.jinisyssoftware.java_mobile_scaffolding.data.interfaces.ISecurityDataSource;
import com.jinisyssoftware.java_mobile_scaffolding.helper.event.AppEvent;

import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import javax.inject.Inject;

/**
 * Created by JINISYS on 26/03/2018.
 */

public class SplashPresenter implements ISplashPresenter {
    private static final String TAG = SplashPresenter.class.getName();
    private ISplashView view;
    private ISecurityDataSource securityDataSource;

    @Inject
    public SplashPresenter(ISplashView view, ISecurityDataSource securityDataSource){
        this.view = view;
        this.securityDataSource = securityDataSource;
    }

    @Override
    public void testConnection() {
        this.securityDataSource.testConnection();
    }

    @Subscribe(threadMode = ThreadMode.POSTING)
    public void testConnectionStatus(AppEvent event){
        if(event.success){
            this.view.navigateToMain();
        }else{
            this.view.navigateToError(event.statusCode);
        }
    }
}
