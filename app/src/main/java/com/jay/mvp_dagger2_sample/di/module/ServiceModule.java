package com.jay.mvp_dagger2_sample.di.module;

import com.jay.mvp_dagger2_sample.data.remote.Api;

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
