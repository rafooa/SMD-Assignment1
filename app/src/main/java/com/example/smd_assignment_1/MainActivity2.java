package com.example.smd_assignment_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {
    private ImageButton bButton;
    private Intent myIntent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        myIntent = new Intent(this, MainActivity.class);
        bButton = findViewById(R.id.backButton);
        bButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.backButton)
        {
            startActivity(myIntent);
        }
    }
}