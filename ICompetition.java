package com.company;

/**
 * Created by jack on 11/16/2014.
 */
public interface ICompetition {
        Event event = null;
        Team teamA = null;
        Team teamB = null;

    public Event getEvent();

    public void setEvent(Event event);

    public Team getTeamA();

    public void setTeamA(Team teamA);

    public Team getTeamB();

    public void setTeamB(Team teamB);

    public void StartComp(Event event, Team teamA, Team teamB);

}
