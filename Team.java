package com.company;

/**
 * Created by jack on 10/28/2014.
 */
public class Team {
    private Olympian olympian1;
    private Olympian olympian2;
    private int winner;
    private int loser;

    public Team(){
        this.olympian1 = new Olympian();
        this.olympian2 = new Olympian();
        this.winner = 0;
        this.loser = 0;

    }
    public Team(Olympian olympianX, Olympian olympianY){
        this.olympian1 = olympianX;
        this.olympian2 = olympianY;
        this.winner = 0;
        this.loser = 0;

    }
    public Team(Olympian olympianX, Olympian olympianY, int wins, int losses){
        this.olympian1 = olympianX;
        this.olympian2 = olympianY;
        this.winner = winner;
        this.loser = loser;

    }
    public void createTeam(Olympian o1, Olympian o2, int victory, int defeat){
        this.olympian1 = o1;
        this.olympian2 = o2;
        this.winner = victory;
        this.loser = defeat;
    }
    public String getTeamInfo(){
        return this.olympian1 + " will compete against " + this.olympian2;
    }

}
