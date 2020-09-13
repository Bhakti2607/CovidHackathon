package com.example.covidhackathon;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
ImageView contactHelpline,notification,hospitalDashboard,confirmationPatients,dash;
TextView myDB,contactText,hospitaldashText,notificationText,confirmationText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contactHelpline = findViewById(R.id.contacthelpline);
        notification = findViewById(R.id.notification);
        hospitalDashboard = findViewById(R.id.hospitalDashboard);
        confirmationPatients = findViewById(R.id.confirmationPatients);
        dash = findViewById(R.id.dash);

        myDB = findViewById(R.id.myDB);
        contactText = findViewById(R.id.contactText);
        hospitaldashText = findViewById(R.id.hospitaldashText);
        notificationText = findViewById(R.id.notificationText);
        confirmationText = findViewById(R.id.confirmationText);

        contactText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(MainActivity.this,ContactHelpline.class);
                startActivity(i1);
            }
        });

        hospitaldashText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2=new Intent(MainActivity.this,ActivitiesDash.class);
                startActivity(i2);
            }
        });

        notificationText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3=new Intent(MainActivity.this, Notifications.class);
                startActivity(i3);
            }
        });

        confirmationText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i4 = new Intent(MainActivity.this,Confirmation.class);
                startActivity(i4);
            }
        });




    }
}