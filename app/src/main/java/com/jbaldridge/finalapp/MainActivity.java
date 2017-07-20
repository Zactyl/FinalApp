package com.jbaldridge.finalapp;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void goToRegister(View view)
    {
        // Creates an Intent in order to launch the Register Activity
        Intent intent = new Intent(getApplicationContext(), RegisterActivity.class);
        // Intent(getApplicationContext(), [activity name].class); in order to create intents;
        startActivity(intent);
    }

    public void goToManage(View view)
    {
        // Create an intent in order to go to the ManageList Activity
        Intent intent = new Intent(getApplicationContext(), RegisterActivity.class);

        startActivity(intent);
    }

    public void tryLogin(View view)
    {
        EditText usernameEditText = (EditText) findViewById(R.id.emailText);
        EditText passwordEditText = (EditText) findViewById(R.id.passwordText);

        String username = usernameEditText.getText().toString();
        String passwordEntered = passwordEditText.getText().toString();
        //String passwordStored = sharedPreferences.getString(username, "");

        // Creates Logs in order to show the entered values
        Log.i("Info", "Username is: " + username);
        Log.i("Info", "Password entered is: " + passwordEntered);
        //Log.i("Info", "Password stored is: " + passwordStored);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences sharedPreferences = this.getSharedPreferences("com.jbaldridge.sharedpreferences", Context.MODE_PRIVATE);

        sharedPreferences.edit().putString("test@test.com", "password").apply();
    }
}
