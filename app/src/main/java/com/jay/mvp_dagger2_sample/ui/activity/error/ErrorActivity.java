package com.jay.mvp_dagger2_sample.ui.activity.error;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.jay.mvp_dagger2_sample.R;

public class ErrorActivity extends AppCompatActivity {

    TextView txtError;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_error);

        String error = getResources().getString(R.string.error_default);
        Intent intent = getIntent();
        if(intent.getExtras() != null){
            error = intent.getExtras().getString("errorMessage");
        }

        txtError = (TextView) findViewById(R.id.txt_error);
        txtError.setText(error);
    }
}
