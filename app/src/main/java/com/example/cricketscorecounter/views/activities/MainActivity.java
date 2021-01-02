package com.example.cricketscorecounter.views.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.example.cricketscorecounter.R;
import com.example.cricketscorecounter.databinding.ActivityMainBinding;
import com.example.cricketscorecounter.viewmodels.CrickCounterViewModel;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private CrickCounterViewModel crickCounterViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        crickCounterViewModel = ViewModelProviders.of(this).get(CrickCounterViewModel.class);
        displayRunsTeamA(crickCounterViewModel.runsTeamA);
        displayRunsTeamB(crickCounterViewModel.runsTeamB);
        displayFourCounterTeamA(crickCounterViewModel.fourCounterTeamA);
        displayFourCounterTeamB(crickCounterViewModel.fourCounterTeamB);
        displaySixCounterTeamA(crickCounterViewModel.sixCounterTeamA);
        displaySixCounterTeamB(crickCounterViewModel.sixCounterTeamB);
        displayTwoCounterTeamA(crickCounterViewModel.twoCounterTeamA);
        displayTwoCounterTeamB(crickCounterViewModel.twoCounterTeamB);
        displayWicketsTeamA(crickCounterViewModel.wicketsTeamA);
        displayWicketsTeamB(crickCounterViewModel.wicketsTeamB);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        new MenuInflater(this).inflate(R.menu.main_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case R.id.reset_score_menu_item:
                if (crickCounterViewModel.runsTeamA == 0 && crickCounterViewModel.runsTeamB == 0 &&
                crickCounterViewModel.wicketsTeamA == 0 && crickCounterViewModel.wicketsTeamB == 0){
                    return true;
                }
                showResetConfirmationDialog();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void displayRunsTeamA(int i) {
        binding.runsTeamA.setText(String.valueOf(i));
    }

    public void displayRunsTeamB(int i) {
        binding.runsTeamB.setText(String.valueOf(i));
    }

    public void displayWicketsTeamA(int i) {
        binding.wicketsTeamA.setText(String.valueOf(i));
    }

    public void displayWicketsTeamB(int i) {
        binding.wicketsTeamB.setText(String.valueOf(i));
    }

    public void displaySixCounterTeamA(int i) {
        binding.sixCounterTeamA.setText(String.valueOf(i));
    }

    public void displayFourCounterTeamA(int i) {
        binding.fourCounterTeamA.setText(String.valueOf(i));
    }

    public void displayTwoCounterTeamA(int i) {
        binding.twoCounterTeamA.setText(String.valueOf(i));
    }

    public void displayNoBallsCounterTeamB(int i){

    }

    public void displayWideBallsCounterTeamB(int i){

    }

    public void displayDotBallsCounterTeamB(int i){

    }

    public void displaySixCounterTeamB(int i) {
        binding.sixCounterTeamB.setText(String.valueOf(i));
    }

    public void displayFourCounterTeamB(int i) {
        binding.fourCounterTeamB.setText(String.valueOf(i));
    }

    public void displayTwoCounterTeamB(int i) {
        binding.twoCounterTeamB.setText(String.valueOf(i));
    }

    public void displayNoBallsCounterTeamA(int i){

    }

    public void displayWideBallsCounterTeamA(int i){

    }

    public void displayDotBallsCounterTeamA(int i){

    }

    public void addOneTeamA(View view) {
        crickCounterViewModel.runsTeamA = crickCounterViewModel.runsTeamA + 1;
        displayRunsTeamA(crickCounterViewModel.runsTeamA);
    }

    public void addTwoTeamA(View view) {
        crickCounterViewModel.runsTeamA = crickCounterViewModel.runsTeamA + 2;
        crickCounterViewModel.twoCounterTeamA = crickCounterViewModel.twoCounterTeamA + 1;
        displayRunsTeamA(crickCounterViewModel.runsTeamA);
        displayTwoCounterTeamA(crickCounterViewModel.twoCounterTeamA);
    }

    public void addFourTeamA(View view) {
        crickCounterViewModel.runsTeamA = crickCounterViewModel.runsTeamA + 4;
        crickCounterViewModel.fourCounterTeamA = crickCounterViewModel.fourCounterTeamA + 1;
        displayRunsTeamA(crickCounterViewModel.runsTeamA);
        displayFourCounterTeamA(crickCounterViewModel.fourCounterTeamA);
    }

    public void addSixTeamA(View view) {
        crickCounterViewModel.runsTeamA = crickCounterViewModel.runsTeamA + 6;
        crickCounterViewModel.sixCounterTeamA = crickCounterViewModel.sixCounterTeamA + 1;
        displayRunsTeamA(crickCounterViewModel.runsTeamA);
        displaySixCounterTeamA(crickCounterViewModel.sixCounterTeamA);
    }

    public void addWicketTeamA(View view) {
        if (crickCounterViewModel.wicketsTeamA == 10) {
            return;
        } else {
            crickCounterViewModel.wicketsTeamA = crickCounterViewModel.wicketsTeamA + 1;
        }
        displayWicketsTeamA(crickCounterViewModel.wicketsTeamA);
    }


    public void addOneTeamB(View view) {
        crickCounterViewModel.runsTeamB = crickCounterViewModel.runsTeamB + 1;
        displayRunsTeamB(crickCounterViewModel.runsTeamB);
    }

    public void addTwoTeamB(View view) {
        crickCounterViewModel.runsTeamB = crickCounterViewModel.runsTeamB + 2;
        crickCounterViewModel.twoCounterTeamB = crickCounterViewModel.twoCounterTeamB + 1;
        displayRunsTeamB(crickCounterViewModel.runsTeamB);
        displayTwoCounterTeamB(crickCounterViewModel.twoCounterTeamB);
    }

    public void addFourTeamB(View view) {
        crickCounterViewModel.runsTeamB = crickCounterViewModel.runsTeamB + 4;
        crickCounterViewModel.fourCounterTeamB = crickCounterViewModel.fourCounterTeamB + 1;
        displayRunsTeamB(crickCounterViewModel.runsTeamB);
        displayFourCounterTeamB(crickCounterViewModel.fourCounterTeamB);
    }

    public void addSixTeamB(View view) {
        crickCounterViewModel.runsTeamB = crickCounterViewModel.runsTeamB + 6;
        crickCounterViewModel.sixCounterTeamB = crickCounterViewModel.sixCounterTeamB + 1;
        displayRunsTeamB(crickCounterViewModel.runsTeamB);
        displaySixCounterTeamB(crickCounterViewModel.sixCounterTeamB);
    }

    public void addWicketTeamB(View view) {
        if (crickCounterViewModel.wicketsTeamB == 10) {
            return;
        } else {
            crickCounterViewModel.wicketsTeamB = crickCounterViewModel.wicketsTeamB + 1;
        }
        displayWicketsTeamB(crickCounterViewModel.wicketsTeamB);
    }

    public void addWideBallTeamA(View view) {
        crickCounterViewModel.wideBallsTeamA = crickCounterViewModel.wideBallsTeamA + 1;
        crickCounterViewModel.runsTeamA = crickCounterViewModel.runsTeamA +1;
        crickCounterViewModel.wideBallsCounterTeamA = crickCounterViewModel.wideBallsCounterTeamA + 1;
    }

    public void addNoBallTeamA(View view) {
        crickCounterViewModel.noBallsTeamA = crickCounterViewModel.noBallsTeamA + 1;
        crickCounterViewModel.runsTeamA = crickCounterViewModel.runsTeamA +1;
        crickCounterViewModel.noBallsCounterTeamA = crickCounterViewModel.noBallsCounterTeamA + 1;
    }

    public void addDotBallTeamA(View view) {
        crickCounterViewModel.dotBallsTeamA = crickCounterViewModel.dotBallsTeamA + 1;
        crickCounterViewModel.dotBallsCounterTeamA = crickCounterViewModel.dotBallsCounterTeamA + 1;
    }

    public void addWideBallTeamB(View view) {
        crickCounterViewModel.wideBallsTeamB = crickCounterViewModel.wideBallsTeamB + 1;
        crickCounterViewModel.runsTeamB = crickCounterViewModel.runsTeamB +1;
        crickCounterViewModel.wideBallsCounterTeamB = crickCounterViewModel.wideBallsCounterTeamB + 1;
    }

    public void addNoBallTeamB(View view) {
        crickCounterViewModel.noBallsTeamB = crickCounterViewModel.noBallsTeamB + 1;
        crickCounterViewModel.runsTeamB = crickCounterViewModel.runsTeamB +1;
        crickCounterViewModel.noBallsCounterTeamB = crickCounterViewModel.noBallsCounterTeamB + 1;
    }

    public void addDotBallTeamB(View view) {
        crickCounterViewModel.dotBallsTeamB = crickCounterViewModel.dotBallsTeamB + 1;
        crickCounterViewModel.dotBallsCounterTeamB = crickCounterViewModel.dotBallsCounterTeamB + 1;
    }

    public void resetScore() {
        crickCounterViewModel.onCleared();
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

    private void showResetConfirmationDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(R.string.reset_score_dialog);
        builder.setPositiveButton(R.string.reset, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                resetScore();
            }
        });
        builder.setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                if (dialog != null) {
                    dialog.dismiss();
                }
            }
        });

        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}
