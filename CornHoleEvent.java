package com.company;

/**
 * Created by jack on 10/7/2014.
 */
public class CornHoleEvent extends Event{
   private int numBeanBags = 4;

    public CornHoleEvent(String name, int playTo, boolean isPlayToExact, int playDistance) {
        super(name, playTo, isPlayToExact, playDistance);
    }

    public CornHoleEvent(){
        super("CornHole", 21, true, 50);
    }
    @Override public String getExtraInfo(){
        return "One player on each team stands at each end of the playing area, the playing area is roughly 27 feet from\n" +
                "board to board. Each player tosses beanbags toward the opposite board to score points until one team \n" +
                "reaches at least 21 points and has more than a 2 point lead on the opposing team. To determine which \n" +
                "team goes first “coin toss” a beanbag. After the game has started the team that scored the last good \n" +
                "point tosses first.\n";

}}
