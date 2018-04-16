package com.jay.mvp_dagger2_sample.ui.activity.main;

/**
 * Created by JINISYS on 26/03/2018.
 */

public interface IMainView {
    void showAlertDialog(String title, String message);
    void showLoadingDialog(String message);
    void hideLoadingDialog();
}
