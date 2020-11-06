package com.example.dcs;

import android.content.Intent;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.database.core.view.View;

public class Dashboardpage extends AppCompatActivity {

    DrawerLayout drawerLayout;
    TextView GoDashboard,GoAboutus,GoAppointmentFixing,GoAppointmentStatus,GoFaq,GoVideoCall,GoLiveChat,GoImageSharing,GoHealthCare,Goqiz;
    ImageView ClickMenu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboardpage);

        drawerLayout = findViewById(R.id.drawer_layout);
        GoDashboard = (TextView) findViewById(R.id.godashboard);
        GoAboutus = (TextView) findViewById(R.id.goaboutus);
        GoAppointmentFixing=(TextView)findViewById(R.id.goappointmentfixing);
        GoAppointmentStatus =(TextView)findViewById(R.id.goadmins);
        GoFaq=(TextView)findViewById(R.id.gofaq);
        GoImageSharing=(TextView)findViewById(R.id.imagesharing);
        GoLiveChat=(TextView)findViewById(R.id.gochatbox);
        GoVideoCall=(TextView)findViewById(R.id.govideocall);
        Goqiz=(TextView)findViewById(R.id.goquizpage);
        GoHealthCare=(TextView)findViewById(R.id.gohealthcare);
        ClickMenu = (ImageView) findViewById(R.id.clickmenu);

        GoDashboard.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                startActivity(new Intent(Dashboardpage.this, Doctorsatyourservice.class));
            }
        });

        GoAboutus.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                startActivity(new Intent(Dashboardpage.this, AboutUs.class));

            }
        });

        GoAppointmentFixing.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                startActivity(new Intent(Dashboardpage.this, AppointmentFixing.class));

            }
        });

        GoAppointmentStatus.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                startActivity(new Intent(Dashboardpage.this, adminloginpage.class));

            }
        });

        GoFaq.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                startActivity(new Intent(Dashboardpage.this, FaqPage.class));

            }
        });

        Goqiz.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                startActivity(new Intent(Dashboardpage.this, quizPage.class));

            }
        });


        GoImageSharing.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                startActivity(new Intent(Dashboardpage.this, ImageSharing.class));

            }
        });

        GoVideoCall.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                startActivity(new Intent(Dashboardpage.this, VideoCall.class));

            }
        });

        GoHealthCare.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                startActivity(new Intent(Dashboardpage.this, Healthcare.class));

            }
        });

        GoLiveChat.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                startActivity(new Intent(Dashboardpage.this, IntractionPage.class));

            }
        });



        ClickMenu.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                openDrawer(drawerLayout);
            }
        });
    }

    public static void openDrawer(DrawerLayout drawerLayout) {
        drawerLayout.openDrawer(GravityCompat.START);
    }
    public void ClickLogo(View view){
        closeDrawer(drawerLayout);
    }

    public  static void closeDrawer(DrawerLayout drawerLayout) {
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);

        }
    }


    @Override
    protected void onPause() {
        super.onPause();
        closeDrawer(drawerLayout);
    }

}