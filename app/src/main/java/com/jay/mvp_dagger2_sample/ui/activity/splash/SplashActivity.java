package com.jay.mvp_dagger2_sample.ui.activity.splash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.jay.mvp_dagger2_sample.BuildConfig;
import com.jay.mvp_dagger2_sample.R;
import com.jay.mvp_dagger2_sample.constant.Constant;
import com.jay.mvp_dagger2_sample.constant.ErrorUtil;
import com.jay.mvp_dagger2_sample.constant.ImageUtil;
import com.jay.mvp_dagger2_sample.di.module.GlideApp;
import com.jay.mvp_dagger2_sample.ui.activity.error.ErrorActivity;
import com.jay.mvp_dagger2_sample.ui.activity.main.MainActivity;

import org.greenrobot.eventbus.EventBus;

import java.io.IOException;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import timber.log.Timber;

public class SplashActivity extends AppCompatActivity implements ISplashView {
    private static final String TAG = SplashActivity.class.getSimpleName();
    @Inject ISplashPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        this.presenter.testConnection();
    }

    @Override
    protected void onPause() {
        super.onPause();
        EventBus.getDefault().unregister(presenter);
    }

    @Override
    protected void onResume() {
        super.onResume();
        EventBus.getDefault().register(presenter);
    }

    @Override
    public void navigateToMain() {
        if(BuildConfig.DEBUG){
            Timber.e("Show main activity");
        }
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void navigateToError(int statusCode) {
        if(BuildConfig.DEBUG){
            Timber.e("Show error activity");
        }
        String errorMessage = ErrorUtil.getErrorMessage(getResources(), statusCode);
        Intent intent = new Intent(this, ErrorActivity.class);
        intent.putExtra("errorMessage", errorMessage);
        startActivity(intent);
        finish();
    }


}
