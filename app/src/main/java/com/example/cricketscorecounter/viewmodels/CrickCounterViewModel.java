package com.example.cricketscorecounter.viewmodels;

import androidx.lifecycle.ViewModel;

public class CrickCounterViewModel extends ViewModel {

    //Team A constants
    public int runsTeamA = 0;
    public int wicketsTeamA = 0;

    public int sixCounterTeamA = 0;
    public int fourCounterTeamA = 0;
    public int twoCounterTeamA = 0;
    public int wideBallsTeamA = 0;
    public int noBallsTeamA = 0;
    public int requiredRunsTeamA = 0;
    public int ballsRemainingTeamA = 0;
    public double oversTeamA = 0;

    //Team B constants
    public int runsTeamB = 0;
    public int wicketsTeamB = 0;

    public int sixCounterTeamB = 0;
    public int fourCounterTeamB = 0;
    public int twoCounterTeamB = 0;
    public int wideBallsTeamB = 0;
    public int noBallsTeamB = 0;
    public int requiredRunsTeamB = 0;
    public int ballsRemainingTeamB = 0;
    public double oversTeamB = 0;

    public CrickCounterViewModel() {
    }

    @Override
    public void onCleared() {
        super.onCleared();
        //Team A constants
        runsTeamA = 0;
        wicketsTeamA = 0;

        sixCounterTeamA = 0;
        fourCounterTeamA = 0;
        twoCounterTeamA = 0;
        wideBallsTeamA = 0;
        noBallsTeamA = 0;
        requiredRunsTeamA = 0;
        ballsRemainingTeamA = 0;
        oversTeamA = 0;

        //Team B constants
        runsTeamB = 0;
        wicketsTeamB = 0;

        sixCounterTeamB = 0;
        fourCounterTeamB = 0;
        twoCounterTeamB = 0;
        wideBallsTeamB = 0;
        noBallsTeamB = 0;
        requiredRunsTeamB = 0;
        ballsRemainingTeamB = 0;
        oversTeamB = 0;
    }
}
