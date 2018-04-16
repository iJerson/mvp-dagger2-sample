package com.jinisyssoftware.java_mobile_scaffolding.ui.activity.main;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Created by JINISYS on 26/03/2018.
 */
@Subcomponent(modules = MainModule.class)
public interface IMainComponent extends AndroidInjector<MainActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity>{}
}