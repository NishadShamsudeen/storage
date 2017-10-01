package com.example.user.database;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by user on 01-10-2017.
 */

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {
    private Button mLogoutButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mLogoutButton = (Button) findViewById(R.id.logoutbutton);

        mLogoutButton.setOnClickListener((this));
    }

    @Override
    public void onClick(View view) {
        StorageHandler.setCheked(this, false);
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }
}

