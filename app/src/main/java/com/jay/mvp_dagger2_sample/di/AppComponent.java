package com.jay.mvp_dagger2_sample.di;

import android.app.Application;

import com.jay.mvp_dagger2_sample.BaseApplication;
import com.jay.mvp_dagger2_sample.di.module.ActivityBuilder;
import com.jay.mvp_dagger2_sample.di.module.AppModule;
import com.jay.mvp_dagger2_sample.di.module.RepositoryModule;
import com.jay.mvp_dagger2_sample.di.module.ServiceModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * Created by JINISYS on 26/03/2018.
 */
@Singleton
@Component(modules = {
        AndroidSupportInjectionModule.class,
        AppModule.class,
        ServiceModule.class,
        RepositoryModule.class,
        ActivityBuilder.class
})
public interface AppComponent {
    @Component.Builder
    interface Builder{
        @BindsInstance
        Builder application(Application app);
        AppComponent build();
    }

    void inject(BaseApplication app);
}
