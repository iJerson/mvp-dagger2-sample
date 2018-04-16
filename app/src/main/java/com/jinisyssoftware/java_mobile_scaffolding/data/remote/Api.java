package com.jinisyssoftware.java_mobile_scaffolding.data.remote;

import com.jinisyssoftware.java_mobile_scaffolding.data.remote.mapper.DefaultHttpResponse;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by JINISYS on 26/03/2018.
 */

public interface Api {
    //region CONNECTION

    @GET("/api/connection/test")
    Call<DefaultHttpResponse> testConnection();

    //endregion
}
