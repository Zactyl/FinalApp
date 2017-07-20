package com.jbaldridge.finalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RegisterActivity extends AppCompatActivity {

    public void cancelRegister(View view)
    {
        // Create an intent to launch the main activity;
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);

        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }
}
