package com.example.slide6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btngoogle(View view) {
        startActivity(new Intent(this,MapsActivity.class));
    }

    public void btnfacebook(View view) {
        startActivity(new Intent(this,FacebookActivity.class));
    }
}