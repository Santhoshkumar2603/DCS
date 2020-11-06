package com.example.dcs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class quizPage extends AppCompatActivity {

    Button mStartButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_page);

        mStartButton = (Button) findViewById(R.id.startButton);
        mStartButton.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(quizPage.this, QuizActivity.class));
            }
        });
    }
}