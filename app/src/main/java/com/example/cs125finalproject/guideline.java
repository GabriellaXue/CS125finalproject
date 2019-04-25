package com.example.cs125finalproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class guideline extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guideline);
        goBackToMenu();
    }
    private void goBackToMenu() {
        final Button back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backActivity = new Intent(guideline.this, Start.class);
                startActivity(backActivity);
            }
        });
    }
}
