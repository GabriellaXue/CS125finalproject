package com.example.cs125finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Start extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        configureNextButton();
        goToNextButton();

    }
    private void configureNextButton() {
        final Button startActivity = findViewById(R.id.Start);
        startActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Start.this, MainActivity.class));
            }
        });
    }
    private void goToNextButton() {
        final Button about = findViewById(R.id.About);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent aboutActivity = new Intent(Start.this, guideline.class);
                startActivity(aboutActivity);
            }
        });
    }
}
