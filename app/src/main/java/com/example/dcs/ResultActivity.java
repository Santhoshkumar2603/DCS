package com.example.dcs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    TextView mGrade, mFinalScore;
    Button mRetryButton,exitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        mGrade = (TextView)findViewById(R.id.grade);
        mFinalScore = (TextView)findViewById(R.id.outOf);
        mRetryButton = (Button)findViewById(R.id.retry);



        Bundle bundle = getIntent().getExtras();
        int score = bundle.getInt("finalScore");



        if (score == 5){
            mGrade.setText("Good,You are safe");
        }else if (score == 4){
            mGrade.setText("Consult nearby doctors to Check whether you are Affected");
        }else  {
            mGrade.setText("You are not safe,take a Corona test");
        }

        mRetryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ResultActivity.this, QuizActivity.class));
                ResultActivity.this.finish();
            }
        });

    }
}
