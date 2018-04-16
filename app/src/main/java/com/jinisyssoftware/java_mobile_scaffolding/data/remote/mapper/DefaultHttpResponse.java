package com.jinisyssoftware.java_mobile_scaffolding.data.remote.mapper;

/**
 * Created by JINISYS on 26/03/2018.
 */

public class DefaultHttpResponse {
    private boolean success;
    private String message;
    private String code;
    private String id;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
