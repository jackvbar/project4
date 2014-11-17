package com.company;

/**
 * Created by jack on 10/7/2014.
*/
public abstract class Event{
    private String name;
    private int playTo;
    private boolean isPlayToExact;
    private int playDistance;

    public Event(String name, int playTo, boolean isPlayToExact, int playDistance){
        this.name = name;
        this.playTo = playTo;
        this.isPlayToExact = isPlayToExact;
        this.playDistance = playDistance;
    }

    public abstract String getExtraInfo();

    public String getInfo() {
    return this.name + " " + this.playTo + " " + this.isPlayToExact + " " + this.playDistance + "" + getExtraInfo();
    }
    }