package com.example.android.goalkeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    int scoresTeamA = 0;
    int scoresTeamB = 0;
    int foulsTeamA = 0;
    int foulsTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayScoresForTeamA(scoresTeamA);
        displayScoresForTeamB(scoresTeamB);
        displayFoulsForTeamA(foulsTeamA);
        displayFoulsForTeamB(foulsTeamB);
    }

    public void displayScoresForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayScoresForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayFoulsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_fouls);
        scoreView.setText(String.valueOf(score));
    }

    public void displayFoulsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_fouls);
        scoreView.setText(String.valueOf(score));
    }

    public void addScoreTeamA(View view){
        scoresTeamA ++;
        displayScoresForTeamA(scoresTeamA);
    }

    public void addScoreTeamB(View view){
        scoresTeamB ++;
        displayScoresForTeamB(scoresTeamB);
    }

    public void addFoulTeamA(View view){
        foulsTeamA ++;
        displayFoulsForTeamA(foulsTeamA);
    }

    public void addFoulTeamB(View view){
        foulsTeamB ++;
        displayFoulsForTeamB(foulsTeamB);
    }

    public void reset(View view){
        scoresTeamA = 0;
        scoresTeamB = 0;
        foulsTeamA = 0;
        foulsTeamB = 0;
        displayScoresForTeamA(scoresTeamA);
        displayScoresForTeamB(scoresTeamB);
        displayFoulsForTeamA(foulsTeamA);
        displayFoulsForTeamB(foulsTeamB);
    }
}
