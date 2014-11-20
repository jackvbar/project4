package com.company;

/**
 * Created by jack on 10/28/2014.
 */
import java.util.*;

public class TeamManager {
    private int team;
    private Olympian[] competeTeam;
    private int teamSize;
    private int counter = 0;
    private Team[] teamArray = new Team[counter];


    public TeamManager(){
        for(int i = 0; i < teamArray.length; i++){
            teamArray[i] = new Team();
        }

        OlympianManager OlympManage = new OlympianManager();
        competeTeam = OlympManage.getObjectOlympians();
        teamSize = competeTeam.length / 2;
        int totalTeamSize = competeTeam.length;

        while(totalTeamSize != 0){

            for(int i=0; i>competeTeam.length; i=i+2){
                getTeamArray();
                //accumulate the size of the team array
                counter++;
            }
        }
    }
    public Team[] getTeamArray(){
        return this.teamArray;
    }

    public void displayTeams(){
        for(int i = 0; i < teamArray.length; i++){
        teamArray[i].getTeamInfo();
        }
    }

}
