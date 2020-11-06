package com.example.dcs;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class Doctorsatyourservice extends AppCompatActivity {


    ImageView doctor1,doctor2,doctor3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctorsatyoursite);

        doctor1 = (ImageView) findViewById(R.id.modeofmetro);
        doctor2 = (ImageView) findViewById(R.id.doctors2);
        doctor3 = (ImageView) findViewById(R.id.aboutandhelp);

        doctor1.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                startActivity(new Intent(Doctorsatyourservice.this, Doctor1.class));
            }
        });

        doctor2.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                startActivity(new Intent(Doctorsatyourservice.this, Doctor2.class));

            }
        });

        doctor3.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                startActivity(new Intent(Doctorsatyourservice.this, Doctor3.class));

            }
        });
    }
}


