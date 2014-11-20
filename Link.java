package com.company;

/**
 * Created by jack on 11/19/2014.
 */
public class Link {
    private Link next;
    private competition myComp = null;
    private Event myEvent;
    private Team team;

    public Link getNext(){
        return next;
    }

    public void setNext(Link next){
        this.next = next;
    }

    public competition getMyComp(){
        return myComp;
    }

    public void setMyComp(competition comp){
        this.myComp = comp;
    }

    public Event getEvent(){
        return myEvent;
    }

    public void setEvent(Event event){
        this.myEvent=event;
    }

    public Team getTeam1(){
        return team;
    }

    public void setTeam1(Team myTeam1){
        this.team = myTeam1;
    }

    public Team getTeam2(){
        return team;
    }

    public void setTeam2(Team myTeam2){
        this.team = myTeam2;
    }
}
