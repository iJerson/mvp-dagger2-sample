package com.jinisyssoftware.java_mobile_scaffolding.di.module;

import com.jinisyssoftware.java_mobile_scaffolding.data.remote.Api;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

/**
 * Created by JINISYS on 26/03/2018.
 */
@Module
public class ServiceModule {
    @Provides
    public Api provideApi(Retrofit retrofit) {
        return retrofit.create(Api.class);
    }
}
