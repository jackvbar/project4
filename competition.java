package com.company;

/**
 * Created by jack on 11/16/2014.
 */
public class competition implements ICompetition {
    protected competition previous;
    protected competition next;
    protected Event event;
    protected Team teamA;
    protected Team teamB;

    public Event getEvent(){
        return event;
    }

    public void setEvent(Event event){
        this.event=event;
    }

    public Team getTeamA(){
        return teamA;
    }

    public Team getTeamB(){
        return teamB;
    }

    public void setTeamA(Team teamA){
        this.teamA=teamA;
    }

    public void setTeamB(Team teamB){
        this.teamB=teamB;
    }

    public void StartComp(Event event, Team teamA, Team teamB){
        this.event=event;
        this.teamA=teamA;
        this.teamB=teamB;
    }

}
