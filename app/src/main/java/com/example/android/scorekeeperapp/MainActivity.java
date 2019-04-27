package com.example.android.scorekeeperapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final int INNING_MIN_VALUE = 0;
    private static final int INNING_MAX_VALUE = 9;

    private int mInningForTeamA = INNING_MIN_VALUE;
    private int mInningForTeamB = INNING_MIN_VALUE;
    private int mRunForTeamA = 0;
    private int mRunForTeamB = 0;
    private int mHitForTeamA = 0;
    private int mHitForTeamB = 0;
    private int mErrorForTeamA = 0;
    private int mErrorForTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void decreaseInningForTeamA(View view) {
        mInningForTeamA = Math.max(INNING_MIN_VALUE, mInningForTeamA - 1);
        displayInningForTeamA();
    }

    public void increaseInningForTeamA(View view) {
        mInningForTeamA = Math.min(INNING_MAX_VALUE, mInningForTeamA + 1);
        displayInningForTeamA();
    }

    private void displayInningForTeamA() {
        TextView inningText = findViewById(R.id.team_a_inning);
        inningText.setText(String.valueOf(mInningForTeamA));
    }

    public void decreaseInningForTeamB(View view) {
        mInningForTeamB = Math.max(INNING_MIN_VALUE, mInningForTeamB - 1);
        displayInningForTeamB();
    }

    public void increaseInningForTeamB(View view) {
        mInningForTeamB = Math.min(INNING_MAX_VALUE, mInningForTeamB + 1);
        displayInningForTeamB();
    }

    private void displayInningForTeamB() {
        TextView inningText = findViewById(R.id.team_b_inning);
        inningText.setText(String.valueOf(mInningForTeamB));
    }

    public void runForTeamA(View view) {
        mRunForTeamA++;
        displayRunForTeamA();
    }

    private void displayRunForTeamA() {
        TextView scoreText = findViewById(R.id.team_a_score);
        scoreText.setText(String.valueOf(mRunForTeamA));

        TextView runText = findViewById(R.id.team_a_run);
        runText.setText(String.valueOf(mRunForTeamA));
    }

    public void runForTeamB(View view) {
        mRunForTeamB++;
        displayRunForTeamB();
    }

    private void displayRunForTeamB() {
        TextView scoreText = findViewById(R.id.team_b_score);
        scoreText.setText(String.valueOf(mRunForTeamB));

        TextView runText = findViewById(R.id.team_b_run);
        runText.setText(String.valueOf(mRunForTeamB));
    }

    public void hitForTeamA(View view) {
        mHitForTeamA++;
        displayHitForTeamA();
    }

    private void displayHitForTeamA() {
        TextView hitText = findViewById(R.id.team_a_hit);
        hitText.setText(String.valueOf(mHitForTeamA));
    }

    public void hitForTeamB(View view) {
        mHitForTeamB++;
        displayHitForTeamB();
    }

    private void displayHitForTeamB() {
        TextView hitText = findViewById(R.id.team_b_hit);
        hitText.setText(String.valueOf(mHitForTeamB));
    }

    public void errorForTeamA(View view) {
        mErrorForTeamA++;
        displayErrorForTeamA();
    }

    private void displayErrorForTeamA() {
        TextView errorText = findViewById(R.id.team_a_error);
        errorText.setText(String.valueOf(mErrorForTeamA));
    }

    public void errorForTeamB(View view) {
        mErrorForTeamB++;
        displayErrorForTeamB();
    }

    private void displayErrorForTeamB() {
        TextView errorText = findViewById(R.id.team_b_error);
        errorText.setText(String.valueOf(mErrorForTeamB));
    }

    public void reset(View view) {
        mInningForTeamA = INNING_MIN_VALUE;
        mInningForTeamB = INNING_MIN_VALUE;
        mRunForTeamA = 0;
        mRunForTeamB = 0;
        mHitForTeamA = 0;
        mHitForTeamB = 0;
        mErrorForTeamA = 0;
        mErrorForTeamB = 0;

        displayInningForTeamA();
        displayInningForTeamB();
        displayRunForTeamA();
        displayRunForTeamB();
        displayHitForTeamA();
        displayHitForTeamB();
        displayErrorForTeamA();
        displayErrorForTeamB();
    }
}
