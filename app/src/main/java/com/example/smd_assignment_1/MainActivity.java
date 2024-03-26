package com.example.smd_assignment_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button sButton;
    private Button eButton;
    private Intent myIntent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myIntent = new Intent(this, MainActivity2.class);
        sButton = findViewById(R.id.btn_signup);
        sButton.setOnClickListener(this);
        eButton = findViewById(R.id.btn_exit);
        eButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_signup)
        {
            startActivity(myIntent);
        }
        else if (v.getId() == R.id.btn_exit)
        {
            finish();
            System.exit(0);
        }
    }
}