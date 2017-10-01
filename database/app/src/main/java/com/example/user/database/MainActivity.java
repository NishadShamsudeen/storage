package com.example.user.database;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText mUsernameEditText;
    private EditText mPasswordEditText;
    private CheckBox mCheckBox;
    private Button mLoginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(StorageHandler.isChecked(this)){
            startActivity(new Intent(this, HomeActivity.class));
            finish();
             }
        setContentView(R.layout.activity_main);

        mUsernameEditText = (EditText) findViewById(R.id.usernameEditText);
        mPasswordEditText = (EditText) findViewById(R.id.passwordEditText);
        mCheckBox = (CheckBox) findViewById(R.id.checkBox);
        mLoginButton = (Button) findViewById(R.id.loginButton);

        mLoginButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        StorageHandler.insertUserName(this, mUsernameEditText.getText().toString());
        StorageHandler.insertPassword(this, mPasswordEditText.getText().toString());
        StorageHandler.setCheked(this, mCheckBox.isChecked());

        startActivity(new Intent(this, HomeActivity.class));
        finish();
    }
}