package com.example.covidhackathon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ActivitiesDash extends AppCompatActivity {
TextView hospbed,medbed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activities_dash);

        hospbed = findViewById(R.id.hospbed);
        medbed = findViewById(R.id.medbed);

        hospbed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(ActivitiesDash.this,HospitalDash.class);
                startActivity(i);
            }
        });

        medbed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2=new Intent(ActivitiesDash.this,MedicalDash.class);
                startActivity(i2);
            }
        });

    }
}