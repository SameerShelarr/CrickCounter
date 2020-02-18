package com.example.cricketscorecounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    int runsTeamA = 0;
    int wicketsTeamA = 0;

    int sixCounterTeamA = 0;
    int fourCounterTeamA = 0;
    int twoCounterTeamA = 0;


    int runsTeamB = 0;
    int wicketsTeamB = 0;

    int sixCounterTeamB = 0;
    int fourCounterTeamB = 0;
    int twoCounterTeamB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void displayRunsTeamA(int i) {
        TextView textView = findViewById(R.id.runs_team_a);
        textView.setText("" + i);
    }

    public void displayRunsTeamB(int i) {
        TextView textView = findViewById(R.id.runs_team_b);
        textView.setText("" + i);
    }

    public void displayWicketsTeamA(int i) {
        TextView textView = findViewById(R.id.wickets_team_a);
        textView.setText("" + i);
    }

    public void displayWicketsTeamB(int i) {
        TextView textView = findViewById(R.id.wickets_team_b);
        textView.setText("" + i);
    }

    public void displaySixCounterTeamA(int i) {
        TextView textView = findViewById(R.id.six_counter_team_a);
        textView.setText("" + i);
    }

    public void displayFourCounterTeamA(int i) {
        TextView textView = findViewById(R.id.four_counter_team_a);
        textView.setText("" + i);
    }

    public void displayTwoCounterTeamA(int i) {
        TextView textView = findViewById(R.id.two_counter_team_a);
        textView.setText("" + i);
    }

    public void displaySixCounterTeamB(int i) {
        TextView textView = findViewById(R.id.six_counter_team_b);
        textView.setText("" + i);
    }

    public void displayFourCounterTeamB(int i) {
        TextView textView = findViewById(R.id.four_counter_team_b);
        textView.setText("" + i);
    }

    public void displayTwoCounterTeamB(int i) {
        TextView textView = findViewById(R.id.two_counter_team_b);
        textView.setText("" + i);
    }


    public void addOneTeamA(View view) {
        runsTeamA = runsTeamA + 1;
        displayRunsTeamA(runsTeamA);
    }

    public void addTwoTeamA(View view) {
        runsTeamA = runsTeamA + 2;
        twoCounterTeamA = twoCounterTeamA + 1;
        displayRunsTeamA(runsTeamA);
        displayTwoCounterTeamA(twoCounterTeamA);
    }

    public void addFourTeamA(View view) {
        runsTeamA = runsTeamA + 4;
        fourCounterTeamA = fourCounterTeamA + 1;
        displayRunsTeamA(runsTeamA);
        displayFourCounterTeamA(fourCounterTeamA);
    }

    public void addSixTeamA(View view) {
        runsTeamA = runsTeamA + 6;
        sixCounterTeamA = sixCounterTeamA + 1;
        displayRunsTeamA(runsTeamA);
        displaySixCounterTeamA(sixCounterTeamA);
    }

    public void addWicketTeamA(View view) {
        if (wicketsTeamA == 11) {
            wicketsTeamA = 11;
        } else {
            wicketsTeamA = wicketsTeamA + 1;
        }
        displayWicketsTeamA(wicketsTeamA);
    }


    public void addOneTeamB(View view) {
        runsTeamB = runsTeamB + 1;
        displayRunsTeamB(runsTeamB);
    }

    public void addTwoTeamB(View view) {
        runsTeamB = runsTeamB + 2;
        twoCounterTeamB = twoCounterTeamB + 1;
        displayRunsTeamB(runsTeamB);
        displayTwoCounterTeamB(twoCounterTeamB);
    }

    public void addFourTeamB(View view) {
        runsTeamB = runsTeamB + 4;
        fourCounterTeamB = fourCounterTeamB + 1;
        displayRunsTeamB(runsTeamB);
        displayFourCounterTeamB(fourCounterTeamB);
    }

    public void addSixTeamB(View view) {
        runsTeamB = runsTeamB + 6;
        sixCounterTeamB = sixCounterTeamB + 1;
        displayRunsTeamB(runsTeamB);
        displaySixCounterTeamB(sixCounterTeamB);
    }

    public void addWicketTeamB(View view) {
        if (wicketsTeamB == 11) {
            wicketsTeamB = 11;
        } else {
            wicketsTeamB = wicketsTeamB + 1;
        }
        displayWicketsTeamB(wicketsTeamB);
    }

    public void resetScore(View view) {
        runsTeamA = 0;
        runsTeamB = 0;
        wicketsTeamA = 0;
        wicketsTeamB = 0;
        sixCounterTeamA = 0;
        sixCounterTeamB = 0;
        fourCounterTeamA = 0;
        fourCounterTeamB = 0;
        twoCounterTeamA = 0;
        twoCounterTeamB = 0;
        displayRunsTeamA(0);
        displayRunsTeamB(0);
        displayWicketsTeamA(0);
        displayWicketsTeamB(0);
        displaySixCounterTeamA(0);
        displaySixCounterTeamB(0);
        displayFourCounterTeamA(0);
        displayFourCounterTeamB(0);
        displayTwoCounterTeamA(0);
        displayTwoCounterTeamB(0);
    }
}
