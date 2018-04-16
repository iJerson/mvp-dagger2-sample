package com.jay.mvp_dagger2_sample.di.module;

import android.app.Activity;

import com.jay.mvp_dagger2_sample.ui.activity.main.IMainComponent;
import com.jay.mvp_dagger2_sample.ui.activity.main.MainActivity;
import com.jay.mvp_dagger2_sample.ui.activity.splash.ISplashComponent;
import com.jay.mvp_dagger2_sample.ui.activity.splash.SplashActivity;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

/**
 * Created by JINISYS on 26/03/2018.
 */
@Module
public abstract class ActivityBuilder {

    @Binds
    @IntoMap
    @ActivityKey(SplashActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindSplashActivity(ISplashComponent.Builder builder);

    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindMainActivity(IMainComponent.Builder builder);
}
