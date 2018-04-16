package com.jay.mvp_dagger2_sample.ui.activity.splash;

/**
 * Created by JINISYS on 26/03/2018.
 */

public interface ISplashView {
    void navigateToMain();
    void navigateToError(int statusCode);
}
