package com.jay.mvp_dagger2_sample.ui.activity.splash;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Created by JINISYS on 26/03/2018.
 */
@Subcomponent(modules = SplashModule.class)
public interface ISplashComponent extends AndroidInjector<SplashActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<SplashActivity>{}
}

