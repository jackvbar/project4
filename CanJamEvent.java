package com.company;

/**
 * Created by jack on 10/7/2014.
 */
public class CanJamEvent extends Event{
   private int frisbeeSize = 6;

    public CanJamEvent(String name, int playTo, boolean isPlayToExact, int playDistance) {
        super(name, playTo, isPlayToExact, playDistance);
    }

    public CanJamEvent(){
        super("CanJam", 21, true, 50);
    }
    @Override public String getExtraInfo(){
        return "One player on each team stands at each end of the playing area, the playing area is roughly 50 feet from\n" +
                "can to can. Each player throws a frisbee towards the opposite can to score points until one team \n" +
                "reaches exactly 21 points. To determine which team goes first “coin toss” the frisbee, the team that \n" +
                "doesn't go first gets rebuttal rights in the event the starting team reaches 21 points first.\n" +
                "Each turn consists of one player tossing the frisbee, followed by that player's team-mate tossing the \n" +
                "frisbee back to the player.";

}}
