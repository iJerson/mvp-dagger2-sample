package com.jay.mvp_dagger2_sample.helper.event;

/**
 * Created by JINISYS on 26/03/2018.
 */

public class AppEvent {
    public boolean success;
    public String message;
    public int statusCode;

    public AppEvent(boolean success, String message, int statusCode){
        this.success = success;
        this.message = message;
        this.statusCode = statusCode;
    }
}
