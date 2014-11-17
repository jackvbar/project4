package com.company;

/**
 * Created by jack on 10/7/2014.
 */
public class EventManager{

    private Event[] events = new Event[6];{
    this.events[0]= new HorseShoesEvent();
    this.events[1]=new CanJamEvent();
    this.events[2]=new LadderBallEvent();
    this.events[3]=new StickGameEvent();
    this.events[4]=new CornHoleEvent();
    this.events[5]=new WashoosEvent();}

    public void displayEvents(){

        for(int i=0; i<events.length; i++)
        {
            System.out.println(events[i].getInfo());
        }

    }
}

