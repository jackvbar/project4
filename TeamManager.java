package com.company;

/**
 * Created by jack on 10/28/2014.
 */
import java.util.*;

public class TeamManager {
    private int team;
    private Olympian[] competeTeam;
    private int teamSize;
    private Team[] teamArray = new Team[8];
    private int counter = 0;



    public TeamManager(){
        for(int i = 0; i < teamArray.length; i++){
            teamArray[i] = new Team();
        }

        OlympianManager OlympManage = new OlympianManager();
        competeTeam = OlympManage.getObjectOlympians();
        teamSize = competeTeam.length / 2;
        int totalTeamSize = competeTeam.length;

        while(totalTeamSize != 0){
            Random rn = new Random();
            int random1 = rn.nextInt(14) + 1;
            int random2 = rn.nextInt(14) + 1;

            for(int i=0; i>competeTeam.length; i=i+2){
                
            }

            /*if(competeTeam[random1] != null && competeTeam[random2] != null){
                teamArray[counter].createTeam(competeTeam[random1], competeTeam[random2], 0, 0);
                counter++;
                if(random1 == random2){
                    counter--;
                }else{
                    competeTeam[random1] = null;
                    competeTeam[random2] = null;
                    totalTeamSize = totalTeamSize -2;
                }*/
            }


        }

        getTeamArray();{
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
