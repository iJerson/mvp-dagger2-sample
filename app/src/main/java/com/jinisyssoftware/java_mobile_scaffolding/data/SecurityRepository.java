package com.jinisyssoftware.java_mobile_scaffolding.data;

import com.jinisyssoftware.java_mobile_scaffolding.data.remote.Api;
import com.jinisyssoftware.java_mobile_scaffolding.data.interfaces.ISecurityDataSource;
import com.jinisyssoftware.java_mobile_scaffolding.data.remote.mapper.DefaultHttpResponse;
import com.jinisyssoftware.java_mobile_scaffolding.helper.event.AppEvent;

import org.greenrobot.eventbus.EventBus;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by JINISYS on 26/03/2018.
 */

public class SecurityRepository implements ISecurityDataSource {

    private Api api;

    @Inject
    public SecurityRepository(Api api){
        this.api = api;
    }

    @Override
    public void testConnection() {
        Call<DefaultHttpResponse> connection = api.testConnection();
        connection.enqueue(new Callback<DefaultHttpResponse>() {
            @Override
            public void onResponse(Call<DefaultHttpResponse> call, Response<DefaultHttpResponse> response) {
                if(response.isSuccessful()){
                    EventBus.getDefault().post(new AppEvent(true, response.message(), response.code()));
                }else{
                    EventBus.getDefault().post(new AppEvent(false, response.message(), response.code()));
                }
            }

            @Override
            public void onFailure(Call<DefaultHttpResponse> call, Throwable t) {
                EventBus.getDefault().post(new AppEvent(false, t.getMessage(), 500));
            }
        });
    }
}