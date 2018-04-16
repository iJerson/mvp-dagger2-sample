package com.jay.mvp_dagger2_sample.ui.activity.main;

import com.jay.mvp_dagger2_sample.data.interfaces.ISecurityDataSource;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Created by JINISYS on 26/03/2018.
 */
@Module
public class MainModule {
    @Provides
    IMainView provideMainView(MainActivity activity){
        return activity;
    }

    @Provides
    IMainPresenter provideMainPresenter(IMainView view, @Named("SecurityRepository")ISecurityDataSource securityDataSource){
        return new MainPresenter(view, securityDataSource);
    }
}
