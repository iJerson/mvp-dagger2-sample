package com.jinisyssoftware.java_mobile_scaffolding.di.module;

import com.jinisyssoftware.java_mobile_scaffolding.data.SecurityRepository;
import com.jinisyssoftware.java_mobile_scaffolding.data.interfaces.ISecurityDataSource;
import com.jinisyssoftware.java_mobile_scaffolding.data.remote.Api;

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
