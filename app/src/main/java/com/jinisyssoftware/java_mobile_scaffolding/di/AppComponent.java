package com.jinisyssoftware.java_mobile_scaffolding.di;

import android.app.Application;

import com.jinisyssoftware.java_mobile_scaffolding.BaseApplication;
import com.jinisyssoftware.java_mobile_scaffolding.di.module.ActivityBuilder;
import com.jinisyssoftware.java_mobile_scaffolding.di.module.AppModule;
import com.jinisyssoftware.java_mobile_scaffolding.di.module.RepositoryModule;
import com.jinisyssoftware.java_mobile_scaffolding.di.module.ServiceModule;

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
