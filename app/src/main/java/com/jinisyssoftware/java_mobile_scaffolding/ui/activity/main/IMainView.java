package com.jinisyssoftware.java_mobile_scaffolding.ui.activity.main;

/**
 * Created by JINISYS on 26/03/2018.
 */

public interface IMainView {
    void showAlertDialog(String title, String message);
    void showLoadingDialog(String message);
    void hideLoadingDialog();
}
