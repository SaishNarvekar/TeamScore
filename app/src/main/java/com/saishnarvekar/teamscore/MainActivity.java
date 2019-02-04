package com.saishnarvekar.teamscore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int pointsA = 0;
    int pointsB = 0;

     TextView scoreAView;
     TextView scoreBView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scoreAView = (TextView) findViewById(R.id.team_a_score);
        scoreBView = (TextView) findViewById(R.id.team_b_score);
    }

    public void threePointer(View view){
        pointsA+=3;
        displayScore(pointsA);
    }

    public void twoPointer(View view){
        pointsA+=2;
        displayScore(pointsA);
    }

    public void freeThrow(View view){
        pointsA+=1;
        displayScore(pointsA);
    }

    private void displayScore(int number){

        scoreAView.setText(String.valueOf(number));
    }
    public void threePointerB(View view){
        pointsB+=3;
        displayScoreB(pointsB);
    }

    public void twoPointerB(View view){
        pointsB+=2;
        displayScoreB(pointsB);
    }

    public void freeThrowB(View view){
        pointsB+=1;
        displayScoreB(pointsB);
    }

    private void displayScoreB(int number){
        scoreBView.setText(String.valueOf(number));
    }

    public void reset(View view){
        scoreAView.setText("0");
        scoreBView.setText("0");
    }

}
