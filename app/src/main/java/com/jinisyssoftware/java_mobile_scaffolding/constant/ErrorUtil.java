package com.jinisyssoftware.java_mobile_scaffolding.constant;

import android.content.res.Resources;

import com.jinisyssoftware.java_mobile_scaffolding.R;

public class ErrorUtil {
    public static String getErrorMessage(Resources resources, int statusCode){
        String msg;
        switch (statusCode){
            case 401:
                msg = resources.getString(R.string.error_401);
                break;
            case 500:
                msg = resources.getString(R.string.error_500);
                break;
            default:
                String txt = resources.getString(R.string.error_default);
                msg = String.format(txt, statusCode);
        }
        return msg;
    }
}
