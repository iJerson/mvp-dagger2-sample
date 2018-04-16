package com.jinisyssoftware.java_mobile_scaffolding.ui.activity.splash;

import com.jinisyssoftware.java_mobile_scaffolding.data.interfaces.ISecurityDataSource;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Created by JINISYS on 26/03/2018.
 */
@Module
public class SplashModule {
    @Provides
    ISplashView provideSplashView(SplashActivity activity){
        return activity;
    }

    @Provides
    ISplashPresenter provideSplashPresenter(ISplashView view, @Named("SecurityRepository")ISecurityDataSource securityDataSource){
        return new SplashPresenter(view, securityDataSource);
    }
}
