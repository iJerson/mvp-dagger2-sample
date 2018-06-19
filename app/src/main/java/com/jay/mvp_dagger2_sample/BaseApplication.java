package com.jay.mvp_dagger2_sample;

import android.app.Activity;
import android.app.Application;
import android.support.v4.app.Fragment;

import com.jay.mvp_dagger2_sample.di.DaggerAppComponent;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;
import dagger.android.support.HasSupportFragmentInjector;
import io.realm.Realm;
import io.realm.RealmConfiguration;
import timber.log.Timber;

/**
 * Created by JINISYS on 26/03/2018.
 */

public class BaseApplication extends Application implements HasActivityInjector, HasSupportFragmentInjector {

    @Inject
    DispatchingAndroidInjector<Activity> activityDispatchingAndroidInjector;
    @Inject DispatchingAndroidInjector<Fragment> fragmentDispatchingAndroidInjector;

    @Override
    public void onCreate(){
        super.onCreate();

//      REALM DB
        Realm.init(this);
        initRealmConfiguration();

        configureExceptionLogging();

//      DAGGER 2
        DaggerAppComponent
                .builder()
                .application(this)
                .build()
                .inject(this);
    }

    @Override
    public DispatchingAndroidInjector<Activity> activityInjector(){
        return activityDispatchingAndroidInjector;
    }

    @Override
    public AndroidInjector<Fragment> supportFragmentInjector() {
        return fragmentDispatchingAndroidInjector;
    }

    private void configureExceptionLogging() {
        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        }else{
//            Timber.plant(new CrashReportingTree());
        }
    }

    private void initRealmConfiguration(){
        RealmConfiguration config = new RealmConfiguration.Builder().name("demo.realm").deleteRealmIfMigrationNeeded().build();
//        Realm.deleteRealm(config); Log.e("START", "DELETE REALM");
        Realm.setDefaultConfiguration(config);
    }

//    /** A tree which logs important information for crash reporting. */
//    private static class CrashReportingTree extends Timber.Tree {
//        @Override protected void log(int priority, String tag, @NonNull String message, Throwable t) {
//            if (priority == Log.VERBOSE || priority == Log.DEBUG) {
//                return;
//            }
//
//            FakeCrashLibrary.log(priority, tag, message);
//
//            if (t != null) {
//                if (priority == Log.ERROR) {
//                    FakeCrashLibrary.logError(t);
//                } else if (priority == Log.WARN) {
//                    FakeCrashLibrary.logWarning(t);
//                }
//            }
//        }
//    }

}