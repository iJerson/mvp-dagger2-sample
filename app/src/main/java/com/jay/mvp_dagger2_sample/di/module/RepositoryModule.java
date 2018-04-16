package com.jay.mvp_dagger2_sample.di.module;

import com.jay.mvp_dagger2_sample.data.SecurityRepository;
import com.jay.mvp_dagger2_sample.data.interfaces.ISecurityDataSource;
import com.jay.mvp_dagger2_sample.data.remote.Api;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by JINISYS on 26/03/2018.
 */
@Module
public class RepositoryModule {

    @Provides
    @Singleton
    @Named("SecurityRepository")
    public ISecurityDataSource provideSecurityDataSource(Api api){
        return new SecurityRepository(api);
    }

}
