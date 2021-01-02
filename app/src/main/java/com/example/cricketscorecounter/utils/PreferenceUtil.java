package com.example.cricketscorecounter.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

public class PreferenceUtil {

    private static final String TAG = "PreferenceUtil";
    private static PreferenceUtil preferenceManager;
    Context context;
    private final SharedPreferences.Editor preferenceEditor;
    private final SharedPreferences sharedPreferences;
    private static final String CRICK_SHARED_FILE = "crick_counter";
    static int PRIVATE_MODE = 0;
    private static final String KEY_WICKETS_ALLOWED = "wickets_allowed";
    private static final String KEY_OVERS_ALLOWED = "overs_allowed";
    private static final String KEY_TEAM_A_NAME = "overs_allowed";
    private static final String KEY_TEAM_B_NAME = "overs_allowed";
    private static final String KEY_GAME_TYPE = "game_type";

    private PreferenceUtil(Context paramContext) {
        this.context = paramContext;
        this.sharedPreferences = paramContext.getSharedPreferences(CRICK_SHARED_FILE, PRIVATE_MODE);
        this.preferenceEditor = this.sharedPreferences.edit();
    }

    public static PreferenceUtil getInstance(Context paramContext) {
        if (preferenceManager == null) {
            preferenceManager = new PreferenceUtil(paramContext);
        }
        return preferenceManager;
    }

    public static void releaseInstance() {
        if (preferenceManager != null) {
            preferenceManager = null;
        }
    }

    //getters
    public int getWicketsAllowed(){
        if (this.sharedPreferences.contains(KEY_WICKETS_ALLOWED)){
            return this.sharedPreferences.getInt(KEY_WICKETS_ALLOWED,11);
        } else {
            Log.e(TAG, "getWicketsAllowed: Wickets allowed is not set");
            return 0;
        }
    }

    public int getOversAllowed(){
        if (this.sharedPreferences.contains(KEY_OVERS_ALLOWED)){
            return this.sharedPreferences.getInt(KEY_OVERS_ALLOWED,5);
        } else {
            Log.e(TAG, "getOversAllowed: Overs allowed is not set");
            return 0;
        }
    }

    public String getTeamAName(){
        if (this.sharedPreferences.contains(KEY_TEAM_A_NAME)){
            return this.sharedPreferences.getString(KEY_TEAM_A_NAME,"Team A");
        } else {
            Log.e(TAG, "getTeamAName: Team A name is not present in the SharedPreference");
            return "Team A";
        }
    }

    public String getTeamBName(){
        if (this.sharedPreferences.contains(KEY_TEAM_B_NAME)){
            return this.sharedPreferences.getString(KEY_TEAM_B_NAME,"Team B");
        } else {
            Log.e(TAG, "getTeamBName: Team B name is not present in the SharedPreference");
            return "Team B";
        }
    }

    public String getGameType(){
        if (this.sharedPreferences.contains(KEY_GAME_TYPE)){
            return this.sharedPreferences.getString(KEY_GAME_TYPE,"Open");
        } else {
            Log.e(TAG, "getGameType: Game type is not present in the SharedPreference");
            return "Open";
        }
    }

    //setters
    public void setWicketsAllowed(int setWickets){
        this.preferenceEditor.putInt(KEY_WICKETS_ALLOWED,setWickets);
    }

    public void setOversAllowed(int setOvers){
        this.preferenceEditor.putInt(KEY_OVERS_ALLOWED,setOvers);
    }

    public void setTeamAName(String nameTeamA){
        this.preferenceEditor.putString(KEY_TEAM_A_NAME,nameTeamA);
    }

    public void setTeamBName(String nameTeamB){
        this.preferenceEditor.putString(KEY_TEAM_B_NAME,nameTeamB);
    }

    public void setGameType(String gameType){
        this.preferenceEditor.putString(KEY_GAME_TYPE,gameType);
    }
}
